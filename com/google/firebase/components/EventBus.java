package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
class EventBus implements Subscriber, Publisher {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> f42117a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    private Queue<Event<?>> f42118b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f42119c;

    public EventBus(Executor executor) {
        this.f42119c = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m67328a(Map.Entry entry, Event event) {
        m67325d(entry, event);
    }

    /* renamed from: c */
    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> m67326c(Event<?> event) {
        Set<Map.Entry<EventHandler<Object>, Executor>> entrySet;
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.f42117a.get(event.getType());
        if (concurrentHashMap == null) {
            entrySet = Collections.emptySet();
        } else {
            entrySet = concurrentHashMap.entrySet();
        }
        return entrySet;
    }

    /* renamed from: d */
    public static /* synthetic */ void m67325d(Map.Entry entry, Event event) {
        ((EventHandler) entry.getKey()).handle(event);
    }

    /* renamed from: b */
    public void m67327b() {
        Queue<Event<?>> queue;
        synchronized (this) {
            queue = this.f42118b;
            if (queue != null) {
                this.f42118b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (Event<?> event : queue) {
                publish(event);
            }
        }
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(final Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            Queue<Event<?>> queue = this.f42118b;
            if (queue != null) {
                queue.add(event);
                return;
            }
            for (final Map.Entry<EventHandler<Object>, Executor> entry : m67326c(event)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        EventBus.m67328a(entry, event);
                    }
                });
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        Preconditions.checkNotNull(executor);
        if (!this.f42117a.containsKey(cls)) {
            this.f42117a.put(cls, new ConcurrentHashMap<>());
        }
        this.f42117a.get(cls).put(eventHandler, executor);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (!this.f42117a.containsKey(cls)) {
            return;
        }
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.f42117a.get(cls);
        concurrentHashMap.remove(eventHandler);
        if (concurrentHashMap.isEmpty()) {
            this.f42117a.remove(cls);
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.f42119c, eventHandler);
    }
}
