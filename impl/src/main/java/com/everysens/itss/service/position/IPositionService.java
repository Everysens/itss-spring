package com.everysens.itss.service.position;

import com.everysens.itss.dto.position.PositionEventDto;
import com.everysens.itss.dto.position.PositionEventListDto;

public interface IPositionService {

    void notifyLastPosition(PositionEventDto lastPosition);

    PositionEventDto getLastPosition(String customerSystemId, String transportDeviceId);

    PositionEventListDto getPositionsFromTo(String customerSystemId, String transportDeviceId, long fromUtcMillis, long toUtcMillis);

}
