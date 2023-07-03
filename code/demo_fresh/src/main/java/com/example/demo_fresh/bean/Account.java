package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("account")
public class Account {

  @TableId(type = IdType.ASSIGN_ID)
  private long id;
  private double balance;
  private String name;

}
