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
SELECT 
    *
FROM
    khach_hang
WHERE
    YEAR(CURDATE()) - YEAR(ngay_sinh) >= 18
        AND YEAR(CURDATE()) - YEAR(ngay_sinh) <= 50
        AND (dia_chi LIKE '%Quảng Trị')
        OR (dia_chi LIKE '%Đà Nẵng');

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
 
 SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    COUNT(hop_dong.ma_hop_dong) AS so_lan_dat_phong
FROM
    khach_hang
        JOIN
    hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
        JOIN
    loai_khach ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
WHERE
    loai_khach.ten_loai_khach = 'Diamond'
GROUP BY khach_hang.ma_khach_hang
ORDER BY so_lan_dat_phong;
 
--  5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc,
--  tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và 
--  Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. 
--  (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    loai_khach.ten_loai_khach,
    hop_dong.ma_hop_dong,
    dich_vu.ten_dich_vu,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    (IFNULL(dich_vu.chi_phi_thue, 0) + IFNULL(hop_dong_chi_tiet.so_luong, 0) * IFNULL(dich_vu_di_kem.gia, 0)) AS tong_tien
FROM
    khach_hang
        LEFT JOIN
    loai_khach ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
        LEFT JOIN
    hop_dong ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        LEFT JOIN
    dich_vu ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
        LEFT JOIN
    hop_dong_chi_tiet ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
        LEFT JOIN
    dich_vu_di_kem ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
GROUP BY hop_dong.ma_hop_dong , khach_hang.ma_khach_hang
ORDER BY ma_khach_hang;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của 
-- tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).

SELECT dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
JOIN loai_dich_vu on loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu 
WHERE dich_vu.ma_dich_vu not in (
	SELECT hop_dong.ma_dich_vu
	from hop_dong
	WHERE hop_dong.ngay_lam_hop_dong BETWEEN '2021-01-01' AND '2021-03-31'
);

-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của 
-- tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

SELECT 
    dich_vu.ma_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        JOIN
    loai_dich_vu ON loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
WHERE
    dich_vu.ma_dich_vu NOT IN (SELECT 
            hop_dong.ma_dich_vu
        FROM
            hop_dong
        WHERE
            YEAR(ngay_lam_hop_dong) IN (2021))
;

-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
SELECT DISTINCT
    kh.ho_ten
FROM
    khach_hang kh;  

SELECT  kh.ho_ten   
FROM khach_hang kh
GROUP BY ho_ten;  

SELECT  kh.ho_ten   
FROM khach_hang kh
UNION SELECT  kh.ho_ten   
FROM khach_hang kh;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 
-- 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

SELECT 
    MONTH(hop_dong.ngay_lam_hop_dong) AS month,
    COUNT(hop_dong.ma_hop_dong) AS so_luong_khach_hang
FROM
    hop_dong
WHERE
    YEAR(hop_dong.ngay_lam_hop_dong) = 2021
GROUP BY MONTH(hop_dong.ngay_lam_hop_dong)
ORDER BY MONTH(hop_dong.ngay_lam_hop_dong);

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem
--  (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

SELECT hop_dong.ma_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc, sum(dich_vu_di_kem.ten_dich_vu_di_kem) as so_luong_dich_vu_di_kem
from hop_dong
JOIN dich_vu_di_kem
