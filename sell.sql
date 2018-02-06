CREATE TABLE `product_info` (
    `product_id` VARCHAR(32) NOT NULL,
    `product_name` VARCHAR(64) NOT NULL comment '商品名称',
    `product_price` DECIMAL(8,2) NOT NULL comment '单价',
    `product_stock` INT NOT NULL comment '库存',
    `product_status` INT NOT NULL comment '状态， 0 正常 1下架',
    `product_description` VARCHAR(64) comment '描述',
    `product_icon` VARCHAR(512) comment '小图',
    `category_type` INT NOT NULL comment '类目编号',
    `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp comment '创建时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp on update current_timestamp comment '修改时间',
    PRIMARY KEY (`product_id`)

 ) comment '商品表';

CREATE TABLE `product_category` (
    `category_id` INT NOT NULL auto_increment,
    `category_name` VARCHAR(64) NOT NULL comment '类目名字',
    `category_type` INT NOT NULL comment '类目编号',
    `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp comment '创建时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp on update current_timestamp comment '修改时间',
    PRIMARY KEY (`category_id`),
    UNIQUE KEY `uqe_category_type` (`category_type`)
) comment '类目表';

CREATE TABLE `order_master` (
    `order_id` VARCHAR(32) NOT NULL,
    `buyer_name` VARCHAR(32) NOT NULL comment '买家名字',
    `buyer_phone` VARCHAR(32) NOT NULL comment '买家电话',
    `buyer_address` VARCHAR(128) NOT NULL comment '买家地址',
    `buyer_openid` VARCHAR(64) NOT NULL comment '买家微信openid',
    `order_amount` DECIMAL(8,2) NOT NULL comment '订单总金额',
    `order_status` TINYINT(3) NOT NULL DEFAULT '0' comment '订单状态, 默认0',
    `pay_status` TINYINT(3) NOT NULL DEFAULT '0' comment '支付状态, 默认0',
    `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp comment '创建时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp on update current_timestamp comment '修改时间',
    PRIMARY KEY (`order_id`),
    KEY `idx_buyer_openid` (`buyer_openid`)
) comment '订单表';

CREATE TABLE `order_detail` (
    `detail_id` VARCHAR(32) NOT NULL,
    `order_id` VARCHAR(32) NOT NULL,
    `product_id` VARCHAR(32) NOT NULL,
    `product_name` VARCHAR(64) NOT NULL comment '商品名称',
    `product_price` DECIMAL(8,2) NOT NULL comment '商品价格',
    `product_quantity` INT NOT NULL comment '商品数量',
    `product_icon` VARCHAR(512) NOT NULL comment '商品小图',
    `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp comment '创建时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp on update current_timestamp comment '修改时间',
    PRIMARY KEY (`detail_id`),
    KEY `idx_buyer_openid` (`order_id`)
) comment '订单详情表';
