package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class SlidingPercentile {

    /* renamed from: h */
    private static final Comparator<Sample> f35893h = new Comparator() { // from class: com.google.android.exoplayer2.upstream.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.m72753b((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
        }
    };

    /* renamed from: i */
    private static final Comparator<Sample> f35894i = new Comparator() { // from class: com.google.android.exoplayer2.upstream.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.m72754a((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
        }
    };

    /* renamed from: a */
    private final int f35895a;

    /* renamed from: e */
    private int f35899e;

    /* renamed from: f */
    private int f35900f;

    /* renamed from: g */
    private int f35901g;

    /* renamed from: c */
    private final Sample[] f35897c = new Sample[5];

    /* renamed from: b */
    private final ArrayList<Sample> f35896b = new ArrayList<>();

    /* renamed from: d */
    private int f35898d = -1;

    /* loaded from: classes4.dex */
    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    public SlidingPercentile(int i) {
        this.f35895a = i;
    }

    /* renamed from: a */
    public static /* synthetic */ int m72754a(Sample sample, Sample sample2) {
        return m72749f(sample, sample2);
    }

    /* renamed from: b */
    public static /* synthetic */ int m72753b(Sample sample, Sample sample2) {
        return m72750e(sample, sample2);
    }

    /* renamed from: c */
    private void m72752c() {
        if (this.f35898d != 1) {
            Collections.sort(this.f35896b, f35893h);
            this.f35898d = 1;
        }
    }

    /* renamed from: d */
    private void m72751d() {
        if (this.f35898d != 0) {
            Collections.sort(this.f35896b, f35894i);
            this.f35898d = 0;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ int m72750e(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    /* renamed from: f */
    public static /* synthetic */ int m72749f(Sample sample, Sample sample2) {
        return Float.compare(sample.value, sample2.value);
    }

    public void addSample(int i, float f) {
        Sample sample;
        m72752c();
        int i2 = this.f35901g;
        if (i2 > 0) {
            Sample[] sampleArr = this.f35897c;
            int i3 = i2 - 1;
            this.f35901g = i3;
            sample = sampleArr[i3];
        } else {
            sample = new Sample();
        }
        int i4 = this.f35899e;
        this.f35899e = i4 + 1;
        sample.index = i4;
        sample.weight = i;
        sample.value = f;
        this.f35896b.add(sample);
        this.f35900f += i;
        while (true) {
            int i5 = this.f35900f;
            int i6 = this.f35895a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                Sample sample2 = this.f35896b.get(0);
                int i8 = sample2.weight;
                if (i8 <= i7) {
                    this.f35900f -= i8;
                    this.f35896b.remove(0);
                    int i9 = this.f35901g;
                    if (i9 < 5) {
                        Sample[] sampleArr2 = this.f35897c;
                        this.f35901g = i9 + 1;
                        sampleArr2[i9] = sample2;
                    }
                } else {
                    sample2.weight = i8 - i7;
                    this.f35900f -= i7;
                }
            } else {
                return;
            }
        }
    }

    public float getPercentile(float f) {
        ArrayList<Sample> arrayList;
        m72751d();
        float f2 = f * this.f35900f;
        int i = 0;
        for (int i2 = 0; i2 < this.f35896b.size(); i2++) {
            Sample sample = this.f35896b.get(i2);
            i += sample.weight;
            if (i >= f2) {
                return sample.value;
            }
        }
        if (this.f35896b.isEmpty()) {
            return Float.NaN;
        }
        return this.f35896b.get(arrayList.size() - 1).value;
    }

    public void reset() {
        this.f35896b.clear();
        this.f35898d = -1;
        this.f35899e = 0;
        this.f35900f = 0;
    }
}
