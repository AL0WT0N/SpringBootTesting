package com.qa.springboottesting.service;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.qa.springboottesting.domain.Music;
import com.qa.springboottesting.repos.MusicRepo;

@RunWith(MockitoJUnitRunner.class)
public class MusicServiceUnitTest {
	
	@InjectMocks
	private MusicService service;
	
	@Mock
	private MusicRepo repo;
	
	@Test
	public void createTest() {
		Music input = new Music("Single", "Test Song", "Test Artist", 2021);
		Music output = new Music(1L, "Single", "Test Song", "Test Artist", 2021);
		
		Mockito.when(this.repo.save(input)).thenReturn(output);
		
		assertEquals(output, this.service.create(input));
		
		Mockito.verify(this.repo, Mockito.times(1)).save(input);
	}
	
	@Test
	public void getAllTest() {
		List<Music> output = new ArrayList<>();
		output.add(new Music("Single", "Test Song", "Test Artist", 2021));
		
		Mockito.when(this.repo.findAll()).thenReturn(output);
		
		assertEquals(output, this.service.getAll());
		
		Mockito.verify(this.repo, Mockito.times(1)).findAll();
	}
}
