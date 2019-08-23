package com.lin.appapidemo.model.shixun;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "t_reader")
public class Reader {
    @Id
    @Column(name = "rid")
    private int rid;
    @Column(name = "account")
    /**
     * 学号
     */
    private String account;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private String time;
    @Column(name = "condi")
    private int condi;
    @Column(name = "feedback")
    private String feedback;
    @Column(name = "EMailAddr")
    private String EMailAddr;
    @Column(name = "phoneNumber")
    private String phoneNumber;

    

    public Reader(String account, String password, String name, String time, int condi,String feedback,String EMailAddr,String phoneNumber) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.time = time;
        this.condi = condi;
        this.feedback = feedback;
        this.EMailAddr = EMailAddr;
        this.phoneNumber = phoneNumber;
    }
}
