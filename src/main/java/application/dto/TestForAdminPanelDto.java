package application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class TestForAdminPanelDto {
    private String topic;
    private List<String> testNames;
}
