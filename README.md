<h2>Phone Book Application</h2>
This project is a СRUD application made with Maven, Spring, MySQL, Hibernate.<br>
This app allows you to add, delete, edit and search for user numbers in phone book.<br>
<br>
<br>
SQL code to create and write in users the database:<br>
<code>CREATE DATABASE phoneManager;</code><br>
<code>USE phoneManager;</code><br>
<code>CREATE TABLE `phones` (</code><br>
<code>`id` int(11) NOT NULL AUTO_INCREMENT,</code><br>
<code>`name` varchar(45) NOT NULL,</code><br>
<code>`number` bigint(20) NOT NULL,</code><br>
<code>PRIMARY KEY (`id`)</code><br>
<code>) COLLATE='utf8_general_ci';</code><br>
<code>CREATE UNIQUE INDEX films_title_uindex ON phones (name);</code><br>
<code>INSERT INTO `phones` (`name`,`number`)</code><br>
<code>VALUES</code><br>
<code>('Andy', 79102239944),</code><br>
<code>('Calista', 79923328819),</code><br>
<code>('Alton', 79192341199),</code><br>
<code>('Charlie', 79893823842); </code><br>
