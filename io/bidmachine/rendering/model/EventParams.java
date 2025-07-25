package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class EventParams {

    /* renamed from: a */
    private final EventType f97906a;

    /* renamed from: b */
    private final String f97907b;

    /* renamed from: c */
    private final List f97908c;

    public EventParams(@NonNull EventType eventType, @NonNull String str) {
        this(eventType, str, new ArrayList());
    }

    @NonNull
    public EventParams addTaskParams(@NonNull EventTaskParams eventTaskParams) {
        this.f97908c.add(eventTaskParams);
        return this;
    }

    @NonNull
    public List<EventTaskParams> getEventTaskParamsList() {
        return this.f97908c;
    }

    @NonNull
    public EventType getEventType() {
        return this.f97906a;
    }

    @NonNull
    public String getSource() {
        return this.f97907b;
    }

    public EventParams(@NonNull EventType eventType, @NonNull String str, @NonNull List<EventTaskParams> list) {
        this.f97906a = eventType;
        this.f97907b = str.toLowerCase();
        this.f97908c = list;
    }
}
