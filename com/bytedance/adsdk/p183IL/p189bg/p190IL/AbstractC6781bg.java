package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.view.animation.Interpolator;
import com.bytedance.adsdk.p183IL.C6873zx;
import com.bytedance.adsdk.p183IL.p192iR.C6836IL;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC6781bg<K, A> {

    /* renamed from: bX */
    protected C6836IL<A> f14496bX;

    /* renamed from: zx */
    private final InterfaceC6784bX<K> f14499zx;

    /* renamed from: bg */
    final List<InterfaceC6785bg> f14497bg = new ArrayList(1);
    private boolean eqN = false;

    /* renamed from: IL */
    protected float f14494IL = 0.0f;
    private A ldr = null;

    /* renamed from: iR */
    private float f14498iR = -1.0f;

    /* renamed from: Kg */
    private float f14495Kg = -1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.adsdk.IL.bg.IL.bg$IL */
    /* loaded from: classes3.dex */
    public static final class C6783IL<T> implements InterfaceC6784bX<T> {
        private C6783IL() {
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: IL */
        public C6838bg<T> mo90836IL() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bX */
        public float mo90834bX() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bg */
        public boolean mo90833bg() {
            return true;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        public float eqN() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: IL */
        public boolean mo90835IL(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bg */
        public boolean mo90832bg(float f) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.adsdk.IL.bg.IL.bg$bX */
    /* loaded from: classes3.dex */
    public interface InterfaceC6784bX<T> {
        /* renamed from: IL */
        C6838bg<T> mo90836IL();

        /* renamed from: IL */
        boolean mo90835IL(float f);

        @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        /* renamed from: bX */
        float mo90834bX();

        /* renamed from: bg */
        boolean mo90833bg();

        /* renamed from: bg */
        boolean mo90832bg(float f);

        @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        float eqN();
    }

    /* renamed from: com.bytedance.adsdk.IL.bg.IL.bg$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC6785bg {
        /* renamed from: bg */
        void mo90776bg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.adsdk.IL.bg.IL.bg$eqN */
    /* loaded from: classes3.dex */
    public static final class C6786eqN<T> implements InterfaceC6784bX<T> {

        /* renamed from: bg */
        private final List<? extends C6838bg<T>> f14502bg;

        /* renamed from: bX */
        private C6838bg<T> f14501bX = null;
        private float eqN = -1.0f;

        /* renamed from: IL */
        private C6838bg<T> f14500IL = m90837bX(0.0f);

        C6786eqN(List<? extends C6838bg<T>> list) {
            this.f14502bg = list;
        }

        /* renamed from: bX */
        private C6838bg<T> m90837bX(float f) {
            List<? extends C6838bg<T>> list;
            C6838bg<T> c6838bg = this.f14502bg.get(list.size() - 1);
            if (f >= c6838bg.m90716bX()) {
                return c6838bg;
            }
            for (int size = this.f14502bg.size() - 2; size > 0; size--) {
                C6838bg<T> c6838bg2 = this.f14502bg.get(size);
                if (this.f14500IL != c6838bg2 && c6838bg2.m90715bg(f)) {
                    return c6838bg2;
                }
            }
            return this.f14502bg.get(0);
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: IL */
        public C6838bg<T> mo90836IL() {
            return this.f14500IL;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bg */
        public boolean mo90833bg() {
            return false;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        public float eqN() {
            List<? extends C6838bg<T>> list = this.f14502bg;
            return list.get(list.size() - 1).eqN();
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: IL */
        public boolean mo90835IL(float f) {
            C6838bg<T> c6838bg = this.f14501bX;
            C6838bg<T> c6838bg2 = this.f14500IL;
            if (c6838bg == c6838bg2 && this.eqN == f) {
                return true;
            }
            this.f14501bX = c6838bg2;
            this.eqN = f;
            return false;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bg */
        public boolean mo90832bg(float f) {
            if (this.f14500IL.m90715bg(f)) {
                return !this.f14500IL.m90712zx();
            }
            this.f14500IL = m90837bX(f);
            return true;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bX */
        public float mo90834bX() {
            return this.f14502bg.get(0).m90716bX();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.adsdk.IL.bg.IL.bg$zx */
    /* loaded from: classes3.dex */
    public static final class C6787zx<T> implements InterfaceC6784bX<T> {

        /* renamed from: IL */
        private float f14503IL = -1.0f;

        /* renamed from: bg */
        private final C6838bg<T> f14504bg;

        C6787zx(List<? extends C6838bg<T>> list) {
            this.f14504bg = list.get(0);
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: IL */
        public C6838bg<T> mo90836IL() {
            return this.f14504bg;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bX */
        public float mo90834bX() {
            return this.f14504bg.m90716bX();
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bg */
        public boolean mo90833bg() {
            return false;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        public float eqN() {
            return this.f14504bg.eqN();
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: IL */
        public boolean mo90835IL(float f) {
            if (this.f14503IL == f) {
                return true;
            }
            this.f14503IL = f;
            return false;
        }

        @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6784bX
        /* renamed from: bg */
        public boolean mo90832bg(float f) {
            return !this.f14504bg.m90712zx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6781bg(List<? extends C6838bg<K>> list) {
        this.f14499zx = m90839bg(list);
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    /* renamed from: WR */
    private float m90844WR() {
        if (this.f14498iR == -1.0f) {
            this.f14498iR = this.f14499zx.mo90834bX();
        }
        return this.f14498iR;
    }

    /* renamed from: IL */
    public void mo90846IL() {
        for (int i = 0; i < this.f14497bg.size(); i++) {
            this.f14497bg.get(i).mo90776bg();
        }
    }

    /* renamed from: Kg */
    public float m90845Kg() {
        return this.f14494IL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bX */
    public C6838bg<K> m90843bX() {
        C6873zx.m90580bg("BaseKeyframeAnimation#getCurrentKeyframe");
        C6838bg<K> mo90836IL = this.f14499zx.mo90836IL();
        C6873zx.m90583IL("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo90836IL;
    }

    /* renamed from: bg */
    abstract A mo90811bg(C6838bg<K> c6838bg, float f);

    /* renamed from: bg */
    public void m90842bg() {
        this.eqN = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float eqN() {
        if (this.eqN) {
            return 0.0f;
        }
        C6838bg<K> m90843bX = m90843bX();
        if (m90843bX.m90712zx()) {
            return 0.0f;
        }
        return (this.f14494IL - m90843bX.m90716bX()) / (m90843bX.eqN() - m90843bX.m90716bX());
    }

    /* renamed from: iR */
    public A mo90813iR() {
        A mo90811bg;
        float eqN = eqN();
        if (this.f14496bX == null && this.f14499zx.mo90835IL(eqN)) {
            return this.ldr;
        }
        C6838bg<K> m90843bX = m90843bX();
        Interpolator interpolator = m90843bX.eqN;
        if (interpolator != null && m90843bX.f14693zx != null) {
            mo90811bg = mo90840bg(m90843bX, eqN, interpolator.getInterpolation(eqN), m90843bX.f14693zx.getInterpolation(eqN));
        } else {
            mo90811bg = mo90811bg(m90843bX, m90838zx());
        }
        this.ldr = mo90811bg;
        return mo90811bg;
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    float ldr() {
        if (this.f14495Kg == -1.0f) {
            this.f14495Kg = this.f14499zx.eqN();
        }
        return this.f14495Kg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: zx */
    public float m90838zx() {
        C6838bg<K> m90843bX = m90843bX();
        if (m90843bX != null && !m90843bX.m90712zx()) {
            return m90843bX.f14688bX.getInterpolation(eqN());
        }
        return 0.0f;
    }

    /* renamed from: bg */
    public void m90841bg(InterfaceC6785bg interfaceC6785bg) {
        this.f14497bg.add(interfaceC6785bg);
    }

    /* renamed from: bg */
    public void mo90814bg(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.f14499zx.mo90833bg()) {
            return;
        }
        if (f < m90844WR()) {
            f = m90844WR();
        } else if (f > ldr()) {
            f = ldr();
        }
        if (f == this.f14494IL) {
            return;
        }
        this.f14494IL = f;
        if (this.f14499zx.mo90832bg(f)) {
            mo90846IL();
        }
    }

    /* renamed from: bg */
    protected A mo90840bg(C6838bg<K> c6838bg, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: bg */
    private static <T> InterfaceC6784bX<T> m90839bg(List<? extends C6838bg<T>> list) {
        if (list.isEmpty()) {
            return new C6783IL();
        }
        if (list.size() == 1) {
            return new C6787zx(list);
        }
        return new C6786eqN(list);
    }
}
