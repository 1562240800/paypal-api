package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

class BillingInfo {

    @JsonProperty("outstanding_balance")
    public Amount outstandingBalance;

    @JsonProperty("cycle_executions")
    public List<CycleExecution> cycleExecutions;

    @JsonProperty("last_payment")
    public Amount lastPayment;

    @JsonProperty("next_billing_time")
    public String nextBillingTime;

    @JsonProperty("final_payment_time")
    public String finalPaymentTime;

    @JsonProperty("failed_payments_count")
    public int failedPaymentsCount;
}
