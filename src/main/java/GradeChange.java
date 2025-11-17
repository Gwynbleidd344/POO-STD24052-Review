import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class GradeChange {
    private double value;
    private Instant timestamp;
    private String reason;
}
