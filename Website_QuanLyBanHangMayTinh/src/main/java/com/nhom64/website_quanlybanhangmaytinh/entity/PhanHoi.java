package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "PhanHois")
@NoArgsConstructor
@AllArgsConstructor
public class PhanHoi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maPhanHoi;  // Feedback ID
    private String moTa;  // Description

    @ManyToOne
    @JoinColumn(name = "TenDangNhap")
    private TaiKhoan taiKhoan;  // Account
}
