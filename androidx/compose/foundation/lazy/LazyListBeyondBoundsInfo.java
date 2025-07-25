package androidx.compose.foundation.lazy;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListBeyondBoundsInfo.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyListBeyondBoundsInfo {
    @NotNull
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    /* compiled from: LazyListBeyondBoundsInfo.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Interval {
        private final int end;
        private final int start;

        public Interval(int i, int i2) {
            boolean z;
            this.start = i;
            this.end = i2;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 >= i) {
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = interval.start;
            }
            if ((i3 & 2) != 0) {
                i2 = interval.end;
            }
            return interval.copy(i, i2);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        @NotNull
        public final Interval copy(int i, int i2) {
            return new Interval(i, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            if (this.start == interval.start && this.end == interval.end) {
                return true;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        @NotNull
        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    @NotNull
    public final Interval addInterval(int i, int i2) {
        Interval interval = new Interval(i, i2);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i = 0;
            do {
                Interval interval = content[i];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i++;
            } while (i < size);
            return end;
        }
        return end;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getStart() {
        /*
            r7 = this;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval> r0 = r7.beyondBoundsItems
            java.lang.Object r0 = r0.first()
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval r0 = (androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval) r0
            int r0 = r0.getStart()
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval> r1 = r7.beyondBoundsItems
            int r2 = r1.getSize()
            r3 = 0
            if (r2 <= 0) goto L2c
            java.lang.Object[] r1 = r1.getContent()
            r4 = r3
        L1a:
            r5 = r1[r4]
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval r5 = (androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval) r5
            int r6 = r5.getStart()
            if (r6 >= r0) goto L28
            int r0 = r5.getStart()
        L28:
            int r4 = r4 + 1
            if (r4 < r2) goto L1a
        L2c:
            if (r0 < 0) goto L2f
            r3 = 1
        L2f:
            if (r3 == 0) goto L32
            return r0
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.getStart():int");
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.isNotEmpty();
    }

    public final void removeInterval(@NotNull Interval interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.beyondBoundsItems.remove(interval);
    }
}
