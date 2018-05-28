package com.github.misterchangray.dao.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.github.misterchangray.dao.entity.UserRoleMap")
public class UserRoleMap {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="userId")
    private Integer userId;

    @ApiModelProperty(value="roleId")
    private Integer roleId;

    @ApiModelProperty(value="deleted是否删除0false, 1true")
    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public UserRoleMap setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public UserRoleMap setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public UserRoleMap setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public UserRoleMap setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table user_role_map
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        userId("user_id"),
        roleId("role_id"),
        deleted("deleted");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_role_map
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_role_map
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_role_map
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_role_map
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_role_map
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_role_map
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}