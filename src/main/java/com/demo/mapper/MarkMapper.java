package com.demo.mapper;

import com.demo.entity.Mark;
import com.demo.entity.MarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkMapper {
    int countByExample(MarkExample example);

    int deleteByExample(MarkExample example);

    int insert(Mark record);

    //带条件的插入
    int insertSelective(Mark record);

    List<Mark> selectByExample(MarkExample example);

    int updateByExampleSelective(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByExample(@Param("record") Mark record, @Param("example") MarkExample example);
}
