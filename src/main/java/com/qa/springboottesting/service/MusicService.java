package com.qa.springboottesting.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.qa.springboottesting.domain.Music;
import com.qa.springboottesting.repos.MusicRepo;

@Service
public class MusicService implements ServiceIF<Music> {
	
	private MusicRepo repo;
	
	public MusicService(MusicRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public Music create(Music music) {
		return this.repo.save(music);
	}

	@Override
	public List<Music> getAll() {
		return this.repo.findAll();
	}

	@Override
	public Music getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Music update(long id, Music t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
