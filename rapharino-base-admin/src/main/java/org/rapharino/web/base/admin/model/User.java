package org.rapharino.web.base.admin.model;

import java.util.Date;

/**
 * Generated by Rapharino.
 * 
 * 表名: tb_user
 */
public class User {
    /**
     * ????
     * 表字段: tb_user.id
     */
    private Integer id;

    /**
     * ???
     * 表字段: tb_user.userName
     */
    private String username;

    /**
     * 
     * 表字段: tb_user.userPwd
     */
    private String userpwd;

    /**
     * 
     * 表字段: tb_user.salt
     */
    private String salt;

    /**
     * 
     * 表字段: tb_user.name
     */
    private String name;

    /**
     * 
     * 表字段: tb_user.tel
     */
    private String tel;

    /**
     * 
     * 表字段: tb_user.email
     */
    private String email;

    /**
     * 
     * 表字段: tb_user.entryTime
     */
    private Date entrytime;

    /**
     * 
     * 表字段: tb_user.organizationId
     */
    private Integer organizationid;

    /**
     * 
     * 表字段: tb_user.role_ids
     */
    private String roleIds;

    /**
     * 
     * 表字段: tb_user.locked
     */
    private Byte locked;

    /**
     * 
     * 表字段: tb_user.userPhoto
     */
    private String userphoto;

    /**
     * This method returns the value of the database column tb_user.id
     * @return the value of tb_user.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tb_user.id
     * @param id the value for tb_user.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_user.userName
     * @return the value of tb_user.userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method sets the value of the database column tb_user.userName
     * @param username the value for tb_user.userName
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method returns the value of the database column tb_user.userPwd
     * @return the value of tb_user.userPwd
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * This method sets the value of the database column tb_user.userPwd
     * @param userpwd the value for tb_user.userPwd
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    /**
     * This method returns the value of the database column tb_user.salt
     * @return the value of tb_user.salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method sets the value of the database column tb_user.salt
     * @param salt the value for tb_user.salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method returns the value of the database column tb_user.name
     * @return the value of tb_user.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column tb_user.name
     * @param name the value for tb_user.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_user.tel
     * @return the value of tb_user.tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method sets the value of the database column tb_user.tel
     * @param tel the value for tb_user.tel
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method returns the value of the database column tb_user.email
     * @return the value of tb_user.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method sets the value of the database column tb_user.email
     * @param email the value for tb_user.email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method returns the value of the database column tb_user.entryTime
     * @return the value of tb_user.entryTime
     */
    public Date getEntrytime() {
        return entrytime;
    }

    /**
     * This method sets the value of the database column tb_user.entryTime
     * @param entrytime the value for tb_user.entryTime
     */
    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    /**
     * This method returns the value of the database column tb_user.organizationId
     * @return the value of tb_user.organizationId
     */
    public Integer getOrganizationid() {
        return organizationid;
    }

    /**
     * This method sets the value of the database column tb_user.organizationId
     * @param organizationid the value for tb_user.organizationId
     */
    public void setOrganizationid(Integer organizationid) {
        this.organizationid = organizationid;
    }

    /**
     * This method returns the value of the database column tb_user.role_ids
     * @return the value of tb_user.role_ids
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * This method sets the value of the database column tb_user.role_ids
     * @param roleIds the value for tb_user.role_ids
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds == null ? null : roleIds.trim();
    }

    /**
     * This method returns the value of the database column tb_user.locked
     * @return the value of tb_user.locked
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * This method sets the value of the database column tb_user.locked
     * @param locked the value for tb_user.locked
     */
    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    /**
     * This method returns the value of the database column tb_user.userPhoto
     * @return the value of tb_user.userPhoto
     */
    public String getUserphoto() {
        return userphoto;
    }

    /**
     * This method sets the value of the database column tb_user.userPhoto
     * @param userphoto the value for tb_user.userPhoto
     */
    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto == null ? null : userphoto.trim();
    }
}