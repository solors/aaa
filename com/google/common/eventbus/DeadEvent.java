package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class DeadEvent {

    /* renamed from: a */
    private final Object f40911a;

    /* renamed from: b */
    private final Object f40912b;

    public DeadEvent(Object obj, Object obj2) {
        this.f40911a = Preconditions.checkNotNull(obj);
        this.f40912b = Preconditions.checkNotNull(obj2);
    }

    public Object getEvent() {
        return this.f40912b;
    }

    public Object getSource() {
        return this.f40911a;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("source", this.f40911a).add("event", this.f40912b).toString();
    }
}
