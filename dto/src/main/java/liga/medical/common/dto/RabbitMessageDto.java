package liga.medical.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class RabbitMessageDto {
    @EqualsAndHashCode.Exclude
    private long id;
    @EqualsAndHashCode.Exclude
    private String description;
    private Type type;
}
