package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.StudentFee;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the StudentFee entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StudentFeeRepository extends JpaRepository<StudentFee, Long> {
}
