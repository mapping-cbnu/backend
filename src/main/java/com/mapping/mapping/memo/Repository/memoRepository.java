package com.mapping.mapping.memo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.mapping.mapping.memo.dto.memo;

import java.util.List;


public interface memoRepository extends CrudRepository<memo, Long> {
    List<memo> findByWriter(String writer);
    List<memo> findByTag(String tag);
    List<memo> findByContentContains(String content);
}
