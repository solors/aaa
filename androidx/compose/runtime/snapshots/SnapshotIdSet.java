package androidx.compose.runtime.snapshots;

import ae.KMarkers;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37566w;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37650l;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotIdSet.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, KMarkers {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    @Nullable
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    /* compiled from: SnapshotIdSet.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = i;
        this.belowBound = iArr;
    }

    @NotNull
    public final SnapshotIdSet and(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (Intrinsics.m17075f(bits, snapshotIdSet)) {
            return snapshotIdSet;
        }
        if (Intrinsics.m17075f(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j = this.upperSet;
                long j2 = bits.upperSet;
                long j3 = this.lowerSet;
                long j4 = bits.lowerSet;
                long j5 = j3 & j4;
                if ((j & j2) != 0 || j5 != 0 || iArr2 != null) {
                    return new SnapshotIdSet(j2 & j, j3 & j4, i2, iArr2);
                }
                return snapshotIdSet;
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (bits.get(intValue)) {
                    snapshotIdSet = snapshotIdSet.set(intValue);
                }
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = bits.iterator();
        while (it2.hasNext()) {
            int intValue2 = it2.next().intValue();
            if (get(intValue2)) {
                snapshotIdSet = snapshotIdSet.set(intValue2);
            }
        }
        return snapshotIdSet;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i2, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        SnapshotIdSet snapshotIdSet2 = this;
        while (it.hasNext()) {
            snapshotIdSet2 = snapshotIdSet2.clear(it.next().intValue());
        }
        return snapshotIdSet2;
    }

    @NotNull
    public final SnapshotIdSet clear(int i) {
        int[] iArr;
        int binarySearch;
        int i2 = this.lowerBound;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.lowerSet;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.upperSet, j2 & (~j), i2, this.belowBound);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.upperSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.lowerSet, i2, this.belowBound);
            }
        } else if (i3 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[length];
            if (binarySearch > 0) {
                _ArraysJvm.m17395j(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < length) {
                _ArraysJvm.m17395j(iArr, iArr2, binarySearch, binarySearch + 1, length + 1);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final void fastForEach(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i : iArr) {
                block.invoke(Integer.valueOf(i));
            }
        }
        if (this.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.lowerSet & (1 << i2)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i2));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.upperSet & (1 << i3)) != 0) {
                    block.invoke(Integer.valueOf(i3 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final boolean get(int i) {
        int[] iArr;
        int i2 = i - this.lowerBound;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            if (((1 << i2) & this.lowerSet) != 0) {
                return true;
            }
            return false;
        } else if (i2 >= 64 && i2 < 128) {
            if (((1 << (i2 - 64)) & this.upperSet) != 0) {
                return true;
            }
            return false;
        } else if (i2 > 0 || (iArr = this.belowBound) == null) {
            return false;
        } else {
            if (SnapshotIdSetKt.binarySearch(iArr, i) < 0) {
                z = false;
            }
            return z;
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        Sequence m16842b;
        m16842b = C37650l.m16842b(new SnapshotIdSet$iterator$1(this, null));
        return m16842b.iterator();
    }

    public final int lowest(int i) {
        int lowestBitOf;
        int lowestBitOf2;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.lowerSet;
        if (j != 0) {
            int i2 = this.lowerBound;
            lowestBitOf2 = SnapshotIdSetKt.lowestBitOf(j);
            return i2 + lowestBitOf2;
        }
        long j2 = this.upperSet;
        if (j2 != 0) {
            lowestBitOf = SnapshotIdSetKt.lowestBitOf(j2);
            return this.lowerBound + 64 + lowestBitOf;
        }
        return i;
    }

    @NotNull
    /* renamed from: or */
    public final SnapshotIdSet m105429or(@NotNull SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        int i = bits.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i2, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.set(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        SnapshotIdSet snapshotIdSet2 = this;
        while (it2.hasNext()) {
            snapshotIdSet2 = snapshotIdSet2.set(it2.next().intValue());
        }
        return snapshotIdSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r3 = kotlin.collections._Collections.m17554Y0(r9);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.SnapshotIdSet set(int r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.set(int):androidx.compose.runtime.snapshots.SnapshotIdSet");
    }

    @NotNull
    public String toString() {
        int m17154x;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        m17154x = C37566w.m17154x(this, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(ListUtils.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
