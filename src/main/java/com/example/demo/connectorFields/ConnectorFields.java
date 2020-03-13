package com.example.demo.connectorFields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.demo.fieldType.ReactFIeldType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

//@Data
@Entity
@Table(name = "con_fields")//cart
public class ConnectorFields {


    @Id
    @Type(type = "uuid-char")
    @JsonIgnore
    private UUID id ;

    @Column
    private String ticketTypeId;

    @Column
    private String fieldName;

    @Column
    private String fieldToolName;

    // tady je jeste nastavovani cascade.
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="fieldType")
    private ReactFIeldType fieldType;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    @Column
    private String list;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTicketTypeId() {
        return ticketTypeId;
    }

    public void setTicketTypeId(String ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldToolName() {
        return fieldToolName;
    }

    public void setFieldToolName(String fieldToolName) {
        this.fieldToolName = fieldToolName;
    }

    public ReactFIeldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(ReactFIeldType fieldType) {
        this.fieldType = fieldType;
    }
}
