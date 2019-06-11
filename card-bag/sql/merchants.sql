/*
Navicat MySQL Data Transfer

Source Server         : 120.79.151.179
Source Server Version : 50718
Source Host           : 120.79.151.179:3306
Source Database       : passbook

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-06-11 09:22:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for merchants
-- ----------------------------
DROP TABLE IF EXISTS `merchants`;
CREATE TABLE `merchants` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商户名称',
  `logo_url` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商户 logo',
  `business_license_url` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商户营业执照',
  `phone` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商户联系电话',
  `address` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商户地址',
  `is_audit` tinyint(1) NOT NULL COMMENT '是否通过审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
