package com.zandriod.elastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface  PersonRepository extends ElasticsearchRepository<Person, String> {
}
