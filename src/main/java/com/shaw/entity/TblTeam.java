package com.shaw.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by shaw on 2017/7/17.
 */
@Table(name = "tbl_team")
public class TblTeam {
    /**
     * 球队id
     */
    @Column(name = "team_id")
    @Id
    private int teamId;
    /**
     * 队名
     */
    private String name;

    /**
     * 所属城市
     */
    private String city;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
