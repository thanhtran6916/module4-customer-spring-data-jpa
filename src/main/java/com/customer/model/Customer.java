package com.customer.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotEmpty(message = "ten khong duoc de trong")
    @Size(min = 2, max = 30, message = "ten toi thieu 2 ky tu toi da 30 ky tu")
    private String name;

    @Column(nullable = false)
    @Min(value = 18, message = "tuoi tren 18")
    private int age;

    @Column(nullable = false)
    @NotEmpty(message = "so dien thoai khong duoc de trong")
    @Pattern(regexp = "^0\\d{9,10}", message = "dinh dang so dien thoai sai")
    private String phone;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
