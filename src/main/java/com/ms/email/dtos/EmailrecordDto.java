package com.ms.email.dtos;

import java.util.UUID;

public record EmailrecordDto(UUID userId,
                             String emailTo,
                             String subject,
                             String text) {
}
