package com.shaw.schedule.service.impl;

import com.shaw.entity.TblScore;
import com.shaw.schedule.mapper.TblScoreMapper;
import com.shaw.schedule.service.TblScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shaw on 2018/1/1.
 */
@Service
public class TblScoreServiceImpl implements TblScoreService{

    @Autowired
    private TblScoreMapper tblScoreMapper;

    @Override
    public List<TblScore> getScoreList() {
        return tblScoreMapper.getScoreList();
    }

    @Override
    public int deleteScoreById(int id) {
        return tblScoreMapper.deleteScoreById(id);
    }
}
