package com.example.codeclan.CheckMate.repositories;

import com.example.codeclan.CheckMate.models.Check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends JpaRepository<Check, Long> {
}
