package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class Subscriber {
    @Weak

    /* renamed from: a */
    private EventBus f40928a;
    @VisibleForTesting

    /* renamed from: b */
    final Object f40929b;

    /* renamed from: c */
    private final Method f40930c;

    /* renamed from: d */
    private final Executor f40931d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class SynchronizedSubscriber extends Subscriber {
        @Override // com.google.common.eventbus.Subscriber
        /* renamed from: e */
        void mo68528e(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.mo68528e(obj);
            }
        }

        private SynchronizedSubscriber(EventBus eventBus, Object obj, Method method) {
            super(eventBus, obj, method);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m68534a(Subscriber subscriber, Object obj) {
        subscriber.m68529g(obj);
    }

    /* renamed from: b */
    private SubscriberExceptionContext m68533b(Object obj) {
        return new SubscriberExceptionContext(this.f40928a, obj, this.f40929b, this.f40930c);
    }

    /* renamed from: c */
    public static Subscriber m68532c(EventBus eventBus, Object obj, Method method) {
        if (m68530f(method)) {
            return new Subscriber(eventBus, obj, method);
        }
        return new SynchronizedSubscriber(eventBus, obj, method);
    }

    /* renamed from: f */
    private static boolean m68530f(Method method) {
        if (method.getAnnotation(AllowConcurrentEvents.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public /* synthetic */ void m68529g(Object obj) {
        try {
            mo68528e(obj);
        } catch (InvocationTargetException e) {
            this.f40928a.m68537b(e.getCause(), m68533b(obj));
        }
    }

    /* renamed from: d */
    public final void m68531d(final Object obj) {
        this.f40931d.execute(new Runnable() { // from class: com.google.common.eventbus.a
            @Override // java.lang.Runnable
            public final void run() {
                Subscriber.m68534a(Subscriber.this, obj);
            }
        });
    }

    @VisibleForTesting
    /* renamed from: e */
    void mo68528e(Object obj) throws InvocationTargetException {
        try {
            this.f40930c.invoke(this.f40929b, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
            sb2.append("Method became inaccessible: ");
            sb2.append(valueOf);
            throw new Error(sb2.toString(), e);
        } catch (IllegalArgumentException e2) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 33);
            sb3.append("Method rejected target/argument: ");
            sb3.append(valueOf2);
            throw new Error(sb3.toString(), e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscriber)) {
            return false;
        }
        Subscriber subscriber = (Subscriber) obj;
        if (this.f40929b != subscriber.f40929b || !this.f40930c.equals(subscriber.f40930c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f40930c.hashCode() + 31) * 31) + System.identityHashCode(this.f40929b);
    }

    private Subscriber(EventBus eventBus, Object obj, Method method) {
        this.f40928a = eventBus;
        this.f40929b = Preconditions.checkNotNull(obj);
        this.f40930c = method;
        method.setAccessible(true);
        this.f40931d = eventBus.m68538a();
    }
}
