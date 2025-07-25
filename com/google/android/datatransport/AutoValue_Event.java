package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
final class AutoValue_Event<T> extends Event<T> {

    /* renamed from: a */
    private final Integer f30852a;

    /* renamed from: b */
    private final T f30853b;

    /* renamed from: c */
    private final Priority f30854c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Event(@Nullable Integer num, T t, Priority priority) {
        this.f30852a = num;
        if (t != null) {
            this.f30853b = t;
            if (priority != null) {
                this.f30854c = priority;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.f30852a;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.f30853b.equals(event.getPayload()) && this.f30854c.equals(event.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public Integer getCode() {
        return this.f30852a;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.f30853b;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.f30854c;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f30852a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f30853b.hashCode()) * 1000003) ^ this.f30854c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f30852a + ", payload=" + this.f30853b + ", priority=" + this.f30854c + "}";
    }
}
