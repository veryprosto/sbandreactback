package ru.veryprosto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.veryprosto.model.Patient;
import ru.veryprosto.repository.PatientRepository;

import java.text.SimpleDateFormat;


@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserBackendApplication.class, args);
    }

    @Autowired
    PatientRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
     /*   SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        userRepo.save(new Patient("Иванов Иван Иваныч", "1111 111111", formatter.parse("01-01-1960"), true));
        userRepo.save(new Patient("Сидорова Елена Сидоровна", "2222 222222", formatter.parse("01-02-1970"), false));
        userRepo.save(new Patient("Петров Пётр Петрович", "3333 333333", formatter.parse("01-03-1980"), true));
        userRepo.save(new Patient("Дмитриева Влада Владимировна", "4444 444444", formatter.parse("01-04-1990"), false));*/
    }

}