package com.csi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
