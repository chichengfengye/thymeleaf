/*创建数据数据库focus*/
create database if not exists focus charset urf8;

/**创建user_filei表*/
create table if not EXISTS user_file(
  id serial PRIMARY KEY ,
  user_name varchar(500) ,
	uid varchar(255) ,
	status tinyint ,
	file_path varchar(500) ,
	req_url varchar(500) ,
	version int ,
	create_time Date,
	type int
)