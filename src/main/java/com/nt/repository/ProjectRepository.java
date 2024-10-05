package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
