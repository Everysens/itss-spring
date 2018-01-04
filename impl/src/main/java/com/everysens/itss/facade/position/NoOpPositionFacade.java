package com.everysens.itss.facade.position;

import com.everysens.itss.dto.position.PositionEventDto;
import com.everysens.itss.dto.position.PositionEventListDto;
import org.springframework.stereotype.Service;

@Service
public class NoOpPositionFacade implements IPositionFacade {

    public void notifyLastPosition(PositionEventDto lastPosition) {

    }

    @Override
    public PositionEventDto getLastPosition(String customerSystemId, String transportDeviceId) {
        return null;
    }

    @Override
    public PositionEventListDto getPositionsFromTo(String customerSystemId, String transportDeviceId, long fromUtcMillis, long toUtcMillis) {
        return null;
    }
}
