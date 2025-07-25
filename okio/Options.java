package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.p0 */
/* loaded from: classes10.dex */
public final class Options extends AbstractList<C39208h> implements RandomAccess {
    @NotNull

    /* renamed from: d */
    public static final C39220a f102982d = new C39220a(null);
    @NotNull

    /* renamed from: b */
    private final C39208h[] f102983b;
    @NotNull

    /* renamed from: c */
    private final int[] f102984c;

    /* compiled from: Options.kt */
    @Metadata
    /* renamed from: okio.p0$a */
    /* loaded from: classes10.dex */
    public static final class C39220a {
        private C39220a() {
        }

        public /* synthetic */ C39220a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m13476a(long j, C39200e c39200e, int i, List<? extends C39208h> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7;
            C39200e c39200e2;
            boolean z3;
            int i8 = i;
            if (i2 < i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (list.get(i9).m13569C() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C39208h c39208h = list.get(i2);
                C39208h c39208h2 = list.get(i3 - 1);
                int i10 = -1;
                if (i8 == c39208h.m13569C()) {
                    int i11 = i2 + 1;
                    i4 = i11;
                    i5 = list2.get(i2).intValue();
                    c39208h = list.get(i11);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (c39208h.m13562g(i8) != c39208h2.m13562g(i8)) {
                    int i12 = 1;
                    for (int i13 = i4 + 1; i13 < i3; i13++) {
                        if (list.get(i13 - 1).m13562g(i8) != list.get(i13).m13562g(i8)) {
                            i12++;
                        }
                    }
                    long m13474c = j + m13474c(c39200e) + 2 + (i12 * 2);
                    c39200e.writeInt(i12);
                    c39200e.writeInt(i5);
                    for (int i14 = i4; i14 < i3; i14++) {
                        byte m13562g = list.get(i14).m13562g(i8);
                        if (i14 == i4 || m13562g != list.get(i14 - 1).m13562g(i8)) {
                            c39200e.writeInt(m13562g & 255);
                        }
                    }
                    C39200e c39200e3 = new C39200e();
                    while (i4 < i3) {
                        byte m13562g2 = list.get(i4).m13562g(i8);
                        int i15 = i4 + 1;
                        int i16 = i15;
                        while (true) {
                            if (i16 < i3) {
                                if (m13562g2 != list.get(i16).m13562g(i8)) {
                                    i6 = i16;
                                    break;
                                }
                                i16++;
                            } else {
                                i6 = i3;
                                break;
                            }
                        }
                        if (i15 == i6 && i8 + 1 == list.get(i4).m13569C()) {
                            c39200e.writeInt(list2.get(i4).intValue());
                            i7 = i6;
                            c39200e2 = c39200e3;
                        } else {
                            c39200e.writeInt(((int) (m13474c + m13474c(c39200e3))) * i10);
                            i7 = i6;
                            c39200e2 = c39200e3;
                            m13476a(m13474c, c39200e3, i8 + 1, list, i4, i6, list2);
                        }
                        c39200e3 = c39200e2;
                        i4 = i7;
                        i10 = -1;
                    }
                    c39200e.mo13440H(c39200e3);
                    return;
                }
                int min = Math.min(c39208h.m13569C(), c39208h2.m13569C());
                int i17 = 0;
                for (int i18 = i8; i18 < min && c39208h.m13562g(i18) == c39208h2.m13562g(i18); i18++) {
                    i17++;
                }
                long m13474c2 = j + m13474c(c39200e) + 2 + i17 + 1;
                c39200e.writeInt(-i17);
                c39200e.writeInt(i5);
                int i19 = i8 + i17;
                while (i8 < i19) {
                    c39200e.writeInt(c39208h.m13562g(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i19 == list.get(i4).m13569C()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        c39200e.writeInt(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C39200e c39200e4 = new C39200e();
                c39200e.writeInt(((int) (m13474c(c39200e4) + m13474c2)) * (-1));
                m13476a(m13474c2, c39200e4, i19, list, i4, i3, list2);
                c39200e.mo13440H(c39200e4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m13475b(C39220a c39220a, long j, C39200e c39200e, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            c39220a.m13476a((i4 & 1) != 0 ? 0L : j, c39200e, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m13474c(C39200e c39200e) {
            return c39200e.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:115:0x00e9, code lost:
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.Options m13473d(@org.jetbrains.annotations.NotNull okio.C39208h... r17) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.C39220a.m13473d(okio.h[]):okio.p0");
        }
    }

    public /* synthetic */ Options(C39208h[] c39208hArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39208hArr, iArr);
    }

    @NotNull
    /* renamed from: i */
    public static final Options m13477i(@NotNull C39208h... c39208hArr) {
        return f102982d.m13473d(c39208hArr);
    }

    /* renamed from: a */
    public /* bridge */ boolean m13483a(C39208h c39208h) {
        return super.contains(c39208h);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    /* renamed from: c */
    public C39208h get(int i) {
        return this.f102983b[i];
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C39208h)) {
            return false;
        }
        return m13483a((C39208h) obj);
    }

    @NotNull
    /* renamed from: d */
    public final C39208h[] m13481d() {
        return this.f102983b;
    }

    @NotNull
    /* renamed from: f */
    public final int[] m13480f() {
        return this.f102984c;
    }

    /* renamed from: g */
    public /* bridge */ int m13479g(C39208h c39208h) {
        return super.indexOf(c39208h);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f102983b.length;
    }

    /* renamed from: h */
    public /* bridge */ int m13478h(C39208h c39208h) {
        return super.lastIndexOf(c39208h);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C39208h)) {
            return -1;
        }
        return m13479g((C39208h) obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C39208h)) {
            return -1;
        }
        return m13478h((C39208h) obj);
    }

    private Options(C39208h[] c39208hArr, int[] iArr) {
        this.f102983b = c39208hArr;
        this.f102984c = iArr;
    }
}
