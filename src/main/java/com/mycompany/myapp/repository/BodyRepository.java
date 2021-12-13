package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Body;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Body entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BodyRepository extends JpaRepository<Body, Long> {}
