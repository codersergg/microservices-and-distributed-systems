package com.codersergg.clients.notification;

import org.springframework.web.bind.annotation.PostMapping;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}
