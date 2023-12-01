alter table task rename column tsk_due_date to tsk_finish_date;
alter table task alter column tsk_finish_date set default current_date;