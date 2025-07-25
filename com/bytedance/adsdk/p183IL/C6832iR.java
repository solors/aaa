package com.bytedance.adsdk.p183IL;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p185bX.C6732bX;
import com.bytedance.adsdk.p183IL.p185bX.C6766eqN;
import com.bytedance.adsdk.p183IL.p185bX.C6768ldr;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.C6748zx;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.IL.iR */
/* loaded from: classes3.dex */
public class C6832iR {

    /* renamed from: Kg */
    private LongSparseArray<C6748zx> f14658Kg;

    /* renamed from: PX */
    private float f14660PX;

    /* renamed from: Ta */
    private float f14661Ta;

    /* renamed from: VB */
    private float f14662VB;
    private C6835bg VzQ;

    /* renamed from: WR */
    private List<C6748zx> f14663WR;

    /* renamed from: bX */
    private Map<String, List<C6748zx>> f14664bX;

    /* renamed from: eo */
    private Rect f14666eo;
    private Map<String, C6821eo> eqN;

    /* renamed from: iR */
    private SparseArray<C6766eqN> f14667iR;
    private List<C6768ldr> ldr;
    private C6833IL tuV;

    /* renamed from: vb */
    private C6834bX f14668vb;
    private boolean yDt;

    /* renamed from: zx */
    private Map<String, C6732bX> f14669zx;

    /* renamed from: bg */
    private final C6869tuV f14665bg = new C6869tuV();

    /* renamed from: IL */
    private final HashSet<String> f14657IL = new HashSet<>();

    /* renamed from: Lq */
    private int f14659Lq = 0;
    private String xxp = "";

    /* renamed from: com.bytedance.adsdk.IL.iR$IL */
    /* loaded from: classes3.dex */
    public static class C6833IL {

        /* renamed from: IL */
        public int[][] f14670IL;

        /* renamed from: bg */
        public String f14671bg;
    }

    /* renamed from: com.bytedance.adsdk.IL.iR$bX */
    /* loaded from: classes3.dex */
    public static class C6834bX {

        /* renamed from: IL */
        public String f14672IL;

        /* renamed from: bX */
        public String f14673bX;

        /* renamed from: bg */
        public int f14674bg;
        public String eqN;
        public String ldr;

        /* renamed from: zx */
        public int[] f14675zx;
    }

    /* renamed from: com.bytedance.adsdk.IL.iR$bg */
    /* loaded from: classes3.dex */
    public static class C6835bg {

        /* renamed from: IL */
        public Map<String, Object> f14676IL;

        /* renamed from: bX */
        public Map<String, Object> f14677bX;

        /* renamed from: bg */
        public int f14678bg;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: IL */
    public int m90744IL() {
        return this.f14659Lq;
    }

    /* renamed from: Kg */
    public C6834bX m90741Kg() {
        return this.f14668vb;
    }

    /* renamed from: Lq */
    public Map<String, C6732bX> m90740Lq() {
        return this.f14669zx;
    }

    /* renamed from: PX */
    public float m90739PX() {
        return this.f14661Ta;
    }

    /* renamed from: Ta */
    public List<C6748zx> m90738Ta() {
        return this.f14663WR;
    }

    /* renamed from: VB */
    public C6835bg m90737VB() {
        return this.VzQ;
    }

    /* renamed from: WR */
    public String m90736WR() {
        return this.xxp;
    }

    /* renamed from: bX */
    public C6869tuV m90735bX() {
        return this.f14665bg;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: bg */
    public void m90729bg(Rect rect, float f, float f2, float f3, List<C6748zx> list, LongSparseArray<C6748zx> longSparseArray, Map<String, List<C6748zx>> map, Map<String, C6821eo> map2, SparseArray<C6766eqN> sparseArray, Map<String, C6732bX> map3, List<C6768ldr> list2, C6834bX c6834bX, String str, C6835bg c6835bg, C6833IL c6833il) {
        this.f14666eo = rect;
        this.f14662VB = f;
        this.f14660PX = f2;
        this.f14661Ta = f3;
        this.f14663WR = list;
        this.f14658Kg = longSparseArray;
        this.f14664bX = map;
        this.eqN = map2;
        this.f14667iR = sparseArray;
        this.f14669zx = map3;
        this.ldr = list2;
        this.f14668vb = c6834bX;
        this.xxp = str;
        this.VzQ = c6835bg;
        this.tuV = c6833il;
    }

    /* renamed from: eo */
    public C6833IL m90726eo() {
        return this.tuV;
    }

    public Rect eqN() {
        return this.f14666eo;
    }

    /* renamed from: iR */
    public float m90725iR() {
        return this.f14660PX;
    }

    public float ldr() {
        return this.f14662VB;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (C6748zx c6748zx : this.f14663WR) {
            sb2.append(c6748zx.m90911bg("\t"));
        }
        return sb2.toString();
    }

    /* renamed from: vb */
    public Map<String, C6821eo> m90724vb() {
        return this.eqN;
    }

    public float xxp() {
        return this.f14660PX - this.f14662VB;
    }

    public SparseArray<C6766eqN> yDt() {
        return this.f14667iR;
    }

    /* renamed from: zx */
    public float m90723zx() {
        return (xxp() / this.f14661Ta) * 1000.0f;
    }

    /* renamed from: IL */
    public void m90742IL(boolean z) {
        this.f14665bg.m90593bg(z);
    }

    /* renamed from: bX */
    public C6768ldr m90734bX(String str) {
        int size = this.ldr.size();
        for (int i = 0; i < size; i++) {
            C6768ldr c6768ldr = this.ldr.get(i);
            if (c6768ldr.m90879bg(str)) {
                return c6768ldr;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: IL */
    public List<C6748zx> m90743IL(String str) {
        return this.f14664bX.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: bg */
    public void m90728bg(String str) {
        this.f14657IL.add(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: bg */
    public void m90727bg(boolean z) {
        this.yDt = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: bg */
    public void m90731bg(int i) {
        this.f14659Lq += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: bg */
    public boolean m90733bg() {
        return this.yDt;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: bg */
    public C6748zx m90730bg(long j) {
        return this.f14658Kg.get(j);
    }

    /* renamed from: bg */
    public float m90732bg(float f) {
        return C6868zx.m90600bg(this.f14662VB, this.f14660PX, f);
    }
}
