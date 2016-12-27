package org.rapharino.web.base.admin.model;

/**
 * Generated by Rapharino.
 * 
 * 表名: tb_icon
 */
public class Icon {
    /**
     * 
     * 表字段: tb_icon.id
     */
    private Integer id;

    /**
     * 
     * 表字段: tb_icon.name
     */
    private String name;

    /**
     * 
     * 表字段: tb_icon.description
     */
    private String description;

    /**
     * 
     * 表字段: tb_icon.packageName
     */
    private String packagename;

    /**
     * 
     * 表字段: tb_icon.className
     */
    private String classname;

    /**
     * This method returns the value of the database column tb_icon.id
     * @return the value of tb_icon.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tb_icon.id
     * @param id the value for tb_icon.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_icon.name
     * @return the value of tb_icon.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column tb_icon.name
     * @param name the value for tb_icon.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_icon.description
     * @return the value of tb_icon.description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method sets the value of the database column tb_icon.description
     * @param description the value for tb_icon.description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method returns the value of the database column tb_icon.packageName
     * @return the value of tb_icon.packageName
     */
    public String getPackagename() {
        return packagename;
    }

    /**
     * This method sets the value of the database column tb_icon.packageName
     * @param packagename the value for tb_icon.packageName
     */
    public void setPackagename(String packagename) {
        this.packagename = packagename == null ? null : packagename.trim();
    }

    /**
     * This method returns the value of the database column tb_icon.className
     * @return the value of tb_icon.className
     */
    public String getClassname() {
        return classname;
    }

    /**
     * This method sets the value of the database column tb_icon.className
     * @param classname the value for tb_icon.className
     */
    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }
}