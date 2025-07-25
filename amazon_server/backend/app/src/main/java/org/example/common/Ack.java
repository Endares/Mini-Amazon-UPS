package org.example.common;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "acks")
public class Ack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ackId;

    @Column(name = "ack", nullable = false)
    private Long ack;
    // Getters and setters


    public Long getAck() {
        return ack;
    }

    public void setAck(Long ack) {
        this.ack = ack;
    }
}
