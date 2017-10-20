-- 建数据库
CREATE DATABASE IF NOT EXISTS osp DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
CREATE USER 'ospadmin'@'%' IDENTIFIED BY '123456';
GRANT ALL ON osp.* TO 'ospadmin'@'%';

-- 用户表
drop table osp.osp_user;
create table osp.osp_user(
  `id` int not null auto_increment primary key  comment '编号，自增长主键',
  `username` varchar(128) not null comment '用户名',
  `password` varchar(128) not null comment '密码',
  `emp_code` varchar(128) null comment '工号',
  `status` int not null default 1 comment '状态，0-无效 1-有效',
  `create_user` varchar(64) not null comment '创建人员',
  `create_time` timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
  `modify_user` varchar(64)  comment '修改人员',
  `modify_time` timestamp  comment '修改时间'
);