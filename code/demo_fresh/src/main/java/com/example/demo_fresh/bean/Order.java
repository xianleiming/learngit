package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_order")
public class Order {

  @TableId(type = IdType.ASSIGN_ID)
  private long oid;
  private String ordersn;
  private long userId;
  private long orderStatus;
  private String consignee;
  private String phone;
  private String address;
  private String message;
  private long payType;
  private double goodsPrice;
  private double freightPrice;
  private double orderPrice;
  private String shipSn;
  private String shipChannel;
  private String confirmTime;
  private long comments;
  private String endTime;
  private String createTime;

}
