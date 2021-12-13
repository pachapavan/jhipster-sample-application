package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.BadgeType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the BadgeType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BadgeTypeRepository extends JpaRepository<BadgeType, Long> {}
