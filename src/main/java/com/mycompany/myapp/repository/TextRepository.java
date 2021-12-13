package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Text;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Text entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TextRepository extends JpaRepository<Text, Long> {}
