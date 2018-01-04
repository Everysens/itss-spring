
package com.everysens.itss.dto.position;

import com.everysens.itss.dto.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
public class PositionDto extends BaseDto {

    @JsonProperty("GNSS_Position")
    public GNSSPositionDto gnssPosition;

}
