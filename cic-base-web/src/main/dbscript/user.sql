/*
 Navicat Premium Data Transfer

 Source Server         : Local-Mysql
 Source Server Type    : MySQL
 Source Server Version : 50634
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50634
 File Encoding         : utf-8

 Date: 10/19/2017 16:21:51 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL COMMENT '主键',
  `name` varchar(64) NOT NULL COMMENT '姓名',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'test', '2017-10-17', '测试');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
