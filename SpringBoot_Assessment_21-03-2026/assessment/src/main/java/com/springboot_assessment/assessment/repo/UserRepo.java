package com.springboot_assessment.assessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_assessment.assessment.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    
    /**
     * This is a "Query Method." 
     * Spring Boot looks at the name "findByEmail" and automatically 
     * writes the SQL: SELECT * FROM users WHERE email = ?
     */
    User findByEmail(String email);
}