-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootfd0t5g0m
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springbootfd0t5g0m`
--

/*!40000 DROP DATABASE IF EXISTS `springbootfd0t5g0m`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springbootfd0t5g0m` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springbootfd0t5g0m`;

--
-- Table structure for table `canjiapeixun`
--

DROP TABLE IF EXISTS `canjiapeixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canjiapeixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `peixunmingcheng` varchar(200) DEFAULT NULL COMMENT '培训名称',
  `peixuntupian` longtext COMMENT '培训图片',
  `peixunshijian` varchar(200) DEFAULT NULL COMMENT '培训时间',
  `peixundidian` varchar(200) DEFAULT NULL COMMENT '培训地点',
  `zhiyuanzhezhanghao` varchar(200) DEFAULT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `canjiashijian` datetime DEFAULT NULL COMMENT '参加时间',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='参加培训';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canjiapeixun`
--

LOCK TABLES `canjiapeixun` WRITE;
/*!40000 ALTER TABLE `canjiapeixun` DISABLE KEYS */;
INSERT INTO `canjiapeixun` VALUES (101,'2024-04-16 06:34:46','培训名称1','upload/canjiapeixun_peixuntupian1.jpg,upload/canjiapeixun_peixuntupian2.jpg,upload/canjiapeixun_peixuntupian3.jpg','培训时间1','培训地点1','志愿者账号1','志愿者姓名1','手机号码1','2024-04-16 14:34:46',1,1),(102,'2024-04-16 06:34:46','培训名称2','upload/canjiapeixun_peixuntupian2.jpg,upload/canjiapeixun_peixuntupian3.jpg,upload/canjiapeixun_peixuntupian4.jpg','培训时间2','培训地点2','志愿者账号2','志愿者姓名2','手机号码2','2024-04-16 14:34:46',2,2),(103,'2024-04-16 06:34:46','培训名称3','upload/canjiapeixun_peixuntupian3.jpg,upload/canjiapeixun_peixuntupian4.jpg,upload/canjiapeixun_peixuntupian5.jpg','培训时间3','培训地点3','志愿者账号3','志愿者姓名3','手机号码3','2024-04-16 14:34:46',3,3),(104,'2024-04-16 06:34:46','培训名称4','upload/canjiapeixun_peixuntupian4.jpg,upload/canjiapeixun_peixuntupian5.jpg,upload/canjiapeixun_peixuntupian6.jpg','培训时间4','培训地点4','志愿者账号4','志愿者姓名4','手机号码4','2024-04-16 14:34:46',4,4),(105,'2024-04-16 06:34:46','培训名称5','upload/canjiapeixun_peixuntupian5.jpg,upload/canjiapeixun_peixuntupian6.jpg,upload/canjiapeixun_peixuntupian7.jpg','培训时间5','培训地点5','志愿者账号5','志愿者姓名5','手机号码5','2024-04-16 14:34:46',5,5),(106,'2024-04-16 06:34:46','培训名称6','upload/canjiapeixun_peixuntupian6.jpg,upload/canjiapeixun_peixuntupian7.jpg,upload/canjiapeixun_peixuntupian8.jpg','培训时间6','培训地点6','志愿者账号6','志愿者姓名6','手机号码6','2024-04-16 14:34:46',6,6),(107,'2024-04-16 06:34:46','培训名称7','upload/canjiapeixun_peixuntupian7.jpg,upload/canjiapeixun_peixuntupian8.jpg,upload/canjiapeixun_peixuntupian9.jpg','培训时间7','培训地点7','志愿者账号7','志愿者姓名7','手机号码7','2024-04-16 14:34:46',7,7),(108,'2024-04-16 06:34:46','培训名称8','upload/canjiapeixun_peixuntupian8.jpg,upload/canjiapeixun_peixuntupian9.jpg,upload/canjiapeixun_peixuntupian10.jpg','培训时间8','培训地点8','志愿者账号8','志愿者姓名8','手机号码8','2024-04-16 14:34:46',8,8);
/*!40000 ALTER TABLE `canjiapeixun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COMMENT '头像',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  `istop` int(11) DEFAULT '0' COMMENT '是否置顶',
  `toptime` datetime DEFAULT NULL COMMENT '置顶时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=169 DEFAULT CHARSET=utf8 COMMENT='交流论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (161,'2024-04-16 06:34:46','帖子标题1','帖子内容1',0,1,'用户名1','upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg','开放',0,'2024-04-16 14:34:46'),(162,'2024-04-16 06:34:46','帖子标题2','帖子内容2',0,2,'用户名2','upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg','开放',0,'2024-04-16 14:34:46'),(163,'2024-04-16 06:34:46','帖子标题3','帖子内容3',0,3,'用户名3','upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg','开放',0,'2024-04-16 14:34:46'),(164,'2024-04-16 06:34:46','帖子标题4','帖子内容4',0,4,'用户名4','upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg','开放',0,'2024-04-16 14:34:46'),(165,'2024-04-16 06:34:46','帖子标题5','帖子内容5',0,5,'用户名5','upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg','开放',0,'2024-04-16 14:34:46'),(166,'2024-04-16 06:34:46','帖子标题6','帖子内容6',0,6,'用户名6','upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg','开放',0,'2024-04-16 14:34:46'),(167,'2024-04-16 06:34:46','帖子标题7','帖子内容7',0,7,'用户名7','upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg','开放',0,'2024-04-16 14:34:46'),(168,'2024-04-16 06:34:46','帖子标题8','帖子内容8',0,8,'用户名8','upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg,upload/forum_avatarurl10.jpg','开放',0,'2024-04-16 14:34:46');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuwuquyu`
--

DROP TABLE IF EXISTS `fuwuquyu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuwuquyu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fuwuquyu` varchar(200) NOT NULL COMMENT '服务区域',
  PRIMARY KEY (`id`),
  UNIQUE KEY `fuwuquyu` (`fuwuquyu`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='服务区域';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuwuquyu`
--

LOCK TABLES `fuwuquyu` WRITE;
/*!40000 ALTER TABLE `fuwuquyu` DISABLE KEYS */;
INSERT INTO `fuwuquyu` VALUES (51,'2024-04-16 06:34:46','服务区域1'),(52,'2024-04-16 06:34:46','服务区域2'),(53,'2024-04-16 06:34:46','服务区域3'),(54,'2024-04-16 06:34:46','服务区域4'),(55,'2024-04-16 06:34:46','服务区域5'),(56,'2024-04-16 06:34:46','服务区域6'),(57,'2024-04-16 06:34:46','服务区域7'),(58,'2024-04-16 06:34:46','服务区域8');
/*!40000 ALTER TABLE `fuwuquyu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuwutongji`
--

DROP TABLE IF EXISTS `fuwutongji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuwutongji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhiyuanzhezhanghao` varchar(200) DEFAULT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `fuwushizhang` double NOT NULL COMMENT '服务时长',
  `fuwupingjia` varchar(200) NOT NULL COMMENT '服务评价',
  `xiaozubianhao` varchar(200) DEFAULT NULL COMMENT '小组编号',
  `zuzhangxingming` varchar(200) DEFAULT NULL COMMENT '组长姓名',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8 COMMENT='服务统计';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuwutongji`
--

LOCK TABLES `fuwutongji` WRITE;
/*!40000 ALTER TABLE `fuwutongji` DISABLE KEYS */;
INSERT INTO `fuwutongji` VALUES (151,'2024-04-16 06:34:46','志愿者账号1','志愿者姓名1',1,'良','小组编号1','组长姓名1','2024-04-16'),(152,'2024-04-16 06:34:46','志愿者账号2','志愿者姓名2',2,'良','小组编号2','组长姓名2','2024-04-16'),(153,'2024-04-16 06:34:46','志愿者账号3','志愿者姓名3',3,'良','小组编号3','组长姓名3','2024-04-16'),(154,'2024-04-16 06:34:46','志愿者账号4','志愿者姓名4',4,'良','小组编号4','组长姓名4','2024-04-16'),(155,'2024-04-16 06:34:46','志愿者账号5','志愿者姓名5',5,'良','小组编号5','组长姓名5','2024-04-16'),(156,'2024-04-16 06:34:46','志愿者账号6','志愿者姓名6',6,'良','小组编号6','组长姓名6','2024-04-16'),(157,'2024-04-16 06:34:46','志愿者账号7','志愿者姓名7',7,'良','小组编号7','组长姓名7','2024-04-16'),(158,'2024-04-16 06:34:46','志愿者账号8','志愿者姓名8',8,'良','小组编号8','组长姓名8','2024-04-16');
/*!40000 ALTER TABLE `fuwutongji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huodongxinxi`
--

DROP TABLE IF EXISTS `huodongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huodongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongmingcheng` varchar(200) NOT NULL COMMENT '活动名称',
  `xuanchuantupian` longtext COMMENT '宣传图片',
  `huodongshipin` longtext COMMENT '活动视频',
  `huodongxiangqing` longtext COMMENT '活动详情',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='活动信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huodongxinxi`
--

LOCK TABLES `huodongxinxi` WRITE;
/*!40000 ALTER TABLE `huodongxinxi` DISABLE KEYS */;
INSERT INTO `huodongxinxi` VALUES (41,'2024-04-16 06:34:46','活动名称1','upload/huodongxinxi_xuanchuantupian1.jpg,upload/huodongxinxi_xuanchuantupian2.jpg,upload/huodongxinxi_xuanchuantupian3.jpg','','活动详情1'),(42,'2024-04-16 06:34:46','活动名称2','upload/huodongxinxi_xuanchuantupian2.jpg,upload/huodongxinxi_xuanchuantupian3.jpg,upload/huodongxinxi_xuanchuantupian4.jpg','','活动详情2'),(43,'2024-04-16 06:34:46','活动名称3','upload/huodongxinxi_xuanchuantupian3.jpg,upload/huodongxinxi_xuanchuantupian4.jpg,upload/huodongxinxi_xuanchuantupian5.jpg','','活动详情3'),(44,'2024-04-16 06:34:46','活动名称4','upload/huodongxinxi_xuanchuantupian4.jpg,upload/huodongxinxi_xuanchuantupian5.jpg,upload/huodongxinxi_xuanchuantupian6.jpg','','活动详情4'),(45,'2024-04-16 06:34:46','活动名称5','upload/huodongxinxi_xuanchuantupian5.jpg,upload/huodongxinxi_xuanchuantupian6.jpg,upload/huodongxinxi_xuanchuantupian7.jpg','','活动详情5'),(46,'2024-04-16 06:34:46','活动名称6','upload/huodongxinxi_xuanchuantupian6.jpg,upload/huodongxinxi_xuanchuantupian7.jpg,upload/huodongxinxi_xuanchuantupian8.jpg','','活动详情6'),(47,'2024-04-16 06:34:46','活动名称7','upload/huodongxinxi_xuanchuantupian7.jpg,upload/huodongxinxi_xuanchuantupian8.jpg,upload/huodongxinxi_xuanchuantupian9.jpg','','活动详情7'),(48,'2024-04-16 06:34:46','活动名称8','upload/huodongxinxi_xuanchuantupian8.jpg,upload/huodongxinxi_xuanchuantupian9.jpg,upload/huodongxinxi_xuanchuantupian10.jpg','','活动详情8');
/*!40000 ALTER TABLE `huodongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huodongzhubanfang`
--

DROP TABLE IF EXISTS `huodongzhubanfang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huodongzhubanfang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhubanfangzhanghao` varchar(200) NOT NULL COMMENT '主办方账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zhubanfangmingcheng` varchar(200) NOT NULL COMMENT '主办方名称',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `tupian` longtext COMMENT '图片',
  `zhubanfangjianjie` longtext COMMENT '主办方简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhubanfangzhanghao` (`zhubanfangzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='活动主办方';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huodongzhubanfang`
--

LOCK TABLES `huodongzhubanfang` WRITE;
/*!40000 ALTER TABLE `huodongzhubanfang` DISABLE KEYS */;
INSERT INTO `huodongzhubanfang` VALUES (11,'2024-04-16 06:34:46','主办方账号1','123456','主办方名称1','13823888881','upload/huodongzhubanfang_tupian1.jpg','主办方简介1'),(12,'2024-04-16 06:34:46','主办方账号2','123456','主办方名称2','13823888882','upload/huodongzhubanfang_tupian2.jpg','主办方简介2'),(13,'2024-04-16 06:34:46','主办方账号3','123456','主办方名称3','13823888883','upload/huodongzhubanfang_tupian3.jpg','主办方简介3'),(14,'2024-04-16 06:34:46','主办方账号4','123456','主办方名称4','13823888884','upload/huodongzhubanfang_tupian4.jpg','主办方简介4'),(15,'2024-04-16 06:34:46','主办方账号5','123456','主办方名称5','13823888885','upload/huodongzhubanfang_tupian5.jpg','主办方简介5'),(16,'2024-04-16 06:34:46','主办方账号6','123456','主办方名称6','13823888886','upload/huodongzhubanfang_tupian6.jpg','主办方简介6'),(17,'2024-04-16 06:34:46','主办方账号7','123456','主办方名称7','13823888887','upload/huodongzhubanfang_tupian7.jpg','主办方简介7'),(18,'2024-04-16 06:34:46','主办方账号8','123456','主办方名称8','13823888888','upload/huodongzhubanfang_tupian8.jpg','主办方简介8');
/*!40000 ALTER TABLE `huodongzhubanfang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peixunchengji`
--

DROP TABLE IF EXISTS `peixunchengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peixunchengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `peixunmingcheng` varchar(200) DEFAULT NULL COMMENT '培训名称',
  `peixuntupian` longtext COMMENT '培训图片',
  `zhiyuanzhezhanghao` varchar(200) DEFAULT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `kaohechengji` varchar(200) NOT NULL COMMENT '考核成绩',
  `kaoheshijian` datetime DEFAULT NULL COMMENT '考核时间',
  `crossuserid` bigint(20) DEFAULT NULL COMMENT '跨表用户id',
  `crossrefid` bigint(20) DEFAULT NULL COMMENT '跨表主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8 COMMENT='培训成绩';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peixunchengji`
--

LOCK TABLES `peixunchengji` WRITE;
/*!40000 ALTER TABLE `peixunchengji` DISABLE KEYS */;
INSERT INTO `peixunchengji` VALUES (111,'2024-04-16 06:34:46','培训名称1','upload/peixunchengji_peixuntupian1.jpg,upload/peixunchengji_peixuntupian2.jpg,upload/peixunchengji_peixuntupian3.jpg','志愿者账号1','志愿者姓名1','合格','2024-04-16 14:34:46',1,1),(112,'2024-04-16 06:34:46','培训名称2','upload/peixunchengji_peixuntupian2.jpg,upload/peixunchengji_peixuntupian3.jpg,upload/peixunchengji_peixuntupian4.jpg','志愿者账号2','志愿者姓名2','合格','2024-04-16 14:34:46',2,2),(113,'2024-04-16 06:34:46','培训名称3','upload/peixunchengji_peixuntupian3.jpg,upload/peixunchengji_peixuntupian4.jpg,upload/peixunchengji_peixuntupian5.jpg','志愿者账号3','志愿者姓名3','合格','2024-04-16 14:34:46',3,3),(114,'2024-04-16 06:34:46','培训名称4','upload/peixunchengji_peixuntupian4.jpg,upload/peixunchengji_peixuntupian5.jpg,upload/peixunchengji_peixuntupian6.jpg','志愿者账号4','志愿者姓名4','合格','2024-04-16 14:34:46',4,4),(115,'2024-04-16 06:34:46','培训名称5','upload/peixunchengji_peixuntupian5.jpg,upload/peixunchengji_peixuntupian6.jpg,upload/peixunchengji_peixuntupian7.jpg','志愿者账号5','志愿者姓名5','合格','2024-04-16 14:34:46',5,5),(116,'2024-04-16 06:34:46','培训名称6','upload/peixunchengji_peixuntupian6.jpg,upload/peixunchengji_peixuntupian7.jpg,upload/peixunchengji_peixuntupian8.jpg','志愿者账号6','志愿者姓名6','合格','2024-04-16 14:34:46',6,6),(117,'2024-04-16 06:34:46','培训名称7','upload/peixunchengji_peixuntupian7.jpg,upload/peixunchengji_peixuntupian8.jpg,upload/peixunchengji_peixuntupian9.jpg','志愿者账号7','志愿者姓名7','合格','2024-04-16 14:34:46',7,7),(118,'2024-04-16 06:34:46','培训名称8','upload/peixunchengji_peixuntupian8.jpg,upload/peixunchengji_peixuntupian9.jpg,upload/peixunchengji_peixuntupian10.jpg','志愿者账号8','志愿者姓名8','合格','2024-04-16 14:34:46',8,8);
/*!40000 ALTER TABLE `peixunchengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peixunxinxi`
--

DROP TABLE IF EXISTS `peixunxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peixunxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `peixunmingcheng` varchar(200) NOT NULL COMMENT '培训名称',
  `peixuntupian` longtext COMMENT '培训图片',
  `peixunshijian` datetime NOT NULL COMMENT '培训时间',
  `peixundidian` varchar(200) NOT NULL COMMENT '培训地点',
  `peixunneirong` longtext COMMENT '培训内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='培训信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peixunxinxi`
--

LOCK TABLES `peixunxinxi` WRITE;
/*!40000 ALTER TABLE `peixunxinxi` DISABLE KEYS */;
INSERT INTO `peixunxinxi` VALUES (91,'2024-04-16 06:34:46','培训名称1','upload/peixunxinxi_peixuntupian1.jpg,upload/peixunxinxi_peixuntupian2.jpg,upload/peixunxinxi_peixuntupian3.jpg','2024-04-16 14:34:46','培训地点1','培训内容1','2024-04-16'),(92,'2024-04-16 06:34:46','培训名称2','upload/peixunxinxi_peixuntupian2.jpg,upload/peixunxinxi_peixuntupian3.jpg,upload/peixunxinxi_peixuntupian4.jpg','2024-04-16 14:34:46','培训地点2','培训内容2','2024-04-16'),(93,'2024-04-16 06:34:46','培训名称3','upload/peixunxinxi_peixuntupian3.jpg,upload/peixunxinxi_peixuntupian4.jpg,upload/peixunxinxi_peixuntupian5.jpg','2024-04-16 14:34:46','培训地点3','培训内容3','2024-04-16'),(94,'2024-04-16 06:34:46','培训名称4','upload/peixunxinxi_peixuntupian4.jpg,upload/peixunxinxi_peixuntupian5.jpg,upload/peixunxinxi_peixuntupian6.jpg','2024-04-16 14:34:46','培训地点4','培训内容4','2024-04-16'),(95,'2024-04-16 06:34:46','培训名称5','upload/peixunxinxi_peixuntupian5.jpg,upload/peixunxinxi_peixuntupian6.jpg,upload/peixunxinxi_peixuntupian7.jpg','2024-04-16 14:34:46','培训地点5','培训内容5','2024-04-16'),(96,'2024-04-16 06:34:46','培训名称6','upload/peixunxinxi_peixuntupian6.jpg,upload/peixunxinxi_peixuntupian7.jpg,upload/peixunxinxi_peixuntupian8.jpg','2024-04-16 14:34:46','培训地点6','培训内容6','2024-04-16'),(97,'2024-04-16 06:34:46','培训名称7','upload/peixunxinxi_peixuntupian7.jpg,upload/peixunxinxi_peixuntupian8.jpg,upload/peixunxinxi_peixuntupian9.jpg','2024-04-16 14:34:46','培训地点7','培训内容7','2024-04-16'),(98,'2024-04-16 06:34:46','培训名称8','upload/peixunxinxi_peixuntupian8.jpg,upload/peixunxinxi_peixuntupian9.jpg,upload/peixunxinxi_peixuntupian10.jpg','2024-04-16 14:34:46','培训地点8','培训内容8','2024-04-16');
/*!40000 ALTER TABLE `peixunxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `renwujinzhan`
--

DROP TABLE IF EXISTS `renwujinzhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `renwujinzhan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `renwumingcheng` varchar(200) DEFAULT NULL COMMENT '任务名称',
  `renwutupian` longtext COMMENT '任务图片',
  `renwudidian` varchar(200) DEFAULT NULL COMMENT '任务地点',
  `zhiyuanzhezhanghao` varchar(200) DEFAULT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `renwujinzhan` varchar(200) DEFAULT NULL COMMENT '任务进展',
  `renwuxiangqing` longtext COMMENT '任务详情',
  `fuwushijian` datetime DEFAULT NULL COMMENT '服务时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8 COMMENT='任务进展';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `renwujinzhan`
--

LOCK TABLES `renwujinzhan` WRITE;
/*!40000 ALTER TABLE `renwujinzhan` DISABLE KEYS */;
INSERT INTO `renwujinzhan` VALUES (131,'2024-04-16 06:34:46','任务名称1','upload/renwujinzhan_renwutupian1.jpg,upload/renwujinzhan_renwutupian2.jpg,upload/renwujinzhan_renwutupian3.jpg','任务地点1','志愿者账号1','志愿者姓名1','任务进展1','任务详情1','2024-04-16 14:34:46'),(132,'2024-04-16 06:34:46','任务名称2','upload/renwujinzhan_renwutupian2.jpg,upload/renwujinzhan_renwutupian3.jpg,upload/renwujinzhan_renwutupian4.jpg','任务地点2','志愿者账号2','志愿者姓名2','任务进展2','任务详情2','2024-04-16 14:34:46'),(133,'2024-04-16 06:34:46','任务名称3','upload/renwujinzhan_renwutupian3.jpg,upload/renwujinzhan_renwutupian4.jpg,upload/renwujinzhan_renwutupian5.jpg','任务地点3','志愿者账号3','志愿者姓名3','任务进展3','任务详情3','2024-04-16 14:34:46'),(134,'2024-04-16 06:34:46','任务名称4','upload/renwujinzhan_renwutupian4.jpg,upload/renwujinzhan_renwutupian5.jpg,upload/renwujinzhan_renwutupian6.jpg','任务地点4','志愿者账号4','志愿者姓名4','任务进展4','任务详情4','2024-04-16 14:34:46'),(135,'2024-04-16 06:34:46','任务名称5','upload/renwujinzhan_renwutupian5.jpg,upload/renwujinzhan_renwutupian6.jpg,upload/renwujinzhan_renwutupian7.jpg','任务地点5','志愿者账号5','志愿者姓名5','任务进展5','任务详情5','2024-04-16 14:34:46'),(136,'2024-04-16 06:34:46','任务名称6','upload/renwujinzhan_renwutupian6.jpg,upload/renwujinzhan_renwutupian7.jpg,upload/renwujinzhan_renwutupian8.jpg','任务地点6','志愿者账号6','志愿者姓名6','任务进展6','任务详情6','2024-04-16 14:34:46'),(137,'2024-04-16 06:34:46','任务名称7','upload/renwujinzhan_renwutupian7.jpg,upload/renwujinzhan_renwutupian8.jpg,upload/renwujinzhan_renwutupian9.jpg','任务地点7','志愿者账号7','志愿者姓名7','任务进展7','任务详情7','2024-04-16 14:34:46'),(138,'2024-04-16 06:34:46','任务名称8','upload/renwujinzhan_renwutupian8.jpg,upload/renwujinzhan_renwutupian9.jpg,upload/renwujinzhan_renwutupian10.jpg','任务地点8','志愿者账号8','志愿者姓名8','任务进展8','任务详情8','2024-04-16 14:34:46');
/*!40000 ALTER TABLE `renwujinzhan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `renwutongzhi`
--

DROP TABLE IF EXISTS `renwutongzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `renwutongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhiyuanzhezhanghao` varchar(200) NOT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `tongzhineirong` longtext COMMENT '通知内容',
  `tongzhishijian` datetime DEFAULT NULL COMMENT '通知时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8 COMMENT='任务通知';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `renwutongzhi`
--

LOCK TABLES `renwutongzhi` WRITE;
/*!40000 ALTER TABLE `renwutongzhi` DISABLE KEYS */;
INSERT INTO `renwutongzhi` VALUES (141,'2024-04-16 06:34:46','志愿者账号1','志愿者姓名1','通知内容1','2024-04-16 14:34:46'),(142,'2024-04-16 06:34:46','志愿者账号2','志愿者姓名2','通知内容2','2024-04-16 14:34:46'),(143,'2024-04-16 06:34:46','志愿者账号3','志愿者姓名3','通知内容3','2024-04-16 14:34:46'),(144,'2024-04-16 06:34:46','志愿者账号4','志愿者姓名4','通知内容4','2024-04-16 14:34:46'),(145,'2024-04-16 06:34:46','志愿者账号5','志愿者姓名5','通知内容5','2024-04-16 14:34:46'),(146,'2024-04-16 06:34:46','志愿者账号6','志愿者姓名6','通知内容6','2024-04-16 14:34:46'),(147,'2024-04-16 06:34:46','志愿者账号7','志愿者姓名7','通知内容7','2024-04-16 14:34:46'),(148,'2024-04-16 06:34:46','志愿者账号8','志愿者姓名8','通知内容8','2024-04-16 14:34:46');
/*!40000 ALTER TABLE `renwutongzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2024-04-16 06:34:46');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhaomushenqing`
--

DROP TABLE IF EXISTS `zhaomushenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhaomushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaomumingcheng` varchar(200) DEFAULT NULL COMMENT '招募名称',
  `zhaomufengmian` longtext COMMENT '招募封面',
  `zhaomudidian` varchar(200) DEFAULT NULL COMMENT '招募地点',
  `zhaomushijian` varchar(200) DEFAULT NULL COMMENT '招募时间',
  `zhubanfangzhanghao` varchar(200) DEFAULT NULL COMMENT '主办方账号',
  `zhubanfangmingcheng` varchar(200) DEFAULT NULL COMMENT '主办方名称',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `zhiyuanzhezhanghao` varchar(200) DEFAULT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `shenqingshuoming` longtext COMMENT '申请说明',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='招募申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhaomushenqing`
--

LOCK TABLES `zhaomushenqing` WRITE;
/*!40000 ALTER TABLE `zhaomushenqing` DISABLE KEYS */;
INSERT INTO `zhaomushenqing` VALUES (81,'2024-04-16 06:34:46','招募名称1','upload/zhaomushenqing_zhaomufengmian1.jpg,upload/zhaomushenqing_zhaomufengmian2.jpg,upload/zhaomushenqing_zhaomufengmian3.jpg','招募地点1','招募时间1','主办方账号1','主办方名称1','联系方式1','志愿者账号1','志愿者姓名1','申请说明1','2024-04-16 14:34:46','是',''),(82,'2024-04-16 06:34:46','招募名称2','upload/zhaomushenqing_zhaomufengmian2.jpg,upload/zhaomushenqing_zhaomufengmian3.jpg,upload/zhaomushenqing_zhaomufengmian4.jpg','招募地点2','招募时间2','主办方账号2','主办方名称2','联系方式2','志愿者账号2','志愿者姓名2','申请说明2','2024-04-16 14:34:46','是',''),(83,'2024-04-16 06:34:46','招募名称3','upload/zhaomushenqing_zhaomufengmian3.jpg,upload/zhaomushenqing_zhaomufengmian4.jpg,upload/zhaomushenqing_zhaomufengmian5.jpg','招募地点3','招募时间3','主办方账号3','主办方名称3','联系方式3','志愿者账号3','志愿者姓名3','申请说明3','2024-04-16 14:34:46','是',''),(84,'2024-04-16 06:34:46','招募名称4','upload/zhaomushenqing_zhaomufengmian4.jpg,upload/zhaomushenqing_zhaomufengmian5.jpg,upload/zhaomushenqing_zhaomufengmian6.jpg','招募地点4','招募时间4','主办方账号4','主办方名称4','联系方式4','志愿者账号4','志愿者姓名4','申请说明4','2024-04-16 14:34:46','是',''),(85,'2024-04-16 06:34:46','招募名称5','upload/zhaomushenqing_zhaomufengmian5.jpg,upload/zhaomushenqing_zhaomufengmian6.jpg,upload/zhaomushenqing_zhaomufengmian7.jpg','招募地点5','招募时间5','主办方账号5','主办方名称5','联系方式5','志愿者账号5','志愿者姓名5','申请说明5','2024-04-16 14:34:46','是',''),(86,'2024-04-16 06:34:46','招募名称6','upload/zhaomushenqing_zhaomufengmian6.jpg,upload/zhaomushenqing_zhaomufengmian7.jpg,upload/zhaomushenqing_zhaomufengmian8.jpg','招募地点6','招募时间6','主办方账号6','主办方名称6','联系方式6','志愿者账号6','志愿者姓名6','申请说明6','2024-04-16 14:34:46','是',''),(87,'2024-04-16 06:34:46','招募名称7','upload/zhaomushenqing_zhaomufengmian7.jpg,upload/zhaomushenqing_zhaomufengmian8.jpg,upload/zhaomushenqing_zhaomufengmian9.jpg','招募地点7','招募时间7','主办方账号7','主办方名称7','联系方式7','志愿者账号7','志愿者姓名7','申请说明7','2024-04-16 14:34:46','是',''),(88,'2024-04-16 06:34:46','招募名称8','upload/zhaomushenqing_zhaomufengmian8.jpg,upload/zhaomushenqing_zhaomufengmian9.jpg,upload/zhaomushenqing_zhaomufengmian10.jpg','招募地点8','招募时间8','主办方账号8','主办方名称8','联系方式8','志愿者账号8','志愿者姓名8','申请说明8','2024-04-16 14:34:46','是','');
/*!40000 ALTER TABLE `zhaomushenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanxiaozuzhang`
--

DROP TABLE IF EXISTS `zhiyuanxiaozuzhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanxiaozuzhang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaozubianhao` varchar(200) NOT NULL COMMENT '小组编号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zuzhangxingming` varchar(200) NOT NULL COMMENT '组长姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhaopian` longtext COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiaozubianhao` (`xiaozubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='志愿小组长';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanxiaozuzhang`
--

LOCK TABLES `zhiyuanxiaozuzhang` WRITE;
/*!40000 ALTER TABLE `zhiyuanxiaozuzhang` DISABLE KEYS */;
INSERT INTO `zhiyuanxiaozuzhang` VALUES (31,'2024-04-16 06:34:46','小组编号1','123456','组长姓名1','男',1,'13823888881','upload/zhiyuanxiaozuzhang_zhaopian1.jpg'),(32,'2024-04-16 06:34:46','小组编号2','123456','组长姓名2','男',2,'13823888882','upload/zhiyuanxiaozuzhang_zhaopian2.jpg'),(33,'2024-04-16 06:34:46','小组编号3','123456','组长姓名3','男',3,'13823888883','upload/zhiyuanxiaozuzhang_zhaopian3.jpg'),(34,'2024-04-16 06:34:46','小组编号4','123456','组长姓名4','男',4,'13823888884','upload/zhiyuanxiaozuzhang_zhaopian4.jpg'),(35,'2024-04-16 06:34:46','小组编号5','123456','组长姓名5','男',5,'13823888885','upload/zhiyuanxiaozuzhang_zhaopian5.jpg'),(36,'2024-04-16 06:34:46','小组编号6','123456','组长姓名6','男',6,'13823888886','upload/zhiyuanxiaozuzhang_zhaopian6.jpg'),(37,'2024-04-16 06:34:46','小组编号7','123456','组长姓名7','男',7,'13823888887','upload/zhiyuanxiaozuzhang_zhaopian7.jpg'),(38,'2024-04-16 06:34:46','小组编号8','123456','组长姓名8','男',8,'13823888888','upload/zhiyuanxiaozuzhang_zhaopian8.jpg');
/*!40000 ALTER TABLE `zhiyuanxiaozuzhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzhe`
--

DROP TABLE IF EXISTS `zhiyuanzhe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzhe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhiyuanzhezhanghao` varchar(200) NOT NULL COMMENT '志愿者账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zhiyuanzhexingming` varchar(200) NOT NULL COMMENT '志愿者姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `chushengriqi` date DEFAULT NULL COMMENT '出生日期',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `xiaozubianhao` varchar(200) DEFAULT NULL COMMENT '小组编号',
  `zuzhangxingming` varchar(200) DEFAULT NULL COMMENT '组长姓名',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhiyuanzhezhanghao` (`zhiyuanzhezhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='志愿者';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzhe`
--

LOCK TABLES `zhiyuanzhe` WRITE;
/*!40000 ALTER TABLE `zhiyuanzhe` DISABLE KEYS */;
INSERT INTO `zhiyuanzhe` VALUES (21,'2024-04-16 06:34:46','志愿者账号1','123456','志愿者姓名1','男','2024-04-16','13823888881','小组编号1','组长姓名1','upload/zhiyuanzhe_touxiang1.jpg'),(22,'2024-04-16 06:34:46','志愿者账号2','123456','志愿者姓名2','男','2024-04-16','13823888882','小组编号2','组长姓名2','upload/zhiyuanzhe_touxiang2.jpg'),(23,'2024-04-16 06:34:46','志愿者账号3','123456','志愿者姓名3','男','2024-04-16','13823888883','小组编号3','组长姓名3','upload/zhiyuanzhe_touxiang3.jpg'),(24,'2024-04-16 06:34:46','志愿者账号4','123456','志愿者姓名4','男','2024-04-16','13823888884','小组编号4','组长姓名4','upload/zhiyuanzhe_touxiang4.jpg'),(25,'2024-04-16 06:34:46','志愿者账号5','123456','志愿者姓名5','男','2024-04-16','13823888885','小组编号5','组长姓名5','upload/zhiyuanzhe_touxiang5.jpg'),(26,'2024-04-16 06:34:46','志愿者账号6','123456','志愿者姓名6','男','2024-04-16','13823888886','小组编号6','组长姓名6','upload/zhiyuanzhe_touxiang6.jpg'),(27,'2024-04-16 06:34:46','志愿者账号7','123456','志愿者姓名7','男','2024-04-16','13823888887','小组编号7','组长姓名7','upload/zhiyuanzhe_touxiang7.jpg'),(28,'2024-04-16 06:34:46','志愿者账号8','123456','志愿者姓名8','男','2024-04-16','13823888888','小组编号8','组长姓名8','upload/zhiyuanzhe_touxiang8.jpg');
/*!40000 ALTER TABLE `zhiyuanzhe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzhefuwu`
--

DROP TABLE IF EXISTS `zhiyuanzhefuwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzhefuwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `tupian` longtext COMMENT '图片',
  `xiaozubianhao` varchar(200) DEFAULT NULL COMMENT '小组编号',
  `zuzhangxingming` varchar(200) DEFAULT NULL COMMENT '组长姓名',
  `fuwushijian` varchar(200) DEFAULT NULL COMMENT '服务时间',
  `fuwuquyu` varchar(200) DEFAULT NULL COMMENT '服务区域',
  `fuwuneirong` longtext COMMENT '服务内容',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='志愿者服务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzhefuwu`
--

LOCK TABLES `zhiyuanzhefuwu` WRITE;
/*!40000 ALTER TABLE `zhiyuanzhefuwu` DISABLE KEYS */;
INSERT INTO `zhiyuanzhefuwu` VALUES (61,'2024-04-16 06:34:46','标题1','upload/zhiyuanzhefuwu_tupian1.jpg,upload/zhiyuanzhefuwu_tupian2.jpg,upload/zhiyuanzhefuwu_tupian3.jpg','小组编号1','组长姓名1','服务时间1','服务区域1','服务内容1','2024-04-16 14:34:46',1),(62,'2024-04-16 06:34:46','标题2','upload/zhiyuanzhefuwu_tupian2.jpg,upload/zhiyuanzhefuwu_tupian3.jpg,upload/zhiyuanzhefuwu_tupian4.jpg','小组编号2','组长姓名2','服务时间2','服务区域2','服务内容2','2024-04-16 14:34:46',2),(63,'2024-04-16 06:34:46','标题3','upload/zhiyuanzhefuwu_tupian3.jpg,upload/zhiyuanzhefuwu_tupian4.jpg,upload/zhiyuanzhefuwu_tupian5.jpg','小组编号3','组长姓名3','服务时间3','服务区域3','服务内容3','2024-04-16 14:34:46',3),(64,'2024-04-16 06:34:46','标题4','upload/zhiyuanzhefuwu_tupian4.jpg,upload/zhiyuanzhefuwu_tupian5.jpg,upload/zhiyuanzhefuwu_tupian6.jpg','小组编号4','组长姓名4','服务时间4','服务区域4','服务内容4','2024-04-16 14:34:46',4),(65,'2024-04-16 06:34:46','标题5','upload/zhiyuanzhefuwu_tupian5.jpg,upload/zhiyuanzhefuwu_tupian6.jpg,upload/zhiyuanzhefuwu_tupian7.jpg','小组编号5','组长姓名5','服务时间5','服务区域5','服务内容5','2024-04-16 14:34:46',5),(66,'2024-04-16 06:34:46','标题6','upload/zhiyuanzhefuwu_tupian6.jpg,upload/zhiyuanzhefuwu_tupian7.jpg,upload/zhiyuanzhefuwu_tupian8.jpg','小组编号6','组长姓名6','服务时间6','服务区域6','服务内容6','2024-04-16 14:34:46',6),(67,'2024-04-16 06:34:46','标题7','upload/zhiyuanzhefuwu_tupian7.jpg,upload/zhiyuanzhefuwu_tupian8.jpg,upload/zhiyuanzhefuwu_tupian9.jpg','小组编号7','组长姓名7','服务时间7','服务区域7','服务内容7','2024-04-16 14:34:46',7),(68,'2024-04-16 06:34:46','标题8','upload/zhiyuanzhefuwu_tupian8.jpg,upload/zhiyuanzhefuwu_tupian9.jpg,upload/zhiyuanzhefuwu_tupian10.jpg','小组编号8','组长姓名8','服务时间8','服务区域8','服务内容8','2024-04-16 14:34:46',8);
/*!40000 ALTER TABLE `zhiyuanzhefuwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzherenwu`
--

DROP TABLE IF EXISTS `zhiyuanzherenwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzherenwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `renwumingcheng` varchar(200) NOT NULL COMMENT '任务名称',
  `renwutupian` longtext COMMENT '任务图片',
  `renwushijian` datetime NOT NULL COMMENT '任务时间',
  `renwudidian` varchar(200) NOT NULL COMMENT '任务地点',
  `renwuyaoqiu` longtext COMMENT '任务要求',
  `zhiyuanzhezhanghao` varchar(200) NOT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `fenpeishijian` datetime DEFAULT NULL COMMENT '分配时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='志愿者任务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzherenwu`
--

LOCK TABLES `zhiyuanzherenwu` WRITE;
/*!40000 ALTER TABLE `zhiyuanzherenwu` DISABLE KEYS */;
INSERT INTO `zhiyuanzherenwu` VALUES (121,'2024-04-16 06:34:46','任务名称1','upload/zhiyuanzherenwu_renwutupian1.jpg,upload/zhiyuanzherenwu_renwutupian2.jpg,upload/zhiyuanzherenwu_renwutupian3.jpg','2024-04-16 14:34:46','任务地点1','任务要求1','志愿者账号1','志愿者姓名1','2024-04-16 14:34:46'),(122,'2024-04-16 06:34:46','任务名称2','upload/zhiyuanzherenwu_renwutupian2.jpg,upload/zhiyuanzherenwu_renwutupian3.jpg,upload/zhiyuanzherenwu_renwutupian4.jpg','2024-04-16 14:34:46','任务地点2','任务要求2','志愿者账号2','志愿者姓名2','2024-04-16 14:34:46'),(123,'2024-04-16 06:34:46','任务名称3','upload/zhiyuanzherenwu_renwutupian3.jpg,upload/zhiyuanzherenwu_renwutupian4.jpg,upload/zhiyuanzherenwu_renwutupian5.jpg','2024-04-16 14:34:46','任务地点3','任务要求3','志愿者账号3','志愿者姓名3','2024-04-16 14:34:46'),(124,'2024-04-16 06:34:46','任务名称4','upload/zhiyuanzherenwu_renwutupian4.jpg,upload/zhiyuanzherenwu_renwutupian5.jpg,upload/zhiyuanzherenwu_renwutupian6.jpg','2024-04-16 14:34:46','任务地点4','任务要求4','志愿者账号4','志愿者姓名4','2024-04-16 14:34:46'),(125,'2024-04-16 06:34:46','任务名称5','upload/zhiyuanzherenwu_renwutupian5.jpg,upload/zhiyuanzherenwu_renwutupian6.jpg,upload/zhiyuanzherenwu_renwutupian7.jpg','2024-04-16 14:34:46','任务地点5','任务要求5','志愿者账号5','志愿者姓名5','2024-04-16 14:34:46'),(126,'2024-04-16 06:34:46','任务名称6','upload/zhiyuanzherenwu_renwutupian6.jpg,upload/zhiyuanzherenwu_renwutupian7.jpg,upload/zhiyuanzherenwu_renwutupian8.jpg','2024-04-16 14:34:46','任务地点6','任务要求6','志愿者账号6','志愿者姓名6','2024-04-16 14:34:46'),(127,'2024-04-16 06:34:46','任务名称7','upload/zhiyuanzherenwu_renwutupian7.jpg,upload/zhiyuanzherenwu_renwutupian8.jpg,upload/zhiyuanzherenwu_renwutupian9.jpg','2024-04-16 14:34:46','任务地点7','任务要求7','志愿者账号7','志愿者姓名7','2024-04-16 14:34:46'),(128,'2024-04-16 06:34:46','任务名称8','upload/zhiyuanzherenwu_renwutupian8.jpg,upload/zhiyuanzherenwu_renwutupian9.jpg,upload/zhiyuanzherenwu_renwutupian10.jpg','2024-04-16 14:34:46','任务地点8','任务要求8','志愿者账号8','志愿者姓名8','2024-04-16 14:34:46');
/*!40000 ALTER TABLE `zhiyuanzherenwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzhezhaomu`
--

DROP TABLE IF EXISTS `zhiyuanzhezhaomu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzhezhaomu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaomumingcheng` varchar(200) NOT NULL COMMENT '招募名称',
  `zhaomufengmian` longtext COMMENT '招募封面',
  `zhaomushijian` datetime NOT NULL COMMENT '招募时间',
  `zhaomudidian` varchar(200) NOT NULL COMMENT '招募地点',
  `zhaomuyaoqiu` longtext COMMENT '招募要求',
  `zhubanfangzhanghao` varchar(200) DEFAULT NULL COMMENT '主办方账号',
  `zhubanfangmingcheng` varchar(200) DEFAULT NULL COMMENT '主办方名称',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='志愿者招募';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzhezhaomu`
--

LOCK TABLES `zhiyuanzhezhaomu` WRITE;
/*!40000 ALTER TABLE `zhiyuanzhezhaomu` DISABLE KEYS */;
INSERT INTO `zhiyuanzhezhaomu` VALUES (71,'2024-04-16 06:34:46','招募名称1','upload/zhiyuanzhezhaomu_zhaomufengmian1.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian2.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian3.jpg','2024-04-16 14:34:46','招募地点1','招募要求1','主办方账号1','主办方名称1','联系方式1','2024-04-16 14:34:46',1),(72,'2024-04-16 06:34:46','招募名称2','upload/zhiyuanzhezhaomu_zhaomufengmian2.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian3.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian4.jpg','2024-04-16 14:34:46','招募地点2','招募要求2','主办方账号2','主办方名称2','联系方式2','2024-04-16 14:34:46',2),(73,'2024-04-16 06:34:46','招募名称3','upload/zhiyuanzhezhaomu_zhaomufengmian3.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian4.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian5.jpg','2024-04-16 14:34:46','招募地点3','招募要求3','主办方账号3','主办方名称3','联系方式3','2024-04-16 14:34:46',3),(74,'2024-04-16 06:34:46','招募名称4','upload/zhiyuanzhezhaomu_zhaomufengmian4.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian5.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian6.jpg','2024-04-16 14:34:46','招募地点4','招募要求4','主办方账号4','主办方名称4','联系方式4','2024-04-16 14:34:46',4),(75,'2024-04-16 06:34:46','招募名称5','upload/zhiyuanzhezhaomu_zhaomufengmian5.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian6.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian7.jpg','2024-04-16 14:34:46','招募地点5','招募要求5','主办方账号5','主办方名称5','联系方式5','2024-04-16 14:34:46',5),(76,'2024-04-16 06:34:46','招募名称6','upload/zhiyuanzhezhaomu_zhaomufengmian6.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian7.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian8.jpg','2024-04-16 14:34:46','招募地点6','招募要求6','主办方账号6','主办方名称6','联系方式6','2024-04-16 14:34:46',6),(77,'2024-04-16 06:34:46','招募名称7','upload/zhiyuanzhezhaomu_zhaomufengmian7.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian8.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian9.jpg','2024-04-16 14:34:46','招募地点7','招募要求7','主办方账号7','主办方名称7','联系方式7','2024-04-16 14:34:46',7),(78,'2024-04-16 06:34:46','招募名称8','upload/zhiyuanzhezhaomu_zhaomufengmian8.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian9.jpg,upload/zhiyuanzhezhaomu_zhaomufengmian10.jpg','2024-04-16 14:34:46','招募地点8','招募要求8','主办方账号8','主办方名称8','联系方式8','2024-04-16 14:34:46',8);
/*!40000 ALTER TABLE `zhiyuanzhezhaomu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-25 20:55:22
