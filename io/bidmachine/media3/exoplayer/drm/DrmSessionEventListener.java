package io.bidmachine.media3.exoplayer.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes9.dex */
public interface DrmSessionEventListener {

    /* loaded from: classes9.dex */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<C36159a> listenerAndHandlers;
        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener$EventDispatcher$a */
        /* loaded from: classes9.dex */
        public static final class C36159a {
            public Handler handler;
            public DrmSessionEventListener listener;

            public C36159a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: a */
        public static /* synthetic */ void m19758a(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
            eventDispatcher.lambda$drmSessionAcquired$0(drmSessionEventListener, i);
        }

        /* renamed from: b */
        public static /* synthetic */ void m19757b(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.lambda$drmKeysRestored$3(drmSessionEventListener);
        }

        /* renamed from: c */
        public static /* synthetic */ void m19756c(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.lambda$drmSessionReleased$5(drmSessionEventListener);
        }

        /* renamed from: d */
        public static /* synthetic */ void m19755d(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, Exception exc) {
            eventDispatcher.lambda$drmSessionManagerError$2(drmSessionEventListener, exc);
        }

        /* renamed from: e */
        public static /* synthetic */ void m19754e(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.lambda$drmKeysLoaded$1(drmSessionEventListener);
        }

        /* renamed from: f */
        public static /* synthetic */ void m19753f(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
            eventDispatcher.lambda$drmKeysRemoved$4(drmSessionEventListener);
        }

        public /* synthetic */ void lambda$drmKeysLoaded$1(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        public /* synthetic */ void lambda$drmKeysRemoved$4(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        public /* synthetic */ void lambda$drmKeysRestored$3(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        public /* synthetic */ void lambda$drmSessionAcquired$0(DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i);
        }

        public /* synthetic */ void lambda$drmSessionManagerError$2(DrmSessionEventListener drmSessionEventListener, Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        public /* synthetic */ void lambda$drmSessionReleased$5(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new C36159a(handler, drmSessionEventListener));
        }

        public void drmKeysLoaded() {
            Iterator<C36159a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36159a next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m19754e(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            Iterator<C36159a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36159a next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m19753f(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            Iterator<C36159a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36159a next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m19757b(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int i) {
            Iterator<C36159a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36159a next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m19758a(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener, i);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            Iterator<C36159a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36159a next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m19755d(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener, exc);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            Iterator<C36159a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36159a next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.m19756c(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener);
                    }
                });
            }
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            Iterator<C36159a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36159a next = it.next();
                if (next.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        @CheckResult
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<C36159a> copyOnWriteArrayList, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
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
