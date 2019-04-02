package com.stackroute.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
public class Concept {
    @Id
    private int id;
    private String identity;
    private String name;
    private String parentId;
    private String type;
    private String classType;
    private String relation;
    private String context;
}