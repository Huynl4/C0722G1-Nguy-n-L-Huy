use case_study;
insert into vi_tri(ma_vi_tri,ten_vi_tri)
values(1,'Quản Lý'),(2,'Nhân Viên');

insert into trinh_do(ma_trinh_do,ten_trinh_do)
values(1,'Trung Cấp'),(2,'Cao Đẳng'),(3,'Đại Học'),(4,'Sau Đại Học'); 

INSERT into bo_phan(ma_bo_phan,ten_bo_phan)
values(1,'Sale-Marketing'),(2,'Hành Chính'),(3,'Phục Vụ'),(4,'Quản Lý');


INSERT INTO `case_study`.`nhan_vien` ( `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) 
VALUES	( 'Nguyễn Văn An', '1970-11-07', '456231786', '10000000', '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', '1', '3', '1'),
		( 'Lê Văn Bình', '1997-04-09', '654231234', '7000000', '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', '1', '2', '2'),
		( 'Lê Văn Bình', '1997-04-09', '654231234', '7000000', '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', '1', '2', '2')
 
