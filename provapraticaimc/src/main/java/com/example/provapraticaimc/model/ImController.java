package model;

import dto.ImcDto;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/imc")
public class ImController {
	@GetMapping
	public ResponseEntity<ImcDto> calcular(@RequestParam float peso){
		return ResponseEntity.ok(new ImcDto(peso));
	}
}
