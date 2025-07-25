package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class EventBus {

    /* renamed from: f */
    private static final Logger f40921f = Logger.getLogger(EventBus.class.getName());

    /* renamed from: a */
    private final String f40922a;

    /* renamed from: b */
    private final Executor f40923b;

    /* renamed from: c */
    private final SubscriberExceptionHandler f40924c;

    /* renamed from: d */
    private final SubscriberRegistry f40925d;

    /* renamed from: e */
    private final Dispatcher f40926e;

    /* loaded from: classes4.dex */
    static final class LoggingHandler implements SubscriberExceptionHandler {

        /* renamed from: a */
        static final LoggingHandler f40927a = new LoggingHandler();

        LoggingHandler() {
        }

        /* renamed from: a */
        private static Logger m68536a(SubscriberExceptionContext subscriberExceptionContext) {
            String name = EventBus.class.getName();
            String identifier = subscriberExceptionContext.getEventBus().identifier();
            StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(identifier).length());
            sb2.append(name);
            sb2.append(".");
            sb2.append(identifier);
            return Logger.getLogger(sb2.toString());
        }

        /* renamed from: b */
        private static String m68535b(SubscriberExceptionContext subscriberExceptionContext) {
            Method subscriberMethod = subscriberExceptionContext.getSubscriberMethod();
            String name = subscriberMethod.getName();
            String name2 = subscriberMethod.getParameterTypes()[0].getName();
            String valueOf = String.valueOf(subscriberExceptionContext.getSubscriber());
            String valueOf2 = String.valueOf(subscriberExceptionContext.getEvent());
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 80 + name2.length() + valueOf.length() + valueOf2.length());
            sb2.append("Exception thrown by subscriber method ");
            sb2.append(name);
            sb2.append('(');
            sb2.append(name2);
            sb2.append(')');
            sb2.append(" on subscriber ");
            sb2.append(valueOf);
            sb2.append(" when dispatching event: ");
            sb2.append(valueOf2);
            return sb2.toString();
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
            Logger m68536a = m68536a(subscriberExceptionContext);
            Level level = Level.SEVERE;
            if (m68536a.isLoggable(level)) {
                m68536a.log(level, m68535b(subscriberExceptionContext), th);
            }
        }
    }

    public EventBus() {
        this("default");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Executor m68538a() {
        return this.f40923b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m68537b(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
        Preconditions.checkNotNull(th);
        Preconditions.checkNotNull(subscriberExceptionContext);
        try {
            this.f40924c.handleException(th, subscriberExceptionContext);
        } catch (Throwable th2) {
            f40921f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, th), th2);
        }
    }

    public final String identifier() {
        return this.f40922a;
    }

    public void post(Object obj) {
        Iterator<Subscriber> m68522f = this.f40925d.m68522f(obj);
        if (m68522f.hasNext()) {
            this.f40926e.mo68543a(obj, m68522f);
        } else if (!(obj instanceof DeadEvent)) {
            post(new DeadEvent(this, obj));
        }
    }

    public void register(Object obj) {
        this.f40925d.m68521g(obj);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.f40922a).toString();
    }

    public void unregister(Object obj) {
        this.f40925d.m68520h(obj);
    }

    public EventBus(String str) {
        this(str, MoreExecutors.directExecutor(), Dispatcher.m68546c(), LoggingHandler.f40927a);
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
        this("default", MoreExecutors.directExecutor(), Dispatcher.m68546c(), subscriberExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventBus(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.f40925d = new SubscriberRegistry(this);
        this.f40922a = (String) Preconditions.checkNotNull(str);
        this.f40923b = (Executor) Preconditions.checkNotNull(executor);
        this.f40926e = (Dispatcher) Preconditions.checkNotNull(dispatcher);
        this.f40924c = (SubscriberExceptionHandler) Preconditions.checkNotNull(subscriberExceptionHandler);
    }
}
