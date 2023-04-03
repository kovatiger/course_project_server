package application.mapper;

import application.dto.TestForAdminPanelDto;
import application.entity.Test;
import application.entity.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TopicMapper {

    public static List<TestForAdminPanelDto> getTestForAdminPanelFromTopic(List<Topic> topics) {
        List<TestForAdminPanelDto> tests = new ArrayList<>();
        for (Topic topic : topics) {
            TestForAdminPanelDto test = new TestForAdminPanelDto();
            test.setTopic(topic.getTopic());
            test.setTestNames(topic.getTestList().stream().map(Test::getTest).collect(Collectors.toList()));
            tests.add(test);
        }
        return tests;
    }
}
