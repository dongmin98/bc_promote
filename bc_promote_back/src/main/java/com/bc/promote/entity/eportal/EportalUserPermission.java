package com.bc.promote.entity.eportal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * eportal用户权限
 * 用户权限关联表
 *
 * @author dongmin
 * @TableName eportal_user_permission
 * @date 2022/07/01
 */
@TableName(value ="eportal_user_permission")
@Data
public class EportalUserPermission implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    @TableField(value = "user_id")
    private Long user_id;

    /**
     * 
     */
    @TableField(value = "resource_id")
    private Long resource_id;

    /**
     * 
     */
    @TableField(value = "modified_date")
    private Date modified_date;

    /**
     * 
     */
    @TableField(value = "modified_user")
    private String modified_user;

    /**
     * 
     */
    @TableField(value = "created_date")
    private Date created_date;

    /**
     * 
     */
    @TableField(value = "created_user")
    private String created_user;

    /**
     * 
     */
    @TableField(value = "is_delete")
    private Short is_delete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EportalUserPermission other = (EportalUserPermission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getResource_id() == null ? other.getResource_id() == null : this.getResource_id().equals(other.getResource_id()))
            && (this.getModified_date() == null ? other.getModified_date() == null : this.getModified_date().equals(other.getModified_date()))
            && (this.getModified_user() == null ? other.getModified_user() == null : this.getModified_user().equals(other.getModified_user()))
            && (this.getCreated_date() == null ? other.getCreated_date() == null : this.getCreated_date().equals(other.getCreated_date()))
            && (this.getCreated_user() == null ? other.getCreated_user() == null : this.getCreated_user().equals(other.getCreated_user()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getResource_id() == null) ? 0 : getResource_id().hashCode());
        result = prime * result + ((getModified_date() == null) ? 0 : getModified_date().hashCode());
        result = prime * result + ((getModified_user() == null) ? 0 : getModified_user().hashCode());
        result = prime * result + ((getCreated_date() == null) ? 0 : getCreated_date().hashCode());
        result = prime * result + ((getCreated_user() == null) ? 0 : getCreated_user().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", resource_id=").append(resource_id);
        sb.append(", modified_date=").append(modified_date);
        sb.append(", modified_user=").append(modified_user);
        sb.append(", created_date=").append(created_date);
        sb.append(", created_user=").append(created_user);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}