package upeu.edu.pe.ExamU2.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "activities")
@Data
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String datetime;

    private Boolean published;

    @Enumerated(EnumType.STRING)
    private Status status;
}