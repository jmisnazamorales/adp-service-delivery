package com.s4n.delivery.adp.service.delivery.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Drone {

    List<DeliverPackage> deliveries = new ArrayList<>();

    public void deliver(Drone drone) {
    }
}
