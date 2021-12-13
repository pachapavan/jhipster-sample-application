package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Button;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Button entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ButtonRepository extends JpaRepository<Button, Long> {}
