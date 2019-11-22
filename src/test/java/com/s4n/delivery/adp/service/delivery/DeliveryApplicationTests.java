package com.s4n.delivery.adp.service.delivery;

import com.s4n.delivery.adp.service.delivery.domain.Drone;
import com.s4n.delivery.adp.service.delivery.services.DroneService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class DeliveryApplicationTests {

    @MockBean
    DroneService droneService;

    @Test
    void contextLoads() {

    }

    @Test
    @DisplayName("Should be true")
    public void takeDelivery(){
        Drone drone = new Drone();
        assertFalse(droneService.deliver(drone, 1));
    }

    @Test
    public void deliver(){
        Drone drone = new Drone();
        drone.deliver(drone);
    }

    @Test
    public void readInstructions(){
        String instructions = "";
    }

}
