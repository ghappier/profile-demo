package com.xiaojz.profile.repository.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 地区
 */
@Data
public class Area implements Serializable {

    /**
     * 主键
     */
    private String id;

    /**
     * 上级地区id
     */
    private String pid;

    /**
     * 地区名
     */
    private String name;

    /**
     * 排序
     */
    private Integer ranking;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
