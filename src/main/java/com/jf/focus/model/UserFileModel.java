package com.jf.focus.model;

import java.util.Date;

public class UserFileModel {
    private Long id;//key serial PRIMARY KEY ,
    private String userName;//username  varchar(255) ,
    private Long uid;//usr_id varchar(255) ,
    private Integer stutas;//描述文件状态 tinyint ,
    private String filePath;//文件实际存储在服务器上的位置 varchar(500) ,
    private String reqUrl;//web 请求该图片的时候的路径 varchar(500) ,
    private Integer version;//乐观锁 int ,
    private Date createTime;//
    private Integer type;//文件类型
    //类型 1：私密获取 2：公开获取

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getStutas() {
        return stutas;
    }

    public void setStutas(Integer stutas) {
        this.stutas = stutas;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String file_path) {
        this.filePath = file_path;
    }

    public String getReqUrl() {
        return reqUrl;
    }

    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
