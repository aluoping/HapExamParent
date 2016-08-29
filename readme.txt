mvn clone 下来之后

导入到eclipse,
发布运行即可，本系统用的是mysql数据库

1.用admin admin登录系统，

2.在表hap_om_order_headers 和 hap_om_order_lines 表中插如测试数据

如在表hap_om_order_headers插入:

INSERT INTO `hap_om_order_headers` VALUES ('1', 'a1', '101', '2016-08-24 00:00:00', 'new', '201', '1', '-1', '-1', '2016-08-27 10:05:47', '-1', '-1', '2016-08-27 10:05:47', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `hap_om_order_headers` VALUES ('2', 'a2', '101', '2016-08-23 00:00:00', 'new', '202', '1', '-1', '-1', '2016-08-27 10:07:00', '-1', '-1', '2016-08-27 10:07:00', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `hap_om_order_headers` VALUES ('3', 'a3', '101', '2016-08-24 00:00:00', 'submited', '203', '1', '-1', '-1', '2016-08-27 10:07:50', '-1', '-1', '2016-08-27 10:07:50', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `hap_om_order_headers` VALUES ('4', 'a4', '101', '2016-08-25 00:00:00', 'rejected', '203', '1', '-1', '-1', '2016-08-27 10:09:03', '-1', '-1', '2016-08-27 10:09:03', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

在表hap_om_order_lines中插入

INSERT INTO `hap_om_order_lines` VALUES ('1', '1', '1', '1001', '10', 'g', '10', '钢管', '101', 'asdfa', 'dfsasd', 'asdfa', 'adsf', 'adf', '1', '-1', '-1', '2016-08-27 10:11:30', '-1', '-1', '2016-08-27 10:11:30', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `hap_om_order_lines` VALUES ('2', '2', '2', '1002', '5', 'kg', '10', '水果', '101', 'fdgd', 'sa', 'fd', 'adsf', 'dfa', '1', '-1', '-1', '2016-08-27 10:13:43', '-1', '-1', '2016-08-27 10:13:43', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

3.初次运行，可能需要在资源管理中添加view下的order/order_index.html资源

本系统实现了订单汇总查询界面的大部分功能，除导出Excel和销售订单号的超链接功能，
订单明细界面实现一部分功能