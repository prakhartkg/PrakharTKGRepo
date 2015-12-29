package com.yash.resumeapp.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


import com.yash.resumeapp.dao.CandidateDao;
import com.yash.resumeapp.model.Candidate;
import com.yash.resumeapp.model.Marks;

public class CandidateService {
	

	public List<Candidate> getAllCandidates() {
		List<Candidate> candidates=new ArrayList<>();
		String sql="SELECT * FROM `candidate` c INNER JOIN marks m ON c.`candidate_id`=m.`candidate_id`";
		try {
			ResultSet resultSet=CandidateDao.select(sql);
			while (resultSet.next()) {
				Candidate candidate=new Candidate();
				candidate.setId(resultSet.getInt(1));
				candidate.setName(resultSet.getString(2));
				candidate.setCity(resultSet.getString(3));
				Marks marks=candidate.getMarks();
				marks.setHighSchool(resultSet.getString(6));
				marks.setSecondary(resultSet.getString(7));
				candidate.setMarks(marks);
				System.out.println(candidate);
				candidates.add(candidate);
			}
		} catch (SQLException e) {
		
		}
		
		return candidates;
	}

	public List<Candidate> getCandidatesBycity(String city) {
		List<Candidate> candidates=new ArrayList<>(); 
		String sql="SELECT * FROM `candidate` c INNER JOIN marks m ON c.`candidate_id`=m.`candidate_id` WHERE city='"+city+"'";
		try {
			ResultSet resultSet=CandidateDao.select(sql);
			while (resultSet.next()) {
				Candidate candidate=new Candidate();
				candidate.setId(resultSet.getInt(1));
				candidate.setName(resultSet.getString(2));
				candidate.setCity(resultSet.getString(3));
				Marks marks=candidate.getMarks();
				marks.setHighSchool(resultSet.getString(6));
				marks.setSecondary(resultSet.getString(7));
				candidate.setMarks(marks);
				System.out.println(candidate);
				candidates.add(candidate);
			}
		} catch (SQLException e) {
		
		}
		return candidates;
	}

	public List<Candidate> getCandidatesById(int id) {
		List<Candidate> candidates=new ArrayList<>(); 
		String sql="SELECT * FROM `candidate` c INNER JOIN marks m ON c.`candidate_id`=m.`candidate_id` WHERE c.`candidate_id`="+id;
		System.out.println(sql);
		try {
			ResultSet resultSet=CandidateDao.select(sql);
			while (resultSet.next()) {
				Candidate candidate=new Candidate();
				candidate.setId(resultSet.getInt(1));
				candidate.setName(resultSet.getString(2));
				candidate.setCity(resultSet.getString(3));
				Marks marks=candidate.getMarks();
				marks.setHighSchool(resultSet.getString(6));
				marks.setSecondary(resultSet.getString(7));
				candidate.setMarks(marks);
				System.out.println(candidate);
				candidates.add(candidate);
			}
		} catch (SQLException e) {
		
		}
		return candidates;
	}

	public Candidate getCandidateById(int id) {
		String sql="SELECT * FROM candidate WHERE candidate_id="+id;
		Candidate candidate=null;
		try {
			ResultSet resultSet=CandidateDao.select(sql);
			while (resultSet.next()) {
				candidate=new Candidate();
				candidate.setId(resultSet.getInt(1));
				candidate.setName(resultSet.getString(2));
				candidate.setCity(resultSet.getString(3));
			}
		} catch (SQLException e) {
		
		}
		return candidate;
	}

}
