package com.example.demo_fresh.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("f_order_goods")
public class OrderGoods {

  @TableId(type = IdType.ASSIGN_ID)
  private long id;
  private long orderId;
  private String ordersn;
  private long goodsId;
  private String goodsName;
  private long number;
  private double price;
  private String picUrl;
  private String createTime;

}
