
package com.everysens.itss.dto.position;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PositionEventDto extends BaseDeviceResponseDto {

    @JsonProperty("GNSS_Position")
    protected GNSSPositionDto gnssPosition;

}
