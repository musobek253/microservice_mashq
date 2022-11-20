package org.example.cilents.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("notification")
public interface NotificationCilent {

        @PostMapping("api/v1/notification")
        void sendNotification(NotificationRequest notification);
}
