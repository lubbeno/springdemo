package com.example.demo.connectorFields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ConnectorFieldsService {


    @Autowired
    private ConnectorFieldsRepository connectorFieldsRepository;

    ConnectorFields createConnectorFields(
            String ticketTypeId,
            String fieldName,
            String fieldToolName
    ){
        ConnectorFields connectorFields = new ConnectorFields();
        connectorFields.setId(UUID.randomUUID());
        connectorFields.setTicketTypeId(ticketTypeId);
        connectorFields.setFieldName(fieldName);
        connectorFields.setFieldToolName(fieldToolName);
        return connectorFieldsRepository.save(connectorFields);

    }

    public Iterable<ConnectorFields> findAllByTicketTypeId(String id) {

        return connectorFieldsRepository.findAllByTicketTypeId(id);
    }


    public Optional<String> findStatusListById(UUID Id){

        return connectorFieldsRepository.findStatusListById(Id);
    }
}
