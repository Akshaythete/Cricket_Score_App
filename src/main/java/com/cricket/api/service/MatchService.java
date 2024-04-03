package com.cricket.api.service;

import java.util.List;
import java.util.Map;

import com.cricket.api.entity.Match;

public interface MatchService {
	
	//get all matches
	
	List<Match> getAllMatches();
	
	//get live matches
	
	List<Match> getLiveMatches();
	
	//get point table
	
	List<List<String>>getPointTable();
	
	

}
