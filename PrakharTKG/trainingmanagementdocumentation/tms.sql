/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.27 : Database - trainingmanagementsystem
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`trainingmanagementsystem` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `trainingmanagementsystem`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `course_id` int(3) NOT NULL AUTO_INCREMENT,
  `courseTitle` varchar(30) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `referance_id` varchar(10) DEFAULT NULL,
  `image` blob,
  `active` tinyint(1) DEFAULT NULL,
  `user_id` int(3) DEFAULT NULL,
  PRIMARY KEY (`course_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `course` */

/*Table structure for table `course_status` */

DROP TABLE IF EXISTS `course_status`;

CREATE TABLE `course_status` (
  `course_status_id` int(2) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`course_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `course_status` */

/*Table structure for table `designation` */

DROP TABLE IF EXISTS `designation`;

CREATE TABLE `designation` (
  `designation_id` int(1) NOT NULL AUTO_INCREMENT,
  `designation_name` varchar(10) NOT NULL,
  PRIMARY KEY (`designation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `designation` */

insert  into `designation`(`designation_id`,`designation_name`) values (1,'Manager'),(2,'Trainer'),(3,'Trainee');

/*Table structure for table `heading` */

DROP TABLE IF EXISTS `heading`;

CREATE TABLE `heading` (
  `heading_id` int(3) NOT NULL AUTO_INCREMENT,
  `heading_text` varchar(20) DEFAULT NULL,
  `course_id` int(3) DEFAULT NULL,
  PRIMARY KEY (`heading_id`),
  KEY `course_id` (`course_id`),
  CONSTRAINT `heading_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `heading` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` int(1) NOT NULL,
  `roleName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert  into `role`(`role_id`,`roleName`) values (1,NULL);

/*Table structure for table `status` */

DROP TABLE IF EXISTS `status`;

CREATE TABLE `status` (
  `status_id` int(1) NOT NULL,
  `statusType` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `status` */

insert  into `status`(`status_id`,`statusType`) values (1,NULL);

/*Table structure for table `subheading` */

DROP TABLE IF EXISTS `subheading`;

CREATE TABLE `subheading` (
  `subheading_id` int(3) NOT NULL AUTO_INCREMENT,
  `subheading_text` varchar(30) DEFAULT NULL,
  `heading_id` int(3) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`subheading_id`),
  KEY `heading_id` (`heading_id`),
  CONSTRAINT `subheading_ibfk_1` FOREIGN KEY (`heading_id`) REFERENCES `heading` (`heading_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `subheading` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(3) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `password` varchar(12) NOT NULL,
  `role` int(1) NOT NULL,
  `status` int(1) NOT NULL,
  `designation` int(1) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `designation` (`designation`),
  KEY `status` (`status`),
  KEY `user_ibfk_2` (`role`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`designation`) REFERENCES `designation` (`designation_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`role`) REFERENCES `role` (`role_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_ibfk_3` FOREIGN KEY (`status`) REFERENCES `status` (`status_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`user_id`,`name`,`contact`,`email`,`userName`,`password`,`role`,`status`,`designation`) values (1,'Prakhar Jain','9770783435','prakhartkg@gmail.com','prakhartkg','123456',1,1,1),(7,'prakhar','9770783435','pt@gmail.com','asda13','P@1223',1,1,3),(8,'sada','1234567890','asd@asdasd.com','ASDASD','123asd@',1,1,3),(9,'Prashu','9770783435','prakhar.jain@gmail.com','prashu','Pj@12',1,1,3),(10,'shashank','9770783435','sj@nbv.com','pr','pras@12',1,1,3),(11,'prakhar','9770783435','prakhar.jain@gmail.com','prr','12@ab',1,1,1),(13,'pankaj','8827611875','pankaj@yash.com','pankaj','P@ankaj',1,1,1),(14,'shubham','9770783435','sadas@sasd.com','sb1','sb@12',1,1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
