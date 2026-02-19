package com.sena.test.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.test.Entity.User_Role;

@Repository
public interface User_RoleRepository extends JpaRepository<User_Role, Integer>{

    @Query(""
			+ "SELECT "
			+ "u "
			+ "FROM "
			+ "user_role u "
			+ "WHERE "
			+ "u.id = ?1"
			)
	public List<User_Role>filterById(int id);
}