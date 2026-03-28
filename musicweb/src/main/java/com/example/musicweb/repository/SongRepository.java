package com.example.musicweb.repository;

import com.example.musicweb.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}