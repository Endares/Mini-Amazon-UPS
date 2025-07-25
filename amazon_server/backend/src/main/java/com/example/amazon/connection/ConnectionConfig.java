package com.example.amazon.connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConnectionConfig {

    @Bean("worldConn")
    public ConnectionManager worldConn(
        @Value("${WORLD_HOST}") String host,
        @Value("${WORLD_PORT}") int port) {
        return new ConnectionManager(host, port, 3000, 10000);
    }

    @Bean("upsConn")
    public ConnectionManager upsConn(
        @Value("${UPS_HOST:vcm-45096.vm.duke.edu}") String host,
        @Value("${UPS_PORT:22222}") int port) {
        return new ConnectionManager(host, port, 3000, 10000);
    }
}
