package application.controller;

import application.dto.CountStatisticDto;
import application.dto.ResultStatisticDto;
import application.mapper.StatisticMapper;
import application.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StatisticController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/api/admin/statistic/count")
    public ResponseEntity<List<CountStatisticDto>> getCountStatistic() {
        Map<String, Long> tests = resultService.findTestAndAmountPasses();
        if (tests.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<CountStatisticDto> statisticDto = StatisticMapper.getCountStatisticDto(tests);
        return new ResponseEntity<>(statisticDto, HttpStatus.OK);
    }

    @GetMapping("/api/admin/statistic/result")
    public ResponseEntity<List<ResultStatisticDto>> getResultStatistic() {
        Map<String, Double> results = resultService.findTest();
        if (results.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<ResultStatisticDto> statisticDto = StatisticMapper.getResultStatisticDto(results);
        return new ResponseEntity<>(statisticDto, HttpStatus.OK);
    }
}
