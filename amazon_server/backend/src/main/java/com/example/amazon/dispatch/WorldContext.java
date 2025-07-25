package com.example.amazon.dispatch;

import org.springframework.stereotype.Component;

@Component
public class WorldContext {
    private volatile long worldId = -1;

    public long getWorldId()         { return worldId; }
    public void setWorldId(long id)  { this.worldId = id; }
}