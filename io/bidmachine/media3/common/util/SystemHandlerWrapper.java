package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.util.HandlerWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.bidmachine.media3.common.util.e */
/* loaded from: classes9.dex */
public final class SystemHandlerWrapper implements HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;
    @GuardedBy("messagePool")
    private static final List<C35916b> messagePool = new ArrayList(50);
    private final Handler handler;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SystemHandlerWrapper.java */
    /* renamed from: io.bidmachine.media3.common.util.e$b */
    /* loaded from: classes9.dex */
    public static final class C35916b implements HandlerWrapper.Message {
        @Nullable
        private SystemHandlerWrapper handler;
        @Nullable
        private Message message;

        private C35916b() {
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            SystemHandlerWrapper.recycleMessage(this);
        }

        @Override // io.bidmachine.media3.common.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper) Assertions.checkNotNull(this.handler);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(this.message));
            recycle();
            return sendMessageAtFrontOfQueue;
        }

        @Override // io.bidmachine.media3.common.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((Message) Assertions.checkNotNull(this.message)).sendToTarget();
            recycle();
        }

        @CanIgnoreReturnValue
        public C35916b setMessage(Message message, SystemHandlerWrapper systemHandlerWrapper) {
            this.message = message;
            this.handler = systemHandlerWrapper;
            return this;
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    private static C35916b obtainSystemMessage() {
        C35916b remove;
        List<C35916b> list = messagePool;
        synchronized (list) {
            if (list.isEmpty()) {
                remove = new C35916b();
            } else {
                remove = list.remove(list.size() - 1);
            }
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(C35916b c35916b) {
        List<C35916b> list = messagePool;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(c35916b);
            }
        }
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean hasMessages(int i) {
        return this.handler.hasMessages(i);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j) {
        return this.handler.postDelayed(runnable, j);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public void removeMessages(int i) {
        this.handler.removeMessages(i);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessage(int i) {
        return this.handler.sendEmptyMessage(i);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.handler.sendEmptyMessageAtTime(i, j);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.handler.sendEmptyMessageDelayed(i, i2);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((C35916b) message).sendAtFrontOfQueue(this.handler);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, obj), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, int i2, int i3) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, i2, i3), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, int i2, int i3, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i, i2, i3, obj), this);
    }
}
