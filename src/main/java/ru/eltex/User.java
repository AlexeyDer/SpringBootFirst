package ru.eltex;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Класс представления пользователя
 * @author Alexey Derevtsov
 * @version v1.0
 */
@NoArgsConstructor
@AllArgsConstructor

public class User {
    /** Поле идентификатора */
    @Getter @Setter private Integer id;
    /** Поле ФИО */
    @Getter @Setter private String fio;
    /** Поле телефона */
    @Getter @Setter private String phone;

    /**
     * Метод преобразования пользователя в CSV формат
     * @return возвращает пользователя в формате CSV
     */
    public String toCSV() {
        return this.id + ":" + this.fio + ":" + this.phone;
    }

}
