package com.everysens.itss.facade.movement;

import com.everysens.itss.dto.movement.MovementStateEventDto;

public interface IMovementStateFacade {

    MovementStateEventDto getLastMovementState(String customerSystemId, String transportDeviceId);

    void notifyLastMovementState(MovementStateEventDto event);
}
