package com.example.fileuploaddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.fileuploaddemo.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FileuploaddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileuploaddemoApplication.class, args);
	}

}
