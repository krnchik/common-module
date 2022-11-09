package liga.medical.common.core.model;

import liga.medical.common.dto.Status;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "debug", schema = "medical")
public class Debug {

    @Id
    @Column(length = 36)
    private String id;

    @Column(name = "system_type_id")
    @Enumerated(EnumType.STRING)
    private Status systemStatusId;

    @Column(name = "method_params")
    private String methodParams;
}
