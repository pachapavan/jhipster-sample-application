package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.StaffSalary;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the StaffSalary entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StaffSalaryRepository extends JpaRepository<StaffSalary, Long> {
}
