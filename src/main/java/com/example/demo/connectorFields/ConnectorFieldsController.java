package com.example.demo.connectorFields;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/con")
@CrossOrigin(origins = {"http://bluezzzcluster.eu-de.containers.appdomain.cloud:30617", "http://localhost:4200"})
public class ConnectorFieldsController {

    @Autowired
    private ConnectorFieldsService connectorFieldsService;

    @PostMapping("/connectorFields")
    @ResponseStatus(HttpStatus.CREATED)
    public ConnectorFields createConnectorFields(@RequestBody ConnectorFields ccl){

        return connectorFieldsService.createConnectorFields(
                ccl.getTicketTypeId(),
                ccl.getFieldName(),
                ccl.getFieldToolName()
        );

    }

    @GetMapping("/connectorFields/{value}")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<ConnectorFields>  findAllByTicketTypeId(@PathVariable("value") String id) {

        Iterable<ConnectorFields> test =connectorFieldsService.findAllByTicketTypeId(id);

        System.out.println("neco");
        return  test;
    }

    @GetMapping("/connectorFields/statuses/{value}")
    public Optional<String> getStatuses(@PathVariable("value") UUID id){
        System.out.println("test");
        Optional<String> test =    connectorFieldsService.findStatusListById(id);

        System.out.println(test.toString());
        return test;


    }

}
