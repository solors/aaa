package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.applovin.impl.ni */
/* loaded from: classes2.dex */
public final class C5012ni extends AbstractC4387fb {

    /* renamed from: i */
    static final AbstractC4387fb f8588i = new C5012ni(null, new Object[0], 0);

    /* renamed from: f */
    private final transient int[] f8589f;

    /* renamed from: g */
    final transient Object[] f8590g;

    /* renamed from: h */
    private final transient int f8591h;

    /* renamed from: com.applovin.impl.ni$a */
    /* loaded from: classes2.dex */
    public static class C5013a extends AbstractC4518hb {

        /* renamed from: c */
        private final transient AbstractC4387fb f8592c;

        /* renamed from: d */
        private final transient Object[] f8593d;

        /* renamed from: f */
        private final transient int f8594f;

        /* renamed from: g */
        private final transient int f8595g;

        /* renamed from: com.applovin.impl.ni$a$a */
        /* loaded from: classes2.dex */
        class C5014a extends AbstractC4247db {
            C5014a() {
                C5013a.this = r1;
            }

            @Override // java.util.List
            /* renamed from: b */
            public Map.Entry get(int i) {
                Preconditions.checkElementIndex(i, C5013a.this.f8595g);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(C5013a.this.f8593d[C5013a.this.f8594f + i2], C5013a.this.f8593d[i2 + (C5013a.this.f8594f ^ 1)]);
            }

            @Override // com.applovin.impl.AbstractC4113bb
            /* renamed from: e */
            public boolean mo96650e() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C5013a.this.f8595g;
            }
        }

        C5013a(AbstractC4387fb abstractC4387fb, Object[] objArr, int i, int i2) {
            this.f8592c = abstractC4387fb;
            this.f8593d = objArr;
            this.f8594f = i;
            this.f8595g = i2;
        }

        @Override // com.applovin.impl.AbstractC4113bb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f8592c.get(key))) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: e */
        public boolean mo96650e() {
            return true;
        }

        @Override // com.applovin.impl.AbstractC4518hb
        /* renamed from: f */
        AbstractC4247db mo96649f() {
            return new C5014a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public AbstractC5139pp iterator() {
            return mo96955a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f8595g;
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: a */
        public int mo96654a(Object[] objArr, int i) {
            return mo96955a().mo96654a(objArr, i);
        }
    }

    /* renamed from: com.applovin.impl.ni$b */
    /* loaded from: classes2.dex */
    static final class C5015b extends AbstractC4518hb {

        /* renamed from: c */
        private final transient AbstractC4387fb f8597c;

        /* renamed from: d */
        private final transient AbstractC4247db f8598d;

        C5015b(AbstractC4387fb abstractC4387fb, AbstractC4247db abstractC4247db) {
            this.f8597c = abstractC4387fb;
            this.f8598d = abstractC4247db;
        }

        @Override // com.applovin.impl.AbstractC4518hb, com.applovin.impl.AbstractC4113bb
        /* renamed from: a */
        public AbstractC4247db mo96955a() {
            return this.f8598d;
        }

        @Override // com.applovin.impl.AbstractC4113bb, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (this.f8597c.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: e */
        public boolean mo96650e() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public AbstractC5139pp iterator() {
            return mo96955a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f8597c.size();
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: a */
        public int mo96654a(Object[] objArr, int i) {
            return mo96955a().mo96654a(objArr, i);
        }
    }

    /* renamed from: com.applovin.impl.ni$c */
    /* loaded from: classes2.dex */
    static final class C5016c extends AbstractC4247db {

        /* renamed from: c */
        private final transient Object[] f8599c;

        /* renamed from: d */
        private final transient int f8600d;

        /* renamed from: f */
        private final transient int f8601f;

        C5016c(Object[] objArr, int i, int i2) {
            this.f8599c = objArr;
            this.f8600d = i;
            this.f8601f = i2;
        }

        @Override // com.applovin.impl.AbstractC4113bb
        /* renamed from: e */
        public boolean mo96650e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.f8601f);
            return this.f8599c[(i * 2) + this.f8600d];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f8601f;
        }
    }

    private C5012ni(int[] iArr, Object[] objArr, int i) {
        this.f8589f = iArr;
        this.f8590g = objArr;
        this.f8591h = i;
    }

    /* renamed from: a */
    public static C5012ni m96966a(int i, Object[] objArr) {
        if (i == 0) {
            return (C5012ni) f8588i;
        }
        if (i == 1) {
            AbstractC5103p3.m96597a(objArr[0], objArr[1]);
            return new C5012ni(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        return new C5012ni(m96964a(objArr, i, AbstractC4518hb.m98749a(i), 0), objArr, i);
    }

    @Override // com.applovin.impl.AbstractC4387fb
    /* renamed from: b */
    AbstractC4518hb mo96963b() {
        return new C5013a(this, this.f8590g, 0, this.f8591h);
    }

    @Override // com.applovin.impl.AbstractC4387fb
    /* renamed from: c */
    AbstractC4518hb mo96962c() {
        return new C5015b(this, new C5016c(this.f8590g, 0, this.f8591h));
    }

    @Override // com.applovin.impl.AbstractC4387fb
    /* renamed from: d */
    AbstractC4113bb mo96961d() {
        return new C5016c(this.f8590g, 1, this.f8591h);
    }

    @Override // com.applovin.impl.AbstractC4387fb
    /* renamed from: f */
    boolean mo96960f() {
        return false;
    }

    @Override // com.applovin.impl.AbstractC4387fb, java.util.Map
    public Object get(Object obj) {
        return m96965a(this.f8589f, this.f8590g, this.f8591h, 0, obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f8591h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int[] m96964a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.applovin.impl.AbstractC5103p3.m96597a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L77
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.applovin.impl.AbstractC5103p3.m96597a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.impl.AbstractC4643ja.m98282a(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C5012ni.m96964a(java.lang.Object[], int, int, int):int[]");
    }

    /* renamed from: a */
    static Object m96965a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int m98282a = AbstractC4643ja.m98282a(obj.hashCode());
            while (true) {
                int i3 = m98282a & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                m98282a = i3 + 1;
            }
        }
    }
}
