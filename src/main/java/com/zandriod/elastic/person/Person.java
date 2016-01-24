package com.zandriod.elastic.person;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "person", type = "user", indexStoreType = "memory", shards = 1, replicas = 0, refreshInterval = "-1")
public class Person {

    @Id
    private String id;

    private String name;
}
