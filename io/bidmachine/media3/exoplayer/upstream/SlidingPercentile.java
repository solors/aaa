package io.bidmachine.media3.exoplayer.upstream;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.upstream.SlidingPercentile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@UnstableApi
/* loaded from: classes9.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<C36461b> INDEX_COMPARATOR = new Comparator() { // from class: io.bidmachine.media3.exoplayer.upstream.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.m19665a((SlidingPercentile.C36461b) obj, (SlidingPercentile.C36461b) obj2);
        }
    };
    private static final Comparator<C36461b> VALUE_COMPARATOR = new Comparator() { // from class: io.bidmachine.media3.exoplayer.upstream.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return SlidingPercentile.m19664b((SlidingPercentile.C36461b) obj, (SlidingPercentile.C36461b) obj2);
        }
    };
    private final C36461b[] recycledSamples = new C36461b[5];
    private final ArrayList<C36461b> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    /* renamed from: io.bidmachine.media3.exoplayer.upstream.SlidingPercentile$b */
    /* loaded from: classes9.dex */
    public static class C36461b {
        public int index;
        public float value;
        public int weight;

        private C36461b() {
        }
    }

    public SlidingPercentile(int i) {
        this.maxWeight = i;
    }

    /* renamed from: a */
    public static /* synthetic */ int m19665a(C36461b c36461b, C36461b c36461b2) {
        return lambda$static$0(c36461b, c36461b2);
    }

    /* renamed from: b */
    public static /* synthetic */ int m19664b(C36461b c36461b, C36461b c36461b2) {
        return lambda$static$1(c36461b, c36461b2);
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    public static /* synthetic */ int lambda$static$0(C36461b c36461b, C36461b c36461b2) {
        return c36461b.index - c36461b2.index;
    }

    public static /* synthetic */ int lambda$static$1(C36461b c36461b, C36461b c36461b2) {
        return Float.compare(c36461b.value, c36461b2.value);
    }

    public void addSample(int i, float f) {
        C36461b c36461b;
        ensureSortedByIndex();
        int i2 = this.recycledSampleCount;
        if (i2 > 0) {
            C36461b[] c36461bArr = this.recycledSamples;
            int i3 = i2 - 1;
            this.recycledSampleCount = i3;
            c36461b = c36461bArr[i3];
        } else {
            c36461b = new C36461b();
        }
        int i4 = this.nextSampleIndex;
        this.nextSampleIndex = i4 + 1;
        c36461b.index = i4;
        c36461b.weight = i;
        c36461b.value = f;
        this.samples.add(c36461b);
        this.totalWeight += i;
        while (true) {
            int i5 = this.totalWeight;
            int i6 = this.maxWeight;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C36461b c36461b2 = this.samples.get(0);
                int i8 = c36461b2.weight;
                if (i8 <= i7) {
                    this.totalWeight -= i8;
                    this.samples.remove(0);
                    int i9 = this.recycledSampleCount;
                    if (i9 < 5) {
                        C36461b[] c36461bArr2 = this.recycledSamples;
                        this.recycledSampleCount = i9 + 1;
                        c36461bArr2[i9] = c36461b2;
                    }
                } else {
                    c36461b2.weight = i8 - i7;
                    this.totalWeight -= i7;
                }
            } else {
                return;
            }
        }
    }

    public float getPercentile(float f) {
        ArrayList<C36461b> arrayList;
        ensureSortedByValue();
        float f2 = f * this.totalWeight;
        int i = 0;
        for (int i2 = 0; i2 < this.samples.size(); i2++) {
            C36461b c36461b = this.samples.get(i2);
            i += c36461b.weight;
            if (i >= f2) {
                return c36461b.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        return this.samples.get(arrayList.size() - 1).value;
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }
}
