package com.shaw.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by shaw on 2017/7/18.
 */
@Table(name = "tbl_schedule")
public class TblSchedule {
    /**
     * 赛程id
     */
    @Column(name = "schedule_id")
    @Id
    private int scheduleId;
    /**
     * 球队id
     */
    @Column(name = "team_id")
    private int teamId;
    /**
     * 比赛日期
     */
    private Date matchday;
    /**
     * 赛场
     */
    private String statium;

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Date getMatchday() {
        return matchday;
    }

    public void setMatchday(Date matchday) {
        this.matchday = matchday;
    }

    public String getStatium() {
        return statium;
    }

    public void setStatium(String statium) {
        this.statium = statium;
    }
}
