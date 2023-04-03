package application.service.service_impl;

import application.entity.Result;
import application.entity.Test;
import application.entity.User;
import application.repository.ResultRepository;
import application.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class ResultServiceImpl implements ResultService {
    private final ResultRepository resultRepository;

    @Autowired
    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public Result findResultByUserAndTestAndResult(User user, Test test, Double rating) {
        return resultRepository.findResultByResultAndUserAndTest(rating, user, test);
    }

    @Override
    public void save(Test test, User user, double userResult) {
        Result result = new Result();
        result.setTest(test);
        result.setUser(user);
        result.setResult(userResult);
        resultRepository.save(result);
    }

    @Override
    public Map<String, Long> findTestAndAmountPasses() {
        List<Result> results = resultRepository.findAll();
        return results.stream()
                .collect(Collectors.groupingBy(n -> n.getTest().getTest(), Collectors.counting()));
    }

    @Override
    public Map<String, Double> findTest() {
        List<Result> results = resultRepository.findAll();
        return results.stream()
                .collect(Collectors.groupingBy(n -> n.getTest().getTest(), Collectors.averagingDouble(Result::getResult)));
    }

}
