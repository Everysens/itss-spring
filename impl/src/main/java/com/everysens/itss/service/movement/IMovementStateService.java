package com.everysens.itss.service.movement;

import com.everysens.itss.dto.movement.MovementStateEventDto;
import com.everysens.itss.dto.position.PositionEventDto;

public interface IMovementStateService {

    MovementStateEventDto getLastMovementState(String customerSystemId, String transportDeviceId);

    void notifyLastMovementState(MovementStateEventDto event);
}
