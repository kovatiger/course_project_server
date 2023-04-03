package application.repository;

import application.dto.StatisticDto;
import application.entity.Result;
import application.entity.Test;
import application.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    Result findResultByResultAndUserAndTest(Double result, User user, Test test);
}
