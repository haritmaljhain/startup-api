package com.startup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.entity.SystemLevel;

@Repository
public interface SystemLevelRepository extends JpaRepository<SystemLevel, Long> {
	
}
