package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ObjectContainingString;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the ObjectContainingString entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ObjectContainingStringRepository extends JpaRepository<ObjectContainingString, Long> {}
