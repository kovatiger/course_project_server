package application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResultStatisticDto {
    private String testForAverageResult;
    private Double averageResult;
}
