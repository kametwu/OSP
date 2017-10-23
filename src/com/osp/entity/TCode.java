package com.osp.entity;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class TCode extends BaseEntity {
    private Integer id;
    private String codeType;
    private String codeName;
    private String itemCode;
    private String itemValue;
    private String status;
    private String attr1;
    private String attr2;
    private String attr3;
    private String attr4;
    private String attr5;
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
    public String getCodeType() {
        return codeType;
    }
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }
    public String getCodeName() {
        return codeName;
    }
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public String getItemValue() {
        return itemValue;
    }
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getAttr1() {
        return attr1;
    }
    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }
    public String getAttr2() {
        return attr2;
    }
    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }
    public String getAttr3() {
        return attr3;
    }
    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }
    public String getAttr4() {
        return attr4;
    }
    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }
    public String getAttr5() {
        return attr5;
    }
    public void setAttr5(String attr5) {
        this.attr5 = attr5;
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