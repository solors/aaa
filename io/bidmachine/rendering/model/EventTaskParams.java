package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class EventTaskParams {

    /* renamed from: a */
    private final EventTaskType f97909a;

    /* renamed from: b */
    private final String f97910b;

    /* renamed from: c */
    private final Object f97911c;

    public EventTaskParams(@NonNull EventTaskType eventTaskType, @NonNull String str) {
        this(eventTaskType, str, null);
    }

    @NonNull
    public EventTaskType getEventTaskType() {
        return this.f97909a;
    }

    @NonNull
    public String getTarget() {
        return this.f97910b;
    }

    @Nullable
    public Object getValue() {
        return this.f97911c;
    }

    public EventTaskParams(@NonNull EventTaskType eventTaskType, @NonNull String str, @Nullable Object obj) {
        this.f97909a = eventTaskType;
        this.f97910b = str.toLowerCase();
        this.f97911c = obj;
    }
}
