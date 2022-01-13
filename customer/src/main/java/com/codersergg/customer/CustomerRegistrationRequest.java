package com.codersergg.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
