package SteshM.CBC.Elearning.System.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ResponseDTO {
    private long statusCode;
    private String statusDescription;
    private List<?> data;
}
