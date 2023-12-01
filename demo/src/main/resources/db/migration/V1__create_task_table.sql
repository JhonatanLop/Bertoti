create table if not exists task (
    tsk_id serial primary key,
    tsk_name varchar(255) not null,
    tsk_description varchar(255) not null,
    tsk_due_date date not null,
    tsk_completed boolean not null default false
)