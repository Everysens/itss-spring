package com.everysens.itss.dto.device;

import com.everysens.itss.dto.BaseResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceListDto extends BaseResponseDto {

    @NotNull
    @JsonProperty("ITSS_DeviceList")
    private List<DeviceDto> devices;

}
