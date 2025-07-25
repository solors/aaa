package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p690h0.MeanCalculator;

/* renamed from: com.airbnb.lottie.n */
/* loaded from: classes2.dex */
public class PerformanceTracker {

    /* renamed from: a */
    private boolean f2256a = false;

    /* renamed from: b */
    private final Set<InterfaceC3515b> f2257b = new ArraySet();

    /* renamed from: c */
    private final Map<String, MeanCalculator> f2258c = new HashMap();

    /* renamed from: d */
    private final Comparator<Pair<String, Float>> f2259d = new C3514a();

    /* compiled from: PerformanceTracker.java */
    /* renamed from: com.airbnb.lottie.n$a */
    /* loaded from: classes2.dex */
    class C3514a implements Comparator<Pair<String, Float>> {
        C3514a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* renamed from: com.airbnb.lottie.n$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3515b {
        /* renamed from: a */
        void m103240a(float f);
    }

    /* renamed from: a */
    public void m103243a(String str, float f) {
        if (!this.f2256a) {
            return;
        }
        MeanCalculator meanCalculator = this.f2258c.get(str);
        if (meanCalculator == null) {
            meanCalculator = new MeanCalculator();
            this.f2258c.put(str, meanCalculator);
        }
        meanCalculator.m23876a(f);
        if (str.equals("__container")) {
            for (InterfaceC3515b interfaceC3515b : this.f2257b) {
                interfaceC3515b.m103240a(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m103242b(boolean z) {
        this.f2256a = z;
    }
}
