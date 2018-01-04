package com.everysens.itss.facade.movement;

import com.everysens.itss.dto.movement.MovementStateEventDto;
import org.springframework.stereotype.Service;

@Service
public class NoOpMovementStateFacade implements IMovementStateFacade {
    public MovementStateEventDto getLastMovementState(String customerSystemId, String transportDeviceId) {
        return null;
    }

    public void notifyLastMovementState(MovementStateEventDto event) {

    }
}
