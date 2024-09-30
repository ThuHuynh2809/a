package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = "PhanQuyen", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "TenDangNhap", "MaVaiTro" })
})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhanQuyen implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maId;  // Id

    @ManyToOne
    @JoinColumn(name = "TenDangNhap")
    private TaiKhoan taiKhoan;  // Account

    @ManyToOne
    @JoinColumn(name = "MaVaiTro")
    private VaiTro vaiTro;  // Role

}
