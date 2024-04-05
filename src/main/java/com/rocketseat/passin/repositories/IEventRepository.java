package com.rocketseat.passin.repositories;

import com.rocketseat.passin.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepository extends JpaRepository<Event, String> {

}
