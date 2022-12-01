package com.role_base.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.role_base.model.User;
@Repository
public interface Srepo extends JpaRepository<User, Long>{

}
