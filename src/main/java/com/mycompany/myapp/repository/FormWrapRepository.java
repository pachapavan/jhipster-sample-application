package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.FormWrap;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the FormWrap entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FormWrapRepository extends JpaRepository<FormWrap, String> {}
