package com.everysens.itss.dto.shock;

import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
public class ShockEventDto extends PositionEventDto {

    @NotNull
    @JsonUnwrapped
    private ShockDto shock;

}
