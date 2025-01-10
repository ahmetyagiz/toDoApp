package com.ahmetyagiz.repository;

import com.ahmetyagiz.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
