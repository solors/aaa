package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.MutableCollections;
import kotlin.collections.PrimitiveIterators;
import kotlin.collections.SetsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver {
    @NotNull
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Match {
        @NotNull
        private final List<Integer> resultIndices;
        @NotNull
        private final PrimitiveRanges resultRange;

        public Match(@NotNull PrimitiveRanges resultRange, @NotNull List<Integer> resultIndices) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        @NotNull
        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        @NotNull
        public final PrimitiveRanges getResultRange() {
            return this.resultRange;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class ResultColumn {
        private final int index;
        @NotNull
        private final String name;

        public ResultColumn(@NotNull String name, int i) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.index = i;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i2 & 2) != 0) {
                i = resultColumn.index;
            }
            return resultColumn.copy(str, i);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        @NotNull
        public final ResultColumn copy(@NotNull String name, int i) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ResultColumn(name, i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            if (Intrinsics.m17075f(this.name, resultColumn.name) && this.index == resultColumn.index) {
                return true;
            }
            return false;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        @NotNull
        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Solution implements Comparable<Solution> {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final Solution NO_SOLUTION;
        private final int coverageOffset;
        @NotNull
        private final List<Match> matches;
        private final int overlaps;

        /* compiled from: AmbiguousColumnResolver.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Solution build(@NotNull List<Match> matches) {
                boolean z;
                Intrinsics.checkNotNullParameter(matches, "matches");
                List<Match> list = matches;
                int i = 0;
                int i2 = 0;
                for (Match match : list) {
                    i2 += ((match.getResultRange().m16952d() - match.getResultRange().m16953c()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    int m16953c = ((Match) it.next()).getResultRange().m16953c();
                    while (it.hasNext()) {
                        int m16953c2 = ((Match) it.next()).getResultRange().m16953c();
                        if (m16953c > m16953c2) {
                            m16953c = m16953c2;
                        }
                    }
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        int m16952d = ((Match) it2.next()).getResultRange().m16952d();
                        while (it2.hasNext()) {
                            int m16952d2 = ((Match) it2.next()).getResultRange().m16952d();
                            if (m16952d < m16952d2) {
                                m16952d = m16952d2;
                            }
                        }
                        PrimitiveRanges primitiveRanges = new PrimitiveRanges(m16953c, m16952d);
                        if (!(primitiveRanges instanceof Collection) || !((Collection) primitiveRanges).isEmpty()) {
                            Iterator<Integer> it3 = primitiveRanges.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                int nextInt = ((PrimitiveIterators) it3).nextInt();
                                Iterator<T> it4 = list.iterator();
                                int i4 = 0;
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (((Match) it4.next()).getResultRange().m16968i(nextInt)) {
                                            i4++;
                                            continue;
                                        }
                                        if (i4 > 1) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (z && (i3 = i3 + 1) < 0) {
                                    C37563v.m17157v();
                                }
                            }
                            i = i3;
                        }
                        return new Solution(matches, i2, i);
                    }
                    throw new NoSuchElementException();
                }
                throw new NoSuchElementException();
            }

            @NotNull
            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }
        }

        static {
            List m17166m;
            m17166m = C37563v.m17166m();
            NO_SOLUTION = new Solution(m17166m, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public Solution(@NotNull List<Match> matches, int i, int i2) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i;
            this.overlaps = i2;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        @NotNull
        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull Solution other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int m17071j = Intrinsics.m17071j(this.overlaps, other.overlaps);
            return m17071j != 0 ? m17071j : Intrinsics.m17071j(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i, Function1<? super List<? extends T>, Unit> function1) {
        List m17553Z0;
        if (i == list.size()) {
            m17553Z0 = _Collections.m17553Z0(list2);
            function1.invoke(m17553Z0);
            return;
        }
        for (T t : list.get(i)) {
            list2.add(t);
            INSTANCE.dfs(list, list2, i + 1, function1);
            MutableCollections.m17611Q(list2);
        }
    }

    static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i, function1);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, InterfaceC45268n<? super Integer, ? super Integer, ? super List<ResultColumn>, Unit> interfaceC45268n) {
        int i = 0;
        int i2 = 0;
        for (String str : strArr) {
            i2 += str.hashCode();
        }
        int length = strArr.length;
        int i3 = 0;
        for (ResultColumn resultColumn : list.subList(0, length)) {
            i3 += resultColumn.getName().hashCode();
        }
        while (true) {
            if (i2 == i3) {
                interfaceC45268n.invoke(Integer.valueOf(i), Integer.valueOf(length), list.subList(i, length));
            }
            i++;
            length++;
            if (length > list.size()) {
                return;
            }
            i3 = (i3 - list.get(i - 1).getName().hashCode()) + list.get(length - 1).getName().hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @NotNull
    public static final int[][] resolve(@NotNull String[] resultColumns, @NotNull String[][] mappings) {
        boolean z;
        Set m17129b;
        Set m17130a;
        List m17177c;
        List<ResultColumn> m17179a;
        int m17154x;
        int[] m17554Y0;
        List m17177c2;
        List m17179a2;
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                break;
            }
            String str = resultColumns[i2];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i2] = lowerCase;
            i2++;
        }
        int length2 = mappings.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int length3 = mappings[i3].length;
            for (int i4 = 0; i4 < length3; i4++) {
                String[] strArr = mappings[i3];
                String str2 = strArr[i4];
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = str2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i4] = lowerCase2;
            }
        }
        m17129b = SetsJVM.m17129b();
        for (String[] strArr2 : mappings) {
            MutableCollections.m17622F(m17129b, strArr2);
        }
        m17130a = SetsJVM.m17130a(m17129b);
        m17177c = CollectionsJVM.m17177c();
        int length4 = resultColumns.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length4) {
            String str3 = resultColumns[i5];
            int i7 = i6 + 1;
            if (m17130a.contains(str3)) {
                m17177c.add(new ResultColumn(str3, i6));
            }
            i5++;
            i6 = i7;
        }
        m17179a = CollectionsJVM.m17179a(m17177c);
        int length5 = mappings.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i8 = 0; i8 < length5; i8++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length6) {
            String[] strArr3 = mappings[i9];
            int i11 = i10 + 1;
            INSTANCE.rabinKarpSearch(m17179a, strArr3, new AmbiguousColumnResolver$resolve$1$1(strArr3, arrayList, i10));
            if (((List) arrayList.get(i10)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i12 = i; i12 < length7; i12++) {
                    String str4 = strArr3[i12];
                    m17177c2 = CollectionsJVM.m17177c();
                    for (ResultColumn resultColumn : m17179a) {
                        if (Intrinsics.m17075f(str4, resultColumn.getName())) {
                            m17177c2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    m17179a2 = CollectionsJVM.m17179a(m17177c2);
                    if (!m17179a2.isEmpty()) {
                        arrayList2.add(m17179a2);
                    } else {
                        throw new IllegalStateException(("Column " + str4 + " not found in result").toString());
                    }
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new AmbiguousColumnResolver$resolve$1$2(arrayList, i10), 6, null);
            }
            i9++;
            i10 = i11;
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(!((List) it.next()).isEmpty())) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            C37609n0 c37609n0 = new C37609n0();
            c37609n0.f99327b = Solution.Companion.getNO_SOLUTION();
            dfs$default(INSTANCE, arrayList, null, 0, new AmbiguousColumnResolver$resolve$4(c37609n0), 6, null);
            List<Match> matches = ((Solution) c37609n0.f99327b).getMatches();
            m17154x = C37566w.m17154x(matches, 10);
            ArrayList arrayList3 = new ArrayList(m17154x);
            for (Match match : matches) {
                m17554Y0 = _Collections.m17554Y0(match.getResultIndices());
                arrayList3.add(m17554Y0);
            }
            Object[] array = arrayList3.toArray(new int[0]);
            Intrinsics.m17073h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (int[][]) array;
        }
        throw new IllegalStateException("Failed to find matches for all mappings".toString());
    }
}
