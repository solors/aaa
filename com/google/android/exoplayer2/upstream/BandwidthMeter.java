package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public interface BandwidthMeter {

    /* loaded from: classes4.dex */
    public interface EventListener {

        /* loaded from: classes4.dex */
        public static final class EventDispatcher {

            /* renamed from: a */
            private final CopyOnWriteArrayList<HandlerAndListener> f35729a = new CopyOnWriteArrayList<>();

            /* loaded from: classes4.dex */
            public static final class HandlerAndListener {

                /* renamed from: a */
                private final Handler f35730a;

                /* renamed from: b */
                private final EventListener f35731b;

                /* renamed from: c */
                private boolean f35732c;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.f35730a = handler;
                    this.f35731b = eventListener;
                }

                public void release() {
                    this.f35732c = true;
                }
            }

            /* renamed from: a */
            public static /* synthetic */ void m72811a(HandlerAndListener handlerAndListener, int i, long j, long j2) {
                m72810b(handlerAndListener, i, j, j2);
            }

            /* renamed from: b */
            public static /* synthetic */ void m72810b(HandlerAndListener handlerAndListener, int i, long j, long j2) {
                handlerAndListener.f35731b.onBandwidthSample(i, j, j2);
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.f35729a.add(new HandlerAndListener(handler, eventListener));
            }

            public void bandwidthSample(final int i, final long j, final long j2) {
                Iterator<HandlerAndListener> it = this.f35729a.iterator();
                while (it.hasNext()) {
                    final HandlerAndListener next = it.next();
                    if (!next.f35732c) {
                        next.f35730a.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                BandwidthMeter.EventListener.EventDispatcher.m72811a(BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            public void removeListener(EventListener eventListener) {
                Iterator<HandlerAndListener> it = this.f35729a.iterator();
                while (it.hasNext()) {
                    HandlerAndListener next = it.next();
                    if (next.f35731b == eventListener) {
                        next.release();
                        this.f35729a.remove(next);
                    }
                }
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
