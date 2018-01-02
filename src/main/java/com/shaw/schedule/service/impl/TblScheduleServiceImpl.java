package com.shaw.schedule.service.impl;

import com.shaw.entity.TblTeam;
import com.shaw.schedule.mapper.TblScheduleMapper;
import com.shaw.schedule.service.TblScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shaw on 2017/7/17.
 */
@Service
public class TblScheduleServiceImpl implements TblScheduleService{

    @Autowired
    private TblScheduleMapper tblScheduleMapper;

    @Override
    public void updateById() {
//        tblScheduleMapper.updateByPrimaryKey();
    }

    @Override
    public List<TblTeam> getTeam() {
        return tblScheduleMapper.getTeam();
    }
}
