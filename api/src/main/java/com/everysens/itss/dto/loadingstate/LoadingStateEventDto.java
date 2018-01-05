package com.everysens.itss.dto.loadingstate;

import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class LoadingStateEventDto extends PositionEventDto {

    @NotNull
    @JsonProperty("UTCtimestamp")
    private Double utcTimestamp;

    @NotNull
    private String loadingState;

    private Double payload;
}
