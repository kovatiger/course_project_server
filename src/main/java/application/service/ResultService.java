package application.service;

import application.entity.Result;
import application.entity.Test;
import application.entity.User;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public interface ResultService {
    Result findResultByUserAndTestAndResult(User user, Test test, Double rating);

    void save(Test test, User user, double userResult);

    Map<String, Long> findTestAndAmountPasses();

    Map<String,Double> findTest();
}
