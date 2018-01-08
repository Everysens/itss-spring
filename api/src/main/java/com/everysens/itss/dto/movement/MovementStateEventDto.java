package com.everysens.itss.dto.movement;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class MovementStateEventDto extends PositionEventDto {

    @NotNull
    @JsonProperty("UTCtimestamp")
    private Double utcTimestamp;

    @NotNull
    @JsonProperty("ITSS_MovementState")
    private MovementState movementState;

}
