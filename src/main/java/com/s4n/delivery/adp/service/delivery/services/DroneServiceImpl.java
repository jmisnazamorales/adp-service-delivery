package com.s4n.delivery.adp.service.delivery.services;

import com.s4n.delivery.adp.service.delivery.domain.DeliverPackage;
import com.s4n.delivery.adp.service.delivery.domain.Drone;
import com.s4n.delivery.adp.service.delivery.domain.enumerators.EnumStateDelivery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DroneServiceImpl implements DroneService{


    @Override
    public boolean deliver(Drone drone, DeliverPackage delivery) {
        log.info("method in class {} params {} ", this.getClass().getName(), drone.toString());
        if(!isDeliver(delivery)){
            goHead(delivery);
        }
        backToOrigin(drone);
        return true;
    }

    @Override
    public void backToOrigin(Drone drone) {
        log.info("method in class {} params {} ", this.getClass().getName(), drone.toString());
        try {
            Thread.sleep(1000);
        }catch (Exception e ){
            log.info(e.getMessage());
        }

    }

    @Override
    public void goHead(DeliverPackage delivery) {
        log.info("method in class {} params {} ", this.getClass().getName(), delivery.toString());
        delivery.getPoints().stream().forEach( x -> log.info(x.toString()));

    }

    @Override
    public void turn() {

    }

    private boolean isDeliver(DeliverPackage deliverPackage){
        return deliverPackage.getState().equals(EnumStateDelivery.F.getNameState());
    }

    private boolean isAxisX(){}
}
