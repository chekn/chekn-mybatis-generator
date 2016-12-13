package org.study.dao;

import java.util.List;
import org.study.model.SprDeclareGood;
import org.study.model.SprDeclareGoodCriteria;

public interface SprDeclareGoodMapper {
    int insert(SprDeclareGood record);

    int insertSelective(SprDeclareGood record);

    List<SprDeclareGood> selectByExample(SprDeclareGoodCriteria example);
}