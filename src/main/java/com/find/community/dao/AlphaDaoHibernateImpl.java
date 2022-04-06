package com.find.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author find
 * @date 2022/4/4 21:13
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select(){
        return "Hibernate";
    }
}
