package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_goods")
public class Goods {

  @TableId(type = IdType.ASSIGN_ID)
  private long gid;
  private String gname;
  private String title;
  private double price;
  private long unit;
  private long stock;
  private String brief;
  private String detail;
  private String keyword;
  private long cid;
  private long clicks;
  private String picUrl;
  private String gallery;
  private long isNew;
  private long isHot;
  private String createTime;
  private String updateTime;

}
