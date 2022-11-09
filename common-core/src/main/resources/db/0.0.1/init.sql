create table if not exists medical.debug
(
    id varchar(36) primary key ,
    system_type_id varchar(255) ,
    method_params text
);

create table if not exists medical.exception
(
    id varchar(36) primary key ,
    system_type_id varchar(255) ,
    method_params text
);

