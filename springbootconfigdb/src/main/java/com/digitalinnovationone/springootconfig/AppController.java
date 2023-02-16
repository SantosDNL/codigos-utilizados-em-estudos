package com.digitalinnovationone.springootconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class AppController {
	
		@Value("${app.message}")
		private String appMessage;
		
		@Value("${ENV_DB_URL:NENHUMA}")
		private String dbEnviromentVariable;
		
		@GetMapping("/")
		public String getMessage () {
			return appMessage;
		}
		
		@GetMapping("/envVariable")
		public String getEnviromentVariable () {
			return "A seguinte variável foi passada: " + dbEnviromentVariable;
		}

}
