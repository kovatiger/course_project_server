package application.mapper;

import application.dto.CountStatisticDto;
import application.dto.ResultStatisticDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StatisticMapper {

    public static List<CountStatisticDto> getCountStatisticDto(Map<String, Long> tests) {
        List<CountStatisticDto> statisticDtos = new ArrayList<>();
        for (Map.Entry<String, Long> entry : tests.entrySet()) {
            CountStatisticDto statisticDto = new CountStatisticDto();
            statisticDto.setTest(entry.getKey());
            statisticDto.setCountOfUsers(entry.getValue().intValue());
            statisticDtos.add(statisticDto);
        }
        return statisticDtos;
    }

    public static List<ResultStatisticDto> getResultStatisticDto(Map<String, Double> results) {
        List<ResultStatisticDto> statisticDtos = new ArrayList<>();
        for (Map.Entry<String, Double> entry : results.entrySet()) {
            ResultStatisticDto statisticDto = new ResultStatisticDto();
            statisticDto.setTestForAverageResult(entry.getKey());
            statisticDto.setAverageResult(entry.getValue().intValue());
            statisticDtos.add(statisticDto);
        }
        return statisticDtos;
    }
}
