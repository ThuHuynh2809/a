package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@SuppressWarnings("serial")
@Entity
@Table(name = "ThongKe") // Đổi tên bảng thành tiếng Việt
@NoArgsConstructor
@AllArgsConstructor
public class ThongKe implements Serializable {
    @Id
    private Long maThongKe;  // ID

    @ManyToOne
    @JoinColumn(name = "MaDonHang")  // Order ID
    private DonHang donHang;  // Order

    @ManyToOne
    @JoinColumn(name = "MaChiTietDonHang")  // OrderDetail ID
    private ChiTietDonHang chiTietDonHang;  // OrderDetail

    private long soLuongDonHang;  // slOrder

    private long soLuongDoanhThu;  // slDoanhthu
}
