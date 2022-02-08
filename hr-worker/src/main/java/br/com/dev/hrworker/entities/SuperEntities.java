package br.com.dev.hrworker.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Setter
@Getter
public class SuperEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateCreation;
    private LocalDateTime dateUpdate;
    private boolean status;

    public SuperEntities() {
        LocalDateTime now = LocalDateTime.now();
        dateCreation = now;
        status = true;
    }
}
