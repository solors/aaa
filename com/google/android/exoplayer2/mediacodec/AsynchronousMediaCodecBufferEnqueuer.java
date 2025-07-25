package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.C0379a;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes4.dex */
public class AsynchronousMediaCodecBufferEnqueuer {
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")

    /* renamed from: g */
    private static final ArrayDeque<MessageParams> f33776g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f33777h = new Object();

    /* renamed from: a */
    private final MediaCodec f33778a;

    /* renamed from: b */
    private final HandlerThread f33779b;

    /* renamed from: c */
    private Handler f33780c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f33781d;

    /* renamed from: e */
    private final ConditionVariable f33782e;

    /* renamed from: f */
    private boolean f33783f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        MessageParams() {
        }

        public void setQueueParams(int i, int i2, int i3, long j, int i4) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeUs = j;
            this.flags = i4;
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ConditionVariable());
    }

    /* renamed from: b */
    private void m74246b() throws InterruptedException {
        this.f33782e.close();
        ((Handler) Assertions.checkNotNull(this.f33780c)).obtainMessage(2).sendToTarget();
        this.f33782e.block();
    }

    /* renamed from: c */
    private static void m74245c(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo cryptoInfo2) {
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        cryptoInfo2.numBytesOfClearData = m74243e(cryptoInfo.numBytesOfClearData, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = m74243e(cryptoInfo.numBytesOfEncryptedData, cryptoInfo2.numBytesOfEncryptedData);
        cryptoInfo2.key = (byte[]) Assertions.checkNotNull(m74244d(cryptoInfo.key, cryptoInfo2.key));
        cryptoInfo2.iv = (byte[]) Assertions.checkNotNull(m74244d(cryptoInfo.f32685iv, cryptoInfo2.iv));
        cryptoInfo2.mode = cryptoInfo.mode;
        if (Util.SDK_INT >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
    }

    @Nullable
    /* renamed from: d */
    private static byte[] m74244d(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Nullable
    /* renamed from: e */
    private static int[] m74243e(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m74242f(Message message) {
        MessageParams messageParams;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                messageParams = null;
                if (i != 2) {
                    C0379a.m105461a(this.f33781d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    this.f33782e.open();
                }
            } else {
                messageParams = (MessageParams) message.obj;
                m74240h(messageParams.index, messageParams.offset, messageParams.cryptoInfo, messageParams.presentationTimeUs, messageParams.flags);
            }
        } else {
            messageParams = (MessageParams) message.obj;
            m74241g(messageParams.index, messageParams.offset, messageParams.size, messageParams.presentationTimeUs, messageParams.flags);
        }
        if (messageParams != null) {
            m74237k(messageParams);
        }
    }

    /* renamed from: g */
    private void m74241g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f33778a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            C0379a.m105461a(this.f33781d, null, e);
        }
    }

    /* renamed from: h */
    private void m74240h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f33777h) {
                this.f33778a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            C0379a.m105461a(this.f33781d, null, e);
        }
    }

    /* renamed from: i */
    private void m74239i() throws InterruptedException {
        ((Handler) Assertions.checkNotNull(this.f33780c)).removeCallbacksAndMessages(null);
        m74246b();
    }

    /* renamed from: j */
    private static MessageParams m74238j() {
        ArrayDeque<MessageParams> arrayDeque = f33776g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new MessageParams();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: k */
    private static void m74237k(MessageParams messageParams) {
        ArrayDeque<MessageParams> arrayDeque = f33776g;
        synchronized (arrayDeque) {
            arrayDeque.add(messageParams);
        }
    }

    public void flush() {
        if (this.f33783f) {
            try {
                m74239i();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void maybeThrowException() {
        RuntimeException andSet = this.f33781d.getAndSet(null);
        if (andSet == null) {
            return;
        }
        throw andSet;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        maybeThrowException();
        MessageParams m74238j = m74238j();
        m74238j.setQueueParams(i, i2, i3, j, i4);
        ((Handler) Util.castNonNull(this.f33780c)).obtainMessage(0, m74238j).sendToTarget();
    }

    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        maybeThrowException();
        MessageParams m74238j = m74238j();
        m74238j.setQueueParams(i, i2, 0, j, i3);
        m74245c(cryptoInfo, m74238j.cryptoInfo);
        ((Handler) Util.castNonNull(this.f33780c)).obtainMessage(1, m74238j).sendToTarget();
    }

    public void shutdown() {
        if (this.f33783f) {
            flush();
            this.f33779b.quit();
        }
        this.f33783f = false;
    }

    public void start() {
        if (!this.f33783f) {
            this.f33779b.start();
            this.f33780c = new Handler(this.f33779b.getLooper()) { // from class: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    AsynchronousMediaCodecBufferEnqueuer.this.m74242f(message);
                }
            };
            this.f33783f = true;
        }
    }

    public void waitUntilQueueingComplete() throws InterruptedException {
        m74246b();
    }

    @VisibleForTesting
    AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, ConditionVariable conditionVariable) {
        this.f33778a = mediaCodec;
        this.f33779b = handlerThread;
        this.f33782e = conditionVariable;
        this.f33781d = new AtomicReference<>();
    }
}
