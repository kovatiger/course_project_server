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
            CountStatisticDto statisticDto = CountStatisticDto.builder()
                    .test(entry.getKey())
                    .countOfUsers(entry.getValue())
                    .build();
            statisticDtos.add(statisticDto);
        }
        return statisticDtos;
    }

    public static List<ResultStatisticDto> getResultStatisticDto(Map<String, Double> results) {
        List<ResultStatisticDto> statisticDtos = new ArrayList<>();
        for (Map.Entry<String, Double> entry : results.entrySet()) {
            ResultStatisticDto statisticDto = ResultStatisticDto.builder()
                    .testForAverageResult(entry.getKey())
                    .averageResult(entry.getValue())
                    .build();
            statisticDtos.add(statisticDto);
        }
        return statisticDtos;
    }
}
