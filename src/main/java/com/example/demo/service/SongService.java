package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Song;

@Service
public interface SongService {

	public void addSong(Song song);


	public boolean songExists(String name);

	public List<Song> fetchAllSongs();
    
	public void updateSong(Song song);
	
}
