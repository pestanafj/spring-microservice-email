package com.ms.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ms.email.models.EmailModel;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
