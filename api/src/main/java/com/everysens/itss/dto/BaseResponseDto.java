package com.everysens.itss.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseResponseDto extends BaseDto{

    @NotNull
    @JsonProperty("ITSS_TelematicsApplicationID")
    protected String telematicsApplicationId;

    @NotNull
    @Size(min = 1, max = 20)
    @JsonProperty("ITSS_PassPhrase")
    protected String passPhrase;
}
