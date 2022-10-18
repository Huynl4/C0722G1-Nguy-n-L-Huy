use case_study;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
SELECT 
    *
FROM
    nhan_vien
WHERE
    (ho_ten LIKE 'H%') OR (ho_ten LIKE 'T%')
        OR (ho_ten LIKE 'K%')
        AND CHAR_LENGTH(ho_ten) <= 15;
        
--  3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.       
SELECT * from khach_hang
where YEAR(CURDATE()) - YEAR(ngay_sinh) >= 18 
and YEAR(CURDATE()) - YEAR(ngay_sinh) <= 50
and (dia_chi like '%Quảng Trị') OR (dia_chi like '%Đà Nẵng');

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
 
 SELECT khach_hang.ma_khach_hang, khach_hang.ho_ten, count(hop_dong.ma_hop_dong) as so_lan_dat_phong
 FROM khach_hang
 JOIN hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
 join loai_khach  on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
 where loai_khach.ten_loai_khach = 'Diamond'
 GROUP BY khach_hang.ma_khach_hang
 ORDER BY so_lan_dat_phong;
 
--  5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc,
--  tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và 
--  Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. 
--  (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

SELECT khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
(ifnull(dich_vu.chi_phi_thue,0) + ifnull(hop_dong_chi_tiet.so_luong,0) * ifnull(dich_vu_di_kem.gia,0)) as tong_tien
FROM khach_hang 
LEFT JOIN loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
LEFT JOIN hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
LEFT JOIN dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
LEFT JOIN hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
LEFT JOIN dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
GROUP BY  hop_dong.ma_hop_dong, khach_hang.ma_khach_hang
ORDER BY ma_khach_hang;