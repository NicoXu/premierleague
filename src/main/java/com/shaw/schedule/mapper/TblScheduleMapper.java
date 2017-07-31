package com.shaw.schedule.mapper;

import com.shaw.base.MyMapper;
import com.shaw.entity.TblTeam;

import java.util.List;

/**
 * Created by shaw on 2017/7/17.
 */
public interface TblScheduleMapper extends MyMapper<TblTeam>{
    List<TblTeam> getTeam();
}
