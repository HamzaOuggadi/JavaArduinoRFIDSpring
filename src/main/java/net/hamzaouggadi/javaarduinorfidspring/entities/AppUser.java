package net.hamzaouggadi.javaarduinorfidspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private Long RFID;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String pictureURL;
}
