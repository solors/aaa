package com.yandex.mobile.ads.impl;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class dk1<K, V> extends ph0<K, V> {

    /* renamed from: h */
    static final ph0<Object, Object> f78176h = new dk1(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    private final transient Object f78177e;

    /* renamed from: f */
    final transient Object[] f78178f;

    /* renamed from: g */
    private final transient int f78179g;

    /* renamed from: com.yandex.mobile.ads.impl.dk1$a */
    /* loaded from: classes8.dex */
    static class C30174a<K, V> extends qh0<Map.Entry<K, V>> {

        /* renamed from: d */
        private final transient ph0<K, V> f78180d;

        /* renamed from: e */
        private final transient Object[] f78181e;

        /* renamed from: f */
        private final transient int f78182f = 0;

        /* renamed from: g */
        private final transient int f78183g;

        /* renamed from: com.yandex.mobile.ads.impl.dk1$a$a */
        /* loaded from: classes8.dex */
        final class C30175a extends oh0<Map.Entry<K, V>> {
            C30175a() {
            }

            @Override // com.yandex.mobile.ads.impl.mh0
            /* renamed from: f */
            public final boolean mo30881f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                uf1.m28796a(i, C30174a.this.f78183g);
                C30174a c30174a = C30174a.this;
                int i2 = i * 2;
                Object obj = c30174a.f78181e[c30174a.f78182f + i2];
                Objects.requireNonNull(obj);
                C30174a c30174a2 = C30174a.this;
                Object obj2 = c30174a2.f78181e[i2 + (c30174a2.f78182f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return C30174a.this.f78183g;
            }
        }

        C30174a(ph0 ph0Var, Object[] objArr, int i) {
            this.f78180d = ph0Var;
            this.f78181e = objArr;
            this.f78183g = i;
        }

        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: a */
        final int mo30882a(int i, Object[] objArr) {
            return mo30356b().mo30882a(i, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f78180d.get(key))) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: f */
        public final boolean mo30881f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.qh0
        /* renamed from: g */
        final oh0<Map.Entry<K, V>> mo30354g() {
            return new C30175a();
        }

        @Override // com.yandex.mobile.ads.impl.qh0, com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final d32<Map.Entry<K, V>> iterator() {
            return mo30356b().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f78183g;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dk1$b */
    /* loaded from: classes8.dex */
    static final class C30176b<K> extends qh0<K> {

        /* renamed from: d */
        private final transient ph0<K, ?> f78185d;

        /* renamed from: e */
        private final transient oh0<K> f78186e;

        C30176b(ph0<K, ?> ph0Var, oh0<K> oh0Var) {
            this.f78185d = ph0Var;
            this.f78186e = oh0Var;
        }

        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: a */
        final int mo30882a(int i, Object[] objArr) {
            return this.f78186e.mo30882a(i, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.qh0, com.yandex.mobile.ads.impl.mh0
        /* renamed from: b */
        public final oh0<K> mo30356b() {
            return this.f78186e;
        }

        @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (this.f78185d.get(obj) != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: f */
        public final boolean mo30881f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.qh0, com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final d32<K> iterator() {
            return this.f78186e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f78185d.size();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dk1$c */
    /* loaded from: classes8.dex */
    static final class C30177c extends oh0<Object> {

        /* renamed from: e */
        private final transient Object[] f78187e;

        /* renamed from: f */
        private final transient int f78188f;

        /* renamed from: g */
        private final transient int f78189g;

        C30177c(Object[] objArr, int i, int i2) {
            this.f78187e = objArr;
            this.f78188f = i;
            this.f78189g = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: f */
        public final boolean mo30881f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            uf1.m28796a(i, this.f78189g);
            Object obj = this.f78187e[(i * 2) + this.f78188f];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f78189g;
        }
    }

    private dk1(Object obj, Object[] objArr, int i) {
        this.f78177e = obj;
        this.f78178f = objArr;
        this.f78179g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> com.yandex.mobile.ads.impl.dk1<K, V> m34895a(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dk1.m34895a(int, java.lang.Object[]):com.yandex.mobile.ads.impl.dk1");
    }

    @Override // com.yandex.mobile.ads.impl.ph0
    /* renamed from: b */
    final qh0<Map.Entry<K, V>> mo30668b() {
        return new C30174a(this, this.f78178f, this.f78179g);
    }

    @Override // com.yandex.mobile.ads.impl.ph0
    /* renamed from: c */
    final qh0<K> mo30667c() {
        return new C30176b(this, new C30177c(this.f78178f, 0, this.f78179g));
    }

    @Override // com.yandex.mobile.ads.impl.ph0
    /* renamed from: d */
    final mh0<V> mo30666d() {
        return new C30177c(this.f78178f, 1, this.f78179g);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    @Override // com.yandex.mobile.ads.impl.ph0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f78177e
            java.lang.Object[] r1 = r8.f78178f
            int r2 = r8.f78179g
            r3 = 0
            if (r9 != 0) goto Lb
            goto L8d
        Lb:
            r4 = 1
            if (r2 != r4) goto L21
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L8d
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9b
        L21:
            if (r0 != 0) goto L24
            goto L8d
        L24:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L4f
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.impl.sc0.m29647a(r0)
        L36:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            goto L8d
        L3f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L4c:
            int r0 = r0 + 1
            goto L36
        L4f:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7b
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.impl.sc0.m29647a(r0)
        L61:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6b
            goto L8d
        L6b:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L78
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L78:
            int r0 = r0 + 1
            goto L61
        L7b:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.yandex.mobile.ads.impl.sc0.m29647a(r5)
        L87:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L8f
        L8d:
            r9 = r3
            goto L9b
        L8f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L9f
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9b:
            if (r9 != 0) goto L9e
            return r3
        L9e:
            return r9
        L9f:
            int r5 = r5 + 1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dk1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f78179g;
    }

    /* renamed from: a */
    private static IllegalArgumentException m34894a(Object obj, Object obj2, Object[] objArr, int i) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i] + "=" + objArr[i ^ 1]);
    }
}
