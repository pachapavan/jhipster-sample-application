package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TabelValues;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TabelValues entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TabelValuesRepository extends JpaRepository<TabelValues, Long> {}
