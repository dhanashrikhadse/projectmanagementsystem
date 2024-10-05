package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Project;
import com.nt.repository.ProjectRepository;



@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    
    public List<Project> getAllProjects(){
    	return projectRepository.findAll();
    }
    public Project getProject(Long id) {
    return   projectRepository.findById(id).get();
    }
    @Transactional(rollbackForClassName= {"java.lang.Exception"})
    public Project saveProject(Project project){
    	return  projectRepository.save(project);
    }
    @Transactional(rollbackForClassName= {"java.lang.Exception"})
    public Project updateProject(Project project){
    	return  projectRepository.save(project);
    }
    
    @Transactional(rollbackForClassName= {"java.lang.Exception"})
    public void deleteProject(Long id){
    	projectRepository.deleteById(id);
    }
    
}
