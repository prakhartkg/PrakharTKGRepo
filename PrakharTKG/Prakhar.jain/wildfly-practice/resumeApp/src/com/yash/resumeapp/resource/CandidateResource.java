package com.yash.resumeapp.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.resumeapp.model.Candidate;
import com.yash.resumeapp.model.Marks;
import com.yash.resumeapp.service.CandidateService;
import com.yash.resumeapp.service.MarksService;

@Path("/candidates")
public class CandidateResource {
	CandidateService candidateService=new CandidateService();
	MarksService marksService=new MarksService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Candidate> getAllCandidate(){
	return candidateService.getAllCandidates();	
	}
		 
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{city}")
	public List<Candidate> getCandidatesByCity(@PathParam("city") String city){
		return candidateService.getCandidatesBycity(city);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/id/{candidate_id}")
	public List<Candidate> getCandidatesById(@PathParam("candidate_id") int id){
		System.out.println(id);
		return candidateService.getCandidatesById(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/id/{id}/grade/{grade}")
	public Candidate getCandidateByMarks(@PathParam("id")int id, @PathParam("grade")int gradeschool){
		System.out.println(id);
		System.out.println(gradeschool);
		Candidate candidate=candidateService.getCandidateById(id);
		Marks marks=marksService.getMarks(id,gradeschool);
		candidate.setMarks(marks);
		return candidate;
	}
}
