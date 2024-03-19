package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Song;
import com.example.demo.entity.Users;
@Repository

public interface SongRepository extends JpaRepository<Song, Integer> {
	
	public Song findByName(String name);
}
