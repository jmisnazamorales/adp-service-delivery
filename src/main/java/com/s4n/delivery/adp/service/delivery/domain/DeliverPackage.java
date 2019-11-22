package com.s4n.delivery.adp.service.delivery.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class DeliverPackage {

    /**
     * Delivery State
     */
    private String state;

    /**
     * Point list to arrive
     */
    private List<DestinationPoint> points;
}
