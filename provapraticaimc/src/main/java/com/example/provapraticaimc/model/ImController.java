package com.example.provapraticaimc.model;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.provapraticaimc.dto.ImcDto;

@RestController
@RequestMapping("/imc")
public class ImController {
	@GetMapping
	public ResponseEntity<ImcDto> calcular(@RequestParam List<String> pesoaltura){
		return ResponseEntity.ok(new ImcDto(pesoaltura));
	}
}
