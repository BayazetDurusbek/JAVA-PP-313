package ru.example.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.springsecurity.models.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
