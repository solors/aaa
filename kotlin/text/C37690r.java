package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37566w;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.PrimitiveIterators;
import kotlin.collections._Arrays;
import kotlin.collections._ArraysJvm;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* compiled from: Strings.kt */
@Metadata
/* renamed from: kotlin.text.r */
/* loaded from: classes7.dex */
public class C37690r extends StringsJVM {

    /* compiled from: Strings.kt */
    @Metadata
    /* renamed from: kotlin.text.r$a */
    /* loaded from: classes7.dex */
    public static final class C37691a extends Lambda implements Function2<CharSequence, Integer, Tuples<? extends Integer, ? extends Integer>> {

        /* renamed from: g */
        final /* synthetic */ char[] f99489g;

        /* renamed from: h */
        final /* synthetic */ boolean f99490h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37691a(char[] cArr, boolean z) {
            super(2);
            this.f99489g = cArr;
            this.f99490h = z;
        }

        @Nullable
        /* renamed from: a */
        public final Tuples<Integer, Integer> m16542a(@NotNull CharSequence $receiver, int i) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            int m16564f0 = C37690r.m16564f0($receiver, this.f99489g, i, this.f99490h);
            if (m16564f0 < 0) {
                return null;
            }
            return C38513v.m14532a(Integer.valueOf(m16564f0), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Tuples<? extends Integer, ? extends Integer> mo105910invoke(CharSequence charSequence, Integer num) {
            return m16542a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata
    /* renamed from: kotlin.text.r$b */
    /* loaded from: classes7.dex */
    public static final class C37692b extends Lambda implements Function2<CharSequence, Integer, Tuples<? extends Integer, ? extends Integer>> {

        /* renamed from: g */
        final /* synthetic */ List<String> f99491g;

        /* renamed from: h */
        final /* synthetic */ boolean f99492h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37692b(List<String> list, boolean z) {
            super(2);
            this.f99491g = list;
            this.f99492h = z;
        }

        @Nullable
        /* renamed from: a */
        public final Tuples<Integer, Integer> m16541a(@NotNull CharSequence $receiver, int i) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Tuples m16582W = C37690r.m16582W($receiver, this.f99491g, i, this.f99492h, false);
            if (m16582W != null) {
                return C38513v.m14532a(m16582W.m17630c(), Integer.valueOf(((String) m16582W.m17629d()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Tuples<? extends Integer, ? extends Integer> mo105910invoke(CharSequence charSequence, Integer num) {
            return m16541a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata
    /* renamed from: kotlin.text.r$c */
    /* loaded from: classes7.dex */
    public static final class C37693c extends Lambda implements Function1<PrimitiveRanges, String> {

        /* renamed from: g */
        final /* synthetic */ CharSequence f99493g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37693c(CharSequence charSequence) {
            super(1);
            this.f99493g = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final String invoke(@NotNull PrimitiveRanges it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37690r.m16604J0(this.f99493g, it);
        }
    }

    /* renamed from: A0 */
    private static final List<String> m16613A0(CharSequence charSequence, String str, boolean z, int i) {
        List<String> m17175e;
        boolean z2;
        m16545x0(i);
        int i2 = 0;
        int m16574a0 = m16574a0(charSequence, str, 0, z);
        if (m16574a0 == -1 || i == 1) {
            m17175e = CollectionsJVM.m17175e(charSequence.toString());
            return m17175e;
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2) {
            i3 = _Ranges.m16912j(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, m16574a0).toString());
            i2 = str.length() + m16574a0;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            m16574a0 = m16574a0(charSequence, str, i2, z);
        } while (m16574a0 != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: B0 */
    public static /* synthetic */ List m16612B0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m16544y0(charSequence, cArr, z, i);
    }

    /* renamed from: C0 */
    public static /* synthetic */ List m16611C0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m16543z0(charSequence, strArr, z, i);
    }

    @NotNull
    /* renamed from: D0 */
    public static final Sequence<String> m16610D0(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z, int i) {
        Sequence<String> m16804z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        m16804z = _Sequences.m16804z(m16549t0(charSequence, delimiters, 0, z, i, 2, null), new C37693c(charSequence));
        return m16804z;
    }

    /* renamed from: E0 */
    public static /* synthetic */ Sequence m16609E0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m16610D0(charSequence, strArr, z, i);
    }

    /* renamed from: F0 */
    public static final boolean m16608F0(@NotNull CharSequence charSequence, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() <= 0 || !Char.m16759g(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: G0 */
    public static final boolean m16607G0(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, boolean z) {
        boolean m16624M;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z && (charSequence instanceof String) && (prefix instanceof String)) {
            m16624M = StringsJVM.m16624M((String) charSequence, (String) prefix, false, 2, null);
            return m16624M;
        }
        return m16548u0(charSequence, 0, prefix, 0, prefix.length(), z);
    }

    /* renamed from: H0 */
    public static /* synthetic */ boolean m16606H0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m16608F0(charSequence, c, z);
    }

    /* renamed from: I0 */
    public static /* synthetic */ boolean m16605I0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m16607G0(charSequence, charSequence2, z);
    }

    @NotNull
    /* renamed from: J0 */
    public static final String m16604J0(@NotNull CharSequence charSequence, @NotNull PrimitiveRanges range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    @NotNull
    /* renamed from: K0 */
    public static final String m16603K0(@NotNull String str, char c, @NotNull String missingDelimiterValue) {
        int m16568d0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16568d0 = m16568d0(str, c, 0, false, 6, null);
        if (m16568d0 != -1) {
            String substring = str.substring(m16568d0 + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @NotNull
    /* renamed from: L0 */
    public static String m16602L0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        int m16566e0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16566e0 = m16566e0(str, delimiter, 0, false, 6, null);
        if (m16566e0 != -1) {
            String substring = str.substring(m16566e0 + delimiter.length(), str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: M0 */
    public static /* synthetic */ String m16601M0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m16603K0(str, c, str2);
    }

    /* renamed from: N0 */
    public static /* synthetic */ String m16599N0(String str, String str2, String str3, int i, Object obj) {
        String m16602L0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        m16602L0 = m16602L0(str, str2, str3);
        return m16602L0;
    }

    /* renamed from: O */
    public static final boolean m16598O(@NotNull CharSequence charSequence, char c, boolean z) {
        int m16568d0;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        m16568d0 = m16568d0(charSequence, c, 0, z, 2, null);
        if (m16568d0 >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: O0 */
    public static String m16597O0(@NotNull String str, char c, @NotNull String missingDelimiterValue) {
        int m16559j0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16559j0 = m16559j0(str, c, 0, false, 6, null);
        if (m16559j0 != -1) {
            String substring = str.substring(m16559j0 + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: P */
    public static boolean m16596P(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z) {
        int m16566e0;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            m16566e0 = m16566e0(charSequence, (String) other, 0, z, 2, null);
            if (m16566e0 >= 0) {
                return true;
            }
        } else if (m16570c0(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: P0 */
    public static final String m16595P0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        int m16558k0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16558k0 = m16558k0(str, delimiter, 0, false, 6, null);
        if (m16558k0 != -1) {
            String substring = str.substring(m16558k0 + delimiter.length(), str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m16594Q(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m16598O(charSequence, c, z);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ String m16593Q0(String str, char c, String str2, int i, Object obj) {
        String m16597O0;
        if ((i & 2) != 0) {
            str2 = str;
        }
        m16597O0 = m16597O0(str, c, str2);
        return m16597O0;
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m16592R(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean m16596P;
        if ((i & 2) != 0) {
            z = false;
        }
        m16596P = m16596P(charSequence, charSequence2, z);
        return m16596P;
    }

    /* renamed from: R0 */
    public static /* synthetic */ String m16591R0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m16595P0(str, str2, str3);
    }

    /* renamed from: S */
    public static final boolean m16590S(@NotNull CharSequence charSequence, char c, boolean z) {
        int m16578Y;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() > 0) {
            m16578Y = m16578Y(charSequence);
            if (Char.m16759g(charSequence.charAt(m16578Y), c, z)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: S0 */
    public static final String m16589S0(@NotNull String str, char c, @NotNull String missingDelimiterValue) {
        int m16568d0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16568d0 = m16568d0(str, c, 0, false, 6, null);
        if (m16568d0 != -1) {
            String substring = str.substring(0, m16568d0);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: T */
    public static final boolean m16588T(@NotNull CharSequence charSequence, @NotNull CharSequence suffix, boolean z) {
        boolean m16616x;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z && (charSequence instanceof String) && (suffix instanceof String)) {
            m16616x = StringsJVM.m16616x((String) charSequence, (String) suffix, false, 2, null);
            return m16616x;
        }
        return m16548u0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z);
    }

    @NotNull
    /* renamed from: T0 */
    public static final String m16587T0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        int m16566e0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16566e0 = m16566e0(str, delimiter, 0, false, 6, null);
        if (m16566e0 != -1) {
            String substring = str.substring(0, m16566e0);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m16586U(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m16590S(charSequence, c, z);
    }

    /* renamed from: U0 */
    public static /* synthetic */ String m16585U0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m16589S0(str, c, str2);
    }

    /* renamed from: V */
    public static /* synthetic */ boolean m16584V(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m16588T(charSequence, charSequence2, z);
    }

    /* renamed from: V0 */
    public static /* synthetic */ String m16583V0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m16587T0(str, str2, str3);
    }

    /* renamed from: W */
    public static final Tuples<Integer, String> m16582W(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int m16578Y;
        int m16912j;
        C37629d m16904r;
        Object obj;
        Object obj2;
        boolean m16634C;
        int m16917e;
        Object m17565N0;
        if (!z && collection.size() == 1) {
            m17565N0 = _Collections.m17565N0(collection);
            String str = (String) m17565N0;
            int m16566e0 = !z2 ? m16566e0(charSequence, str, i, false, 4, null) : m16558k0(charSequence, str, i, false, 4, null);
            if (m16566e0 < 0) {
                return null;
            }
            return C38513v.m14532a(Integer.valueOf(m16566e0), str);
        }
        if (!z2) {
            m16917e = _Ranges.m16917e(i, 0);
            m16904r = new PrimitiveRanges(m16917e, charSequence.length());
        } else {
            m16578Y = m16578Y(charSequence);
            m16912j = _Ranges.m16912j(i, m16578Y);
            m16904r = _Ranges.m16904r(m16912j, 0);
        }
        if (charSequence instanceof String) {
            int m16953c = m16904r.m16953c();
            int m16952d = m16904r.m16952d();
            int m16951f = m16904r.m16951f();
            if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            m16634C = StringsJVM.m16634C(str2, 0, (String) charSequence, m16953c, str2.length(), z);
                            if (m16634C) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return C38513v.m14532a(Integer.valueOf(m16953c), str3);
                    }
                    if (m16953c == m16952d) {
                        break;
                    }
                    m16953c += m16951f;
                }
            }
        } else {
            int m16953c2 = m16904r.m16953c();
            int m16952d2 = m16904r.m16952d();
            int m16951f2 = m16904r.m16951f();
            if ((m16951f2 > 0 && m16953c2 <= m16952d2) || (m16951f2 < 0 && m16952d2 <= m16953c2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (m16548u0(str4, 0, charSequence, m16953c2, str4.length(), z)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return C38513v.m14532a(Integer.valueOf(m16953c2), str5);
                    }
                    if (m16953c2 == m16952d2) {
                        break;
                    }
                    m16953c2 += m16951f2;
                }
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: W0 */
    public static final String m16581W0(@NotNull String str, char c, @NotNull String missingDelimiterValue) {
        int m16559j0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16559j0 = m16559j0(str, c, 0, false, 6, null);
        if (m16559j0 != -1) {
            String substring = str.substring(0, m16559j0);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @NotNull
    /* renamed from: X */
    public static PrimitiveRanges m16580X(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new PrimitiveRanges(0, charSequence.length() - 1);
    }

    @NotNull
    /* renamed from: X0 */
    public static final String m16579X0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        int m16558k0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        m16558k0 = m16558k0(str, delimiter, 0, false, 6, null);
        if (m16558k0 != -1) {
            String substring = str.substring(0, m16558k0);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: Y */
    public static int m16578Y(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: Y0 */
    public static /* synthetic */ String m16577Y0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m16581W0(str, c, str2);
    }

    /* renamed from: Z */
    public static final int m16576Z(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m16564f0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: Z0 */
    public static /* synthetic */ String m16575Z0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m16579X0(str, str2, str3);
    }

    /* renamed from: a0 */
    public static final int m16574a0(@NotNull CharSequence charSequence, @NotNull String string, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        return m16570c0(charSequence, string, i, charSequence.length(), z, false, 16, null);
    }

    @Nullable
    /* renamed from: a1 */
    public static Boolean m16573a1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.m17075f(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.m17075f(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: b0 */
    private static final int m16572b0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int m16578Y;
        int m16912j;
        int m16917e;
        C37629d m16904r;
        boolean m16634C;
        int m16917e2;
        int m16912j2;
        if (!z2) {
            m16917e2 = _Ranges.m16917e(i, 0);
            m16912j2 = _Ranges.m16912j(i2, charSequence.length());
            m16904r = new PrimitiveRanges(m16917e2, m16912j2);
        } else {
            m16578Y = m16578Y(charSequence);
            m16912j = _Ranges.m16912j(i, m16578Y);
            m16917e = _Ranges.m16917e(i2, 0);
            m16904r = _Ranges.m16904r(m16912j, m16917e);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m16953c = m16904r.m16953c();
            int m16952d = m16904r.m16952d();
            int m16951f = m16904r.m16951f();
            if ((m16951f <= 0 || m16953c > m16952d) && (m16951f >= 0 || m16952d > m16953c)) {
                return -1;
            }
            while (true) {
                m16634C = StringsJVM.m16634C((String) charSequence2, 0, (String) charSequence, m16953c, charSequence2.length(), z);
                if (m16634C) {
                    return m16953c;
                }
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                } else {
                    return -1;
                }
            }
        } else {
            int m16953c2 = m16904r.m16953c();
            int m16952d2 = m16904r.m16952d();
            int m16951f2 = m16904r.m16951f();
            if ((m16951f2 > 0 && m16953c2 <= m16952d2) || (m16951f2 < 0 && m16952d2 <= m16953c2)) {
                while (!m16548u0(charSequence2, 0, charSequence, m16953c2, charSequence2.length(), z)) {
                    if (m16953c2 != m16952d2) {
                        m16953c2 += m16951f2;
                    } else {
                        return -1;
                    }
                }
                return m16953c2;
            }
            return -1;
        }
    }

    @NotNull
    /* renamed from: b1 */
    public static CharSequence m16571b1(@NotNull CharSequence charSequence) {
        int i;
        boolean m16779b;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            m16779b = CharJVM.m16779b(charSequence.charAt(i));
            if (!z) {
                if (!m16779b) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!m16779b) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: c0 */
    static /* synthetic */ int m16570c0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m16572b0(charSequence, charSequence2, i, i2, z, z2);
    }

    @NotNull
    /* renamed from: c1 */
    public static String m16569c1(@NotNull String str, @NotNull char... chars) {
        int i;
        boolean m17341K;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            m17341K = _Arrays.m17341K(chars, str.charAt(i));
            if (!z) {
                if (!m17341K) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!m17341K) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    /* renamed from: d0 */
    public static /* synthetic */ int m16568d0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m16576Z(charSequence, c, i, z);
    }

    @NotNull
    /* renamed from: d1 */
    public static CharSequence m16567d1(@NotNull CharSequence charSequence) {
        boolean m16779b;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                m16779b = CharJVM.m16779b(charSequence.charAt(length));
                if (!m16779b) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m16566e0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m16574a0(charSequence, str, i, z);
    }

    @NotNull
    /* renamed from: e1 */
    public static String m16565e1(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequence;
        boolean m17341K;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                m17341K = _Arrays.m17341K(chars, str.charAt(length));
                if (!m17341K) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    /* renamed from: f0 */
    public static final int m16564f0(@NotNull CharSequence charSequence, @NotNull char[] chars, int i, boolean z) {
        int m16917e;
        int m16578Y;
        boolean z2;
        char m17307s0;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (z || chars.length != 1 || !(charSequence instanceof String)) {
            m16917e = _Ranges.m16917e(i, 0);
            m16578Y = m16578Y(charSequence);
            PrimitiveIterators it = new PrimitiveRanges(m16917e, m16578Y).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = chars.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (Char.m16759g(chars[i2], charAt, z)) {
                            z2 = true;
                            continue;
                            break;
                        }
                        i2++;
                    } else {
                        z2 = false;
                        continue;
                        break;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        m17307s0 = _Arrays.m17307s0(chars);
        return ((String) charSequence).indexOf(m17307s0, i);
    }

    @NotNull
    /* renamed from: f1 */
    public static CharSequence m16563f1(@NotNull CharSequence charSequence) {
        boolean m16779b;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            m16779b = CharJVM.m16779b(charSequence.charAt(i));
            if (!m16779b) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: g0 */
    public static /* synthetic */ int m16562g0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m16564f0(charSequence, cArr, i, z);
    }

    /* renamed from: h0 */
    public static final int m16561h0(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m16557l0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: i0 */
    public static final int m16560i0(@NotNull CharSequence charSequence, @NotNull String string, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i);
        }
        return m16572b0(charSequence, string, i, 0, z, true);
    }

    /* renamed from: j0 */
    public static /* synthetic */ int m16559j0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m16578Y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m16561h0(charSequence, c, i, z);
    }

    /* renamed from: k0 */
    public static /* synthetic */ int m16558k0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m16578Y(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m16560i0(charSequence, str, i, z);
    }

    /* renamed from: l0 */
    public static final int m16557l0(@NotNull CharSequence charSequence, @NotNull char[] chars, int i, boolean z) {
        int m16578Y;
        int m16912j;
        char m17307s0;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (z || chars.length != 1 || !(charSequence instanceof String)) {
            m16578Y = m16578Y(charSequence);
            for (m16912j = _Ranges.m16912j(i, m16578Y); -1 < m16912j; m16912j--) {
                char charAt = charSequence.charAt(m16912j);
                int length = chars.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (Char.m16759g(chars[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return m16912j;
                }
            }
            return -1;
        }
        m17307s0 = _Arrays.m17307s0(chars);
        return ((String) charSequence).lastIndexOf(m17307s0, i);
    }

    @NotNull
    /* renamed from: m0 */
    public static Sequence<String> m16556m0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return m16609E0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @NotNull
    /* renamed from: n0 */
    public static final List<String> m16555n0(@NotNull CharSequence charSequence) {
        Sequence m16556m0;
        List<String> m16822J;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        m16556m0 = m16556m0(charSequence);
        m16822J = _Sequences.m16822J(m16556m0);
        return m16822J;
    }

    @NotNull
    /* renamed from: o0 */
    public static final CharSequence m16554o0(@NotNull CharSequence charSequence, int i, char c) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(i);
            PrimitiveIterators it = new PrimitiveRanges(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb2.append(c);
            }
            sb2.append(charSequence);
            return sb2;
        }
        throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
    }

    @NotNull
    /* renamed from: p0 */
    public static String m16553p0(@NotNull String str, int i, char c) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m16554o0(str, i, c).toString();
    }

    /* renamed from: q0 */
    private static final Sequence<PrimitiveRanges> m16552q0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m16545x0(i2);
        return new Strings(charSequence, i, i2, new C37691a(cArr, z));
    }

    /* renamed from: r0 */
    private static final Sequence<PrimitiveRanges> m16551r0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        List m17399f;
        m16545x0(i2);
        m17399f = _ArraysJvm.m17399f(strArr);
        return new Strings(charSequence, i, i2, new C37692b(m17399f, z));
    }

    /* renamed from: s0 */
    static /* synthetic */ Sequence m16550s0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m16552q0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: t0 */
    static /* synthetic */ Sequence m16549t0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m16551r0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: u0 */
    public static final boolean m16548u0(@NotNull CharSequence charSequence, int i, @NotNull CharSequence other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!Char.m16759g(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: v0 */
    public static String m16547v0(@NotNull String str, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (m16605I0(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @NotNull
    /* renamed from: w0 */
    public static String m16546w0(@NotNull String str, @NotNull CharSequence suffix) {
        boolean m16584V;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        m16584V = m16584V(str, suffix, false, 2, null);
        if (m16584V) {
            String substring = str.substring(0, str.length() - suffix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: x0 */
    public static final void m16545x0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    @NotNull
    /* renamed from: y0 */
    public static final List<String> m16544y0(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z, int i) {
        Iterable<PrimitiveRanges> m16818l;
        int m17154x;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length != 1) {
            m16818l = _Sequences.m16818l(m16550s0(charSequence, delimiters, 0, z, i, 2, null));
            m17154x = C37566w.m17154x(m16818l, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (PrimitiveRanges primitiveRanges : m16818l) {
                arrayList.add(m16604J0(charSequence, primitiveRanges));
            }
            return arrayList;
        }
        return m16613A0(charSequence, String.valueOf(delimiters[0]), z, i);
    }

    @NotNull
    /* renamed from: z0 */
    public static final List<String> m16543z0(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z, int i) {
        Iterable<PrimitiveRanges> m16818l;
        int m17154x;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        boolean z2 = true;
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m16613A0(charSequence, str, z, i);
            }
        }
        m16818l = _Sequences.m16818l(m16549t0(charSequence, delimiters, 0, z, i, 2, null));
        m17154x = C37566w.m17154x(m16818l, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (PrimitiveRanges primitiveRanges : m16818l) {
            arrayList.add(m16604J0(charSequence, primitiveRanges));
        }
        return arrayList;
    }
}
