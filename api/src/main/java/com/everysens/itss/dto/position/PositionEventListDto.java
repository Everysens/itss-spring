
package com.everysens.itss.dto.position;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@Getter
@ToString(callSuper = true)
public class PositionEventListDto extends BaseDeviceResponseDto {

    @NotNull
    @JsonProperty("GNSS_Position_List")
    public List<GNSSPositionDto> positions;

}
