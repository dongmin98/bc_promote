package com.bc.promote.entity.eportal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * eportal资源
 * 资源表
 *
 * @author dongmin
 * @TableName eportal_resource
 * @date 2022/07/01
 */
@TableName(value ="eportal_resource")
@Data
public class EportalResource implements Serializable {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父级ID
     */
    @TableField(value = "parent_id")
    private Long parent_id;

    /**
     * 资源编码
     */
    @TableField(value = "resource_code")
    private String resource_code;

    /**
     * 资源名称
     */
    @TableField(value = "resource_name")
    private String resource_name;

    /**
     * 资源图标
     */
    @TableField(value = "resource_icon")
    private String resource_icon;

    /**
     * 资源传播
     */
    @TableField(value = "resource_spread")
    private Short resource_spread;

    /**
     * 资源类型：菜单-MENU;按钮-BUTTON
     */
    @TableField(value = "resource_type")
    private String resource_type;

    /**
     * 当RESOURCE_TYPE=menu时：catalog:目录;folder:文件夹;leaf:子节点
     */
    @TableField(value = "resource_sub_type")
    private String resource_sub_type;

    /**
     * 资源路径
     */
    @TableField(value = "resource_path")
    private String resource_path;

    /**
     * 资源展示顺序
     */
    @TableField(value = "show_order")
    private Short show_order;

    /**
     * 资源状态：0-无效;1-有效;默认为1
     */
    @TableField(value = "status")
    private Short status;

    /**
     * 修改日期
     */
    @TableField(value = "modified_date")
    private Date modified_date;

    /**
     * 修改用户
     */
    @TableField(value = "modified_user")
    private String modified_user;

    /**
     * 创建日期
     */
    @TableField(value = "created_date")
    private Date created_date;

    /**
     * 创建用户
     */
    @TableField(value = "created_user")
    private String created_user;

    /**
     * 是否删除：0未删除，1已删除
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
        EportalResource other = (EportalResource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getResource_code() == null ? other.getResource_code() == null : this.getResource_code().equals(other.getResource_code()))
            && (this.getResource_name() == null ? other.getResource_name() == null : this.getResource_name().equals(other.getResource_name()))
            && (this.getResource_icon() == null ? other.getResource_icon() == null : this.getResource_icon().equals(other.getResource_icon()))
            && (this.getResource_spread() == null ? other.getResource_spread() == null : this.getResource_spread().equals(other.getResource_spread()))
            && (this.getResource_type() == null ? other.getResource_type() == null : this.getResource_type().equals(other.getResource_type()))
            && (this.getResource_sub_type() == null ? other.getResource_sub_type() == null : this.getResource_sub_type().equals(other.getResource_sub_type()))
            && (this.getResource_path() == null ? other.getResource_path() == null : this.getResource_path().equals(other.getResource_path()))
            && (this.getShow_order() == null ? other.getShow_order() == null : this.getShow_order().equals(other.getShow_order()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getResource_code() == null) ? 0 : getResource_code().hashCode());
        result = prime * result + ((getResource_name() == null) ? 0 : getResource_name().hashCode());
        result = prime * result + ((getResource_icon() == null) ? 0 : getResource_icon().hashCode());
        result = prime * result + ((getResource_spread() == null) ? 0 : getResource_spread().hashCode());
        result = prime * result + ((getResource_type() == null) ? 0 : getResource_type().hashCode());
        result = prime * result + ((getResource_sub_type() == null) ? 0 : getResource_sub_type().hashCode());
        result = prime * result + ((getResource_path() == null) ? 0 : getResource_path().hashCode());
        result = prime * result + ((getShow_order() == null) ? 0 : getShow_order().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", parent_id=").append(parent_id);
        sb.append(", resource_code=").append(resource_code);
        sb.append(", resource_name=").append(resource_name);
        sb.append(", resource_icon=").append(resource_icon);
        sb.append(", resource_spread=").append(resource_spread);
        sb.append(", resource_type=").append(resource_type);
        sb.append(", resource_sub_type=").append(resource_sub_type);
        sb.append(", resource_path=").append(resource_path);
        sb.append(", show_order=").append(show_order);
        sb.append(", status=").append(status);
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