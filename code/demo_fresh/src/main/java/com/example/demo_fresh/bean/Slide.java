package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_slide")
public class Slide {

  @TableId(type = IdType.ASSIGN_ID)
  private Long sid;
  private long type;
  private String pic;
  private String createTime;

}
