package Arusok.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "rendezveny")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rendezveny {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime eventStartDate;
    private LocalDateTime eventEndDate;
    private LocalDateTime applicationStartDate;
    private LocalDateTime applicationEndDate;

}
