dohko-eureka-client-order-service
---
订单服务，注册到Eureka注册中心


1. 修改application.yml中数据库配置，改成自己的数据库信息；

2. 建表语句
```
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `commodity_code` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品编码',
  `quantity` int(11) NOT NULL DEFAULT 0 COMMENT '数量',
  `amount` int(11) NOT NULL DEFAULT 0 COMMENT '金额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;
```