package com.examly.springapp.model;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "repairs")
public class Repair {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="repair_name")
    private  String repName;

    @OneToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @OneToMany
    private List<Device> device=new ArrayList<>();
}