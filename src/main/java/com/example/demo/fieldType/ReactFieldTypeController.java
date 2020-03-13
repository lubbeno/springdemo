package com.example.demo.fieldType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/field_type")
@CrossOrigin(origins = {"http://bluezzzcluster.eu-de.containers.appdomain.cloud:30617", "http://localhost:4200"})
public class ReactFieldTypeController {

    @Autowired
    private ReactFieldTypeService reactFieldTypeService;

    @GetMapping("/add/{value}")
    public ReactFIeldType newFieldTypeEntry(@PathVariable("value")  String fieldType){
        return reactFieldTypeService.newEntry(fieldType);
    }

}
