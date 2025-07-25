package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public final class PlayerMessage {
    private Handler handler;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private int windowIndex;
    private long positionMs = -9223372036854775807L;
    private boolean deleteAfterDelivery = true;

    /* loaded from: classes6.dex */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* loaded from: classes6.dex */
    public interface Target {
        void handleMessage(int i, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, Handler handler) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.handler = handler;
        this.windowIndex = i;
    }

    public final synchronized boolean blockUntilDelivered() throws InterruptedException, TimeoutException {
        boolean z;
        boolean z2;
        Assertions.checkState(this.isSent);
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        long j = 500;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        while (true) {
            z2 = this.isProcessed;
            if (z2 || j <= 0) {
                break;
            }
            wait(j);
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z2) {
        } else {
            throw new TimeoutException("Message delivery time out");
        }
        return this.isDelivered;
    }

    public final synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public final boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final Object getPayload() {
        return this.payload;
    }

    public final long getPositionMs() {
        return this.positionMs;
    }

    public final Target getTarget() {
        return this.target;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWindowIndex() {
        return this.windowIndex;
    }

    public final synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public final synchronized void markAsProcessed(boolean z) {
        this.isDelivered = z | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public final PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == -9223372036854775807L) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public final PlayerMessage setDeleteAfterDelivery(boolean z) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public final PlayerMessage setHandler(Handler handler) {
        Assertions.checkState(!this.isSent);
        this.handler = handler;
        return this;
    }

    public final PlayerMessage setPayload(@Nullable Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public final PlayerMessage setPosition(long j) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public final PlayerMessage setType(int i) {
        Assertions.checkState(!this.isSent);
        this.type = i;
        return this;
    }

    public final PlayerMessage setPosition(int i, long j) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j != -9223372036854775807L);
        if (i >= 0 && (this.timeline.isEmpty() || i < this.timeline.getWindowCount())) {
            this.windowIndex = i;
            this.positionMs = j;
            return this;
        }
        throw new IllegalSeekPositionException(this.timeline, i, j);
    }
}
