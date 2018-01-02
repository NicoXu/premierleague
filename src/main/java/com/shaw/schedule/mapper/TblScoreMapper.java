package com.shaw.schedule.mapper;

import com.shaw.base.MyMapper;
import com.shaw.entity.TblScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by shaw on 2018/1/1.
 */
@Mapper
public interface TblScoreMapper extends MyMapper<TblScore> {
    List<TblScore> getScoreList();
}
