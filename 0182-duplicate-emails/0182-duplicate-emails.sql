# Write your MySQL query statement below
Select email
FROM person
GROUP BY email
HAVING count(email)>1 ;