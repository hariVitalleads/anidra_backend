package com.example.demo;

import com.example.demo.model.PatientMewsConfig;
import com.example.demo.model.PrDefaultPatientThreshold;
import com.example.demo.repository.PatientMewsConfigRepository;
import com.example.demo.repository.PrDefaultPatientThresholdRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*
    @Bean
    public CommandLineRunner csAdditionalInfoRep(CsAdditionalInfoRepository infoRepository) {
        return (args) -> {

            CsAdditionalInfo repo1 = new CsAdditionalInfo(
                    "key1", "parent1", "parent_key1", "name1", "infogroup1", "charValue1", new BigDecimal("1"), new BigDecimal("2"), Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), "userId1", "modifyUserId1", "createApplication1", "modifyApplication1");

            infoRepository.save(repo1);

            for (CsAdditionalInfo info : infoRepository.findAll()) {
                System.out.println("info.getName() " + info.getName());
            }
        };
    }*/

    @Bean
    public CommandLineRunner prDefaultPatientThresholdRep(PrDefaultPatientThresholdRepository thresholdRepository) {

        return (args) -> {
            PrDefaultPatientThreshold threshold1 = new PrDefaultPatientThreshold(
                    "thresholdtype1",
                    new BigDecimal("92"),
                    new BigDecimal("90"),
                    new BigDecimal("80"),
                    new BigDecimal("22"),
                    new BigDecimal("44"),
                    new BigDecimal("98"),
                    new BigDecimal("92"),
                    new BigDecimal("98.3"),
                    new BigDecimal("102"),
                    new BigDecimal("100"),
                    new BigDecimal("102"),
                    new BigDecimal("103")
            );
            PrDefaultPatientThreshold threshold2 = new PrDefaultPatientThreshold(
                    "thresholdtype2",
                    new BigDecimal("100"),
                    new BigDecimal("90"),
                    new BigDecimal("80"),
                    new BigDecimal("22"),
                    new BigDecimal("44"),
                    new BigDecimal("98"),
                    new BigDecimal("92"),
                    new BigDecimal("98.3"),
                    new BigDecimal("102"),
                    new BigDecimal("100"),
                    new BigDecimal("102"),
                    new BigDecimal("103")
            );

            thresholdRepository.save(threshold1);
            thresholdRepository.save(threshold2);

            for (PrDefaultPatientThreshold info : thresholdRepository.findByThresholdType("thresholdtype1")) {
                System.out.println("Pulse rate patient threshold max val " + info.getSpo2_max_val());
            }
        };
    }


    @Bean
    public CommandLineRunner patientMewsConfigServiceRep(PatientMewsConfigRepository patientMewsRep) {

        return (args) -> {
            PatientMewsConfig config1 = new PatientMewsConfig(Integer.valueOf(1234), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,null);
            patientMewsRep.save(config1);

            PatientMewsConfig config = patientMewsRep.findByConfigId(1234);
            System.out.println("Dia Max " + config.getDiaMax());
            System.out.println("Dia Min " + config.getDiaMin());
        };
    }
}
