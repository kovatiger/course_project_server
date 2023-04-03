package application.controller;

import application.dto.StatisticDto;
import application.entity.Result;
import application.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StatisticController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/api/admin/statistic")
    public ResponseEntity<StatisticDto> getStatistic() {
        System.out.println();
        return null;
    }

}
