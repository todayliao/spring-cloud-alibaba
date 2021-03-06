package com.thatday.user.modules.user.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 文件夹表
 */
@Data
@Entity(name = "td_dir_group")
public class DirGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long userId;

    @NotNull
    private String groupTitle;

    private String groupIcon;

    @Column(columnDefinition = "timestamp default current_timestamp comment '创建时间'")
    private Date createTime;

    @Column(columnDefinition = "timestamp default current_timestamp on update current_timestamp comment '更新时间'")
    private Date updateTime;
}