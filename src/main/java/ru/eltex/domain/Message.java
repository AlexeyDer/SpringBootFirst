package ru.eltex.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Message   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Getter@Setter private Integer id;
    @Getter@Setter private String text;
    @Getter@Setter private String tag;
}
