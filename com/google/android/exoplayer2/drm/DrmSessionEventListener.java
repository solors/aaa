package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public interface DrmSessionEventListener {

    /* loaded from: classes4.dex */
    public static class EventDispatcher {

        /* renamed from: a */
        private final CopyOnWriteArrayList<ListenerAndHandler> f32782a;
        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: a */
        public static /* synthetic */ void m74813a(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.m74802l(drmSessionEventListener);
        }

        /* renamed from: b */
        public static /* synthetic */ void m74812b(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.m74806h(drmSessionEventListener);
        }

        /* renamed from: c */
        public static /* synthetic */ void m74811c(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.m74807g(drmSessionEventListener);
        }

        /* renamed from: d */
        public static /* synthetic */ void m74810d(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.m74805i(drmSessionEventListener);
        }

        /* renamed from: e */
        public static /* synthetic */ void m74809e(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, Exception exc) {
            eventDispatcher.m74803k(drmSessionEventListener, exc);
        }

        /* renamed from: f */
        public static /* synthetic */ void m74808f(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
            eventDispatcher.m74804j(drmSessionEventListener, i);
        }

        /* renamed from: g */
        public /* synthetic */ void m74807g(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        /* renamed from: h */
        public /* synthetic */ void m74806h(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        /* renamed from: i */
        public /* synthetic */ void m74805i(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        /* renamed from: j */
        public /* synthetic */ void m74804j(DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i);
        }

        /* renamed from: k */
        public /* synthetic */ void m74803k(DrmSessionEventListener drmSessionEventListener, Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        /* renamed from: l */
        public /* synthetic */ void m74802l(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.f32782a.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void drmKeysLoaded() {
            Iterator<ListenerAndHandler> it = this.f32782a.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m74811c(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            Iterator<ListenerAndHandler> it = this.f32782a.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m74812b(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            Iterator<ListenerAndHandler> it = this.f32782a.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m74810d(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int i) {
            Iterator<ListenerAndHandler> it = this.f32782a.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m74808f(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener, i);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            Iterator<ListenerAndHandler> it = this.f32782a.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m74809e(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener, exc);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            Iterator<ListenerAndHandler> it = this.f32782a.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m74813a(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            Iterator<ListenerAndHandler> it = this.f32782a.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                if (next.listener == drmSessionEventListener) {
                    this.f32782a.remove(next);
                }
            }
        }

        @CheckResult
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.f32782a, i, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.f32782a = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }
    }

    @Deprecated
    default void onDrmSessionAcquired(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i2) {
    }

    default void onDrmKeysLoaded(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionReleased(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionManagerError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }
}
