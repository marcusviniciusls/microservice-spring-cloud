create table role (id int8 generated by default as identity, role_name varchar(255), primary key (id));
create table user (id int8 generated by default as identity, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email);
alter table if exists user_role add constraint FKa68196081fvovjhkek5m97n3y foreign key (role_id) references role;
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user;
INSERT INTO user (name, email, password) VALUES ('', '', '');
INSERT INTO user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO role (role_name) VALUES ('ROLE_ADMIN');
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 2);
create table role (id int8 generated by default as identity, role_name varchar(255), primary key (id));
create table user (id int8 generated by default as identity, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email);
alter table if exists user_role add constraint FKa68196081fvovjhkek5m97n3y foreign key (role_id) references role;
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user;
INSERT INTO user (name, email, password) VALUES ('', '', '');
INSERT INTO user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO role (role_name) VALUES ('ROLE_ADMIN');
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 2);
create table role (id int8 generated by default as identity, role_name varchar(255), primary key (id));
create table user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
create table userr (id int8 generated by default as identity, email varchar(255), name varchar(255), password varchar(255), primary key (id));
alter table if exists userr add constraint UK_fquhh9vhs8636tad5s6jvfvei unique (email);
alter table if exists user_role add constraint FKa68196081fvovjhkek5m97n3y foreign key (role_id) references role;
alter table if exists user_role add constraint FK60jlo3dtc2puvn4388hbqs0oi foreign key (user_id) references userr;
INSERT INTO user (name, email, password) VALUES ('', '', '');
INSERT INTO user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO role (role_name) VALUES ('ROLE_ADMIN');
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 2);