package application.service;

import application.entity.Test;
import application.entity.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {
    Test findTestByTestName(String testName);

    void saveTest(String testName, Topic topic);
}
