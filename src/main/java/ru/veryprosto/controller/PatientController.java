package ru.veryprosto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.veryprosto.model.Patient;
import ru.veryprosto.repository.PatientRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> Patients() {
        return patientRepository.findAll();
    }

    @PostMapping("/patients")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }
}