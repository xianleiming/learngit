package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_category")
public class Category {

  @TableId(type = IdType.ASSIGN_ID)
  private long cid;
  private String cname;
  private String icon;
  private String banner;
  private String keywords;
  private String createTime;

}
