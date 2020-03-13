package com.example.demo.connectorFields;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ConnectorFieldsRepository extends CrudRepository<ConnectorFields, UUID> {

    Iterable<ConnectorFields> findAllByTicketTypeId(@Param("TicketTypeId") String ticketTypeId);

    Iterable<ConnectorFields> findAll();

    Iterable<ConnectorFields> findAllByTicketTypeIdIn(List<String> ticketTypeIds);


    @Query("select fieldType FROM ConnectorFields where id = ?1")
    Optional<String> findStatusListById(UUID id);
}
