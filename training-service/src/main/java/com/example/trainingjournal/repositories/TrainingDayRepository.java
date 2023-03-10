package com.example.trainingjournal.repositories;

import com.example.trainingjournal.entities.TrainingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingDayRepository extends JpaRepository<TrainingDay, Integer> {
}
