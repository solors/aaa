package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Dispatcher {

    /* loaded from: classes4.dex */
    private static final class ImmediateDispatcher extends Dispatcher {

        /* renamed from: a */
        private static final ImmediateDispatcher f40913a = new ImmediateDispatcher();

        private ImmediateDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        /* renamed from: a */
        void mo68543a(Object obj, Iterator<Subscriber> it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                it.next().m68531d(obj);
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class LegacyAsyncDispatcher extends Dispatcher {

        /* renamed from: a */
        private final ConcurrentLinkedQueue<EventWithSubscriber> f40914a;

        /* loaded from: classes4.dex */
        private static final class EventWithSubscriber {

            /* renamed from: a */
            private final Object f40915a;

            /* renamed from: b */
            private final Subscriber f40916b;

            private EventWithSubscriber(Object obj, Subscriber subscriber) {
                this.f40915a = obj;
                this.f40916b = subscriber;
            }
        }

        private LegacyAsyncDispatcher() {
            this.f40914a = Queues.newConcurrentLinkedQueue();
        }

        @Override // com.google.common.eventbus.Dispatcher
        /* renamed from: a */
        void mo68543a(Object obj, Iterator<Subscriber> it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                this.f40914a.add(new EventWithSubscriber(obj, it.next()));
            }
            while (true) {
                EventWithSubscriber poll = this.f40914a.poll();
                if (poll != null) {
                    poll.f40916b.m68531d(poll.f40915a);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PerThreadQueuedDispatcher extends Dispatcher {

        /* renamed from: a */
        private final ThreadLocal<Queue<Event>> f40917a;

        /* renamed from: b */
        private final ThreadLocal<Boolean> f40918b;

        /* loaded from: classes4.dex */
        private static final class Event {

            /* renamed from: a */
            private final Object f40919a;

            /* renamed from: b */
            private final Iterator<Subscriber> f40920b;

            private Event(Object obj, Iterator<Subscriber> it) {
                this.f40919a = obj;
                this.f40920b = it;
            }
        }

        private PerThreadQueuedDispatcher() {
            this.f40917a = new ThreadLocal<Queue<Event>>(this) { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                /* renamed from: a */
                public Queue<Event> initialValue() {
                    return Queues.newArrayDeque();
                }
            };
            this.f40918b = new ThreadLocal<Boolean>(this) { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // java.lang.ThreadLocal
                /* renamed from: a */
                public Boolean initialValue() {
                    return Boolean.FALSE;
                }
            };
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0034 A[Catch: all -> 0x005b, LOOP:1: B:7:0x0034->B:9:0x003e, LOOP_START, TryCatch #0 {all -> 0x005b, blocks: (B:5:0x002c, B:7:0x0034, B:9:0x003e), top: B:16:0x002c }] */
        @Override // com.google.common.eventbus.Dispatcher
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void mo68543a(java.lang.Object r4, java.util.Iterator<com.google.common.eventbus.Subscriber> r5) {
            /*
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event>> r0 = r3.f40917a
                java.lang.Object r0 = r0.get()
                java.util.Queue r0 = (java.util.Queue) r0
                com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event r1 = new com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event
                r2 = 0
                r1.<init>(r4, r5)
                r0.offer(r1)
                java.lang.ThreadLocal<java.lang.Boolean> r4 = r3.f40918b
                java.lang.Object r4 = r4.get()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L67
                java.lang.ThreadLocal<java.lang.Boolean> r4 = r3.f40918b
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r4.set(r5)
            L2c:
                java.lang.Object r4 = r0.poll()     // Catch: java.lang.Throwable -> L5b
                com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event r4 = (com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event) r4     // Catch: java.lang.Throwable -> L5b
                if (r4 == 0) goto L50
            L34:
                java.util.Iterator r5 = com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event.m68540a(r4)     // Catch: java.lang.Throwable -> L5b
                boolean r5 = r5.hasNext()     // Catch: java.lang.Throwable -> L5b
                if (r5 == 0) goto L2c
                java.util.Iterator r5 = com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event.m68540a(r4)     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L5b
                com.google.common.eventbus.Subscriber r5 = (com.google.common.eventbus.Subscriber) r5     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r1 = com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.Event.m68539b(r4)     // Catch: java.lang.Throwable -> L5b
                r5.m68531d(r1)     // Catch: java.lang.Throwable -> L5b
                goto L34
            L50:
                java.lang.ThreadLocal<java.lang.Boolean> r4 = r3.f40918b
                r4.remove()
                java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event>> r4 = r3.f40917a
                r4.remove()
                goto L67
            L5b:
                r4 = move-exception
                java.lang.ThreadLocal<java.lang.Boolean> r5 = r3.f40918b
                r5.remove()
                java.lang.ThreadLocal<java.util.Queue<com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$Event>> r5 = r3.f40917a
                r5.remove()
                throw r4
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.mo68543a(java.lang.Object, java.util.Iterator):void");
        }
    }

    Dispatcher() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Dispatcher m68547b() {
        return new LegacyAsyncDispatcher();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Dispatcher m68546c() {
        return new PerThreadQueuedDispatcher();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo68543a(Object obj, Iterator<Subscriber> it);
}
