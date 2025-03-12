package com.vivek.crudoperations.repository;

import com.vivek.crudoperations.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
