package com.qa.springboottesting.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qa.springboottesting.domain.Music;
import com.qa.springboottesting.service.MusicService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MusicController {
	
	private MusicService service;
	
	public MusicController(MusicService service) {
		this.service = service;
	}
	
	// CREATE
	@PostMapping("/create")
	public ResponseEntity<Music> createMusic(@RequestBody Music music) {
		return new ResponseEntity<Music>(this.service.create(music), HttpStatus.CREATED);
	}
	
	// READ ALL
	@GetMapping("/getAll")
	public ResponseEntity<List<Music>> getAll() {
		return new ResponseEntity<List<Music>>(this.service.getAll(), HttpStatus.OK);
	}
}
