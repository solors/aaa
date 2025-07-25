package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p001a0.Font;
import p001a0.FontCharacter;
import p001a0.Marker;
import p629d0.Layer;
import p690h0.C33453f;
import p690h0.MiscUtils;

/* renamed from: com.airbnb.lottie.d */
/* loaded from: classes2.dex */
public class LottieComposition {

    /* renamed from: c */
    private Map<String, List<Layer>> f2124c;

    /* renamed from: d */
    private Map<String, LottieImageAsset> f2125d;

    /* renamed from: e */
    private Map<String, Font> f2126e;

    /* renamed from: f */
    private List<Marker> f2127f;

    /* renamed from: g */
    private SparseArrayCompat<FontCharacter> f2128g;

    /* renamed from: h */
    private LongSparseArray<Layer> f2129h;

    /* renamed from: i */
    private List<Layer> f2130i;

    /* renamed from: j */
    private Rect f2131j;

    /* renamed from: k */
    private float f2132k;

    /* renamed from: l */
    private float f2133l;

    /* renamed from: m */
    private float f2134m;

    /* renamed from: n */
    private boolean f2135n;

    /* renamed from: a */
    private final PerformanceTracker f2122a = new PerformanceTracker();

    /* renamed from: b */
    private final HashSet<String> f2123b = new HashSet<>();

    /* renamed from: o */
    private int f2136o = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public void m103398a(String str) {
        C33453f.m23901c(str);
        this.f2123b.add(str);
    }

    /* renamed from: b */
    public Rect m103397b() {
        return this.f2131j;
    }

    /* renamed from: c */
    public SparseArrayCompat<FontCharacter> m103396c() {
        return this.f2128g;
    }

    /* renamed from: d */
    public float m103395d() {
        return (m103394e() / this.f2134m) * 1000.0f;
    }

    /* renamed from: e */
    public float m103394e() {
        return this.f2133l - this.f2132k;
    }

    /* renamed from: f */
    public float m103393f() {
        return this.f2133l;
    }

    /* renamed from: g */
    public Map<String, Font> m103392g() {
        return this.f2126e;
    }

    /* renamed from: h */
    public float m103391h(float f) {
        return MiscUtils.m23865k(this.f2132k, this.f2133l, f);
    }

    /* renamed from: i */
    public float m103390i() {
        return this.f2134m;
    }

    /* renamed from: j */
    public Map<String, LottieImageAsset> m103389j() {
        return this.f2125d;
    }

    /* renamed from: k */
    public List<Layer> m103388k() {
        return this.f2130i;
    }

    @Nullable
    /* renamed from: l */
    public Marker m103387l(String str) {
        int size = this.f2127f.size();
        for (int i = 0; i < size; i++) {
            Marker marker = this.f2127f.get(i);
            if (marker.m105881a(str)) {
                return marker;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: m */
    public int m103386m() {
        return this.f2136o;
    }

    /* renamed from: n */
    public PerformanceTracker m103385n() {
        return this.f2122a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: o */
    public List<Layer> m103384o(String str) {
        return this.f2124c.get(str);
    }

    /* renamed from: p */
    public float m103383p() {
        return this.f2132k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: q */
    public boolean m103382q() {
        return this.f2135n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: r */
    public void m103381r(int i) {
        this.f2136o += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: s */
    public void m103380s(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, SparseArrayCompat<FontCharacter> sparseArrayCompat, Map<String, Font> map3, List<Marker> list2) {
        this.f2131j = rect;
        this.f2132k = f;
        this.f2133l = f2;
        this.f2134m = f3;
        this.f2130i = list;
        this.f2129h = longSparseArray;
        this.f2124c = map;
        this.f2125d = map2;
        this.f2128g = sparseArrayCompat;
        this.f2126e = map3;
        this.f2127f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: t */
    public Layer m103379t(long j) {
        return this.f2129h.get(j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.f2130i) {
            sb2.append(layer.m25818w("\t"));
        }
        return sb2.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: u */
    public void m103378u(boolean z) {
        this.f2135n = z;
    }

    /* renamed from: v */
    public void m103377v(boolean z) {
        this.f2122a.m103242b(z);
    }
}
