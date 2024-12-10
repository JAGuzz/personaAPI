package com.jaguzz.persona.persona_api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaguzz.persona.persona_api.entities.Locality;
import com.jaguzz.persona.persona_api.services.LocalityServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/locality")
public class LocalityController extends BaseControllerImpl<Locality, LocalityServiceImpl>{

}
