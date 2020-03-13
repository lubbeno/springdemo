package com.example.demo.fieldType;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReactFieldTypeRepository extends CrudRepository<ReactFIeldType, UUID> {



}
