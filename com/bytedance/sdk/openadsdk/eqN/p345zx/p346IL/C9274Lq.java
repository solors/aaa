package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6495bg;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq */
/* loaded from: classes3.dex */
public class C9274Lq {

    /* renamed from: IL */
    private String f20707IL;

    /* renamed from: bX */
    private int f20708bX;

    /* renamed from: bg */
    private long f20709bg;
    private C6494bX eqN;

    /* renamed from: zx */
    private AbstractC8967tuV f20710zx;

    /* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq$bg */
    /* loaded from: classes3.dex */
    public static class C9275bg {

        /* renamed from: Kg */
        private int f20712Kg;

        /* renamed from: VB */
        private C6495bg f20713VB;

        /* renamed from: WR */
        private int f20714WR;

        /* renamed from: iR */
        private int f20718iR;
        private int ldr;

        /* renamed from: zx */
        private int f20719zx;

        /* renamed from: bg */
        private long f20716bg = 0;

        /* renamed from: IL */
        private long f20711IL = 0;

        /* renamed from: bX */
        private long f20715bX = 0;
        private boolean eqN = false;

        /* renamed from: eo */
        private boolean f20717eo = false;

        /* renamed from: Ta */
        private void m83218Ta() {
            long j = this.f20715bX;
            if (j > 0) {
                long j2 = this.f20716bg;
                if (j2 > j) {
                    this.f20716bg = j2 % j;
                }
            }
        }

        /* renamed from: IL */
        public long m83223IL() {
            return this.f20711IL;
        }

        /* renamed from: Kg */
        public int m83220Kg() {
            return this.f20712Kg;
        }

        /* renamed from: PX */
        public C6495bg m83219PX() {
            return this.f20713VB;
        }

        /* renamed from: VB */
        public boolean m83217VB() {
            return this.eqN;
        }

        /* renamed from: WR */
        public int m83216WR() {
            return this.f20714WR;
        }

        /* renamed from: bX */
        public long m83215bX() {
            return this.f20715bX;
        }

        /* renamed from: bg */
        public long m83212bg() {
            return this.f20716bg;
        }

        /* renamed from: eo */
        public boolean m83207eo() {
            return this.f20717eo;
        }

        public int eqN() {
            return this.f20719zx;
        }

        /* renamed from: iR */
        public int m83206iR() {
            return this.f20718iR;
        }

        public int ldr() {
            long j = this.f20715bX;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.f20716bg * 100) / j), 100);
        }

        /* renamed from: zx */
        public int m83205zx() {
            return this.ldr;
        }

        /* renamed from: IL */
        public void m83221IL(long j) {
            this.f20711IL = j;
        }

        /* renamed from: bX */
        public void m83213bX(long j) {
            this.f20715bX = j;
            m83218Ta();
        }

        /* renamed from: bg */
        public void m83210bg(long j) {
            this.f20716bg = j;
            m83218Ta();
        }

        public void eqN(int i) {
            this.f20714WR = i;
        }

        /* renamed from: IL */
        public void m83222IL(int i) {
            this.ldr = i;
        }

        /* renamed from: bX */
        public void m83214bX(int i) {
            this.f20718iR = i;
        }

        /* renamed from: bg */
        public void m83211bg(int i) {
            this.f20719zx = i;
        }

        /* renamed from: bg */
        public void m83208bg(boolean z) {
            this.eqN = z;
        }

        /* renamed from: bg */
        public void m83209bg(C6495bg c6495bg) {
            this.f20713VB = c6495bg;
        }
    }

    public C9274Lq(long j, String str, int i, C6494bX c6494bX, AbstractC8967tuV abstractC8967tuV) {
        this.f20709bg = j;
        this.f20707IL = str;
        this.f20708bX = i;
        this.eqN = c6494bX;
        this.f20710zx = abstractC8967tuV;
    }

    /* renamed from: IL */
    public String m83227IL() {
        return this.f20707IL;
    }

    /* renamed from: bX */
    public int m83226bX() {
        return this.f20708bX;
    }

    /* renamed from: bg */
    public long m83225bg() {
        return this.f20709bg;
    }

    public C6494bX eqN() {
        return this.eqN;
    }

    /* renamed from: zx */
    public AbstractC8967tuV m83224zx() {
        return this.f20710zx;
    }
}
