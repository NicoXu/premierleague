package com.shaw.schedule.controller;

import com.github.pagehelper.PageInfo;
import com.shaw.base.utils.SpringContextHolder;
import com.shaw.entity.TblScore;
import com.shaw.entity.TblTeam;
import com.shaw.schedule.service.TblScheduleService;
import com.shaw.schedule.service.TblScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaw on 2017/7/17.
 */
@RestController
@RequestMapping(value = "/premierleague")
public class scheduleController {

    @Autowired
    private TblScheduleService tblScheduleService;
    @Autowired
    private TblScoreService tblScoreService;

    @RequestMapping(value = "/hello")
    public PageInfo<String> hello() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        PageInfo<String> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @RequestMapping(value = "/getTeamList", method = RequestMethod.POST)
    public PageInfo<TblTeam> getTeam() {
        List<TblTeam> list = tblScheduleService.getTeam();
        PageInfo<TblTeam> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @RequestMapping(value = "/getScoreList", method = RequestMethod.POST)
    public PageInfo<TblScore> getScore() {
        List<TblScore> list = tblScoreService.getScoreList();
        PageInfo<TblScore> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @RequestMapping(value = "/deleteScoreById", method = RequestMethod.POST)
    public int deleteScoreById(@RequestParam String scoreId) {
        Integer id = Integer.valueOf(scoreId);
        return tblScoreService.deleteScoreById(id);
    }

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(10000);
                    System.out.println("hello world");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
