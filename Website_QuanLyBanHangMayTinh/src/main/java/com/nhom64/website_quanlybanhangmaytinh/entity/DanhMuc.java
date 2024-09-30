package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "DanhMuc")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DanhMuc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maDanhMuc;  // Category ID
    private String ten;  // Name

    @JsonIgnore
    @OneToMany(mappedBy = "danhMuc")
    List<SanPham> sanPhams;  // Products

}
