package com.iteam.repository;

import java.util.List;

import com.iteam.entity.Societe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe, Long> {
    @RestResource(path = "name")
    List<Societe> findByName(@Param("name") String name);
}
