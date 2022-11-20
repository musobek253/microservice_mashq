package org.example.notification.service;

import lombok.AllArgsConstructor;
import org.example.cilents.notification.NotificationRequest;
import org.example.notification.entity.Notification;
import org.example.notification.repo.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .tocustomerEmail(notificationRequest.tocustomerEmail())
                        .sender("Musobek")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
