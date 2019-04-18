/*
Navicat MySQL Data Transfer

Source Server         : springBoot
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : ssm_test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-04-18 16:17:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_student_info
-- ----------------------------
DROP TABLE IF EXISTS `t_student_info`;
CREATE TABLE `t_student_info` (
  `STU_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `STU_NUMBER` int(11) DEFAULT NULL COMMENT '学号',
  `STU_NAME` varchar(20) DEFAULT NULL COMMENT '姓名',
  `STU_AGE` int(11) DEFAULT NULL COMMENT '年龄',
  `STU_GENDER` varchar(1) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`STU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_info
-- ----------------------------
INSERT INTO `t_student_info` VALUES ('1', '1', '张三', '23', '男');
INSERT INTO `t_student_info` VALUES ('2', '2', '李四', '24', '女');
