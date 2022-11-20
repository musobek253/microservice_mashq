package org.example.cilents.notification;

public record NotificationRequest(
         Integer toCustomerId,
         String tocustomerEmail,
         String message
) {
}
