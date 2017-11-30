-- 建数据库
CREATE DATABASE IF NOT EXISTS osp DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
CREATE USER 'ospadmin'@'%' IDENTIFIED BY '123456';
GRANT ALL ON osp.* TO 'ospadmin'@'%';

-- 用户表
drop table osp.osp_user;
create table osp.t_user(
`id` int not null auto_increment primary key  comment '编号，自增长主键',
`account` varchar(16) not null comment '帐号',
`password` varchar(128) not null comment '密码',
`name` varchar(64) not null comment '姓名',
`sex` varchar(64)  comment '性别，字典',
`birthday` date  comment '出生日期',
`cert_type` varchar(2)  comment '证件类型，字典',
`cert_no` varchar(24)  comment '证件号码',
`tel_number` varchar(24)  comment '固定电话',
`mob_number` varchar(24)  comment '手机号码',
`fax_number` varchar(24)  comment '传真号码',
`email` varchar(64)  comment '电子邮件',
`emp_code` varchar(24)  comment '工号',
`position` varchar(2)  comment '职位，字典',
`password_status` varchar(1) not null default '0' comment '密码状态，0-临时密码 1-永久密码',
`last_login_time` timestamp  comment '最后登录时间',
`expiry_time` date not null default '2999-12-31' comment '到期时间，帐号失效日期',
`status` varchar(1) not null default '1' comment '状态，0-无效 1-有效',
`remark` varchar(2000)  comment '备注',
`create_user` varchar(64) not null comment '创建人员',
`create_time` timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
`modify_user` varchar(64)  comment '修改人员',
`modify_time` timestamp  comment '修改时间'
);

--代码表
drop table osp.t_code;表
create table osp.t_code(
`id` int not null auto_increment primary key  comment '编号，自增长主键',
`type_code` varchar(64) not null comment '代码类型',
`type_name` varchar(128) not null comment '代码类型名称',
`item_code` varchar(64) not null comment '代码',
`item_name` varchar(128) not null comment '代码名称',
`item_sort` int not null comment '代码排序',
`status` varchar(1) not null default '1' comment '状态，0-无效 1-有效',
`attr1` varchar(512)  comment '扩展属性1',
`attr2` varchar(512)  comment '扩展属性2',
`attr3` varchar(512)  comment '扩展属性3',
`attr4` varchar(512)  comment '扩展属性4',
`attr5` varchar(512)  comment '扩展属性5',
`remark` varchar(2000)  comment '备注',
`create_user` varchar(64) not null comment '创建人员',
`create_time` timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
`modify_user` varchar(64)  comment '修改人员',
`modify_time` timestamp  comment '修改时间'
);