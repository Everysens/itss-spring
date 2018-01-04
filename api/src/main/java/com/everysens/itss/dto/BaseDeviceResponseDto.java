package com.everysens.itss.dto;

import com.everysens.itss.dto.device.DeviceDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import javax.validation.constraints.NotNull;

public abstract class BaseDeviceResponseDto extends BaseResponseDto{

    @JsonUnwrapped
    @NotNull
    private DeviceDto device;

}
