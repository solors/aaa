package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class SubscriberExceptionContext {

    /* renamed from: a */
    private final EventBus f40932a;

    /* renamed from: b */
    private final Object f40933b;

    /* renamed from: c */
    private final Object f40934c;

    /* renamed from: d */
    private final Method f40935d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriberExceptionContext(EventBus eventBus, Object obj, Object obj2, Method method) {
        this.f40932a = (EventBus) Preconditions.checkNotNull(eventBus);
        this.f40933b = Preconditions.checkNotNull(obj);
        this.f40934c = Preconditions.checkNotNull(obj2);
        this.f40935d = (Method) Preconditions.checkNotNull(method);
    }

    public Object getEvent() {
        return this.f40933b;
    }

    public EventBus getEventBus() {
        return this.f40932a;
    }

    public Object getSubscriber() {
        return this.f40934c;
    }

    public Method getSubscriberMethod() {
        return this.f40935d;
    }
}
