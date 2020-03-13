package com.example.demo.fieldType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReactFieldTypeService {

    @Autowired
    private ReactFieldTypeRepository reactFieldTypeRepository;

   public ReactFIeldType newEntry( String fieldType){

        ReactFIeldType reactFIeldType = new ReactFIeldType();
        reactFIeldType.setId(UUID.randomUUID());
        reactFIeldType.setFieldType(fieldType);
       return  reactFieldTypeRepository.save(reactFIeldType);


    }
}
