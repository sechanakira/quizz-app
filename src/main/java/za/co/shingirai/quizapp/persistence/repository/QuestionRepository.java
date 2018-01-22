package za.co.shingirai.quizapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shingirai.quizapp.persistence.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}