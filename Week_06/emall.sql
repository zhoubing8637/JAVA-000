create table emall_goods
(
	id bigint auto_increment comment '主键'
		primary key,
	goods_name varchar(16) charset utf8 null comment '商品名称',
	goods_sn varchar(16) charset utf8 null comment '商品编码'，
	goods_price decimal null comment '商品单价',
	goods_img varchar(255) charset utf8 null comment '商品图片',
                goods_des varchar(255) charset utf8 null comment '商品描述',
	goods_num bignit  null comment '商品数量'，
	gmt_create timestamp null comment '创建时间',
	creator bigint null comment '创建该数据的用户 Id',
	gmt_modified timestamp null comment '下单时间',
	modifier bigint null comment '下单用户的 id',
	is_deleted varchar(1) charset utf8 default 'N' null comment '是否删除标记',
	is_on_sale varchar(1) charset utf8 null comment '是否上架 Y：是 N：否',
	
)
comment '商品表' charset=utf8mb4;

create table emall_order
(
	id bigint auto_increment
		primary key,
	gmt_create timestamp null comment '创建时间',
	creator bigint null comment '创建该数据的用户 Id',
	gmt_modified timestamp null comment '下单时间',
	modifier bigint null comment '下单用户的 id',
	address varchar(128) charset utf8 null comment '详细收货地址',
	tel varchar(16) charset utf8 null comment '收货电话'，
	goods_sn varchar(16) charset utf8 null comment '商品编码'，
	order_amount decimal null comment '订单金额',
	remark varchar(256) charset utf8 null comment '订单备注',
	order_sn varchar(64) charset utf8 null comment '订单编码',
	order_status varchar(64) charset utf8 null comment '订单状态',
	is_deleted varchar(1) charset utf8 default 'N' null comment '是否删除标记'
)
comment '订单表' charset=utf8mb4;

create table emall_user
(
	id bigint not null comment 'id '
		primary key,
	gmt_create timestamp null comment '创建时间',
	creator bigint null comment '创建该数据的用户 Id',
	user_ account bignit null comment '用户账号'
	nick_name varchar(32) charset utf8 null,
	password varchar(125) charset utf8 not null,
	email varchar(255) charset utf8 null comment 'email',
	mobile varchar(11) charset utf8 not null comment '手机号码',
	user_name varchar(32) charset utf8 not null comment '用户真实姓名'，
	user_img varchar(255) charset utf8 null comment '用户头像',
)
charset=utf8mb4;
comment '用户表' charset=utf8mb4;