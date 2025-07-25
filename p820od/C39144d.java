package p820od;

import ae.InterfaceC0039e;
import ae.KMarkers;
import com.ironsource.C20517nb;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.PrimitiveIterators;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MapBuilder.kt */
@Metadata
/* renamed from: od.d */
/* loaded from: classes7.dex */
public final class C39144d<K, V> implements Map<K, V>, Serializable, InterfaceC0039e {
    @NotNull

    /* renamed from: p */
    public static final C39145a f102828p = new C39145a(null);
    @NotNull

    /* renamed from: q */
    private static final C39144d f102829q;
    @NotNull

    /* renamed from: b */
    private K[] f102830b;
    @Nullable

    /* renamed from: c */
    private V[] f102831c;
    @NotNull

    /* renamed from: d */
    private int[] f102832d;
    @NotNull

    /* renamed from: f */
    private int[] f102833f;

    /* renamed from: g */
    private int f102834g;

    /* renamed from: h */
    private int f102835h;

    /* renamed from: i */
    private int f102836i;

    /* renamed from: j */
    private int f102837j;

    /* renamed from: k */
    private int f102838k;
    @Nullable

    /* renamed from: l */
    private C39152f<K> f102839l;
    @Nullable

    /* renamed from: m */
    private C39153g<V> f102840m;
    @Nullable

    /* renamed from: n */
    private C39151e<K, V> f102841n;

    /* renamed from: o */
    private boolean f102842o;

    /* compiled from: MapBuilder.kt */
    @Metadata
    /* renamed from: od.d$a */
    /* loaded from: classes7.dex */
    public static final class C39145a {
        private C39145a() {
        }

        public /* synthetic */ C39145a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final int m13770c(int i) {
            int m16917e;
            m16917e = _Ranges.m16917e(i, 1);
            return Integer.highestOneBit(m16917e * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final int m13769d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        @NotNull
        /* renamed from: e */
        public final C39144d m13768e() {
            return C39144d.f102829q;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata
    /* renamed from: od.d$b */
    /* loaded from: classes7.dex */
    public static final class C39146b<K, V> extends C39148d<K, V> implements Iterator<Map.Entry<K, V>>, KMarkers {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39146b(@NotNull C39144d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: i */
        public C39147c<K, V> next() {
            m13764a();
            if (m13763b() < ((C39144d) m13761d()).f102835h) {
                int m13763b = m13763b();
                m13759g(m13763b + 1);
                m13758h(m13763b);
                C39147c<K, V> c39147c = new C39147c<>(m13761d(), m13762c());
                m13760f();
                return c39147c;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: j */
        public final void m13766j(@NotNull StringBuilder sb2) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (m13763b() < ((C39144d) m13761d()).f102835h) {
                int m13763b = m13763b();
                m13759g(m13763b + 1);
                m13758h(m13763b);
                Object obj = ((C39144d) m13761d()).f102830b[m13762c()];
                if (obj == m13761d()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append(C20517nb.f52173T);
                Object[] objArr = ((C39144d) m13761d()).f102831c;
                Intrinsics.m17074g(objArr);
                Object obj2 = objArr[m13762c()];
                if (obj2 == m13761d()) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                m13760f();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: l */
        public final int m13765l() {
            int i;
            if (m13763b() < ((C39144d) m13761d()).f102835h) {
                int m13763b = m13763b();
                m13759g(m13763b + 1);
                m13758h(m13763b);
                Object obj = ((C39144d) m13761d()).f102830b[m13762c()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = ((C39144d) m13761d()).f102831c;
                Intrinsics.m17074g(objArr);
                Object obj2 = objArr[m13762c()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                m13760f();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata
    /* renamed from: od.d$c */
    /* loaded from: classes7.dex */
    public static final class C39147c<K, V> implements Map.Entry<K, V>, InterfaceC0039e.InterfaceC0040a {
        @NotNull

        /* renamed from: b */
        private final C39144d<K, V> f102843b;

        /* renamed from: c */
        private final int f102844c;

        public C39147c(@NotNull C39144d<K, V> map, int i) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f102843b = map;
            this.f102844c = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.m17075f(entry.getKey(), getKey()) && Intrinsics.m17075f(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((C39144d) this.f102843b).f102830b[this.f102844c];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((C39144d) this.f102843b).f102831c;
            Intrinsics.m17074g(objArr);
            return (V) objArr[this.f102844c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i;
            K key = getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            V value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.f102843b.m13785n();
            Object[] m13787l = this.f102843b.m13787l();
            int i = this.f102844c;
            V v2 = (V) m13787l[i];
            m13787l[i] = v;
            return v2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append(C20517nb.f52173T);
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata
    /* renamed from: od.d$d */
    /* loaded from: classes7.dex */
    public static class C39148d<K, V> {
        @NotNull

        /* renamed from: b */
        private final C39144d<K, V> f102845b;

        /* renamed from: c */
        private int f102846c;

        /* renamed from: d */
        private int f102847d;

        /* renamed from: f */
        private int f102848f;

        public C39148d(@NotNull C39144d<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f102845b = map;
            this.f102847d = -1;
            this.f102848f = ((C39144d) map).f102837j;
            m13760f();
        }

        /* renamed from: a */
        public final void m13764a() {
            if (((C39144d) this.f102845b).f102837j == this.f102848f) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public final int m13763b() {
            return this.f102846c;
        }

        /* renamed from: c */
        public final int m13762c() {
            return this.f102847d;
        }

        @NotNull
        /* renamed from: d */
        public final C39144d<K, V> m13761d() {
            return this.f102845b;
        }

        /* renamed from: f */
        public final void m13760f() {
            while (this.f102846c < ((C39144d) this.f102845b).f102835h) {
                int[] iArr = ((C39144d) this.f102845b).f102832d;
                int i = this.f102846c;
                if (iArr[i] < 0) {
                    this.f102846c = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        public final void m13759g(int i) {
            this.f102846c = i;
        }

        /* renamed from: h */
        public final void m13758h(int i) {
            this.f102847d = i;
        }

        public final boolean hasNext() {
            if (this.f102846c < ((C39144d) this.f102845b).f102835h) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z;
            m13764a();
            if (this.f102847d != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f102845b.m13785n();
                this.f102845b.m13800O(this.f102847d);
                this.f102847d = -1;
                this.f102848f = ((C39144d) this.f102845b).f102837j;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata
    /* renamed from: od.d$e */
    /* loaded from: classes7.dex */
    public static final class C39149e<K, V> extends C39148d<K, V> implements Iterator<K>, KMarkers {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39149e(@NotNull C39144d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            m13764a();
            if (m13763b() < ((C39144d) m13761d()).f102835h) {
                int m13763b = m13763b();
                m13759g(m13763b + 1);
                m13758h(m13763b);
                K k = (K) ((C39144d) m13761d()).f102830b[m13762c()];
                m13760f();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata
    /* renamed from: od.d$f */
    /* loaded from: classes7.dex */
    public static final class C39150f<K, V> extends C39148d<K, V> implements Iterator<V>, KMarkers {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39150f(@NotNull C39144d<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            m13764a();
            if (m13763b() < ((C39144d) m13761d()).f102835h) {
                int m13763b = m13763b();
                m13759g(m13763b + 1);
                m13758h(m13763b);
                Object[] objArr = ((C39144d) m13761d()).f102831c;
                Intrinsics.m17074g(objArr);
                V v = (V) objArr[m13762c()];
                m13760f();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        C39144d c39144d = new C39144d(0);
        c39144d.f102842o = true;
        f102829q = c39144d;
    }

    private C39144d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f102830b = kArr;
        this.f102831c = vArr;
        this.f102832d = iArr;
        this.f102833f = iArr2;
        this.f102834g = i;
        this.f102835h = i2;
        this.f102836i = f102828p.m13769d(m13773z());
    }

    /* renamed from: D */
    private final int m13811D(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.f102836i;
    }

    /* renamed from: G */
    private final boolean m13808G(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m13779t(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (m13807H(entry)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: H */
    private final boolean m13807H(Map.Entry<? extends K, ? extends V> entry) {
        int m13788j = m13788j(entry.getKey());
        V[] m13787l = m13787l();
        if (m13788j >= 0) {
            m13787l[m13788j] = entry.getValue();
            return true;
        }
        int i = (-m13788j) - 1;
        if (!Intrinsics.m17075f(entry.getValue(), m13787l[i])) {
            m13787l[i] = entry.getValue();
            return true;
        }
        return false;
    }

    /* renamed from: I */
    private final boolean m13806I(int i) {
        int m13811D = m13811D(this.f102830b[i]);
        int i2 = this.f102834g;
        while (true) {
            int[] iArr = this.f102833f;
            if (iArr[m13811D] == 0) {
                iArr[m13811D] = i + 1;
                this.f102832d[i] = m13811D;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = m13811D - 1;
            if (m13811D == 0) {
                m13811D = m13773z() - 1;
            } else {
                m13811D = i3;
            }
        }
    }

    /* renamed from: J */
    private final void m13805J() {
        this.f102837j++;
    }

    /* renamed from: K */
    private final void m13804K(int i) {
        m13805J();
        if (this.f102835h > size()) {
            m13784o();
        }
        int i2 = 0;
        if (i == m13773z()) {
            _ArraysJvm.m17384u(this.f102833f, 0, 0, m13773z());
        } else {
            this.f102833f = new int[i];
            this.f102836i = f102828p.m13769d(i);
        }
        while (i2 < this.f102835h) {
            int i3 = i2 + 1;
            if (m13806I(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: M */
    private final void m13802M(int i) {
        int m16912j;
        m16912j = _Ranges.m16912j(this.f102834g * 2, m13773z() / 2);
        int i2 = m16912j;
        int i3 = 0;
        int i4 = i;
        do {
            int i5 = i - 1;
            if (i == 0) {
                i = m13773z() - 1;
            } else {
                i = i5;
            }
            i3++;
            if (i3 > this.f102834g) {
                this.f102833f[i4] = 0;
                return;
            }
            int[] iArr = this.f102833f;
            int i6 = iArr[i];
            if (i6 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i4] = -1;
            } else {
                int i7 = i6 - 1;
                if (((m13811D(this.f102830b[i7]) - i) & (m13773z() - 1)) >= i3) {
                    this.f102833f[i4] = i6;
                    this.f102832d[i7] = i4;
                }
                i2--;
            }
            i4 = i;
            i3 = 0;
            i2--;
        } while (i2 >= 0);
        this.f102833f[i4] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final void m13800O(int i) {
        C39143c.m13819f(this.f102830b, i);
        m13802M(this.f102832d[i]);
        this.f102832d[i] = -1;
        this.f102838k = size() - 1;
        m13805J();
    }

    /* renamed from: Q */
    private final boolean m13798Q(int i) {
        int m13775x = m13775x();
        int i2 = this.f102835h;
        int i3 = m13775x - i2;
        int size = i2 - size();
        if (i3 < i && i3 + size >= i && size >= m13775x() / 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final V[] m13787l() {
        V[] vArr = this.f102831c;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C39143c.m13821d(m13775x());
        this.f102831c = vArr2;
        return vArr2;
    }

    /* renamed from: o */
    private final void m13784o() {
        int i;
        V[] vArr = this.f102831c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f102835h;
            if (i2 >= i) {
                break;
            }
            if (this.f102832d[i2] >= 0) {
                K[] kArr = this.f102830b;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C39143c.m13818g(this.f102830b, i3, i);
        if (vArr != null) {
            C39143c.m13818g(vArr, i3, this.f102835h);
        }
        this.f102835h = i3;
    }

    /* renamed from: r */
    private final boolean m13781r(Map<?, ?> map) {
        if (size() == map.size() && m13783p(map.entrySet())) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final void m13780s(int i) {
        V[] vArr;
        if (i >= 0) {
            if (i > m13775x()) {
                int m17587e = AbstractList.Companion.m17587e(m13775x(), i);
                this.f102830b = (K[]) C39143c.m13820e(this.f102830b, m17587e);
                V[] vArr2 = this.f102831c;
                if (vArr2 != null) {
                    vArr = (V[]) C39143c.m13820e(vArr2, m17587e);
                } else {
                    vArr = null;
                }
                this.f102831c = vArr;
                int[] copyOf = Arrays.copyOf(this.f102832d, m17587e);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                this.f102832d = copyOf;
                int m13770c = f102828p.m13770c(m17587e);
                if (m13770c > m13773z()) {
                    m13804K(m13770c);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: t */
    private final void m13779t(int i) {
        if (m13798Q(i)) {
            m13804K(m13773z());
        } else {
            m13780s(this.f102835h + i);
        }
    }

    /* renamed from: v */
    private final int m13777v(K k) {
        int m13811D = m13811D(k);
        int i = this.f102834g;
        while (true) {
            int i2 = this.f102833f[m13811D];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.m17075f(this.f102830b[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = m13811D - 1;
            if (m13811D == 0) {
                m13811D = m13773z() - 1;
            } else {
                m13811D = i4;
            }
        }
    }

    /* renamed from: w */
    private final int m13776w(V v) {
        int i = this.f102835h;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f102832d[i] >= 0) {
                V[] vArr = this.f102831c;
                Intrinsics.m17074g(vArr);
                if (Intrinsics.m17075f(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    private final Object writeReplace() {
        if (this.f102842o) {
            return new C39156i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: z */
    private final int m13773z() {
        return this.f102833f.length;
    }

    @NotNull
    /* renamed from: A */
    public Set<K> m13814A() {
        C39152f<K> c39152f = this.f102839l;
        if (c39152f == null) {
            C39152f<K> c39152f2 = new C39152f<>(this);
            this.f102839l = c39152f2;
            return c39152f2;
        }
        return c39152f;
    }

    /* renamed from: B */
    public int m13813B() {
        return this.f102838k;
    }

    @NotNull
    /* renamed from: C */
    public Collection<V> m13812C() {
        C39153g<V> c39153g = this.f102840m;
        if (c39153g == null) {
            C39153g<V> c39153g2 = new C39153g<>(this);
            this.f102840m = c39153g2;
            return c39153g2;
        }
        return c39153g;
    }

    /* renamed from: E */
    public final boolean m13810E() {
        return this.f102842o;
    }

    @NotNull
    /* renamed from: F */
    public final C39149e<K, V> m13809F() {
        return new C39149e<>(this);
    }

    /* renamed from: L */
    public final boolean m13803L(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        m13785n();
        int m13777v = m13777v(entry.getKey());
        if (m13777v < 0) {
            return false;
        }
        V[] vArr = this.f102831c;
        Intrinsics.m17074g(vArr);
        if (!Intrinsics.m17075f(vArr[m13777v], entry.getValue())) {
            return false;
        }
        m13800O(m13777v);
        return true;
    }

    /* renamed from: N */
    public final int m13801N(K k) {
        m13785n();
        int m13777v = m13777v(k);
        if (m13777v < 0) {
            return -1;
        }
        m13800O(m13777v);
        return m13777v;
    }

    /* renamed from: P */
    public final boolean m13799P(V v) {
        m13785n();
        int m13776w = m13776w(v);
        if (m13776w < 0) {
            return false;
        }
        m13800O(m13776w);
        return true;
    }

    @NotNull
    /* renamed from: R */
    public final C39150f<K, V> m13797R() {
        return new C39150f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m13785n();
        PrimitiveIterators it = new PrimitiveRanges(0, this.f102835h - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f102832d;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.f102833f[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C39143c.m13818g(this.f102830b, 0, this.f102835h);
        V[] vArr = this.f102831c;
        if (vArr != null) {
            C39143c.m13818g(vArr, 0, this.f102835h);
        }
        this.f102838k = 0;
        this.f102835h = 0;
        m13805J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (m13777v(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (m13776w(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m13774y();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj != this && (!(obj instanceof Map) || !m13781r((Map) obj))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int m13777v = m13777v(obj);
        if (m13777v < 0) {
            return null;
        }
        V[] vArr = this.f102831c;
        Intrinsics.m17074g(vArr);
        return vArr[m13777v];
    }

    @Override // java.util.Map
    public int hashCode() {
        C39146b<K, V> m13778u = m13778u();
        int i = 0;
        while (m13778u.hasNext()) {
            i += m13778u.m13765l();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int m13788j(K k) {
        int m16912j;
        m13785n();
        while (true) {
            int m13811D = m13811D(k);
            m16912j = _Ranges.m16912j(this.f102834g * 2, m13773z() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f102833f[m13811D];
                if (i2 <= 0) {
                    if (this.f102835h >= m13775x()) {
                        m13779t(1);
                    } else {
                        int i3 = this.f102835h;
                        int i4 = i3 + 1;
                        this.f102835h = i4;
                        this.f102830b[i3] = k;
                        this.f102832d[i3] = m13811D;
                        this.f102833f[m13811D] = i4;
                        this.f102838k = size() + 1;
                        m13805J();
                        if (i > this.f102834g) {
                            this.f102834g = i;
                        }
                        return i3;
                    }
                } else if (Intrinsics.m17075f(this.f102830b[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > m16912j) {
                        m13804K(m13773z() * 2);
                        break;
                    }
                    int i5 = m13811D - 1;
                    if (m13811D == 0) {
                        m13811D = m13773z() - 1;
                    } else {
                        m13811D = i5;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m13814A();
    }

    @NotNull
    /* renamed from: m */
    public final Map<K, V> m13786m() {
        m13785n();
        this.f102842o = true;
        if (size() > 0) {
            return this;
        }
        C39144d c39144d = f102829q;
        Intrinsics.m17073h(c39144d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c39144d;
    }

    /* renamed from: n */
    public final void m13785n() {
        if (!this.f102842o) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public final boolean m13783p(@NotNull Collection<?> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!m13782q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        m13785n();
        int m13788j = m13788j(k);
        V[] m13787l = m13787l();
        if (m13788j < 0) {
            int i = (-m13788j) - 1;
            V v2 = m13787l[i];
            m13787l[i] = v;
            return v2;
        }
        m13787l[m13788j] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        m13785n();
        m13808G(from.entrySet());
    }

    /* renamed from: q */
    public final boolean m13782q(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int m13777v = m13777v(entry.getKey());
        if (m13777v < 0) {
            return false;
        }
        V[] vArr = this.f102831c;
        Intrinsics.m17074g(vArr);
        return Intrinsics.m17075f(vArr[m13777v], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        int m13801N = m13801N(obj);
        if (m13801N < 0) {
            return null;
        }
        V[] vArr = this.f102831c;
        Intrinsics.m17074g(vArr);
        V v = vArr[m13801N];
        C39143c.m13819f(vArr, m13801N);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m13813B();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        C39146b<K, V> m13778u = m13778u();
        int i = 0;
        while (m13778u.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            m13778u.m13766j(sb2);
            i++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    /* renamed from: u */
    public final C39146b<K, V> m13778u() {
        return new C39146b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m13812C();
    }

    /* renamed from: x */
    public final int m13775x() {
        return this.f102830b.length;
    }

    @NotNull
    /* renamed from: y */
    public Set<Map.Entry<K, V>> m13774y() {
        C39151e<K, V> c39151e = this.f102841n;
        if (c39151e == null) {
            C39151e<K, V> c39151e2 = new C39151e<>(this);
            this.f102841n = c39151e2;
            return c39151e2;
        }
        return c39151e;
    }

    public C39144d() {
        this(8);
    }

    public C39144d(int i) {
        this(C39143c.m13821d(i), null, new int[i], new int[f102828p.m13770c(i)], 2, 0);
    }
}
