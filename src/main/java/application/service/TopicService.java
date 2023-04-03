package application.service;

import application.entity.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TopicService {
    Topic findTopicByTopicName(String topicName);

    List<Topic> getAllTopics();
}
