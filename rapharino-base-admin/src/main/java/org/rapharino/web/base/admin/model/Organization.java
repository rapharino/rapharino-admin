package org.rapharino.web.base.admin.model;

/**
 * Generated by Rapharino.
 * 
 * 表名: tb_organization
 */
public class Organization {
    /**
     * 
     * 表字段: tb_organization.id
     */
    private Integer id;

    /**
     * 
     * 表字段: tb_organization.name
     */
    private String name;

    /**
     * 
     * 表字段: tb_organization.parent_id
     */
    private Integer parentId;

    /**
     * 
     * 表字段: tb_organization.parent_ids
     */
    private String parentIds;

    /**
     * 
     * 表字段: tb_organization.available
     */
    private Byte available;

    /**
     * 
     * 表字段: tb_organization.description
     */
    private String description;

    /**
     * This method returns the value of the database column tb_organization.id
     * @return the value of tb_organization.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column tb_organization.id
     * @param id the value for tb_organization.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tb_organization.name
     * @return the value of tb_organization.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column tb_organization.name
     * @param name the value for tb_organization.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column tb_organization.parent_id
     * @return the value of tb_organization.parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method sets the value of the database column tb_organization.parent_id
     * @param parentId the value for tb_organization.parent_id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method returns the value of the database column tb_organization.parent_ids
     * @return the value of tb_organization.parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method sets the value of the database column tb_organization.parent_ids
     * @param parentIds the value for tb_organization.parent_ids
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    /**
     * This method returns the value of the database column tb_organization.available
     * @return the value of tb_organization.available
     */
    public Byte getAvailable() {
        return available;
    }

    /**
     * This method sets the value of the database column tb_organization.available
     * @param available the value for tb_organization.available
     */
    public void setAvailable(Byte available) {
        this.available = available;
    }

    /**
     * This method returns the value of the database column tb_organization.description
     * @return the value of tb_organization.description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method sets the value of the database column tb_organization.description
     * @param description the value for tb_organization.description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}