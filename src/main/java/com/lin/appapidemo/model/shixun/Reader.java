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
    @Column(name = "sex")
    private String sex;
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



    public Reader(String account, String password, String name, String sex,String time, int condi,String feedback,String EMailAddr,String phoneNumber) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.time = time;
        this.condi = condi;
        this.feedback = feedback;
        this.EMailAddr = EMailAddr;
        this.phoneNumber = phoneNumber;
    }
    public Reader(String account, String password, String name, String sex, String time, int condi) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.time = time;
        this.condi = condi;
    }
    public Reader(String name,String account, String password, int condi) {
        this.name = name;
        this.account = account;
        this.password = password;
        this.condi = condi;
    }




    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account=account;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time=time;
    }

    public int getCondi(){
        return condi;
    }

    public void setCondi(int condi){
        this.condi=condi;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback() {
        this.feedback=feedback;
    }

    public String getEMailAddr() {
        return EMailAddr;
    }

    public void setEMailAddr() {
        this.EMailAddr=EMailAddr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber=phoneNumber;
    }
}
