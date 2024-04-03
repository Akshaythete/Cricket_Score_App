package com.cricket.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.api.entity.Match;

@Repository
public interface MatchRepo extends JpaRepository<Match, Integer> {
	
	//fetch any match u want to get details
	
	Optional<Match> findByTeamHeading(String teamHeading);

}
