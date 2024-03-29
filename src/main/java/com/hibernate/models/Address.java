package com.hibernate.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NamedQuery(name = "findEmployeeAddresses", query = "from Address where employee = :e")
@Entity
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NonNull
    @Column(nullable = false, length = 150)
    String addressOne;
    @NonNull
    @Column(nullable = true, length = 150)
    String addressTwo;
    @NonNull
    @Column(length = 100, nullable = false)
    String city;
    @NonNull
    @Column(nullable = false)
    int zipCode;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    Employee employee;

}
