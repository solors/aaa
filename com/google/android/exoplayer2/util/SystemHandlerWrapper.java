package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SystemHandlerWrapper implements HandlerWrapper {
    @GuardedBy("messagePool")

    /* renamed from: b */
    private static final List<SystemMessage> f36165b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f36166a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SystemMessage implements HandlerWrapper.Message {
        @Nullable

        /* renamed from: a */
        private Message f36167a;
        @Nullable

        /* renamed from: b */
        private SystemHandlerWrapper f36168b;

        private SystemMessage() {
        }

        /* renamed from: a */
        private void m72549a() {
            this.f36167a = null;
            this.f36168b = null;
            SystemHandlerWrapper.m72550c(this);
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper) Assertions.checkNotNull(this.f36168b);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(this.f36167a));
            m72549a();
            return sendMessageAtFrontOfQueue;
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((Message) Assertions.checkNotNull(this.f36167a)).sendToTarget();
            m72549a();
        }

        @CanIgnoreReturnValue
        public SystemMessage setMessage(Message message, SystemHandlerWrapper systemHandlerWrapper) {
            this.f36167a = message;
            this.f36168b = systemHandlerWrapper;
            return this;
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.f36166a = handler;
    }

    /* renamed from: b */
    private static SystemMessage m72551b() {
        SystemMessage remove;
        List<SystemMessage> list = f36165b;
        synchronized (list) {
            if (list.isEmpty()) {
                remove = new SystemMessage();
            } else {
                remove = list.remove(list.size() - 1);
            }
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m72550c(SystemMessage systemMessage) {
        List<SystemMessage> list = f36165b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(systemMessage);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Looper getLooper() {
        return this.f36166a.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean hasMessages(int i) {
        return this.f36166a.hasMessages(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i) {
        return m72551b().setMessage(this.f36166a.obtainMessage(i), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.f36166a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f36166a.postAtFrontOfQueue(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j) {
        return this.f36166a.postDelayed(runnable, j);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.f36166a.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeMessages(int i) {
        this.f36166a.removeMessages(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessage(int i) {
        return this.f36166a.sendEmptyMessage(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.f36166a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.f36166a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((SystemMessage) message).sendAtFrontOfQueue(this.f36166a);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, @Nullable Object obj) {
        return m72551b().setMessage(this.f36166a.obtainMessage(i, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, int i2, int i3) {
        return m72551b().setMessage(this.f36166a.obtainMessage(i, i2, i3), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i, int i2, int i3, @Nullable Object obj) {
        return m72551b().setMessage(this.f36166a.obtainMessage(i, i2, i3, obj), this);
    }
}
