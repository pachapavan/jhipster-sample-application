package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.FlexBox;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the FlexBox entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FlexBoxRepository extends JpaRepository<FlexBox, Long> {}
