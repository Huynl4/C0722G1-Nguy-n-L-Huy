SELECT * FROM student_management.student;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
SELECT student_name FROM student
WHERE student_name LIKE 'H%';

SELECT * FROM student_management.class;

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
SELECT * from class
WHERE month(start_date) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
SELECT * from subject
GROUP BY credit HAVING credit > 3 AND credit < 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set sql_safe_updates =0;
set sql_safe_updates=1;
update student set class_id =7 where student_name = 'Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
SELECT student.student_name,subject.sub_name,mark.mark 
FROM mark
JOIN student ON mark.student_id=student.student_id 
JOIN subject ON mark.sub_id = subject.sub_id
ORDER BY mark.mark DESC, student.student_name;

