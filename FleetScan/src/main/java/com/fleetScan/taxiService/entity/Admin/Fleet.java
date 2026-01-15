package com.fleetScan.taxiService.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "fleet")
@Data
public class fleet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "public_id", unique = true, nullable = false, length = 40)
    private String publicId;

    @Column(name = "admin_chat_id", nullable = false, length = 40)
    private Long adminChatId;

    @Column(name = "name", unique = false, nullable = false, length = 50)
    private String name;

    @CreationTimestamp
    @Column(name = "created_at_time")
    private LocalDateTime createdAtTime;


}
