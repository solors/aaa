package com.learnings.purchase.event.p403db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "purchase_event")
/* renamed from: com.learnings.purchase.event.db.EventEntity */
/* loaded from: classes6.dex */
public class EventEntity {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "eventId")
    private String eventId;
    @ColumnInfo(name = "eventJson")
    private String eventJson;

    @NonNull
    public String getEventId() {
        return this.eventId;
    }

    public String getEventJson() {
        return this.eventJson;
    }

    public void setEventId(@NonNull String str) {
        this.eventId = str;
    }

    public void setEventJson(String str) {
        this.eventJson = str;
    }
}
