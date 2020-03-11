package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.BusRouteName;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the BusRouteName entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BusRouteNameRepository extends JpaRepository<BusRouteName, Long> {
}
