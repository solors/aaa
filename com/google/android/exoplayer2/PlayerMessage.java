package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class PlayerMessage {

    /* renamed from: a */
    private final Target f31881a;

    /* renamed from: b */
    private final Sender f31882b;

    /* renamed from: c */
    private final Clock f31883c;

    /* renamed from: d */
    private final Timeline f31884d;

    /* renamed from: e */
    private int f31885e;
    @Nullable

    /* renamed from: f */
    private Object f31886f;

    /* renamed from: g */
    private Looper f31887g;

    /* renamed from: h */
    private int f31888h;

    /* renamed from: i */
    private long f31889i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f31890j = true;

    /* renamed from: k */
    private boolean f31891k;

    /* renamed from: l */
    private boolean f31892l;

    /* renamed from: m */
    private boolean f31893m;

    /* renamed from: n */
    private boolean f31894n;

    /* loaded from: classes4.dex */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* loaded from: classes4.dex */
    public interface Target {
        void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, Clock clock, Looper looper) {
        this.f31882b = sender;
        this.f31881a = target;
        this.f31884d = timeline;
        this.f31887g = looper;
        this.f31883c = clock;
        this.f31888h = i;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        Assertions.checkState(this.f31891k);
        Assertions.checkState(this.f31887g.getThread() != Thread.currentThread());
        while (!this.f31893m) {
            wait();
        }
        return this.f31892l;
    }

    @CanIgnoreReturnValue
    public synchronized PlayerMessage cancel() {
        Assertions.checkState(this.f31891k);
        this.f31894n = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.f31890j;
    }

    public Looper getLooper() {
        return this.f31887g;
    }

    public int getMediaItemIndex() {
        return this.f31888h;
    }

    @Nullable
    public Object getPayload() {
        return this.f31886f;
    }

    public long getPositionMs() {
        return this.f31889i;
    }

    public Target getTarget() {
        return this.f31881a;
    }

    public Timeline getTimeline() {
        return this.f31884d;
    }

    public int getType() {
        return this.f31885e;
    }

    public synchronized boolean isCanceled() {
        return this.f31894n;
    }

    public synchronized void markAsProcessed(boolean z) {
        this.f31892l = z | this.f31892l;
        this.f31893m = true;
        notifyAll();
    }

    @CanIgnoreReturnValue
    public PlayerMessage send() {
        Assertions.checkState(!this.f31891k);
        if (this.f31889i == -9223372036854775807L) {
            Assertions.checkArgument(this.f31890j);
        }
        this.f31891k = true;
        this.f31882b.sendMessage(this);
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setDeleteAfterDelivery(boolean z) {
        Assertions.checkState(!this.f31891k);
        this.f31890j = z;
        return this;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public PlayerMessage setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    @CanIgnoreReturnValue
    public PlayerMessage setLooper(Looper looper) {
        Assertions.checkState(!this.f31891k);
        this.f31887g = looper;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPayload(@Nullable Object obj) {
        Assertions.checkState(!this.f31891k);
        this.f31886f = obj;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPosition(long j) {
        Assertions.checkState(!this.f31891k);
        this.f31889i = j;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setType(int i) {
        Assertions.checkState(!this.f31891k);
        this.f31885e = i;
        return this;
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPosition(int i, long j) {
        Assertions.checkState(!this.f31891k);
        Assertions.checkArgument(j != -9223372036854775807L);
        if (i >= 0 && (this.f31884d.isEmpty() || i < this.f31884d.getWindowCount())) {
            this.f31888h = i;
            this.f31889i = j;
            return this;
        }
        throw new IllegalSeekPositionException(this.f31884d, i, j);
    }

    public synchronized boolean blockUntilDelivered(long j) throws InterruptedException, TimeoutException {
        boolean z;
        Assertions.checkState(this.f31891k);
        Assertions.checkState(this.f31887g.getThread() != Thread.currentThread());
        long elapsedRealtime = this.f31883c.elapsedRealtime() + j;
        while (true) {
            z = this.f31893m;
            if (z || j <= 0) {
                break;
            }
            this.f31883c.onThreadBlocked();
            wait(j);
            j = elapsedRealtime - this.f31883c.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f31892l;
    }
}
