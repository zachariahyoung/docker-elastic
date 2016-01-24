package com.zandriod.elastic;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document( indexName = "person" , type = "user", indexStoreType = "memory", shards = 1, replicas = 0, refreshInterval = "-1")
public class Person {

    public Person(String name) {
        this.name = name;
    }

    @Id
    private String id;

    private String name;
}
