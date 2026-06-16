package upeu.edu.pe.ExamU2.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "activitys")
@Data
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private String datetime;

    private Boolean published;

    @Enumerated(EnumType.STRING)
    private Status status;
}
