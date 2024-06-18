# Write your MySQL query statement below
# select e.student_id, student_name, subject_name, count(e.student_id)
# from examinations e 
# join students s 
# on e.student_id=s.student_id 
# group by e.student_id, subject_name 
# order by e.student_id, subject_name;

select st.student_id, st.student_name, su.subject_name, count(e.student_id) as attended_exams 
from students st 
cross join subjects su 
left join Examinations e 
on st.student_id=e.student_id 
and su.subject_name=e.subject_name 
group by st.student_id, su.subject_name 
order by st.student_id, su.subject_name;