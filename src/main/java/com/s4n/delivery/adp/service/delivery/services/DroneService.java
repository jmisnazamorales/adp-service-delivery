package com.s4n.delivery.adp.service.delivery.services;

import com.s4n.delivery.adp.service.delivery.domain.DeliverPackage;
import com.s4n.delivery.adp.service.delivery.domain.Drone;

public interface DroneService {

    boolean deliver(Drone drone,  DeliverPackage delivery);

    void backToOrigin(Drone drone);

    void goHead(DeliverPackage delivery);

    void turn();
}
