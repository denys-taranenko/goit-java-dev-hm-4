package entity;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;

@Builder
@ToString
public class Worker {
    private int id;
    private String name;
    private LocalDate birthday;
    private String level;
    private int salary;
}
