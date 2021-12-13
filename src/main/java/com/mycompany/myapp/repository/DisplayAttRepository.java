package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.DisplayAtt;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the DisplayAtt entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DisplayAttRepository extends JpaRepository<DisplayAtt, Long> {}
