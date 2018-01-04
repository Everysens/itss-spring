
package com.everysens.itss.dto.position;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
public class PositionEventDto extends BaseDeviceResponseDto {

    @NotNull
    @JsonUnwrapped
    private PositionDto position;

}
