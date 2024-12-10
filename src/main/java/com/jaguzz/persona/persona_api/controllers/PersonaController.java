package com.jaguzz.persona.persona_api.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaguzz.persona.persona_api.entities.Persona;
import com.jaguzz.persona.persona_api.services.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

   @GetMapping("/search")
   public ResponseEntity<?> search(@RequestParam String filtro){
    try {

        return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
        
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
    }
   }

   @GetMapping("/searchPaged")
   public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
    try {

        return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro, pageable ));
        
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
    }
   }

    

}
