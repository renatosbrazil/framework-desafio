package com.ninvit.framework.repository;

import java.util.Optional;

import com.ninvit.framework.models.ERole;
import com.ninvit.framework.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
