package com.lin.appapidemo.model.shixun;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "t_subalbum")
public class Subalbum {
    @Id
    @Column(name = "sid")
    private int sid;
    @Column(name = "aid")
    private int aid;
    @Column(name = "number")
    private String number;
    @Column(name = "condi")
    private int condi;
    @Column(name = "time")
    private String time;
    @Transient
    private Album album;

    public Subalbum(int aid, String number, int condi, String time) {
        this.aid = aid;
        this.number = number;
        this.condi = condi;
        this.time = time;
    }

    public int getAid(){
        return aid;
    }

    public void setAid(int aid){
        this.aid=aid;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number=number;
    }

    public int getCondi(){
        return condi;
    }

    public void setCondi(int condi){
        this.condi=condi;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time=time;
    }
}
