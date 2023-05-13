/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : ssm_crmsys

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-01-08 19:37:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  ` deptName` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `deptMsg` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '技术部', '=====技术=====');
INSERT INTO `department` VALUES ('2', '开发部', '=====开发=====');
INSERT INTO `department` VALUES ('3', '研发部', '=====研发=====');
INSERT INTO `department` VALUES ('4', '市场部', '=====市场=====');
INSERT INTO `department` VALUES ('7', '财务部', '=====财务=======');
INSERT INTO `department` VALUES ('8', '事业部', '=====事业=======');
INSERT INTO `department` VALUES ('9', '营销部', '1');

-- ----------------------------
-- Table structure for `doctest`
-- ----------------------------
DROP TABLE IF EXISTS `doctest`;
CREATE TABLE `doctest` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `docName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `docMsg` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  `userAction` varchar(5) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of doctest
-- ----------------------------
INSERT INTO `doctest` VALUES ('1', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('2', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'test');
INSERT INTO `doctest` VALUES ('3', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('4', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'demo');
INSERT INTO `doctest` VALUES ('5', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('6', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('7', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'test');
INSERT INTO `doctest` VALUES ('8', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('9', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('10', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('11', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'test');
INSERT INTO `doctest` VALUES ('12', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('13', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');
INSERT INTO `doctest` VALUES ('14', '系统测试公告', '系统测试公告：为了保证系统的安全运行，做了对系统的测试和功能测试，对系统的优化使得系统运行更流畅，且提高了用户的使用效率！', 'admin');

-- ----------------------------
-- Table structure for `download`
-- ----------------------------
DROP TABLE IF EXISTS `download`;
CREATE TABLE `download` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `filename` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `filepath` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `filemsg` varchar(255) COLLATE utf8_bin NOT NULL,
  `fileadmin` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of download
-- ----------------------------

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `sex` varchar(5) COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `position_id` bigint(11) DEFAULT NULL,
  `eduSchool` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `idCard` varchar(18) COLLATE utf8_bin DEFAULT NULL,
  `dept_id` bigint(11) DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('2', '李四', '男', '1988888', 'adds@sina.com', '2', '本科', '18888*', '1', '广州', '2018-12-25 10:55:24');
INSERT INTO `employee` VALUES ('3', '王五', '男', '1988888', 'adds@sina.com', '1', '本科', '18888*', '3', '广州', '2018-12-25 10:55:24');
INSERT INTO `employee` VALUES ('5', '王柳', '男', '1988888', 'adds@sina.com', '3', '本科', '18888*', '1', '广州', '2018-12-25 10:55:24');
INSERT INTO `employee` VALUES ('20', '测试用户', '男', '18599575642', '1255@sina.com.cn', '2', '专科', '36856955696566556', '9', '上海', '2019-08-01 11:55:17');
INSERT INTO `employee` VALUES ('21', 'Lucy', '男', '18855669555', 'Lucy@gmail.com', '1', '博士', '3856655666955633', '9', '美国', '2019-08-01 11:55:04');
INSERT INTO `employee` VALUES ('22', '小李', '男', '13520109202', 'xiaoli@qq.com', '2', '博士', '15656519850252145', '1', 'xiaoli.com', '2019-02-12 18:21:07');
INSERT INTO `employee` VALUES ('24', '钱六', '男', '18899889999', '16a51651@136.com', '14', '本科', '34029918556544232', '3', '12345678910', '2020-01-08 10:02:13');
INSERT INTO `employee` VALUES ('25', '张三', '男', '15777559998', '123456@136.com', '14', '本科', '340899199906182346', '8', '15765423012', '2020-01-08 10:03:17');

-- ----------------------------
-- Table structure for `position`
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `positionName` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `positionMsg` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', 'DBA工程师', '1');
INSERT INTO `position` VALUES ('4', 'web前端工程师', '1');
INSERT INTO `position` VALUES ('14', '运维工程师', '1');
INSERT INTO `position` VALUES ('17', '数据分析师', '对互联网上的大数据进行分析，提高互联网的智能和现代化！');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '创建时间',
  `state` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('49', 'fdfsd', 'sgrger', '普通用户', '2020-01-08 09:31:53', '1');
INSERT INTO `user` VALUES ('50', 'admin', 'admin', '超级管理员', '2020-01-08 09:46:21', '1');
INSERT INTO `user` VALUES ('51', 'sdfsd', 'sfdfd', '普通用户', '2020-01-08 09:51:26', '1');
