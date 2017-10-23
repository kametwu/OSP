package com.osp.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TUser extends BaseEntity {
    private Integer id;
    private String account;
    private String password;
    private String name;
    private String sex;
    @JSONField(format="yyyy-MM-dd")
    private Date birthday;
    private String certType;
    private String certNo;
    private String telNumber;
    private String mobNumber;
    private String faxNumber;
    private String email;
    private String empCode;
    private String position;
    private String passwordStatus;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Timestamp lastLoginTime;
    @JSONField(format="yyyy-MM-dd")
    private Date expiryTime;
    private String status;
    private String remark;
    private String createUser;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;
    private String modifyUser;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Timestamp modifyTime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getCertType() {
        return certType;
    }
    public void setCertType(String certType) {
        this.certType = certType;
    }
    public String getCertNo() {
        return certNo;
    }
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }
    public String getTelNumber() {
        return telNumber;
    }
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    public String getMobNumber() {
        return mobNumber;
    }
    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }
    public String getFaxNumber() {
        return faxNumber;
    }
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmpCode() {
        return empCode;
    }
    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPasswordStatus() {
        return passwordStatus;
    }
    public void setPasswordStatus(String passwordStatus) {
        this.passwordStatus = passwordStatus;
    }
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }
    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    public Date getExpiryTime() {
        return expiryTime;
    }
    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getCreateUser() {
        return createUser;
    }
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    public Timestamp getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    public String getModifyUser() {
        return modifyUser;
    }
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
    public Timestamp getModifyTime() {
        return modifyTime;
    }
    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }
}