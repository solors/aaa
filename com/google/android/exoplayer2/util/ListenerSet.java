package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.FlagSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public final class ListenerSet<T> {

    /* renamed from: a */
    private final Clock f36100a;

    /* renamed from: b */
    private final HandlerWrapper f36101b;

    /* renamed from: c */
    private final IterationFinishedEvent<T> f36102c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<ListenerHolder<T>> f36103d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f36104e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f36105f;

    /* renamed from: g */
    private final Object f36106g;
    @GuardedBy("releasedLock")

    /* renamed from: h */
    private boolean f36107h;

    /* renamed from: i */
    private boolean f36108i;

    /* loaded from: classes4.dex */
    public interface Event<T> {
        void invoke(T t);
    }

    /* loaded from: classes4.dex */
    public interface IterationFinishedEvent<T> {
        void invoke(T t, FlagSet flagSet);
    }

    /* loaded from: classes4.dex */
    public static final class ListenerHolder<T> {

        /* renamed from: a */
        private FlagSet.Builder f36109a = new FlagSet.Builder();

        /* renamed from: b */
        private boolean f36110b;

        /* renamed from: c */
        private boolean f36111c;
        public final T listener;

        public ListenerHolder(T t) {
            this.listener = t;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ListenerHolder.class == obj.getClass()) {
                return this.listener.equals(((ListenerHolder) obj).listener);
            }
            return false;
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        public void invoke(int i, Event<T> event) {
            if (!this.f36111c) {
                if (i != -1) {
                    this.f36109a.add(i);
                }
                this.f36110b = true;
                event.invoke(this.listener);
            }
        }

        public void iterationFinished(IterationFinishedEvent<T> iterationFinishedEvent) {
            if (!this.f36111c && this.f36110b) {
                FlagSet build = this.f36109a.build();
                this.f36109a = new FlagSet.Builder();
                this.f36110b = false;
                iterationFinishedEvent.invoke(this.listener, build);
            }
        }

        public void release(IterationFinishedEvent<T> iterationFinishedEvent) {
            this.f36111c = true;
            if (this.f36110b) {
                this.f36110b = false;
                iterationFinishedEvent.invoke(this.listener, this.f36109a.build());
            }
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent);
    }

    /* renamed from: a */
    public static /* synthetic */ void m72615a(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
        m72612d(copyOnWriteArraySet, i, event);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m72614b(ListenerSet listenerSet, Message message) {
        return listenerSet.m72613c(message);
    }

    /* renamed from: c */
    public boolean m72613c(Message message) {
        Iterator<ListenerHolder<T>> it = this.f36103d.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.f36102c);
            if (this.f36101b.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static /* synthetic */ void m72612d(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ListenerHolder) it.next()).invoke(i, event);
        }
    }

    /* renamed from: e */
    private void m72611e() {
        boolean z;
        if (!this.f36108i) {
            return;
        }
        if (Thread.currentThread() == this.f36101b.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
    }

    public void add(T t) {
        Assertions.checkNotNull(t);
        synchronized (this.f36106g) {
            if (this.f36107h) {
                return;
            }
            this.f36103d.add(new ListenerHolder<>(t));
        }
    }

    public void clear() {
        m72611e();
        this.f36103d.clear();
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.f36100a, iterationFinishedEvent);
    }

    public void flushEvents() {
        m72611e();
        if (this.f36105f.isEmpty()) {
            return;
        }
        if (!this.f36101b.hasMessages(0)) {
            HandlerWrapper handlerWrapper = this.f36101b;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(0));
        }
        boolean z = !this.f36104e.isEmpty();
        this.f36104e.addAll(this.f36105f);
        this.f36105f.clear();
        if (z) {
            return;
        }
        while (!this.f36104e.isEmpty()) {
            this.f36104e.peekFirst().run();
            this.f36104e.removeFirst();
        }
    }

    public void queueEvent(final int i, final Event<T> event) {
        m72611e();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f36103d);
        this.f36105f.add(new Runnable() { // from class: com.google.android.exoplayer2.util.c
            @Override // java.lang.Runnable
            public final void run() {
                ListenerSet.m72615a(copyOnWriteArraySet, i, event);
            }
        });
    }

    public void release() {
        m72611e();
        synchronized (this.f36106g) {
            this.f36107h = true;
        }
        Iterator<ListenerHolder<T>> it = this.f36103d.iterator();
        while (it.hasNext()) {
            it.next().release(this.f36102c);
        }
        this.f36103d.clear();
    }

    public void remove(T t) {
        m72611e();
        Iterator<ListenerHolder<T>> it = this.f36103d.iterator();
        while (it.hasNext()) {
            ListenerHolder<T> next = it.next();
            if (next.listener.equals(t)) {
                next.release(this.f36102c);
                this.f36103d.remove(next);
            }
        }
    }

    public void sendEvent(int i, Event<T> event) {
        queueEvent(i, event);
        flushEvents();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.f36108i = z;
    }

    public int size() {
        m72611e();
        return this.f36103d.size();
    }

    private ListenerSet(CopyOnWriteArraySet<ListenerHolder<T>> copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this.f36100a = clock;
        this.f36103d = copyOnWriteArraySet;
        this.f36102c = iterationFinishedEvent;
        this.f36106g = new Object();
        this.f36104e = new ArrayDeque<>();
        this.f36105f = new ArrayDeque<>();
        this.f36101b = clock.createHandler(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return ListenerSet.m72614b(ListenerSet.this, message);
            }
        });
        this.f36108i = true;
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        return new ListenerSet<>(this.f36103d, looper, clock, iterationFinishedEvent);
    }
}
