package ru.eltex.repos;

import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import ru.eltex.domain.Message;


public interface MessageRepos extends CrudRepository<Message, Long> {

}
