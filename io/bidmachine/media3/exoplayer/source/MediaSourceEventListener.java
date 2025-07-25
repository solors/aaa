package io.bidmachine.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes9.dex */
public interface MediaSourceEventListener {

    /* loaded from: classes9.dex */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<C36351a> listenerAndHandlers;
        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        /* renamed from: io.bidmachine.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$a */
        /* loaded from: classes9.dex */
        public static final class C36351a {
            public Handler handler;
            public MediaSourceEventListener listener;

            public C36351a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public /* synthetic */ void lambda$downstreamFormatChanged$5(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        public /* synthetic */ void lambda$loadCanceled$2(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public /* synthetic */ void lambda$loadCompleted$1(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public /* synthetic */ void lambda$loadError$3(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z);
        }

        public /* synthetic */ void lambda$loadStarted$0(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public /* synthetic */ void lambda$upstreamDiscarded$4(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new C36351a(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
            downstreamFormatChanged(new MediaLoadData(1, i, format, i2, obj, Util.usToMs(j), -9223372036854775807L));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i) {
            loadCanceled(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i) {
            loadCompleted(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i, IOException iOException, boolean z) {
            loadError(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i) {
            loadStarted(loadEventInfo, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            Iterator<C36351a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36351a next = it.next();
                if (next.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            upstreamDiscarded(new MediaLoadData(1, i, null, 3, null, Util.usToMs(j), Util.usToMs(j2)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<C36351a> copyOnWriteArrayList, int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            loadCanceled(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            loadCompleted(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
            loadError(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)), iOException, z);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2) {
            loadStarted(loadEventInfo, new MediaLoadData(i, i2, format, i3, obj, Util.usToMs(j), Util.usToMs(j2)));
        }

        @CheckResult
        @Deprecated
        public EventDispatcher withParameters(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            Iterator<C36351a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36351a next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.n
                    {
                        MediaSourceEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher.this.lambda$downstreamFormatChanged$5(mediaSourceEventListener, mediaLoadData);
                    }
                });
            }
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            Iterator<C36351a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36351a next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.m
                    {
                        MediaSourceEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher.this.lambda$upstreamDiscarded$4(mediaSourceEventListener, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<C36351a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36351a next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.k
                    {
                        MediaSourceEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher.this.lambda$loadCanceled$2(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<C36351a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36351a next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.l
                    {
                        MediaSourceEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher.this.lambda$loadCompleted$1(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z) {
            Iterator<C36351a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36351a next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.o
                    {
                        MediaSourceEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher.this.lambda$loadError$3(mediaSourceEventListener, loadEventInfo, mediaLoadData, iOException, z);
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            Iterator<C36351a> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                C36351a next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.p
                    {
                        MediaSourceEventListener.EventDispatcher.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher.this.lambda$loadStarted$0(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }
    }

    default void onDownstreamFormatChanged(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadStarted(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }
}
