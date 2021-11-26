drop table if exists customer;

create table customer (
                      customer_id varchar(36) not null,
                      customer_first_name varchar(255),
                      customer_last_name varchar(255),
                      primary key (customer_id)
);