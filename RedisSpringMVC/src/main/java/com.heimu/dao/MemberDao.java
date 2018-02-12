package com.heimu.dao;

import java.util.List;

import com.heimu.model.Member;

public interface MemberDao {
    boolean add(Member member);
 
    abstract boolean add(List<Member> list);
 
    void delete(String key);
 
    Member get(String keyId);
}