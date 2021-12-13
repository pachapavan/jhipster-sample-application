package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Elements;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Elements entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ElementsRepository extends JpaRepository<Elements, Long> {}
