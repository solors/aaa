package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(23)
/* renamed from: com.yandex.mobile.ads.impl.ng */
/* loaded from: classes8.dex */
final class C30941ng {
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")

    /* renamed from: g */
    private static final ArrayDeque<C30943b> f82756g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f82757h = new Object();

    /* renamed from: a */
    private final MediaCodec f82758a;

    /* renamed from: b */
    private final HandlerThread f82759b;

    /* renamed from: c */
    private Handler f82760c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f82761d;

    /* renamed from: e */
    private final C30112cq f82762e;

    /* renamed from: f */
    private boolean f82763f;

    /* renamed from: com.yandex.mobile.ads.impl.ng$a */
    /* loaded from: classes8.dex */
    final class HandlerC30942a extends Handler {
        HandlerC30942a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C30941ng.this.m31524a(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.ng$b */
    /* loaded from: classes8.dex */
    public static class C30943b {

        /* renamed from: a */
        public int f82765a;

        /* renamed from: b */
        public int f82766b;

        /* renamed from: c */
        public int f82767c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f82768d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f82769e;

        /* renamed from: f */
        public int f82770f;

        C30943b() {
        }
    }

    public C30941ng(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C30112cq());
    }

    /* renamed from: b */
    private static C30943b m31521b() {
        ArrayDeque<C30943b> arrayDeque = f82756g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C30943b();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: c */
    public final void m31520c() {
        if (this.f82763f) {
            m31527a();
            this.f82759b.quit();
        }
        this.f82763f = false;
    }

    /* renamed from: d */
    public final void m31519d() {
        if (!this.f82763f) {
            this.f82759b.start();
            this.f82760c = new HandlerC30942a(this.f82759b.getLooper());
            this.f82763f = true;
        }
    }

    /* renamed from: e */
    public final void m31518e() throws InterruptedException {
        this.f82762e.m35183c();
        Handler handler = this.f82760c;
        handler.getClass();
        handler.obtainMessage(2).sendToTarget();
        this.f82762e.m35186a();
    }

    @VisibleForTesting
    C30941ng(MediaCodec mediaCodec, HandlerThread handlerThread, C30112cq c30112cq) {
        this.f82758a = mediaCodec;
        this.f82759b = handlerThread;
        this.f82762e = c30112cq;
        this.f82761d = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m31524a(android.os.Message r10) {
        /*
            r9 = this;
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L44
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r9.f82761d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.<init>(r10)
            androidx.compose.animation.core.C0379a.m105461a(r0, r1, r2)
            goto L5f
        L1c:
            com.yandex.mobile.ads.impl.cq r10 = r9.f82762e
            r10.m35181e()
            goto L5f
        L22:
            java.lang.Object r10 = r10.obj
            com.yandex.mobile.ads.impl.ng$b r10 = (com.yandex.mobile.ads.impl.C30941ng.C30943b) r10
            int r3 = r10.f82765a
            int r4 = r10.f82766b
            android.media.MediaCodec$CryptoInfo r5 = r10.f82768d
            long r6 = r10.f82769e
            int r8 = r10.f82770f
            java.lang.Object r0 = com.yandex.mobile.ads.impl.C30941ng.f82757h     // Catch: java.lang.RuntimeException -> L3d
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3d
            android.media.MediaCodec r2 = r9.f82758a     // Catch: java.lang.Throwable -> L3a
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            goto L5e
        L3a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r2     // Catch: java.lang.RuntimeException -> L3d
        L3d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r9.f82761d
            androidx.compose.animation.core.C0379a.m105461a(r2, r1, r0)
            goto L5e
        L44:
            java.lang.Object r10 = r10.obj
            com.yandex.mobile.ads.impl.ng$b r10 = (com.yandex.mobile.ads.impl.C30941ng.C30943b) r10
            int r3 = r10.f82765a
            int r4 = r10.f82766b
            int r5 = r10.f82767c
            long r6 = r10.f82769e
            int r8 = r10.f82770f
            android.media.MediaCodec r2 = r9.f82758a     // Catch: java.lang.RuntimeException -> L58
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L58
            goto L5e
        L58:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r9.f82761d
            androidx.compose.animation.core.C0379a.m105461a(r2, r1, r0)
        L5e:
            r1 = r10
        L5f:
            if (r1 == 0) goto L64
            m31523a(r1)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30941ng.m31524a(android.os.Message):void");
    }

    /* renamed from: a */
    public final void m31527a() {
        if (this.f82763f) {
            try {
                Handler handler = this.f82760c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.f82762e.m35183c();
                Handler handler2 = this.f82760c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.f82762e.m35186a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public final void m31526a(int i, int i2, long j, int i3) {
        RuntimeException andSet = this.f82761d.getAndSet(null);
        if (andSet == null) {
            C30943b m31521b = m31521b();
            m31521b.f82765a = i;
            m31521b.f82766b = 0;
            m31521b.f82767c = i2;
            m31521b.f82769e = j;
            m31521b.f82770f = i3;
            Handler handler = this.f82760c;
            int i4 = y32.f88010a;
            handler.obtainMessage(0, m31521b).sendToTarget();
            return;
        }
        throw andSet;
    }

    /* renamed from: a */
    public final void m31525a(int i, C31767wt c31767wt, long j) {
        RuntimeException andSet = this.f82761d.getAndSet(null);
        if (andSet == null) {
            C30943b m31521b = m31521b();
            m31521b.f82765a = i;
            m31521b.f82766b = 0;
            m31521b.f82767c = 0;
            m31521b.f82769e = j;
            m31521b.f82770f = 0;
            MediaCodec.CryptoInfo cryptoInfo = m31521b.f82768d;
            cryptoInfo.numSubSamples = c31767wt.f87394f;
            int[] iArr = c31767wt.f87392d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = c31767wt.f87393e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = c31767wt.f87390b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = c31767wt.f87389a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = c31767wt.f87391c;
            if (y32.f88010a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c31767wt.f87395g, c31767wt.f87396h));
            }
            this.f82760c.obtainMessage(1, m31521b).sendToTarget();
            return;
        }
        throw andSet;
    }

    /* renamed from: a */
    private static void m31523a(C30943b c30943b) {
        ArrayDeque<C30943b> arrayDeque = f82756g;
        synchronized (arrayDeque) {
            arrayDeque.add(c30943b);
        }
    }
}
