package com.everysens.itss.service.position;

import com.everysens.itss.dto.position.PositionDto;
import com.everysens.itss.dto.position.PositionEventDto;
import org.springframework.stereotype.Service;

@Service
public class NoOpPositionService implements IPositionService {

    public void notifyLastPosition(PositionEventDto lastPosition) {

    }

    public PositionDto getLastPosition(String transportDeviceId, String customerSystemId) {
        return null;
    }
}
