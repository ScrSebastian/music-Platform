/*
Navicat MySQL Data Transfer

Source Server         : aa
Source Server Version : 80035
Source Host           : localhost:3306
Source Database       : music

Target Server Type    : MYSQL
Target Server Version : 80035
File Encoding         : 65001

Date: 2024-03-06 20:21:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `album`
-- ----------------------------
DROP TABLE IF EXISTS `album`;
CREATE TABLE `album` (
  `album_id` int NOT NULL AUTO_INCREMENT,
  `item_album_id` int DEFAULT NULL,
  `cover_image` varchar(255) DEFAULT NULL,
  `album_name` varchar(100) DEFAULT NULL,
  `album_description` text,
  `play_count` int DEFAULT NULL,
  `album_type` varchar(20) DEFAULT NULL,
  `sales` int DEFAULT NULL,
  `collection_count` int DEFAULT NULL,
  `share_count` int DEFAULT NULL,
  `release_time` datetime DEFAULT NULL,
  PRIMARY KEY (`album_id`),
  UNIQUE KEY `item_album_id` (`item_album_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of album
-- ----------------------------
INSERT INTO `album` VALUES ('1', '201', 'album', 'a1', 'a1', '20', 'free', '1', '10', '30', '1970-01-01 00:00:00');
INSERT INTO `album` VALUES ('2', '202', 'album', 'a2', 'a2', '30', 'free', '2', '20', '40', '1970-01-01 00:00:00');
INSERT INTO `album` VALUES ('3', '203', 'album', 'a3', 'a3', '40', 'vip', '3', '30', '50', '1970-01-01 00:00:00');
INSERT INTO `album` VALUES ('4', '204', 'album', 'a4', 'a4', '50', 'vip', '4', '40', '60', '1970-01-01 00:00:00');
INSERT INTO `album` VALUES ('5', '205', 'album', 'a5', 'a5', '60', 'vip', '5', '50', '71', '1970-01-01 00:00:00');
INSERT INTO `album` VALUES ('6', '206', 'album', 'a6', 'a6', '70', 'vip', '6', '60', '90', '1970-01-01 00:00:00');

-- ----------------------------
-- Table structure for `artist`
-- ----------------------------
DROP TABLE IF EXISTS `artist`;
CREATE TABLE `artist` (
  `artist_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `popularity` int DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `tags` varchar(255) DEFAULT NULL,
  `introduction` text,
  `top_50_list_id` int DEFAULT NULL,
  PRIMARY KEY (`artist_id`),
  KEY `top_50_list_id` (`top_50_list_id`),
  CONSTRAINT `artist_ibfk_1` FOREIGN KEY (`top_50_list_id`) REFERENCES `list` (`list_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of artist
-- ----------------------------
INSERT INTO `artist` VALUES ('1', '张学友', '10000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('2', '韩红', '20000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('3', '张杰', '30000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('4', 'Adele', '40000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('5', '刘德华', '50000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('6', '周杰伦', '60000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('7', '陈奕迅', '70000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('8', '林俊杰', '80000', null, 'Pop', 'He/She is a well-known singer', null);
INSERT INTO `artist` VALUES ('9', '薛之谦', '90000', null, 'Pop', 'He/She is a well-known singer', null);

-- ----------------------------
-- Table structure for `list`
-- ----------------------------
DROP TABLE IF EXISTS `list`;
CREATE TABLE `list` (
  `list_id` int NOT NULL AUTO_INCREMENT,
  `item_list_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `playlist_name` varchar(100) DEFAULT NULL,
  `song_list` json DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `playlist_type` varchar(20) DEFAULT NULL,
  `playlist_description` text,
  `playlist_cover` text,
  PRIMARY KEY (`list_id`),
  UNIQUE KEY `item_list_id` (`item_list_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `list_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of list
-- ----------------------------
INSERT INTO `list` VALUES ('1', '301', '1', '"新名字"', null, '2024-03-03 21:30:09', 'average', '666');
INSERT INTO `list` VALUES ('2', '302', '1', '"b"', null, '2024-03-03 21:30:11', 'average', '{new_description}');
INSERT INTO `list` VALUES ('3', '303', '2', '"c"', null, '2024-03-03 21:30:12', 'highQuality', '666');
INSERT INTO `list` VALUES ('4', '304', '3', '"d"', null, '2024-03-03 21:30:12', 'highQuality', '666');
INSERT INTO `list` VALUES ('5', '305', '4', '"e"', null, '2024-03-03 21:30:13', 'highQuality', '666');
INSERT INTO `list` VALUES ('6', '306', '5', '"f"', null, '2024-03-03 21:30:14', 'netEaseSelection', '666');
INSERT INTO `list` VALUES ('7', '307', '6', '"g"', null, '2024-03-03 21:30:14', 'netEaseSelection', '666');
INSERT INTO `list` VALUES ('14', null, '1', '"好听的歌"', null, '2024-03-05 22:05:47', null, '666');

-- ----------------------------
-- Table structure for `lyrics`
-- ----------------------------
DROP TABLE IF EXISTS `lyrics`;
CREATE TABLE `lyrics` (
  `music_id` int NOT NULL,
  `uploader` varchar(100) DEFAULT NULL,
  `text_content` text,
  PRIMARY KEY (`music_id`),
  CONSTRAINT `lyrics_ibfk_1` FOREIGN KEY (`music_id`) REFERENCES `music` (`music_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of lyrics
-- ----------------------------
INSERT INTO `lyrics` VALUES ('1', 'a', 'XXX');
INSERT INTO `lyrics` VALUES ('2', 'b', 'XXX');
INSERT INTO `lyrics` VALUES ('3', 'c', 'XXX');
INSERT INTO `lyrics` VALUES ('4', 'd', '那是一个秋天\r\n风儿那么缠绵\r\n让我想起他们那双无助的眼\r\n就在那美丽风景相伴的地方\r\n我听到一声巨响震彻山谷\r\n就是那个秋天再看不到爸爸的脸\r\n他用他的双肩托起我重生的起点\r\n黑暗中泪水沾满了双眼\r\n不要离开不要伤害\r\n我看到爸爸妈妈就这么走远\r\n留下我在这陌生的人世间\r\n不知道未来还会有什么风险\r\n我想要紧紧抓住他的手\r\n妈妈告诉我希望还会有\r\n看到太阳出来妈妈笑了天亮了\r\n这是一个夜晚天上宿星点点\r\n我在梦里看见我的妈妈\r\n一个人在世上要学会坚强\r\n你不要离开不要伤害\r\n我看到爸爸妈妈就这么走远\r\n留下我在这陌生的人世间\r\n我愿为他建造一个美丽的花园\r\n我想要紧紧抓住他的手\r\n妈妈告诉我希望还会有\r\n看到太阳出来 天亮了\r\n我看到爸爸妈妈就这么走远\r\n留下我在这陌生的人世间\r\n我愿为他建造一个美丽的花园\r\n我想要紧紧抓住他的手\r\n妈妈告诉我希望还会有\r\n看到太阳出来\r\n他们笑了\r\n天亮了');
INSERT INTO `lyrics` VALUES ('5', 'e', 'XXX');
INSERT INTO `lyrics` VALUES ('6', 'f', 'XXX');
INSERT INTO `lyrics` VALUES ('7', 'g', 'XXX');
INSERT INTO `lyrics` VALUES ('8', 'h', 'XXX');
INSERT INTO `lyrics` VALUES ('9', 'i', 'XXX');
INSERT INTO `lyrics` VALUES ('10', 'j', 'XXX');
INSERT INTO `lyrics` VALUES ('11', 'k', 'XXX');
INSERT INTO `lyrics` VALUES ('12', 'l', 'XXX');
INSERT INTO `lyrics` VALUES ('13', 'o', 'XXX');

-- ----------------------------
-- Table structure for `music`
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music` (
  `music_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(30) DEFAULT NULL,
  `item_music_id` int DEFAULT NULL,
  `file_path` varchar(255) DEFAULT NULL,
  `artist_id` int DEFAULT NULL,
  `album_id` int DEFAULT NULL,
  `liked` int DEFAULT NULL,
  `played` int DEFAULT NULL,
  `download` int DEFAULT NULL,
  `favourite` int DEFAULT NULL,
  `share` int DEFAULT NULL,
  `level` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`music_id`),
  UNIQUE KEY `item_music_id` (`item_music_id`),
  KEY `artist_id` (`artist_id`),
  KEY `album_id` (`album_id`),
  CONSTRAINT `music_ibfk_1` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`artist_id`),
  CONSTRAINT `music_ibfk_2` FOREIGN KEY (`album_id`) REFERENCES `album` (`album_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of music
-- ----------------------------
INSERT INTO `music` VALUES ('1', 'Song 1', '101', 'Song 1.mp3', '1', '1', '351', '5434', '56', '5', '12', 'free');
INSERT INTO `music` VALUES ('2', 'Song 2', '102', 'Song 2.mp3', '1', '1', '523', '4684', '31', '8', '12', 'free');
INSERT INTO `music` VALUES ('3', 'Song 3', '103', 'Song 3.mp3', '1', '1', '64', '318', '52', '9', '12', 'free');
INSERT INTO `music` VALUES ('4', 'Song 4', '104', 'Song 4.mp3', '2', '2', '16', '3131', '11', '10', '12', 'free');
INSERT INTO `music` VALUES ('5', 'Song 5', '105', 'Song 5.mp3', '3', '3', '343', '3843', '12', '11', '12', 'free');
INSERT INTO `music` VALUES ('6', 'Song 6', '106', 'Song 6.mp3', '4', '4', '183', '1813', '13', '12', '12', 'free');
INSERT INTO `music` VALUES ('7', 'Song 7', '107', 'Song 7.mp3', '4', '4', '168', '381', '15', '13', '13', 'free');
INSERT INTO `music` VALUES ('8', 'Song 8', '108', 'Song 8.mp3', '4', '4', '468', '3445', '64', '15', '20', 'free');
INSERT INTO `music` VALUES ('9', 'Song 9', '109', 'Song 9.mp3', '5', '5', '131', '5311', '78', '14', '20', 'vip');
INSERT INTO `music` VALUES ('10', 'Song 10', '110', 'Song 10.mp3', '6', '6', '384', '3584', '25', '25', '20', 'vip');
INSERT INTO `music` VALUES ('11', 'Song 11', '111', 'Song 11.mp3', '6', '6', '767', '5138', '30', '13', '12', 'vip');
INSERT INTO `music` VALUES ('12', 'Song 12', '112', 'Song 12.mp3', '6', '6', '267', '3183', '50', '21', '12', 'vip');
INSERT INTO `music` VALUES ('13', 'Song 13', '113', 'Song 13.mp3', '1', '1', '813', '1388', '85', '12', '1', 'vip');
INSERT INTO `music` VALUES ('14', 'Song 14', '114', 'Song 14.mp3', '1', '1', '303', '1813', '30', '25', '3', 'vip');
INSERT INTO `music` VALUES ('15', 'Song 15', '115', 'Song 15.mp3', '1', '1', '345', '1863', '50', '30', '13', 'vip');
INSERT INTO `music` VALUES ('16', 'Song 16', '116', 'Song 16.mp3', '7', null, '86', '7616', '50', '12', '13', 'vip');
INSERT INTO `music` VALUES ('17', 'Song 17', '117', 'Song 17.mp3', '7', null, '4', '1677', '1', '1', '14', 'vip');
INSERT INTO `music` VALUES ('18', 'Song 18', '118', 'Song 18.mp3', '8', null, '98', '6716', '30', '2', '14', 'vip');
INSERT INTO `music` VALUES ('19', 'Song 19', '119', 'Song 19.mp3', '8', null, '816', '2688', '56', '3', '15', 'vip');
INSERT INTO `music` VALUES ('20', 'Song 20', '120', 'Song 20.mp3', '9', null, '38', '1971', '12', '4', '15', 'vip');

-- ----------------------------
-- Table structure for `musiccomment`
-- ----------------------------
DROP TABLE IF EXISTS `musiccomment`;
CREATE TABLE `musiccomment` (
  `comment_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `music_id` int DEFAULT NULL,
  `comment_content` text,
  `comment_time` datetime DEFAULT NULL,
  `reference_comment_id` int DEFAULT NULL,
  `thumbs_up_count` int DEFAULT NULL,
  `thumbs_down_count` int DEFAULT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `user_id` (`user_id`),
  KEY `music_id` (`music_id`),
  KEY `reference_comment_id` (`reference_comment_id`),
  CONSTRAINT `musiccomment_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`uid`),
  CONSTRAINT `musiccomment_ibfk_2` FOREIGN KEY (`music_id`) REFERENCES `music` (`music_id`),
  CONSTRAINT `musiccomment_ibfk_3` FOREIGN KEY (`reference_comment_id`) REFERENCES `musiccomment` (`comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of musiccomment
-- ----------------------------
INSERT INTO `musiccomment` VALUES ('1', '1', '1', '好听', '2024-03-03 17:32:09', '2', '20', '33');
INSERT INTO `musiccomment` VALUES ('2', '2', '1', '好听', '2024-03-03 17:32:10', null, '12', '11');
INSERT INTO `musiccomment` VALUES ('3', '2', '2', '好听', '2024-03-03 17:32:11', null, '61', '5');
INSERT INTO `musiccomment` VALUES ('4', '3', '6', '难听', '2024-03-03 17:32:12', '4', '34', '6');
INSERT INTO `musiccomment` VALUES ('5', '3', '8', '难听', '2024-03-03 17:32:13', null, '25', '87');
INSERT INTO `musiccomment` VALUES ('6', '4', '9', '难听', '2024-03-03 17:32:14', null, '1', '4');
INSERT INTO `musiccomment` VALUES ('7', '4', '10', '难听', '2024-03-03 17:32:16', null, '15', '1');
INSERT INTO `musiccomment` VALUES ('8', '4', '13', '还可以', '2024-03-03 17:32:17', '1', '0', '2');
INSERT INTO `musiccomment` VALUES ('9', '5', '5', '还可以', '2024-03-03 17:32:18', null, '88', '0');
INSERT INTO `musiccomment` VALUES ('10', '6', '5', '还可以', '2024-03-03 17:32:19', null, '64', '1');
INSERT INTO `musiccomment` VALUES ('11', '7', '5', '还可以', '2024-03-03 17:32:20', null, '34', '2');
INSERT INTO `musiccomment` VALUES ('13', '9', '2', '美好的音乐，使我的灵魂飞升', '2024-03-06 00:16:07', null, null, null);

-- ----------------------------
-- Table structure for `musiclist`
-- ----------------------------
DROP TABLE IF EXISTS `musiclist`;
CREATE TABLE `musiclist` (
  `musiclist_id` int NOT NULL AUTO_INCREMENT,
  `list_id` int DEFAULT NULL,
  `music_id` int DEFAULT NULL,
  PRIMARY KEY (`musiclist_id`),
  KEY `list_id` (`list_id`),
  KEY `music_id` (`music_id`),
  CONSTRAINT `musiclist_ibfk_1` FOREIGN KEY (`list_id`) REFERENCES `list` (`list_id`),
  CONSTRAINT `musiclist_ibfk_2` FOREIGN KEY (`music_id`) REFERENCES `music` (`music_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of musiclist
-- ----------------------------
INSERT INTO `musiclist` VALUES ('1', '1', '1');
INSERT INTO `musiclist` VALUES ('2', '1', '2');
INSERT INTO `musiclist` VALUES ('3', '1', '19');
INSERT INTO `musiclist` VALUES ('4', '2', '1');
INSERT INTO `musiclist` VALUES ('5', '2', '2');
INSERT INTO `musiclist` VALUES ('6', '2', '3');
INSERT INTO `musiclist` VALUES ('7', '4', '4');
INSERT INTO `musiclist` VALUES ('8', '2', '16');
INSERT INTO `musiclist` VALUES ('9', '2', '16');
INSERT INTO `musiclist` VALUES ('10', '2', '16');
INSERT INTO `musiclist` VALUES ('11', '2', '2');
INSERT INTO `musiclist` VALUES ('12', '3', '12');
INSERT INTO `musiclist` VALUES ('13', '3', '12');
INSERT INTO `musiclist` VALUES ('14', '3', '12');
INSERT INTO `musiclist` VALUES ('15', '3', '12');
INSERT INTO `musiclist` VALUES ('16', '4', '13');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `real_name_verification_info` text,
  `phone_number` varchar(15) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `history_record` text,
  `comment_history_record` text,
  `last_login_time` datetime DEFAULT NULL,
  `user_level` int DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'XXX', '13011115555', '新头像', 'sps', null, null, '2024-03-03 17:12:06', '5');
INSERT INTO `user` VALUES ('2', 'XXX', '13022226666', 'touxiang', 'scr', null, null, '2024-03-03 17:12:13', '5');
INSERT INTO `user` VALUES ('3', 'XXX', '13055558888', 'touxiang', 'lmx', null, null, '2024-03-02 17:12:38', '4');
INSERT INTO `user` VALUES ('4', 'XXX', '13911114444', 'touxiang', 'lz', null, null, '2024-03-01 17:12:50', '4');
INSERT INTO `user` VALUES ('5', 'XXX', '13622228888', 'touxiang', 'mhb', null, null, '2024-02-21 17:13:09', '3');
INSERT INTO `user` VALUES ('6', 'XXX', '13822227777', 'touxiang', 'lr', null, null, '2024-01-13 17:13:18', '3');
INSERT INTO `user` VALUES ('7', 'XXX', '11111111111', 'touxiang', 'wxd', null, null, '2024-01-02 17:25:51', '2');
INSERT INTO `user` VALUES ('8', 'XXX', '55555555555', 'touxiang', 'xgp', null, null, '2024-03-03 17:26:01', '2');
INSERT INTO `user` VALUES ('9', 'XXX', '110', 'touxiang', 'gzq', null, null, '2024-03-03 17:26:06', '1');

-- ----------------------------
-- Table structure for `userlibrary`
-- ----------------------------
DROP TABLE IF EXISTS `userlibrary`;
CREATE TABLE `userlibrary` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int DEFAULT NULL,
  `item_music_id` int DEFAULT NULL,
  `item_list_id` int DEFAULT NULL,
  `item_album_id` int DEFAULT NULL,
  `item_type` varchar(20) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  KEY `item_music_id` (`item_music_id`),
  KEY `item_album_id` (`item_album_id`),
  KEY `item_list_id` (`item_list_id`),
  CONSTRAINT `item_album_id` FOREIGN KEY (`item_album_id`) REFERENCES `album` (`item_album_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `item_list_id` FOREIGN KEY (`item_list_id`) REFERENCES `list` (`item_list_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `item_music_id` FOREIGN KEY (`item_music_id`) REFERENCES `music` (`item_music_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `uid` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of userlibrary
-- ----------------------------
INSERT INTO `userlibrary` VALUES ('1', '1', '101', null, null, 'music', '2024-03-05 20:23:45');
INSERT INTO `userlibrary` VALUES ('11', '2', '116', null, null, 'music', '2024-03-05 21:22:55');
INSERT INTO `userlibrary` VALUES ('12', '2', '116', null, null, 'music', '2024-03-05 21:22:55');
INSERT INTO `userlibrary` VALUES ('13', '2', '116', null, null, 'music', '2024-03-05 21:22:56');
INSERT INTO `userlibrary` VALUES ('14', '2', '116', null, null, 'music', '2024-03-05 21:22:57');
INSERT INTO `userlibrary` VALUES ('15', '2', '116', null, null, 'music', '2024-03-05 21:23:06');
INSERT INTO `userlibrary` VALUES ('24', '3', null, '301', null, 'list', null);
INSERT INTO `userlibrary` VALUES ('26', '5', null, null, '202', 'album', '2024-03-05 22:18:50');
