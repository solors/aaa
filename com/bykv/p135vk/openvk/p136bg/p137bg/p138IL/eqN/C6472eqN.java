package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6490IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6495bg;
import com.bytedance.sdk.component.p233Kg.ThreadFactoryC7228WR;
import com.bytedance.sdk.component.p233Kg.p237bg.C7246bg;
import com.bytedance.sdk.component.utils.JAA;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN */
/* loaded from: classes3.dex */
public class C6472eqN implements InterfaceC6463bX.InterfaceC6464IL, InterfaceC6463bX.InterfaceC6465bX, InterfaceC6463bX.InterfaceC6466bg, InterfaceC6463bX.InterfaceC6467eqN, InterfaceC6463bX.InterfaceC6468iR, InterfaceC6463bX.InterfaceC6469ldr, InterfaceC6463bX.InterfaceC6470zx, InterfaceC6496bg, JAA.InterfaceC7736bg {
    private static final SparseIntArray kMt = new SparseIntArray();

    /* renamed from: Fy */
    private boolean f13495Fy;

    /* renamed from: IL */
    private SurfaceHolder f13496IL;
    private boolean JAA;

    /* renamed from: LZ */
    private ArrayList<Runnable> f13499LZ;

    /* renamed from: Ta */
    private JAA f13502Ta;

    /* renamed from: WR */
    private boolean f13508WR;
    private volatile boolean ZQc;

    /* renamed from: bg */
    private SurfaceTexture f13510bg;

    /* renamed from: eo */
    private boolean f13511eo;
    private int eqN;

    /* renamed from: bX */
    private int f13509bX = 0;

    /* renamed from: zx */
    private boolean f13516zx = false;
    private volatile InterfaceC6463bX ldr = null;

    /* renamed from: iR */
    private final boolean f13512iR = false;

    /* renamed from: Kg */
    private boolean f13498Kg = false;

    /* renamed from: VB */
    private volatile int f13505VB = 201;

    /* renamed from: PX */
    private long f13501PX = -1;
    private boolean yDt = false;

    /* renamed from: Lq */
    private long f13500Lq = 0;

    /* renamed from: vb */
    private long f13515vb = Long.MIN_VALUE;
    private long xxp = 0;
    private long VzQ = 0;
    private long tuV = 0;

    /* renamed from: tC */
    private int f13513tC = 0;
    private String rri = "0";

    /* renamed from: Ja */
    private final List<WeakReference<InterfaceC6496bg.InterfaceC6497bg>> f13497Ja = new CopyOnWriteArrayList();

    /* renamed from: Uw */
    private C6494bX f13504Uw = null;
    private boolean DDQ = false;

    /* renamed from: Uq */
    private CountDownLatch f13503Uq = new CountDownLatch(1);
    private volatile int aGH = 200;

    /* renamed from: VW */
    private AtomicBoolean f13507VW = new AtomicBoolean(false);

    /* renamed from: VJ */
    private Surface f13506VJ = null;
    private final Runnable daV = new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.1
        @Override // java.lang.Runnable
        public void run() {
            if (C6472eqN.this.ldr == null) {
                return;
            }
            long xxp = C6472eqN.this.xxp();
            if (xxp > 0 && C6472eqN.this.ldr() && C6472eqN.this.f13515vb != Long.MIN_VALUE) {
                try {
                    if (C6472eqN.this.f13515vb == xxp) {
                        if (!C6472eqN.this.yDt && C6472eqN.this.xxp >= 400) {
                            C6472eqN.this.m91828IL(701, 800);
                            C6472eqN.this.yDt = true;
                        }
                        C6472eqN.this.xxp += C6472eqN.this.aGH;
                    } else {
                        if (C6472eqN.this.yDt) {
                            C6472eqN.this.f13500Lq += C6472eqN.this.xxp;
                            C6472eqN.this.m91828IL(702, 800);
                            long unused = C6472eqN.this.f13500Lq;
                            int unused2 = C6472eqN.this.f13509bX;
                        }
                        C6472eqN.this.xxp = 0L;
                        C6472eqN.this.yDt = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (C6472eqN.this.mo85064vb() > 0) {
                if (C6472eqN.this.f13515vb != xxp) {
                    if (C6492bX.m91754zx()) {
                        long unused3 = C6472eqN.this.f13515vb;
                    }
                    C6472eqN c6472eqN = C6472eqN.this;
                    c6472eqN.m91798bg(xxp, c6472eqN.mo85064vb());
                }
                C6472eqN.this.f13515vb = xxp;
            }
            if (!C6472eqN.this.mo86469IL()) {
                if (C6472eqN.this.f13502Ta != null) {
                    C6472eqN.this.f13502Ta.postDelayed(this, C6472eqN.this.aGH);
                    return;
                }
                return;
            }
            C6472eqN c6472eqN2 = C6472eqN.this;
            c6472eqN2.m91798bg(c6472eqN2.mo85064vb(), C6472eqN.this.mo85064vb());
        }
    };
    private final RunnableC6487bg ayS = new RunnableC6487bg();
    private long LKE = 0;
    private long CQc = 0;

    /* renamed from: uu */
    private boolean f13514uu = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN$bg */
    /* loaded from: classes3.dex */
    public class RunnableC6487bg implements Runnable {

        /* renamed from: IL */
        private long f13537IL;

        /* renamed from: bX */
        private boolean f13538bX;

        RunnableC6487bg() {
        }

        /* renamed from: bg */
        public void m91771bg(boolean z) {
            this.f13538bX = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C6472eqN.this.ldr != null) {
                try {
                    if (!this.f13538bX) {
                        long mo91857WR = C6472eqN.this.ldr.mo91857WR();
                        C6472eqN.this.f13501PX = Math.max(this.f13537IL, mo91857WR);
                    }
                    long unused = C6472eqN.this.f13501PX;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (C6472eqN.this.f13502Ta != null) {
                C6472eqN.this.f13502Ta.sendEmptyMessageDelayed(100, 0L);
            }
        }

        /* renamed from: bg */
        public void m91772bg(long j) {
            this.f13537IL = j;
        }
    }

    public C6472eqN() {
        m91780bg("SSMediaPlayerWrapper");
    }

    private void DDQ() {
        if (this.f13508WR) {
            return;
        }
        this.f13508WR = true;
        Iterator it = new ArrayList(this.f13499LZ).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f13499LZ.clear();
        this.f13508WR = false;
    }

    /* renamed from: Fy */
    private void m91830Fy() {
        this.f13500Lq = 0L;
        this.f13509bX = 0;
        this.xxp = 0L;
        this.yDt = false;
        this.f13515vb = Long.MIN_VALUE;
    }

    private void JAA() {
        SparseIntArray sparseIntArray = kMt;
        Integer valueOf = Integer.valueOf(sparseIntArray.get(this.f13513tC));
        if (valueOf == null) {
            sparseIntArray.put(this.f13513tC, 1);
        } else {
            sparseIntArray.put(this.f13513tC, valueOf.intValue() + 1);
        }
    }

    /* renamed from: Ja */
    private void m91817Ja() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.tuV;
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo84980bg(this, elapsedRealtime);
            }
        }
        this.f13516zx = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LZ */
    public void m91815LZ() {
        JAA jaa = this.f13502Ta;
        if (jaa != null) {
            jaa.post(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.10
                @Override // java.lang.Runnable
                public void run() {
                    if (C6472eqN.this.ldr == null) {
                        try {
                            C6472eqN.this.ldr = new C6460IL();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (C6472eqN.this.ldr != null) {
                            InterfaceC6463bX unused = C6472eqN.this.ldr;
                            C6472eqN.this.rri = "0";
                            C6472eqN.this.ldr.mo91832bg((InterfaceC6463bX.InterfaceC6470zx) C6472eqN.this);
                            C6472eqN.this.ldr.mo91838bg((InterfaceC6463bX.InterfaceC6464IL) C6472eqN.this);
                            C6472eqN.this.ldr.mo91837bg((InterfaceC6463bX.InterfaceC6465bX) C6472eqN.this);
                            C6472eqN.this.ldr.mo91836bg((InterfaceC6463bX.InterfaceC6466bg) C6472eqN.this);
                            C6472eqN.this.ldr.mo91833bg((InterfaceC6463bX.InterfaceC6469ldr) C6472eqN.this);
                            C6472eqN.this.ldr.mo91835bg((InterfaceC6463bX.InterfaceC6467eqN) C6472eqN.this);
                            C6472eqN.this.ldr.mo91834bg((InterfaceC6463bX.InterfaceC6468iR) C6472eqN.this);
                            try {
                                C6472eqN.this.ldr.mo91856bX(false);
                            } catch (Throwable unused2) {
                            }
                            C6472eqN.this.f13498Kg = false;
                        }
                    }
                }
            });
        }
    }

    /* renamed from: Uq */
    private void m91811Uq() {
        boolean z;
        ArrayList<Runnable> arrayList = this.f13499LZ;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return;
        }
        DDQ();
    }

    /* renamed from: Uw */
    private void m91810Uw() {
        JAA jaa = this.f13502Ta;
        if (jaa != null) {
            jaa.post(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C6472eqN.this.ldr.mo91847iR();
                        C6472eqN.this.f13505VB = 207;
                        C6472eqN.this.ZQc = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void aGH() {
        ArrayList<Runnable> arrayList = this.f13499LZ;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f13499LZ.clear();
        }
    }

    /* renamed from: bg */
    private boolean m91800bg(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    private void kMt() {
        JAA jaa = this.f13502Ta;
        if (jaa != null && jaa.getLooper() != null) {
            this.f13502Ta.post(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.6
                @Override // java.lang.Runnable
                public void run() {
                    if (C6472eqN.this.f13502Ta != null && C6472eqN.this.f13502Ta.getLooper() != null) {
                        try {
                            C7246bg.m89489bg().m89482bg(C6472eqN.this.f13502Ta);
                            C6472eqN.this.f13502Ta = null;
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    private void rri() {
        if (this.ldr == null) {
            return;
        }
        try {
            this.ldr.mo91860PX();
        } catch (Throwable unused) {
        }
        this.ldr.mo91838bg((InterfaceC6463bX.InterfaceC6464IL) null);
        this.ldr.mo91834bg((InterfaceC6463bX.InterfaceC6468iR) null);
        this.ldr.mo91836bg((InterfaceC6463bX.InterfaceC6466bg) null);
        this.ldr.mo91835bg((InterfaceC6463bX.InterfaceC6467eqN) null);
        this.ldr.mo91837bg((InterfaceC6463bX.InterfaceC6465bX) null);
        this.ldr.mo91832bg((InterfaceC6463bX.InterfaceC6470zx) null);
        this.ldr.mo91833bg((InterfaceC6463bX.InterfaceC6469ldr) null);
        try {
            this.ldr.mo91858VB();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: tC */
    private void m91774tC() {
        m91820IL(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.14
            @Override // java.lang.Runnable
            public void run() {
                if (C6472eqN.this.f13502Ta != null) {
                    C6472eqN.this.f13502Ta.sendEmptyMessage(104);
                }
            }
        });
    }

    /* renamed from: Lq */
    public int m91814Lq() {
        return this.f13509bX;
    }

    /* renamed from: PX */
    public void m91813PX() {
        if (mo86467Kg()) {
            return;
        }
        this.f13511eo = true;
        aGH();
        JAA jaa = this.f13502Ta;
        if (jaa != null) {
            try {
                jaa.removeCallbacksAndMessages(null);
                if (this.ldr != null) {
                    this.f13502Ta.sendEmptyMessage(103);
                }
                kMt();
            } catch (Throwable unused) {
                kMt();
            }
        }
    }

    /* renamed from: Ta */
    public boolean m91812Ta() {
        if (this.f13505VB == 205) {
            return true;
        }
        return false;
    }

    public SurfaceHolder VzQ() {
        return this.f13496IL;
    }

    public SurfaceTexture tuV() {
        return this.f13510bg;
    }

    /* renamed from: vb */
    public long mo85064vb() {
        long j = this.VzQ;
        if (j != 0) {
            return j;
        }
        if (this.f13505VB == 206 || this.f13505VB == 207) {
            try {
                this.VzQ = this.ldr.mo91848eo();
            } catch (Throwable unused) {
            }
        }
        return this.VzQ;
    }

    public long xxp() {
        if (mo86467Kg()) {
            return 0L;
        }
        if (this.f13505VB == 206 || this.f13505VB == 207) {
            try {
                return this.ldr.mo91857WR();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public long yDt() {
        if (this.yDt) {
            long j = this.xxp;
            if (j > 0) {
                return this.f13500Lq + j;
            }
        }
        return this.f13500Lq;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    /* renamed from: Kg */
    public boolean mo86467Kg() {
        return this.f13511eo;
    }

    /* renamed from: VB */
    public void m91809VB() {
        JAA jaa;
        if (mo86467Kg() || (jaa = this.f13502Ta) == null) {
            return;
        }
        jaa.removeMessages(100);
        this.ZQc = true;
        if (!this.f13514uu) {
            if (!this.f13495Fy && !m91821IL(this.f13504Uw)) {
                m91781bg(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C6472eqN.this.f13502Ta != null) {
                            C6472eqN.this.f13502Ta.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            JAA jaa2 = this.f13502Ta;
            if (jaa2 != null) {
                jaa2.sendEmptyMessage(101);
            }
        } else if (!this.f13516zx && !m91821IL(this.f13504Uw)) {
            m91781bg(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.13
                @Override // java.lang.Runnable
                public void run() {
                    if (C6472eqN.this.f13502Ta != null) {
                        C6472eqN.this.f13502Ta.sendEmptyMessage(101);
                    }
                }
            });
        } else {
            JAA jaa3 = this.f13502Ta;
            if (jaa3 != null) {
                jaa3.sendEmptyMessage(101);
            }
        }
    }

    /* renamed from: WR */
    public void m91807WR() {
        if (mo86467Kg() || this.ldr == null) {
            return;
        }
        this.f13507VW.set(true);
        if (this.f13505VB != 206) {
            m91830Fy();
            this.ZQc = false;
            this.ayS.m91771bg(true);
            m91827IL(0L);
            JAA jaa = this.f13502Ta;
            if (jaa != null) {
                jaa.removeCallbacks(this.daV);
                this.f13502Ta.postDelayed(this.daV, this.aGH);
            }
        }
        this.f13503Uq.countDown();
    }

    /* renamed from: eo */
    public void m91777eo() {
        if (mo86467Kg() || this.f13502Ta == null) {
            return;
        }
        this.f13507VW.set(true);
        this.f13502Ta.post(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.11
            @Override // java.lang.Runnable
            public void run() {
                if (C6472eqN.this.mo86452iR() && C6472eqN.this.ldr != null) {
                    try {
                        C6472eqN.this.ldr.mo91846zx();
                        for (WeakReference weakReference : C6472eqN.this.f13497Ja) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((InterfaceC6496bg.InterfaceC6497bg) weakReference.get()).mo84976zx(C6472eqN.this);
                            }
                        }
                        C6472eqN.this.f13505VB = 206;
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }
        });
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    /* renamed from: iR */
    public boolean mo86452iR() {
        JAA jaa;
        return ((this.f13505VB != 207 && !this.ZQc) || (jaa = this.f13502Ta) == null || jaa.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    public boolean ldr() {
        JAA jaa;
        return (this.f13505VB == 206 || ((jaa = this.f13502Ta) != null && jaa.hasMessages(100))) && !this.ZQc;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    /* renamed from: zx */
    public int mo86451zx() {
        if (this.ldr == null || mo86467Kg()) {
            return 0;
        }
        return this.ldr.yDt();
    }

    /* renamed from: IL */
    private void m91827IL(long j) {
        this.ayS.m91772bg(j);
        if (this.JAA) {
            m91820IL(this.ayS);
        } else if (m91821IL(this.f13504Uw)) {
            m91820IL(this.ayS);
        } else {
            m91781bg(this.ayS);
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    /* renamed from: bX */
    public boolean mo86461bX() {
        return m91812Ta() || ldr() || mo86452iR();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    public int eqN() {
        if (this.ldr == null || mo86467Kg()) {
            return 0;
        }
        return this.ldr.mo91859Ta();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX.InterfaceC6469ldr
    /* renamed from: bX */
    public void mo91805bX(InterfaceC6463bX interfaceC6463bX) {
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo84977bg((InterfaceC6496bg) this, true);
            }
        }
    }

    /* renamed from: IL */
    private boolean m91821IL(C6494bX c6494bX) {
        return c6494bX != null && c6494bX.eqN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m91798bg(long j, long j2) {
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo84979bg(this, j, j2);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    /* renamed from: IL */
    public boolean mo86469IL() {
        return this.f13505VB == 209;
    }

    /* renamed from: IL */
    private void m91819IL(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.ldr.mo91850bg(fileInputStream.getFD());
        fileInputStream.close();
    }

    /* renamed from: bg */
    private void m91780bg(String str) {
        this.f13513tC = 0;
        this.f13502Ta = C7246bg.m89489bg().m89483bg(this, ThreadFactoryC7228WR.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.f13514uu = true;
        m91815LZ();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX.InterfaceC6467eqN
    /* renamed from: IL */
    public boolean mo91825IL(InterfaceC6463bX interfaceC6463bX, int i, int i2) {
        if (this.ldr != interfaceC6463bX) {
            return false;
        }
        if (i2 == -1004) {
            C6495bg c6495bg = new C6495bg(i, i2);
            for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().mo84978bg(this, c6495bg);
                }
            }
        }
        m91828IL(i, i2);
        return false;
    }

    /* renamed from: bg */
    public void m91779bg(final boolean z) {
        if (mo86467Kg()) {
            return;
        }
        this.JAA = z;
        if (this.ldr != null) {
            this.ldr.mo91831bg(z);
            return;
        }
        JAA jaa = this.f13502Ta;
        if (jaa != null) {
            jaa.post(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.9
                @Override // java.lang.Runnable
                public void run() {
                    if (C6472eqN.this.ldr != null) {
                        C6472eqN.this.ldr.mo91831bg(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m91828IL(int i, int i2) {
        if (i == 701) {
            this.LKE = SystemClock.elapsedRealtime();
            this.f13509bX++;
            for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().mo84981bg(this, Integer.MAX_VALUE, 0, 0);
                }
            }
        } else if (i == 702) {
            if (this.LKE > 0) {
                this.CQc += SystemClock.elapsedRealtime() - this.LKE;
                this.LKE = 0L;
            }
            for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference2 : this.f13497Ja) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().mo84983bg((InterfaceC6496bg) this, Integer.MAX_VALUE);
                }
            }
        } else if (this.f13514uu && i == 3) {
            m91811Uq();
            m91817Ja();
            m91818IL(this.DDQ);
        }
    }

    /* renamed from: bg */
    public void m91778bg(boolean z, long j, boolean z2) {
        if (mo86467Kg()) {
            return;
        }
        m91815LZ();
        this.DDQ = z2;
        this.f13507VW.set(true);
        this.ZQc = false;
        m91818IL(z2);
        if (z) {
            this.f13501PX = j;
            m91774tC();
        } else {
            m91827IL(j);
        }
        JAA jaa = this.f13502Ta;
        if (jaa != null) {
            jaa.removeCallbacks(this.daV);
            this.f13502Ta.postDelayed(this.daV, this.aGH);
        }
        this.f13503Uq.countDown();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX.InterfaceC6470zx
    /* renamed from: IL */
    public void mo91826IL(InterfaceC6463bX interfaceC6463bX) {
        if (mo86467Kg()) {
            return;
        }
        this.f13505VB = 205;
        try {
            C6494bX c6494bX = this.f13504Uw;
            if (c6494bX != null) {
                float m91716PX = c6494bX.m91716PX();
                if (m91716PX > 0.0f) {
                    C6490IL c6490il = new C6490IL();
                    c6490il.m91762bg(m91716PX);
                    this.ldr.mo91852bg(c6490il);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.f13502Ta != null) {
            if (this.ZQc) {
                m91810Uw();
            } else {
                JAA jaa = this.f13502Ta;
                jaa.sendMessage(jaa.obtainMessage(100, -1, -1));
            }
        }
        kMt.delete(this.f13513tC);
        boolean z = this.f13514uu;
        boolean z2 = this.f13495Fy;
        if (!z && !z2) {
            m91817Ja();
            this.f13495Fy = true;
        }
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo84988IL(this);
            }
        }
    }

    /* renamed from: bg */
    public void m91799bg(final long j) {
        if (mo86467Kg()) {
            return;
        }
        if (this.f13505VB == 207 || this.f13505VB == 206 || this.f13505VB == 209) {
            m91820IL(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C6472eqN.this.f13502Ta != null) {
                        C6472eqN.this.f13502Ta.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg
    /* renamed from: bg */
    public boolean mo86459bg() {
        return this.f13516zx;
    }

    /* renamed from: bg */
    public void m91797bg(final SurfaceTexture surfaceTexture) {
        if (mo86467Kg()) {
            return;
        }
        this.f13510bg = surfaceTexture;
        m91779bg(true);
        m91820IL(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.3
            @Override // java.lang.Runnable
            public void run() {
                C6472eqN.this.m91815LZ();
                if (C6472eqN.this.f13502Ta != null) {
                    C6472eqN.this.f13502Ta.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    /* renamed from: bg */
    public void m91796bg(final SurfaceHolder surfaceHolder) {
        if (mo86467Kg()) {
            return;
        }
        this.f13496IL = surfaceHolder;
        m91779bg(true);
        m91820IL(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.4
            @Override // java.lang.Runnable
            public void run() {
                C6472eqN.this.m91815LZ();
                if (C6472eqN.this.f13502Ta != null) {
                    C6472eqN.this.f13502Ta.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    /* renamed from: bg */
    public void m91782bg(final C6494bX c6494bX) {
        if (mo86467Kg()) {
            return;
        }
        this.f13504Uw = c6494bX;
        if (c6494bX != null) {
            this.f13514uu = this.f13514uu && !c6494bX.eqN();
        }
        m91820IL(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.5
            @Override // java.lang.Runnable
            public void run() {
                C6472eqN.this.m91815LZ();
                if (C6472eqN.this.f13502Ta != null) {
                    C6472eqN.this.f13502Ta.obtainMessage(107, c6494bX).sendToTarget();
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.component.utils.JAA.InterfaceC7736bg
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo83648bg(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.C6472eqN.mo83648bg(android.os.Message):void");
    }

    /* renamed from: IL */
    private void m91820IL(Runnable runnable) {
        if (runnable == null || mo86467Kg()) {
            return;
        }
        if (!this.f13511eo) {
            runnable.run();
        } else {
            m91781bg(runnable);
        }
    }

    /* renamed from: IL */
    public void m91818IL(final boolean z) {
        JAA jaa;
        if (mo86467Kg() || (jaa = this.f13502Ta) == null) {
            return;
        }
        jaa.post(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.eqN.eqN.8
            @Override // java.lang.Runnable
            public void run() {
                if (!C6472eqN.this.mo86467Kg() && C6472eqN.this.ldr != null) {
                    try {
                        C6472eqN.this.DDQ = z;
                        C6472eqN.this.ldr.eqN(z);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* renamed from: IL */
    public void m91829IL(int i) {
        this.eqN = i;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX.InterfaceC6466bg
    /* renamed from: bg */
    public void mo91794bg(InterfaceC6463bX interfaceC6463bX, int i) {
        if (this.ldr != interfaceC6463bX) {
            return;
        }
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo84987IL(this, i);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX.InterfaceC6464IL
    /* renamed from: bg */
    public void mo91795bg(InterfaceC6463bX interfaceC6463bX) {
        this.f13505VB = 209;
        kMt.delete(this.f13513tC);
        JAA jaa = this.f13502Ta;
        if (jaa != null) {
            jaa.removeCallbacks(this.daV);
        }
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo84984bg(this);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX.InterfaceC6465bX
    /* renamed from: bg */
    public boolean mo91793bg(InterfaceC6463bX interfaceC6463bX, int i, int i2) {
        JAA();
        this.f13505VB = 200;
        JAA jaa = this.f13502Ta;
        if (jaa != null) {
            jaa.removeCallbacks(this.daV);
        }
        if (m91800bg(i, i2)) {
            kMt();
        }
        if (this.f13507VW.get()) {
            this.f13507VW.set(false);
            C6495bg c6495bg = new C6495bg(i, i2);
            for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().mo84978bg(this, c6495bg);
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: bg */
    private void m91781bg(Runnable runnable) {
        try {
            if (this.f13499LZ == null) {
                this.f13499LZ = new ArrayList<>();
            }
            this.f13499LZ.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.InterfaceC6463bX.InterfaceC6468iR
    /* renamed from: bg */
    public void mo91792bg(InterfaceC6463bX interfaceC6463bX, int i, int i2, int i3, int i4) {
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().mo84982bg((InterfaceC6496bg) this, i, i2);
            }
        }
    }

    /* renamed from: bg */
    public void mo85066bg(InterfaceC6496bg.InterfaceC6497bg interfaceC6497bg) {
        if (interfaceC6497bg == null) {
            return;
        }
        for (WeakReference<InterfaceC6496bg.InterfaceC6497bg> weakReference : this.f13497Ja) {
            if (weakReference != null && weakReference.get() == interfaceC6497bg) {
                return;
            }
        }
        this.f13497Ja.add(new WeakReference<>(interfaceC6497bg));
    }

    /* renamed from: bg */
    public void m91801bg(int i) {
        if (mo86467Kg()) {
            return;
        }
        this.aGH = i;
    }
}
