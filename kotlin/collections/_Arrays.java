package kotlin.collections;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37598c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.text.Appendable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.collections.p */
/* loaded from: classes7.dex */
public class _Arrays extends _ArraysJvm {

    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.collections.p$a */
    /* loaded from: classes7.dex */
    public static final class C37555a<T> implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f99261a;

        public C37555a(Object[] objArr) {
            this.f99261a = objArr;
        }

        @Override // kotlin.sequences.Sequence
        @NotNull
        public Iterator<T> iterator() {
            return C37598c.m17055a(this.f99261a);
        }
    }

    /* compiled from: _Arrays.kt */
    @Metadata
    /* renamed from: kotlin.collections.p$b */
    /* loaded from: classes7.dex */
    public static final class C37556b<T> extends Lambda implements Functions<Iterator<? extends T>> {

        /* renamed from: g */
        final /* synthetic */ T[] f99262g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37556b(T[] tArr) {
            super(0);
            this.f99262g = tArr;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final Iterator<T> invoke() {
            return C37598c.m17055a(this.f99262g);
        }
    }

    @NotNull
    /* renamed from: A0 */
    public static HashSet<Integer> m17351A0(@NotNull int[] iArr) {
        int m17292f;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        m17292f = MapsJVM.m17292f(iArr.length);
        return (HashSet) m17301y0(iArr, new HashSet(m17292f));
    }

    @NotNull
    /* renamed from: B0 */
    public static <T> HashSet<T> m17350B0(@NotNull T[] tArr) {
        int m17292f;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        m17292f = MapsJVM.m17292f(tArr.length);
        return (HashSet) m17300z0(tArr, new HashSet(m17292f));
    }

    @NotNull
    /* renamed from: C0 */
    public static List<Integer> m17349C0(@NotNull int[] iArr) {
        List<Integer> m17166m;
        List<Integer> m17175e;
        List<Integer> m17347E0;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            m17166m = C37563v.m17166m();
            return m17166m;
        } else if (length != 1) {
            m17347E0 = m17347E0(iArr);
            return m17347E0;
        } else {
            m17175e = CollectionsJVM.m17175e(Integer.valueOf(iArr[0]));
            return m17175e;
        }
    }

    @NotNull
    /* renamed from: D0 */
    public static <T> List<T> m17348D0(@NotNull T[] tArr) {
        List<T> m17166m;
        List<T> m17175e;
        List<T> m17346F0;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            m17166m = C37563v.m17166m();
            return m17166m;
        } else if (length != 1) {
            m17346F0 = m17346F0(tArr);
            return m17346F0;
        } else {
            m17175e = CollectionsJVM.m17175e(tArr[0]);
            return m17175e;
        }
    }

    @NotNull
    /* renamed from: E0 */
    public static List<Integer> m17347E0(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: F0 */
    public static <T> List<T> m17346F0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(C37563v.m17171h(tArr));
    }

    @NotNull
    /* renamed from: G0 */
    public static <T> Set<T> m17345G0(@NotNull T[] tArr) {
        Set<T> m17123f;
        Set<T> m17127d;
        int m17292f;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            m17123f = C37572z0.m17123f();
            return m17123f;
        } else if (length != 1) {
            m17292f = MapsJVM.m17292f(tArr.length);
            return (Set) m17300z0(tArr, new LinkedHashSet(m17292f));
        } else {
            m17127d = SetsJVM.m17127d(tArr[0]);
            return m17127d;
        }
    }

    @NotNull
    /* renamed from: H0 */
    public static <T> Iterable<IndexedValue<T>> m17344H0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new Iterables(new C37556b(tArr));
    }

    @NotNull
    /* renamed from: I */
    public static <T> Sequence<T> m17343I(@NotNull T[] tArr) {
        boolean z;
        Sequence<T> m16839e;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m16839e = C37653n.m16839e();
            return m16839e;
        }
        return new C37555a(tArr);
    }

    /* renamed from: J */
    public static boolean m17342J(@NotNull byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (m17323c0(bArr, b) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m17341K(@NotNull char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (m17322d0(cArr, c) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m17340L(@NotNull int[] iArr, int i) {
        int m17321e0;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        m17321e0 = m17321e0(iArr, i);
        if (m17321e0 >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m17339M(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (m17320f0(jArr, j) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static <T> boolean m17338N(@NotNull T[] tArr, T t) {
        int m17319g0;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        m17319g0 = m17319g0(tArr, t);
        if (m17319g0 >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m17337O(@NotNull short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (m17318h0(sArr, s) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: P */
    public static <T> List<T> m17336P(@NotNull T[] tArr, int i) {
        boolean z;
        int m16917e;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m16917e = _Ranges.m16917e(tArr.length - i, 0);
            return m17302x0(tArr, m16917e);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @NotNull
    /* renamed from: Q */
    public static <T> List<T> m17335Q(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) m17334R(tArr, new ArrayList());
    }

    @NotNull
    /* renamed from: R */
    public static final <C extends Collection<? super T>, T> C m17334R(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : tArr) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    /* renamed from: S */
    public static float m17333S(@NotNull float[] fArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: T */
    public static int m17332T(@NotNull int[] iArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: U */
    public static <T> T m17331U(@NotNull T[] tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    /* renamed from: V */
    public static <T> T m17330V(@NotNull T[] tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[0];
    }

    @NotNull
    /* renamed from: W */
    public static PrimitiveRanges m17329W(@NotNull int[] iArr) {
        int m17327Y;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        m17327Y = m17327Y(iArr);
        return new PrimitiveRanges(0, m17327Y);
    }

    /* renamed from: X */
    public static int m17328X(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    /* renamed from: Y */
    public static int m17327Y(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: Z */
    public static int m17326Z(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: a0 */
    public static <T> int m17325a0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    @Nullable
    /* renamed from: b0 */
    public static <T> T m17324b0(@NotNull T[] tArr, int i) {
        int m17325a0;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i >= 0) {
            m17325a0 = m17325a0(tArr);
            if (i <= m17325a0) {
                return tArr[i];
            }
        }
        return null;
    }

    /* renamed from: c0 */
    public static final int m17323c0(@NotNull byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d0 */
    public static final int m17322d0(@NotNull char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e0 */
    public static int m17321e0(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: f0 */
    public static final int m17320f0(@NotNull long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g0 */
    public static <T> int m17319g0(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (Intrinsics.m17075f(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: h0 */
    public static final int m17318h0(@NotNull short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @NotNull
    /* renamed from: i0 */
    public static final <T, A extends Appendable> A m17317i0(@NotNull T[] tArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            Appendable.m16654a(buffer, t, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: j0 */
    public static /* synthetic */ Appendable m17316j0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        Function1 function12;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = APSSharedUtil.TRUNCATE_SEPARATOR;
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return m17317i0(objArr, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    @NotNull
    /* renamed from: k0 */
    public static <T> String m17315k0(@NotNull T[] tArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb2 = ((StringBuilder) m17317i0(tArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: l0 */
    public static /* synthetic */ String m17314l0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        String m17315k0;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        m17315k0 = m17315k0(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
        return m17315k0;
    }

    /* renamed from: m0 */
    public static int m17313m0(@NotNull int[] iArr) {
        boolean z;
        int m17327Y;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m17327Y = m17327Y(iArr);
            return iArr[m17327Y];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: n0 */
    public static <T> T m17312n0(@NotNull T[] tArr) {
        boolean z;
        int m17325a0;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m17325a0 = m17325a0(tArr);
            return tArr[m17325a0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: o0 */
    public static <T> int m17311o0(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (Intrinsics.m17075f(t, tArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Nullable
    /* renamed from: p0 */
    public static Float m17310p0(@NotNull Float[] fArr) {
        boolean z;
        int m17325a0;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        m17325a0 = m17325a0(fArr);
        PrimitiveIterators it = new PrimitiveRanges(1, m17325a0).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @Nullable
    /* renamed from: q0 */
    public static Float m17309q0(@NotNull Float[] fArr) {
        boolean z;
        int m17325a0;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        m17325a0 = m17325a0(fArr);
        PrimitiveIterators it = new PrimitiveRanges(1, m17325a0).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @Nullable
    /* renamed from: r0 */
    public static Integer m17308r0(@NotNull int[] iArr) {
        boolean z;
        int m17327Y;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int i = iArr[0];
        m17327Y = m17327Y(iArr);
        PrimitiveIterators it = new PrimitiveRanges(1, m17327Y).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (i > i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: s0 */
    public static char m17307s0(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    /* renamed from: t0 */
    public static <T> T m17306t0(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    /* renamed from: u0 */
    public static <T> List<T> m17305u0(@NotNull T[] tArr, @NotNull PrimitiveRanges indices) {
        Object[] m17386s;
        List<T> m17399f;
        List<T> m17166m;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        m17386s = _ArraysJvm.m17386s(tArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
        m17399f = _ArraysJvm.m17399f(m17386s);
        return m17399f;
    }

    @NotNull
    /* renamed from: v0 */
    public static final <T> T[] m17304v0(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        boolean z;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        _ArraysJvm.m17402F(tArr2, comparator);
        return tArr2;
    }

    @NotNull
    /* renamed from: w0 */
    public static <T> List<T> m17303w0(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        List<T> m17399f;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        m17399f = _ArraysJvm.m17399f(m17304v0(tArr, comparator));
        return m17399f;
    }

    @NotNull
    /* renamed from: x0 */
    public static final <T> List<T> m17302x0(@NotNull T[] tArr, int i) {
        boolean z;
        List<T> m17175e;
        List<T> m17348D0;
        List<T> m17166m;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            int length = tArr.length;
            if (i >= length) {
                m17348D0 = m17348D0(tArr);
                return m17348D0;
            } else if (i == 1) {
                m17175e = CollectionsJVM.m17175e(tArr[length - 1]);
                return m17175e;
            } else {
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = length - i; i2 < length; i2++) {
                    arrayList.add(tArr[i2]);
                }
                return arrayList;
            }
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @NotNull
    /* renamed from: y0 */
    public static final <C extends Collection<? super Integer>> C m17301y0(@NotNull int[] iArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i : iArr) {
            destination.add(Integer.valueOf(i));
        }
        return destination;
    }

    @NotNull
    /* renamed from: z0 */
    public static final <T, C extends Collection<? super T>> C m17300z0(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : tArr) {
            destination.add(t);
        }
        return destination;
    }
}
