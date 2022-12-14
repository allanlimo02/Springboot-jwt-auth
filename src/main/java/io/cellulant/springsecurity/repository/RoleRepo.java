package io.cellulant.springsecurity.repository;

import io.cellulant.springsecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
