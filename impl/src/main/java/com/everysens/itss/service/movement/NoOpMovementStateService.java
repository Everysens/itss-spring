package com.everysens.itss.service.movement;

import com.everysens.itss.dto.movement.MovementStateEventDto;
import org.springframework.stereotype.Service;

@Service
public class NoOpMovementStateService implements IMovementStateService {
    public MovementStateEventDto getLastMovementState(String customerSystemId, String transportDeviceId) {
        return null;
    }

    public void notifyLastMovementState(MovementStateEventDto event) {

    }
}
