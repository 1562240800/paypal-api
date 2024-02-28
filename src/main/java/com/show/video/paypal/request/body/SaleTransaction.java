package com.show.video.paypal.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SaleTransaction {

    @JsonProperty("billing_agreement_id")
    public String billingAgreementId;

    @JsonProperty("amount")
    public Amount amount;

    @JsonProperty("payment_mode")
    public String paymentMode;

    @JsonProperty("update_time")
    public String updateTime;

    @JsonProperty("create_time")
    public String createTime;

    @JsonProperty("protection_eligibility_type")
    public String protectionEligibilityType;

    @JsonProperty("transaction_fee")
    public Amount transactionFee;

    @JsonProperty("protection_eligibility")
    public String protectionEligibility;

    @JsonProperty("links")
    public List<Link> links;

    @JsonProperty("id")
    public String id;

    @JsonProperty("state")
    public String state;

    @JsonProperty("invoice_number")
    public String invoiceNumber;
}