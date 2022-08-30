/*
Enter your query here.
Please append a semicolon ";" at the end of the query
*/

-- I'm selecting the student ID and subject from the Examination table.
-- Using Count(*) as no. of times to get a count of the times the student has appeared in the examination. Then I group them by student ID and Subject.



# SELECT student_id, subject, COUNT(*) AS no_of_times
# FROM Examination
# GROUP BY student_id, subject;