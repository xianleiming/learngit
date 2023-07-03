package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_footprint")
public class Footprint {

  @TableId(type = IdType.ASSIGN_ID)
  private long id;
  private long userId;
  private long goodsId;
  private String createTime;
  private String updateTime;
  private long deleted;

}
