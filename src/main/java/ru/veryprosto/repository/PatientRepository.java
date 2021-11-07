package ru.veryprosto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.veryprosto.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
}