package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_cart")
public class Cart {

  @TableId(type = IdType.ASSIGN_ID)
  private long id;
  private long uid;
  private long gid;
  private String goodsName;
  private double price;
  private long number;
  private long unit;
  private String picUrl;
  private String createTime;
  private String updateTime;

}
