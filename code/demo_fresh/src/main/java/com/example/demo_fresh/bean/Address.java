package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_address")
public class Address {

  @TableId(type = IdType.ASSIGN_ID)
  private long aid;
  private long uid;
  private String address;
  private String addressee;
  private String phone;
  private String postcode;
  private String createTime;
  private String updateTime;

}
