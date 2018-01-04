package com.everysens.itss.dto;

import com.everysens.itss.dto.device.DeviceDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public abstract class BaseDeviceResponseDto extends BaseResponseDto{

    @JsonUnwrapped
    @NotNull
    private DeviceDto device;

}
