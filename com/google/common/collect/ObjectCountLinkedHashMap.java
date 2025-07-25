package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    @VisibleForTesting

    /* renamed from: i */
    transient long[] f40569i;

    /* renamed from: j */
    private transient int f40570j;

    /* renamed from: k */
    private transient int f40571k;

    ObjectCountLinkedHashMap() {
        this(3);
    }

    /* renamed from: A */
    private int m68877A(int i) {
        return (int) (this.f40569i[i] >>> 32);
    }

    /* renamed from: B */
    private int m68876B(int i) {
        return (int) this.f40569i[i];
    }

    /* renamed from: C */
    private void m68875C(int i, int i2) {
        long[] jArr = this.f40569i;
        jArr[i] = (jArr[i] & 4294967295L) | (i2 << 32);
    }

    /* renamed from: D */
    private void m68874D(int i, int i2) {
        if (i == -2) {
            this.f40570j = i2;
        } else {
            m68873E(i, i2);
        }
        if (i2 == -2) {
            this.f40571k = i;
        } else {
            m68875C(i2, i);
        }
    }

    /* renamed from: E */
    private void m68873E(int i, int i2) {
        long[] jArr = this.f40569i;
        jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & 4294967295L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.f40570j = -2;
        this.f40571k = -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: d */
    public int mo68872d() {
        int i = this.f40570j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: l */
    public void mo68871l(int i, float f) {
        super.mo68871l(i, f);
        this.f40570j = -2;
        this.f40571k = -2;
        long[] jArr = new long[i];
        this.f40569i = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: m */
    public void mo68870m(int i, @ParametricNullness K k, int i2, int i3) {
        super.mo68870m(i, k, i2, i3);
        m68874D(this.f40571k, i);
        m68874D(i, -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: n */
    public void mo68869n(int i) {
        int m68880y = m68880y() - 1;
        m68874D(m68877A(i), m68876B(i));
        if (i < m68880y) {
            m68874D(m68877A(m68880y), i);
            m68874D(i, m68876B(m68880y));
        }
        super.mo68869n(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: q */
    public int mo68868q(int i) {
        int m68876B = m68876B(i);
        if (m68876B == -2) {
            return -1;
        }
        return m68876B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: r */
    public int mo68867r(int i, int i2) {
        if (i == m68880y()) {
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: u */
    public void mo68866u(int i) {
        super.mo68866u(i);
        long[] jArr = this.f40569i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f40569i = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectCountLinkedHashMap(int i) {
        this(i, 1.0f);
    }

    ObjectCountLinkedHashMap(int i, float f) {
        super(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
        mo68871l(objectCountHashMap.m68880y(), 1.0f);
        int mo68872d = objectCountHashMap.mo68872d();
        while (mo68872d != -1) {
            put(objectCountHashMap.m68892g(mo68872d), objectCountHashMap.m68890i(mo68872d));
            mo68872d = objectCountHashMap.mo68868q(mo68872d);
        }
    }
}
