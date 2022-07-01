package com.bc.promote.entity.eportal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业用户信息主表
 *
 * @author dongmin
 * @TableName eportal_user
 * @date 2022/07/01
 */
@TableName(value ="eportal_user")
@Data
public class EportalUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账户名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "account_name")
    private String account_name;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Short status;

    /**
     * 申请来源
     */
    @TableField(value = "source_remark")
    private String source_remark;

    /**
     * 企业名称
     */
    @TableField(value = "company_code")
    private String company_code;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 修改时间
     */
    @TableField(value = "modified_date")
    private Date modified_date;

    /**
     * 修改人
     */
    @TableField(value = "modified_user")
    private String modified_user;

    /**
     * 创建时间
     */
    @TableField(value = "created_date")
    private Date created_date;

    /**
     * 创建人
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
        EportalUser other = (EportalUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAccount_name() == null ? other.getAccount_name() == null : this.getAccount_name().equals(other.getAccount_name()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSource_remark() == null ? other.getSource_remark() == null : this.getSource_remark().equals(other.getSource_remark()))
            && (this.getCompany_code() == null ? other.getCompany_code() == null : this.getCompany_code().equals(other.getCompany_code()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAccount_name() == null) ? 0 : getAccount_name().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSource_remark() == null) ? 0 : getSource_remark().hashCode());
        result = prime * result + ((getCompany_code() == null) ? 0 : getCompany_code().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", account_name=").append(account_name);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", status=").append(status);
        sb.append(", source_remark=").append(source_remark);
        sb.append(", company_code=").append(company_code);
        sb.append(", remark=").append(remark);
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