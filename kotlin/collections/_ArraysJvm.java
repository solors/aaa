package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.collections.o */
/* loaded from: classes7.dex */
public class _ArraysJvm extends Arrays {
    @NotNull
    /* renamed from: A */
    public static int[] m17407A(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        Intrinsics.m17074g(copyOf);
        return copyOf;
    }

    @NotNull
    /* renamed from: B */
    public static int[] m17406B(@NotNull int[] iArr, @NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.m17074g(copyOf);
        return copyOf;
    }

    @NotNull
    /* renamed from: C */
    public static <T> T[] m17405C(@NotNull T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        Intrinsics.m17074g(tArr2);
        return tArr2;
    }

    @NotNull
    /* renamed from: D */
    public static <T> T[] m17404D(@NotNull T[] tArr, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.m17074g(tArr2);
        return tArr2;
    }

    /* renamed from: E */
    public static <T> void m17403E(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: F */
    public static final <T> void m17402F(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: G */
    public static <T> void m17401G(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    @NotNull
    /* renamed from: H */
    public static <T extends Comparable<? super T>> SortedSet<T> m17400H(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) _Arrays.m17300z0(tArr, new TreeSet());
    }

    @NotNull
    /* renamed from: f */
    public static <T> List<T> m17399f(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> m17296a = ArraysUtilJVM.m17296a(tArr);
        Intrinsics.checkNotNullExpressionValue(m17296a, "asList(...)");
        return m17296a;
    }

    @NotNull
    /* renamed from: g */
    public static byte[] m17398g(@NotNull byte[] bArr, @NotNull byte[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
        return destination;
    }

    @NotNull
    /* renamed from: h */
    public static char[] m17397h(@NotNull char[] cArr, @NotNull char[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i2, destination, i, i3 - i2);
        return destination;
    }

    @NotNull
    /* renamed from: i */
    public static float[] m17396i(@NotNull float[] fArr, @NotNull float[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i2, destination, i, i3 - i2);
        return destination;
    }

    @NotNull
    /* renamed from: j */
    public static int[] m17395j(@NotNull int[] iArr, @NotNull int[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
        return destination;
    }

    @NotNull
    /* renamed from: k */
    public static long[] m17394k(@NotNull long[] jArr, @NotNull long[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i2, destination, i, i3 - i2);
        return destination;
    }

    @NotNull
    /* renamed from: l */
    public static <T> T[] m17393l(@NotNull T[] tArr, @NotNull T[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i2, destination, i, i3 - i2);
        return destination;
    }

    /* renamed from: m */
    public static /* synthetic */ byte[] m17392m(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        byte[] m17398g;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m17398g = m17398g(bArr, bArr2, i, i2, i3);
        return m17398g;
    }

    /* renamed from: n */
    public static /* synthetic */ float[] m17391n(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        float[] m17396i;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        m17396i = m17396i(fArr, fArr2, i, i2, i3);
        return m17396i;
    }

    /* renamed from: o */
    public static /* synthetic */ int[] m17390o(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        int[] m17395j;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        m17395j = m17395j(iArr, iArr2, i, i2, i3);
        return m17395j;
    }

    /* renamed from: p */
    public static /* synthetic */ Object[] m17389p(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        Object[] m17393l;
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m17393l = m17393l(objArr, objArr2, i, i2, i3);
        return m17393l;
    }

    @NotNull
    /* renamed from: q */
    public static byte[] m17388q(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysJVM.m17417b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @NotNull
    /* renamed from: r */
    public static float[] m17387r(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArraysJVM.m17417b(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @NotNull
    /* renamed from: s */
    public static <T> T[] m17386s(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysJVM.m17417b(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    /* renamed from: t */
    public static final void m17385t(@NotNull float[] fArr, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i, i2, f);
    }

    /* renamed from: u */
    public static void m17384u(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: v */
    public static <T> void m17383v(@NotNull T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: w */
    public static /* synthetic */ void m17382w(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        m17385t(fArr, f, i, i2);
    }

    /* renamed from: x */
    public static /* synthetic */ void m17381x(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m17384u(iArr, i, i2, i3);
    }

    /* renamed from: y */
    public static /* synthetic */ void m17380y(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m17383v(objArr, obj, i, i2);
    }

    @NotNull
    /* renamed from: z */
    public static byte[] m17379z(@NotNull byte[] bArr, @NotNull byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.m17074g(copyOf);
        return copyOf;
    }
}
