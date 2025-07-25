package com.bytedance.sdk.component.p228IL.p229bg;

import com.bytedance.sdk.component.p254bX.p255bg.C7569bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.IL.bg.Ta */
/* loaded from: classes3.dex */
public abstract class AbstractC7191Ta {

    /* renamed from: IL */
    public C7569bg f15503IL = new C7569bg();

    /* renamed from: bg */
    public AbstractC7194VB f15504bg;

    /* renamed from: com.bytedance.sdk.component.IL.bg.Ta$bg */
    /* loaded from: classes3.dex */
    public static class C7192bg {

        /* renamed from: IL */
        Map<String, List<String>> f15505IL;

        /* renamed from: Kg */
        String f15506Kg;

        /* renamed from: bX */
        C7216iR f15507bX;

        /* renamed from: bg */
        C7199bg f15508bg;
        String eqN;

        /* renamed from: iR */
        int f15509iR;
        C7221yDt ldr;

        /* renamed from: zx */
        Object f15510zx;

        public C7192bg() {
            this.f15505IL = new HashMap();
        }

        /* renamed from: IL */
        public C7192bg m89658IL(String str) {
            return m89653bg(C7216iR.m89596bX(str));
        }

        /* renamed from: bg */
        public C7192bg m89654bg(C7199bg c7199bg) {
            this.f15508bg = c7199bg;
            return this;
        }

        /* renamed from: IL */
        public C7192bg m89657IL(String str, String str2) {
            if (!this.f15505IL.containsKey(str)) {
                this.f15505IL.put(str, new ArrayList());
            }
            this.f15505IL.get(str).add(str2);
            return this;
        }

        /* renamed from: bg */
        public C7192bg m89650bg(String str) {
            this.f15506Kg = str;
            return this;
        }

        C7192bg(AbstractC7191Ta abstractC7191Ta) {
            this.f15507bX = abstractC7191Ta.mo89647IL();
            this.eqN = abstractC7191Ta.mo89645bX();
            this.f15505IL = abstractC7191Ta.eqN();
            this.f15510zx = abstractC7191Ta.mo89644bg();
            this.ldr = abstractC7191Ta.mo89646Kg();
            this.f15508bg = abstractC7191Ta.mo89642zx();
            this.f15509iR = abstractC7191Ta.mo89643iR();
            this.f15506Kg = abstractC7191Ta.ldr();
        }

        /* renamed from: bg */
        public C7192bg m89655bg(int i) {
            this.f15509iR = i;
            return this;
        }

        /* renamed from: bg */
        public C7192bg m89651bg(Object obj) {
            this.f15510zx = obj;
            return this;
        }

        /* renamed from: IL */
        public AbstractC7191Ta m89659IL() {
            return new AbstractC7191Ta() { // from class: com.bytedance.sdk.component.IL.bg.Ta.bg.1
                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                /* renamed from: IL */
                public C7216iR mo89647IL() {
                    return C7192bg.this.f15507bX;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                /* renamed from: Kg */
                public C7221yDt mo89646Kg() {
                    return C7192bg.this.ldr;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                /* renamed from: bX */
                public String mo89645bX() {
                    return C7192bg.this.eqN;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                /* renamed from: bg */
                public Object mo89644bg() {
                    return C7192bg.this.f15510zx;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                public Map eqN() {
                    return C7192bg.this.f15505IL;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                /* renamed from: iR */
                public int mo89643iR() {
                    return C7192bg.this.f15509iR;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                public String ldr() {
                    return C7192bg.this.f15506Kg;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta
                /* renamed from: zx */
                public C7199bg mo89642zx() {
                    return C7192bg.this.f15508bg;
                }
            };
        }

        /* renamed from: bg */
        public C7192bg m89653bg(C7216iR c7216iR) {
            this.f15507bX = c7216iR;
            return this;
        }

        /* renamed from: bg */
        public C7192bg m89648bg(String str, String str2) {
            return m89657IL(str, str2);
        }

        /* renamed from: bg */
        public C7192bg m89656bg() {
            return m89649bg("GET", (C7221yDt) null);
        }

        /* renamed from: bg */
        private C7192bg m89649bg(String str, C7221yDt c7221yDt) {
            this.eqN = str;
            this.ldr = c7221yDt;
            return this;
        }

        /* renamed from: bg */
        public C7192bg m89652bg(C7221yDt c7221yDt) {
            return m89649bg("POST", c7221yDt);
        }
    }

    /* renamed from: IL */
    public abstract C7216iR mo89647IL();

    /* renamed from: Kg */
    public C7221yDt mo89646Kg() {
        return null;
    }

    /* renamed from: WR */
    public C7192bg m89661WR() {
        return new C7192bg(this);
    }

    /* renamed from: bX */
    public abstract String mo89645bX();

    /* renamed from: bg */
    public abstract Object mo89644bg();

    /* renamed from: bg */
    public void m89660bg(AbstractC7194VB abstractC7194VB) {
        this.f15504bg = abstractC7194VB;
    }

    public abstract Map<String, List<String>> eqN();

    /* renamed from: iR */
    public abstract int mo89643iR();

    public abstract String ldr();

    /* renamed from: zx */
    public abstract C7199bg mo89642zx();
}
