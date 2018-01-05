
package com.everysens.itss.dto.position;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class PositionEventDto extends BaseDeviceResponseDto {

    @JsonProperty("GNSS_Position")
    protected GNSSPositionDto gnssPosition;

}
