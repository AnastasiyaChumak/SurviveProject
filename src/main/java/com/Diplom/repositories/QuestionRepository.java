package com.Diplom.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Diplom.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	List<Question> findAllByWeather(String weather);

	Integer countByWeather(String weather);

}
