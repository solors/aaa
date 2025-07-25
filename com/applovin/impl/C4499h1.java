package com.applovin.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.h1 */
/* loaded from: classes2.dex */
class C4499h1 {

    /* renamed from: h */
    private static final ArrayDeque f6510h = new ArrayDeque();

    /* renamed from: i */
    private static final Object f6511i = new Object();

    /* renamed from: a */
    private final MediaCodec f6512a;

    /* renamed from: b */
    private final HandlerThread f6513b;

    /* renamed from: c */
    private Handler f6514c;

    /* renamed from: d */
    private final AtomicReference f6515d;

    /* renamed from: e */
    private final C4161c4 f6516e;

    /* renamed from: f */
    private final boolean f6517f;

    /* renamed from: g */
    private boolean f6518g;

    /* renamed from: com.applovin.impl.h1$a */
    /* loaded from: classes2.dex */
    class HandlerC4500a extends Handler {
        HandlerC4500a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C4499h1.this.m98831a(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.h1$b */
    /* loaded from: classes2.dex */
    public static class C4501b {

        /* renamed from: a */
        public int f6520a;

        /* renamed from: b */
        public int f6521b;

        /* renamed from: c */
        public int f6522c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f6523d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f6524e;

        /* renamed from: f */
        public int f6525f;

        C4501b() {
        }

        /* renamed from: a */
        public void m98815a(int i, int i2, int i3, long j, int i4) {
            this.f6520a = i;
            this.f6521b = i2;
            this.f6522c = i3;
            this.f6524e = j;
            this.f6525f = i4;
        }
    }

    public C4499h1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new C4161c4());
    }

    /* renamed from: c */
    private void m98822c() {
        ((Handler) AbstractC5863xp.m93017a(this.f6514c)).removeCallbacksAndMessages(null);
        m98835a();
        m98820e();
    }

    /* renamed from: d */
    private static C4501b m98821d() {
        ArrayDeque arrayDeque = f6510h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C4501b();
            }
            return (C4501b) arrayDeque.removeFirst();
        }
    }

    /* renamed from: e */
    private void m98820e() {
        RuntimeException runtimeException = (RuntimeException) this.f6515d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    /* renamed from: f */
    private static boolean m98819f() {
        String lowerCase = Ascii.toLowerCase(AbstractC5863xp.f12153c);
        if (!lowerCase.contains("samsung") && !lowerCase.contains("motorola")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m98824b() {
        if (this.f6518g) {
            try {
                m98822c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: g */
    public void m98818g() {
        if (this.f6518g) {
            m98824b();
            this.f6513b.quit();
        }
        this.f6518g = false;
    }

    /* renamed from: h */
    public void m98817h() {
        if (!this.f6518g) {
            this.f6513b.start();
            this.f6514c = new HandlerC4500a(this.f6513b.getLooper());
            this.f6518g = true;
        }
    }

    /* renamed from: i */
    public void m98816i() {
        m98835a();
    }

    C4499h1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, C4161c4 c4161c4) {
        this.f6512a = mediaCodec;
        this.f6513b = handlerThread;
        this.f6516e = c4161c4;
        this.f6515d = new AtomicReference();
        this.f6517f = z || m98819f();
    }

    /* renamed from: a */
    private void m98835a() {
        this.f6516e.m100271c();
        ((Handler) AbstractC5863xp.m93017a(this.f6514c)).obtainMessage(2).sendToTarget();
        this.f6516e.m100273a();
    }

    /* renamed from: a */
    private static void m98828a(C5950z4 c5950z4, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c5950z4.f12487f;
        cryptoInfo.numBytesOfClearData = m98825a(c5950z4.f12485d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m98825a(c5950z4.f12486e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC4100b1.m100583a(m98826a(c5950z4.f12483b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC4100b1.m100583a(m98826a(c5950z4.f12482a, cryptoInfo.iv));
        cryptoInfo.mode = c5950z4.f12484c;
        if (AbstractC5863xp.f12151a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c5950z4.f12488g, c5950z4.f12489h));
        }
    }

    /* renamed from: b */
    public void m98823b(int i, int i2, int i3, long j, int i4) {
        m98820e();
        C4501b m98821d = m98821d();
        m98821d.m98815a(i, i2, i3, j, i4);
        ((Handler) AbstractC5863xp.m93017a(this.f6514c)).obtainMessage(0, m98821d).sendToTarget();
    }

    /* renamed from: a */
    private static byte[] m98826a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: a */
    private static int[] m98825a(int[] iArr, int[] iArr2) {
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
    /* renamed from: a */
    public void m98831a(Message message) {
        C4501b c4501b;
        int i = message.what;
        if (i == 0) {
            c4501b = (C4501b) message.obj;
            m98834a(c4501b.f6520a, c4501b.f6521b, c4501b.f6522c, c4501b.f6524e, c4501b.f6525f);
        } else if (i != 1) {
            if (i != 2) {
                m98827a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f6516e.m100269e();
            }
            c4501b = null;
        } else {
            c4501b = (C4501b) message.obj;
            m98833a(c4501b.f6520a, c4501b.f6521b, c4501b.f6523d, c4501b.f6524e, c4501b.f6525f);
        }
        if (c4501b != null) {
            m98830a(c4501b);
        }
    }

    /* renamed from: a */
    private void m98834a(int i, int i2, int i3, long j, int i4) {
        try {
            this.f6512a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            m98827a(e);
        }
    }

    /* renamed from: a */
    private void m98833a(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            if (this.f6517f) {
                synchronized (f6511i) {
                    this.f6512a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
                }
            } else {
                this.f6512a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            m98827a(e);
        }
    }

    /* renamed from: a */
    public void m98832a(int i, int i2, C5950z4 c5950z4, long j, int i3) {
        m98820e();
        C4501b m98821d = m98821d();
        m98821d.m98815a(i, i2, 0, j, i3);
        m98828a(c5950z4, m98821d.f6523d);
        ((Handler) AbstractC5863xp.m93017a(this.f6514c)).obtainMessage(1, m98821d).sendToTarget();
    }

    /* renamed from: a */
    void m98827a(RuntimeException runtimeException) {
        this.f6515d.set(runtimeException);
    }

    /* renamed from: a */
    private static void m98830a(C4501b c4501b) {
        ArrayDeque arrayDeque = f6510h;
        synchronized (arrayDeque) {
            arrayDeque.add(c4501b);
        }
    }
}
