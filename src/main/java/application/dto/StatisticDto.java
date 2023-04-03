package application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StatisticDto {
    private String test;
    private Long countOfUsers;
    private String averageResult;
    private String testForAverageResult;

    public StatisticDto(String test, Long countOfUsers) {
        this.test = test;
        this.countOfUsers = countOfUsers;
    }
}
