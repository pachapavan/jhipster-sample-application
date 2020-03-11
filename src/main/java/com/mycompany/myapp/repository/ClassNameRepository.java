package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ClassName;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ClassName entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClassNameRepository extends JpaRepository<ClassName, Long> {
}
