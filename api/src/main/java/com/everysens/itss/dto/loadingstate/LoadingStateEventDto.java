package com.everysens.itss.dto.loadingstate;

import com.everysens.itss.dto.position.PositionEventDto;

import javax.validation.constraints.NotNull;

public class LoadingStateEventDto extends PositionEventDto {

    @NotNull
    private String loadingState;
    private Double payload;
}
