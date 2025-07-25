package com.bytedance.sdk.component.ldr.p261bg.p262IL;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.ldr.p261bg.C7642IL;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7724zx;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p264bX.HandlerThreadC7648bX;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p265bg.C7654bg;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7661IL;
import com.bytedance.sdk.component.ldr.p261bg.p274zx.AbstractRunnableC7729zx;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.component.ldr.bg.IL.eqN */
/* loaded from: classes3.dex */
public class C7655eqN {

    /* renamed from: PX */
    private final PriorityBlockingQueue<InterfaceC7706bg> f16743PX;

    /* renamed from: VB */
    private final Comparator<InterfaceC7706bg> f16744VB;

    /* renamed from: WR */
    private volatile HandlerThreadC7648bX f16745WR;

    /* renamed from: eo */
    private volatile Handler f16747eo;

    /* renamed from: bg */
    public static final C7655eqN f16739bg = new C7655eqN();
    public static final C7654bg eqN = new C7654bg();

    /* renamed from: zx */
    public static final AtomicLong f16741zx = new AtomicLong(0);
    public static final AtomicLong ldr = new AtomicLong(0);

    /* renamed from: iR */
    public static final long f16740iR = System.currentTimeMillis();

    /* renamed from: Kg */
    public static long f16738Kg = 0;

    /* renamed from: IL */
    public volatile boolean f16742IL = false;

    /* renamed from: bX */
    public volatile boolean f16746bX = false;

    private C7655eqN() {
        Comparator<InterfaceC7706bg> comparator = new Comparator<InterfaceC7706bg>() { // from class: com.bytedance.sdk.component.ldr.bg.IL.eqN.1
            {
                C7655eqN.this = this;
            }

            @Override // java.util.Comparator
            /* renamed from: bg */
            public int compare(InterfaceC7706bg interfaceC7706bg, InterfaceC7706bg interfaceC7706bg2) {
                return C7655eqN.this.m88182bg(interfaceC7706bg, interfaceC7706bg2);
            }
        };
        this.f16744VB = comparator;
        this.f16743PX = new PriorityBlockingQueue<>(8, comparator);
    }

    /* renamed from: IL */
    public void m88189IL() {
        eqN();
        m88179zx();
    }

    /* renamed from: bX */
    public void m88188bX() {
        if (this.f16745WR != null && this.f16745WR.isAlive()) {
            synchronized (this) {
                if (this.f16745WR != null && this.f16745WR.isAlive()) {
                    if (this.f16747eo != null) {
                        this.f16747eo.removeCallbacksAndMessages(null);
                    }
                    this.f16745WR.m88239bg(false);
                    this.f16745WR.quitSafely();
                    this.f16745WR = null;
                }
            }
        }
    }

    public boolean eqN() {
        try {
            if (this.f16745WR == null && !C7642IL.m88295IL()) {
                synchronized (this) {
                    if (this.f16745WR == null) {
                        this.f16745WR = new HandlerThreadC7648bX(this.f16743PX);
                        this.f16745WR.start();
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* renamed from: zx */
    public void m88179zx() {
        C7661IL.m88148bg(eqN.ayS(), 1);
        final HandlerThreadC7648bX handlerThreadC7648bX = this.f16745WR;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
            if (m88153vb != null) {
                Executor eqN2 = m88153vb.eqN();
                if (eqN2 == null) {
                    eqN2 = m88153vb.mo83352zx();
                }
                if (eqN2 != null) {
                    eqN2.execute(new AbstractRunnableC7729zx("flush") { // from class: com.bytedance.sdk.component.ldr.bg.IL.eqN.3
                        {
                            C7655eqN.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            HandlerThreadC7648bX handlerThreadC7648bX2 = handlerThreadC7648bX;
                            if (handlerThreadC7648bX2 != null) {
                                handlerThreadC7648bX2.m88258bX(2);
                            }
                        }
                    });
                }
            }
        } else if (handlerThreadC7648bX != null) {
            handlerThreadC7648bX.m88258bX(2);
        }
    }

    /* renamed from: bg */
    public PriorityBlockingQueue<InterfaceC7706bg> m88187bg() {
        return this.f16743PX;
    }

    /* renamed from: bg */
    public int m88182bg(InterfaceC7706bg interfaceC7706bg, InterfaceC7706bg interfaceC7706bg2) {
        long j;
        long j2;
        long j3;
        long j4;
        if (interfaceC7706bg == null) {
            return interfaceC7706bg2 == null ? 0 : -1;
        } else if (interfaceC7706bg2 == null) {
            return 1;
        } else {
            if (interfaceC7706bg.mo87977zx() == interfaceC7706bg2.mo87977zx()) {
                if (interfaceC7706bg.mo87985bg() != null) {
                    j = interfaceC7706bg.mo87985bg().mo83386bg();
                    j2 = interfaceC7706bg.mo87985bg().mo83389IL();
                } else {
                    j = 0;
                    j2 = 0;
                }
                if (interfaceC7706bg2.mo87985bg() != null) {
                    j4 = interfaceC7706bg2.mo87985bg().mo83386bg();
                    j3 = interfaceC7706bg2.mo87985bg().mo83389IL();
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                if (j == 0 || j4 == 0) {
                    return 0;
                }
                long j5 = j - j4;
                if (Math.abs(j5) > 2147483647L) {
                    return 0;
                }
                if (j5 == 0) {
                    if (j2 == 0 || j3 == 0) {
                        return 0;
                    }
                    return (int) (j2 - j3);
                }
                return (int) j5;
            }
            return interfaceC7706bg.mo87977zx() - interfaceC7706bg2.mo87977zx();
        }
    }

    /* renamed from: bg */
    public void m88186bg(Handler handler) {
        this.f16747eo = handler;
    }

    /* renamed from: bg */
    public void m88183bg(InterfaceC7706bg interfaceC7706bg, int i) {
        eqN();
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        HandlerThreadC7648bX handlerThreadC7648bX = this.f16745WR;
        if (handlerThreadC7648bX != null) {
            m88180bg(m88153vb, interfaceC7706bg);
            handlerThreadC7648bX.m88246bg(interfaceC7706bg, interfaceC7706bg.mo87977zx() == 4);
        }
    }

    /* renamed from: bg */
    private void m88180bg(final InterfaceC7724zx interfaceC7724zx, InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7724zx != null) {
            try {
                if (interfaceC7724zx.mo83353iR()) {
                    final long mo83389IL = (interfaceC7706bg == null || interfaceC7706bg.mo87985bg() == null) ? 0L : interfaceC7706bg.mo87985bg().mo83389IL();
                    if (mo83389IL == 1) {
                        f16738Kg = System.currentTimeMillis();
                    }
                    AtomicLong m88216Ld = eqN.m88216Ld();
                    C7661IL.m88148bg(m88216Ld, 1);
                    if (m88216Ld.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor eqN2 = interfaceC7724zx.eqN();
                            if (eqN2 == null) {
                                eqN2 = interfaceC7724zx.mo83352zx();
                            }
                            if (eqN2 != null) {
                                eqN2.execute(new AbstractRunnableC7729zx("report") { // from class: com.bytedance.sdk.component.ldr.bg.IL.eqN.2
                                    {
                                        C7655eqN.this = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        C7655eqN.this.m88181bg(interfaceC7724zx, mo83389IL);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        m88181bg(interfaceC7724zx, mo83389IL);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: bg */
    public void m88181bg(InterfaceC7724zx interfaceC7724zx, long j) {
        HandlerThreadC7648bX handlerThreadC7648bX = this.f16745WR;
        if (interfaceC7724zx == null || handlerThreadC7648bX == null) {
            return;
        }
        C7654bg c7654bg = eqN;
        handlerThreadC7648bX.m88246bg(interfaceC7724zx.mo83357bg(c7654bg.m88220IL(j)), true);
        c7654bg.m88197jz();
    }
}
