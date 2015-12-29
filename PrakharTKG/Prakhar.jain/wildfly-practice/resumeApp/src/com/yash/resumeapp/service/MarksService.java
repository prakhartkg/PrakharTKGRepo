package com.yash.resumeapp.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.yash.resumeapp.dao.CandidateDao;
import com.yash.resumeapp.model.Marks;

public class MarksService {

	public Marks getMarks(int id,Marks marks) {
		String sql="SELECT * FROM marks WHERE candidate_id="+id;
		try {
			ResultSet resultSet=CandidateDao.select(sql);
			while (resultSet.next()) {
				marks.setHighSchool(resultSet.getString(3));
				marks.setSecondary(resultSet.getString(4));
				
			}
		} catch (SQLException e) {
		
		}
		return marks;
	}

	public Marks getMarks(int id, int gradeschool) {
		String sql="SELECT * FROM marks WHERE candidate_id="+id;
		Marks marks=new Marks();
		try {
			ResultSet resultSet=CandidateDao.select(sql);
			while (resultSet.next()) {
				if(gradeschool==10){
				marks.setHighSchool(resultSet.getString(3));
				}
				else if(gradeschool==12){
					marks.setSecondary(resultSet.getString(4));
				}
				
			}
		} catch (SQLException e) {
		
		}
		return marks;
	}

	
}
