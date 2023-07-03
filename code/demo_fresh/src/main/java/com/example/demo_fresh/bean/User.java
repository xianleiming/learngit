package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_user")
public class User {

  @TableId(type = IdType.ASSIGN_ID)
  private long uid;
  private String uname;
  private String upassword;
  private String sex;
  private String nickname;
  private String birthday;
  private String email;
  private String phone;
  private String icon;
  private long status;
  /** 逻辑删除 */
  @TableLogic
  private long deleted;
  private String createTime;
  private String updateTime;

  @TableField(exist = false)
  private String data;

  public User(long uid) {
    this.uid = uid;
  }
  public User(String uname, String upassword) {
    this.uname = uname;
    this.upassword = upassword;
  }

}
