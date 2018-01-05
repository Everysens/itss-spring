package com.everysens.itss.dto.mileage;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.everysens.itss.dto.BaseResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@ToString(callSuper = true)
public class MileageEventDto extends BaseDeviceResponseDto {

    @NotNull
    @JsonProperty("mileage")
    public Double mileage;

}