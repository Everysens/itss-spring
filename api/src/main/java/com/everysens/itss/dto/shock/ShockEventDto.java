package com.everysens.itss.dto.shock;

import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder(builderMethodName = "shockBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class ShockEventDto extends PositionEventDto {

    @NotNull
    @JsonUnwrapped
    private ShockDto shock;

}
