package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.FlagSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

@UnstableApi
/* loaded from: classes9.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private final Clock clock;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T> iterationFinishedEvent;
    private final CopyOnWriteArraySet<C35904a<T>> listeners;
    private final ArrayDeque<Runnable> queuedEvents;
    @GuardedBy("releasedLock")
    private boolean released;
    private final Object releasedLock;
    private boolean throwsWhenUsingWrongThread;

    /* loaded from: classes9.dex */
    public interface Event<T> {
        void invoke(T t);
    }

    /* loaded from: classes9.dex */
    public interface IterationFinishedEvent<T> {
        void invoke(T t, FlagSet flagSet);
    }

    /* renamed from: io.bidmachine.media3.common.util.ListenerSet$a */
    /* loaded from: classes9.dex */
    public static final class C35904a<T> {
        private FlagSet.Builder flagsBuilder = new FlagSet.Builder();
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public C35904a(T t) {
            this.listener = t;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C35904a.class == obj.getClass()) {
                return this.listener.equals(((C35904a) obj).listener);
            }
            return false;
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        public void invoke(int i, Event<T> event) {
            if (!this.released) {
                if (i != -1) {
                    this.flagsBuilder.add(i);
                }
                this.needsIterationFinishedEvent = true;
                event.invoke(this.listener);
            }
        }

        public void iterationFinished(IterationFinishedEvent<T> iterationFinishedEvent) {
            if (!this.released && this.needsIterationFinishedEvent) {
                FlagSet build = this.flagsBuilder.build();
                this.flagsBuilder = new FlagSet.Builder();
                this.needsIterationFinishedEvent = false;
                iterationFinishedEvent.invoke(this.listener, build);
            }
        }

        public void release(IterationFinishedEvent<T> iterationFinishedEvent) {
            this.released = true;
            if (this.needsIterationFinishedEvent) {
                this.needsIterationFinishedEvent = false;
                iterationFinishedEvent.invoke(this.listener, this.flagsBuilder.build());
            }
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent, true);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m19953a(ListenerSet listenerSet, Message message) {
        return listenerSet.handleMessage(message);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19952b(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
        lambda$queueEvent$0(copyOnWriteArraySet, i, event);
    }

    public boolean handleMessage(Message message) {
        Iterator<C35904a<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.iterationFinishedEvent);
            if (this.handler.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public static /* synthetic */ void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C35904a) it.next()).invoke(i, event);
        }
    }

    private void verifyCurrentThread() {
        boolean z;
        if (!this.throwsWhenUsingWrongThread) {
            return;
        }
        if (Thread.currentThread() == this.handler.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
    }

    public void add(T t) {
        Assertions.checkNotNull(t);
        synchronized (this.releasedLock) {
            if (this.released) {
                return;
            }
            this.listeners.add(new C35904a<>(t));
        }
    }

    public void clear() {
        verifyCurrentThread();
        this.listeners.clear();
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.clock, iterationFinishedEvent);
    }

    public void flushEvents() {
        verifyCurrentThread();
        if (this.queuedEvents.isEmpty()) {
            return;
        }
        if (!this.handler.hasMessages(0)) {
            HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(0));
        }
        boolean z = !this.flushingEvents.isEmpty();
        this.flushingEvents.addAll(this.queuedEvents);
        this.queuedEvents.clear();
        if (z) {
            return;
        }
        while (!this.flushingEvents.isEmpty()) {
            this.flushingEvents.peekFirst().run();
            this.flushingEvents.removeFirst();
        }
    }

    public void queueEvent(final int i, final Event<T> event) {
        verifyCurrentThread();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.listeners);
        this.queuedEvents.add(new Runnable() { // from class: io.bidmachine.media3.common.util.b
            @Override // java.lang.Runnable
            public final void run() {
                ListenerSet.m19952b(copyOnWriteArraySet, i, event);
            }
        });
    }

    public void release() {
        verifyCurrentThread();
        synchronized (this.releasedLock) {
            this.released = true;
        }
        Iterator<C35904a<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
    }

    public void remove(T t) {
        verifyCurrentThread();
        Iterator<C35904a<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            C35904a<T> next = it.next();
            if (next.listener.equals(t)) {
                next.release(this.iterationFinishedEvent);
                this.listeners.remove(next);
            }
        }
    }

    public void sendEvent(int i, Event<T> event) {
        queueEvent(i, event);
        flushEvents();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.throwsWhenUsingWrongThread = z;
    }

    public int size() {
        verifyCurrentThread();
        return this.listeners.size();
    }

    private ListenerSet(CopyOnWriteArraySet<C35904a<T>> copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent, boolean z) {
        this.clock = clock;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.releasedLock = new Object();
        this.flushingEvents = new ArrayDeque<>();
        this.queuedEvents = new ArrayDeque<>();
        this.handler = clock.createHandler(looper, new Handler.Callback() { // from class: io.bidmachine.media3.common.util.c
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return ListenerSet.m19953a(ListenerSet.this, message);
            }
        });
        this.throwsWhenUsingWrongThread = z;
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        return new ListenerSet<>(this.listeners, looper, clock, iterationFinishedEvent, this.throwsWhenUsingWrongThread);
    }
}
