package com.wang.demo.mapper;

import com.wang.demo.entity.Passwd;
import com.wang.demo.entity.PasswdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasswdMapper {
    long countByExample(PasswdExample example);

    int deleteByExample(PasswdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Passwd record);

    int insertSelective(Passwd record);

    List<Passwd> selectByExample(PasswdExample example);

    Passwd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Passwd record, @Param("example") PasswdExample example);

    int updateByExample(@Param("record") Passwd record, @Param("example") PasswdExample example);

    int updateByPrimaryKeySelective(Passwd record);

    int updateByPrimaryKey(Passwd record);
}