package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Attendence;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Attendence entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AttendenceRepository extends JpaRepository<Attendence, Long> {
}
