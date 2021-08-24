package com.codeoftheweb.AirLine;

import com.codeoftheweb.AirLine.Class.Vuelo;
import com.codeoftheweb.AirLine.Repository.VueloRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class AirLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirLineApplication.class, args);
	}


	@Bean
	public CommandLineRunner initData(VueloRepository vueloRepository) {
		return (args) -> {
			Vuelo vuelo1 = new Vuelo("B542", "Mendoza", 5, LocalDate.of(2021,9,02));
			Vuelo vuelo2 = new Vuelo("B545", "Mendoza", 4, LocalDate.of(2021,9,03));
			Vuelo vuelo3 = new Vuelo("B534", "Mendoza", 2, LocalDate.of(2021,9,04));
			Vuelo vuelo4 = new Vuelo("B577", "Mendoza", 2, LocalDate.of(2021,9,03));
			Vuelo vuelo5 = new Vuelo("B571", "Mendoza", 3, LocalDate.of(2021,9,02));
			Vuelo vuelo6 = new Vuelo("B511", "Mendoza", 1, LocalDate.of(2021,9,04));
			Vuelo vuelo7 = new Vuelo("B520", "Mendoza", 7, LocalDate.of(2021,9,02));
			Vuelo vuelo8 = new Vuelo("C633", "Tucuman", 5, LocalDate.of(2021,9,02));
			Vuelo vuelo9 = new Vuelo("C648", "Tucuman", 3, LocalDate.of(2021,9,02));
			Vuelo vuelo10 = new Vuelo("C639", "Tucuman", 8, LocalDate.of(2021,9,03));
			Vuelo vuelo11 = new Vuelo("C682", "Tucuman", 4, LocalDate.of(2021,9,03));
			Vuelo vuelo12 = new Vuelo("C677", "Tucuman", 5, LocalDate.of(2021,9,03));
			Vuelo vuelo13 = new Vuelo("C691", "Tucuman", 2, LocalDate.of(2021,9,04));
			Vuelo vuelo14 = new Vuelo("C616", "Tucuman", 6, LocalDate.of(2021,9,04));
			Vuelo vuelo15 = new Vuelo("C644", "Tucuman", 7, LocalDate.of(2021,9,04));
			Vuelo vuelo16 = new Vuelo("D855", "San Luis", 4, LocalDate.of(2021,9,02));
			Vuelo vuelo17 = new Vuelo("D812", "San Luis", 6, LocalDate.of(2021,9,02));
			Vuelo vuelo18 = new Vuelo("D842", "San Luis", 2, LocalDate.of(2021,9,02));
			Vuelo vuelo19 = new Vuelo("D864", "San Luis", 4, LocalDate.of(2021,9,03));
			Vuelo vuelo20 = new Vuelo("D866", "San Luis", 6, LocalDate.of(2021,9,03));
			Vuelo vuelo21 = new Vuelo("D884", "San Luis", 2, LocalDate.of(2021,9,03));
			Vuelo vuelo22 = new Vuelo("D854", "San Luis", 3, LocalDate.of(2021,9,04));
			Vuelo vuelo23 = new Vuelo("D832", "San Luis", 5, LocalDate.of(2021,9,04));
			Vuelo vuelo24 = new Vuelo("D874", "San Luis", 6, LocalDate.of(2021,9,04));

			vueloRepository.save(vuelo1);
			vueloRepository.save(vuelo2);
			vueloRepository.save(vuelo3);
			vueloRepository.save(vuelo4);
			vueloRepository.save(vuelo5);
			vueloRepository.save(vuelo6);
			vueloRepository.save(vuelo7);
			vueloRepository.save(vuelo8);
			vueloRepository.save(vuelo9);
			vueloRepository.save(vuelo10);
			vueloRepository.save(vuelo11);
			vueloRepository.save(vuelo12);
			vueloRepository.save(vuelo13);
			vueloRepository.save(vuelo14);
			vueloRepository.save(vuelo15);
			vueloRepository.save(vuelo16);
			vueloRepository.save(vuelo17);
			vueloRepository.save(vuelo18);
			vueloRepository.save(vuelo19);
			vueloRepository.save(vuelo20);
			vueloRepository.save(vuelo21);
			vueloRepository.save(vuelo22);
			vueloRepository.save(vuelo23);
			vueloRepository.save(vuelo24);




		};
	}
}
