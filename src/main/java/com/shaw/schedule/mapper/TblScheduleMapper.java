package com.shaw.schedule.mapper;

import com.shaw.base.MyMapper;
import com.shaw.entity.TblTeam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by shaw on 2017/7/17.
 */
@Mapper
public interface TblScheduleMapper extends MyMapper<TblTeam>{
    List<TblTeam> getTeam();
}
