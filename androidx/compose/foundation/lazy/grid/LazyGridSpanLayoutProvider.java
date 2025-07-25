package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridSpanLayoutProvider.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    @NotNull
    private final ArrayList<Bucket> buckets;
    @NotNull
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    @NotNull
    private final LazyGridItemsSnapshot itemsSnapshot;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    @NotNull
    private List<LazyGridSpan> previousDefaultSpans;
    private int slotsPerLine;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        @NotNull
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i) {
            maxCurrentLineSpan = i;
        }

        public void setMaxLineSpan(int i) {
            maxLineSpan = i;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;
        @NotNull
        private final List<LazyGridSpan> spans;

        public LineConfiguration(int i, @NotNull List<LazyGridSpan> spans) {
            Intrinsics.checkNotNullParameter(spans, "spans");
            this.firstItemIndex = i;
            this.spans = spans;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        @NotNull
        public final List<LazyGridSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(@NotNull LazyGridItemsSnapshot itemsSnapshot) {
        List<LazyGridSpan> m17166m;
        Intrinsics.checkNotNullParameter(itemsSnapshot, "itemsSnapshot");
        this.itemsSnapshot = itemsSnapshot;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        arrayList.add(new Bucket(0, 0, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        m17166m = C37563v.m17166m();
        this.previousDefaultSpans = m17166m;
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<LazyGridSpan> getDefaultSpans(int i) {
        if (i == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(LazyGridSpan.m106454boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        this.buckets.add(new Bucket(0, 0, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    private final int spanOf(int i, int i2) {
        int m16908n;
        LazyGridItemsSnapshot lazyGridItemsSnapshot = this.itemsSnapshot;
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i2);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        m16908n = _Ranges.m16908n(LazyGridSpan.m106458getCurrentLineSpanimpl(lazyGridItemsSnapshot.m106489getSpan_orMbw(lazyGridItemSpanScopeImpl, i)), 1, this.slotsPerLine);
        return m16908n;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[LOOP:0: B:35:0x00ae->B:84:0x00ae, LOOP_START, PHI: r2 r4 r5 
      PHI: (r2v10 int) = (r2v9 int), (r2v14 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v6 int) = (r4v5 int), (r4v7 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v6 int) = (r5v5 int), (r5v14 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r12) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    /* renamed from: getLineIndexOfItem--_Ze7BM  reason: not valid java name */
    public final int m106506getLineIndexOfItem_Ze7BM(int i) {
        boolean z;
        int m17168k;
        boolean z2;
        int i2;
        if (getTotalSize() <= 0) {
            return LineIndex.m106516constructorimpl(0);
        }
        if (i < getTotalSize()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.itemsSnapshot.getHasCustomSpans()) {
                m17168k = C37563v.m17168k(this.buckets, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i), 3, null);
                if (m17168k < 0) {
                    m17168k = (-m17168k) - 2;
                }
                int bucketSize = getBucketSize() * m17168k;
                int firstItemIndex = this.buckets.get(m17168k).getFirstItemIndex();
                if (firstItemIndex <= i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i3 = 0;
                    while (firstItemIndex < i) {
                        int i4 = firstItemIndex + 1;
                        int spanOf = spanOf(firstItemIndex, this.slotsPerLine - i3);
                        i3 += spanOf;
                        int i5 = this.slotsPerLine;
                        if (i3 >= i5) {
                            if (i3 == i5) {
                                bucketSize++;
                                i3 = 0;
                            } else {
                                bucketSize++;
                                i3 = spanOf;
                            }
                        }
                        if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                            ArrayList<Bucket> arrayList = this.buckets;
                            if (i3 > 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            arrayList.add(new Bucket(i4 - i2, 0, 2, null));
                        }
                        firstItemIndex = i4;
                    }
                    if (i3 + spanOf(i, this.slotsPerLine - i3) > this.slotsPerLine) {
                        bucketSize++;
                    }
                    return LineIndex.m106516constructorimpl(bucketSize);
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return LineIndex.m106516constructorimpl(i / this.slotsPerLine);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.itemsSnapshot.getItemsCount();
    }

    public final void setSlotsPerLine(int i) {
        if (i != this.slotsPerLine) {
            this.slotsPerLine = i;
            invalidateCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i, int i2) {
            this.firstItemIndex = i;
            this.firstItemKnownSpan = i2;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ Bucket(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
