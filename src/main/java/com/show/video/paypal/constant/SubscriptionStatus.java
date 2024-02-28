package com.show.video.paypal.constant;

import lombok.Getter;

@Getter
public enum SubscriptionStatus {
    APPROVAL_PENDING("The subscription is created but not yet approved by the buyer."),
    APPROVED("The buyer has approved the subscription."),
    ACTIVE("The subscription is active."),
    SUSPENDED("The subscription is suspended."),
    CANCELLED("The subscription is cancelled."),
    EXPIRED("The subscription is expired.");

    private final String description;

    SubscriptionStatus(String description) {
        this.description = description;
    }

}