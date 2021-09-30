package com.qa.springboottesting.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springboottesting.domain.Music;

@Repository
public interface MusicRepo extends JpaRepository <Music, Long> {
	
}
