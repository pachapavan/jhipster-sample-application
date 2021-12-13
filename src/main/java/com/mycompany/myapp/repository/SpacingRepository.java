package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Spacing;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Spacing entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SpacingRepository extends JpaRepository<Spacing, Long> {}
