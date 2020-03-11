package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.StudentMarkes;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the StudentMarkes entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StudentMarkesRepository extends JpaRepository<StudentMarkes, Long> {
}
