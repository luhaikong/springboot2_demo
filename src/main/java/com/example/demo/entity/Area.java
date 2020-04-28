package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2020/4/7.
 */
@Data
@TableName("tb_area")
public class Area {

    //主键ID
//    @TableId(type = IdType.UUID)
    @TableId
    private Long areaId;
    //名称
    @TableField("areaName")
    private String areaName;
    //权重，越大越排前显示
    private Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;
}
