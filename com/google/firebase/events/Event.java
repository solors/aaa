package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* loaded from: classes4.dex */
public class Event<T> {

    /* renamed from: a */
    private final Class<T> f43029a;

    /* renamed from: b */
    private final T f43030b;

    public Event(Class<T> cls, T t) {
        this.f43029a = (Class) Preconditions.checkNotNull(cls);
        this.f43030b = (T) Preconditions.checkNotNull(t);
    }

    public T getPayload() {
        return this.f43030b;
    }

    public Class<T> getType() {
        return this.f43029a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f43029a, this.f43030b);
    }
}
