package com.example.msrestcruddb.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;

@Entity
@Data
@Document(collection = "Employee")

@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empid", updatable = false, nullable = false)
    Long empid;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String designation;
    @Column
    String status;

}
