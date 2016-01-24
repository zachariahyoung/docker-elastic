package com.zandriod.elastic.person;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface  PersonRepository extends ElasticsearchRepository<Person, String> {
}
