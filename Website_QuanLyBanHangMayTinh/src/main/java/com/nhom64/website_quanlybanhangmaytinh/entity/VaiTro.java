package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "vaiTros")
@AllArgsConstructor
@NoArgsConstructor
public class VaiTro implements Serializable {
    @Id
    private String maVaiTro;  // Role ID
    private String ten;  // Name

    @JsonIgnore
    @OneToMany(mappedBy = "vaiTro")
    private List<PhanQuyen> phanQuyens;  // Authorities

}
