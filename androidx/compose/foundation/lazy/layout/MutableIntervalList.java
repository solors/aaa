package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntervalList.kt */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    @NotNull
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    @Nullable
    private IntervalList.Interval<T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i) {
        boolean z = false;
        if (i >= 0 && i < getSize()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + ", size " + getSize());
    }

    private final boolean contains(IntervalList.Interval<T> interval, int i) {
        int startIndex = interval.getStartIndex();
        if (i >= interval.getStartIndex() + interval.getSize() || startIndex > i) {
            return false;
        }
        return true;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i) {
        int binarySearch;
        IntervalList.Interval<T> interval = this.lastInterval;
        if (interval == null || !contains(interval, i)) {
            MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
            binarySearch = IntervalListKt.binarySearch(mutableVector, i);
            IntervalList.Interval<T> interval2 = mutableVector.getContent()[binarySearch];
            this.lastInterval = interval2;
            return interval2;
        }
        return interval;
    }

    public final void addInterval(int i, T t) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return;
            }
            IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i, t);
            this.size = getSize() + i;
            this.intervals.add(interval);
            return;
        }
        throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i, int i2, @NotNull Function1<? super IntervalList.Interval<T>, Unit> block) {
        boolean z;
        int binarySearch;
        Intrinsics.checkNotNullParameter(block, "block");
        checkIndexBounds(i);
        checkIndexBounds(i2);
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            binarySearch = IntervalListKt.binarySearch(this.intervals, i);
            int startIndex = this.intervals.getContent()[binarySearch].getStartIndex();
            while (startIndex <= i2) {
                IntervalList.Interval<T> interval = this.intervals.getContent()[binarySearch];
                block.invoke(interval);
                startIndex += interval.getSize();
                binarySearch++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    @NotNull
    public IntervalList.Interval<T> get(int i) {
        checkIndexBounds(i);
        return getIntervalForIndex(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
