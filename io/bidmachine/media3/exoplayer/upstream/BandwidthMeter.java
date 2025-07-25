package io.bidmachine.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
/* loaded from: classes9.dex */
public interface BandwidthMeter {

    /* loaded from: classes9.dex */
    public interface EventListener {

        /* loaded from: classes9.dex */
        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<C36452a> listeners = new CopyOnWriteArrayList<>();

            /* renamed from: io.bidmachine.media3.exoplayer.upstream.BandwidthMeter$EventListener$EventDispatcher$a */
            /* loaded from: classes9.dex */
            public static final class C36452a {
                private final Handler handler;
                private final EventListener listener;
                private boolean released;

                public C36452a(Handler handler, EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }

                public void release() {
                    this.released = true;
                }
            }

            /* renamed from: a */
            public static /* synthetic */ void m19668a(C36452a c36452a, int i, long j, long j2) {
                lambda$bandwidthSample$0(c36452a, i, j, j2);
            }

            public static /* synthetic */ void lambda$bandwidthSample$0(C36452a c36452a, int i, long j, long j2) {
                c36452a.listener.onBandwidthSample(i, j, j2);
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new C36452a(handler, eventListener));
            }

            public void bandwidthSample(final int i, final long j, final long j2) {
                Iterator<C36452a> it = this.listeners.iterator();
                while (it.hasNext()) {
                    final C36452a next = it.next();
                    if (!next.released) {
                        next.handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.upstream.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                BandwidthMeter.EventListener.EventDispatcher.m19668a(BandwidthMeter.EventListener.EventDispatcher.C36452a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            public void removeListener(EventListener eventListener) {
                Iterator<C36452a> it = this.listeners.iterator();
                while (it.hasNext()) {
                    C36452a next = it.next();
                    if (next.listener == eventListener) {
                        next.release();
                        this.listeners.remove(next);
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
