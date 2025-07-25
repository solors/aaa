package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    @VisibleForTesting

    /* renamed from: m */
    transient long[] f39868m;

    /* renamed from: n */
    private transient int f39869n;

    /* renamed from: o */
    private transient int f39870o;

    /* renamed from: p */
    private final boolean f39871p;

    CompactLinkedHashMap() {
        this(3);
    }

    /* renamed from: Z */
    private int m69628Z(int i) {
        return ((int) (m69627a0(i) >>> 32)) - 1;
    }

    /* renamed from: a0 */
    private long m69627a0(int i) {
        return m69626b0()[i];
    }

    /* renamed from: b0 */
    private long[] m69626b0() {
        long[] jArr = this.f39868m;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    /* renamed from: c0 */
    private void m69625c0(int i, long j) {
        m69626b0()[i] = j;
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactLinkedHashMap<>(i);
    }

    /* renamed from: d0 */
    private void m69624d0(int i, int i2) {
        m69625c0(i, (m69627a0(i) & 4294967295L) | ((i2 + 1) << 32));
    }

    /* renamed from: e0 */
    private void m69623e0(int i, int i2) {
        if (i == -2) {
            this.f39869n = i2;
        } else {
            m69622f0(i, i2);
        }
        if (i2 == -2) {
            this.f39870o = i;
        } else {
            m69624d0(i2, i);
        }
    }

    /* renamed from: f0 */
    private void m69622f0(int i, int i2) {
        m69625c0(i, (m69627a0(i) & (-4294967296L)) | ((i2 + 1) & 4294967295L));
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: A */
    int mo69634A() {
        return this.f39869n;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: B */
    int mo69633B(int i) {
        return ((int) m69627a0(i)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: F */
    public void mo69632F(int i) {
        super.mo69632F(i);
        this.f39869n = -2;
        this.f39870o = -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: G */
    public void mo69631G(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
        super.mo69631G(i, k, v, i2, i3);
        m69623e0(this.f39870o, i);
        m69623e0(i, -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: J */
    public void mo69630J(int i, int i2) {
        int size = size() - 1;
        super.mo69630J(i, i2);
        m69623e0(m69628Z(i), mo69633B(i));
        if (i < size) {
            m69623e0(m69628Z(size), i);
            m69623e0(i, mo69633B(size));
        }
        m69625c0(size, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: Q */
    public void mo69629Q(int i) {
        super.mo69629Q(i);
        this.f39868m = Arrays.copyOf(m69626b0(), i);
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m69701K()) {
            return;
        }
        this.f39869n = -2;
        this.f39870o = -2;
        long[] jArr = this.f39868m;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: p */
    void mo69621p(int i) {
        if (this.f39871p) {
            m69623e0(m69628Z(i), mo69633B(i));
            m69623e0(this.f39870o, i);
            m69623e0(i, -2);
            m69705D();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: q */
    int mo69620q(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: r */
    public int mo69619r() {
        int mo69619r = super.mo69619r();
        this.f39868m = new long[mo69619r];
        return mo69619r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CompactHashMap
    @CanIgnoreReturnValue
    /* renamed from: s */
    public Map<K, V> mo69618s() {
        Map<K, V> mo69618s = super.mo69618s();
        this.f39868m = null;
        return mo69618s;
    }

    @Override // com.google.common.collect.CompactHashMap
    /* renamed from: u */
    Map<K, V> mo69617u(int i) {
        return new LinkedHashMap(i, 1.0f, this.f39871p);
    }

    CompactLinkedHashMap(int i) {
        this(i, false);
    }

    CompactLinkedHashMap(int i, boolean z) {
        super(i);
        this.f39871p = z;
    }
}
