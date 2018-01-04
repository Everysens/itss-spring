package com.everysens.itss.facade.position;

import com.everysens.itss.dto.position.PositionEventDto;
import com.everysens.itss.dto.position.PositionEventListDto;

public interface IPositionFacade {

    void notifyLastPosition(PositionEventDto lastPosition);

    PositionEventDto getLastPosition(String customerSystemId, String transportDeviceId);

    PositionEventListDto getPositionsFromTo(String customerSystemId, String transportDeviceId, long fromUtcMillis, long toUtcMillis);

}
