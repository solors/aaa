package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.protobuf.z0 */
/* loaded from: classes4.dex */
public final class C15358z0 extends LinkedHashMap {

    /* renamed from: b */
    public static final C15358z0 f30352b;

    /* renamed from: a */
    public boolean f30353a;

    static {
        C15358z0 c15358z0 = new C15358z0();
        f30352b = c15358z0;
        c15358z0.f30353a = false;
    }

    public C15358z0() {
        this.f30353a = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.f30353a) {
            super.clear();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto Lb
            goto L5a
        Lb:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
            goto L58
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L58
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
        L58:
            r7 = r1
            goto L5b
        L5a:
            r7 = r0
        L5b:
            if (r7 == 0) goto L5e
            r1 = r0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C15358z0.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC15319m0.f30280a;
                hashCode = bArr.length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else if (!(key instanceof InterfaceC15295e0)) {
                hashCode = key.hashCode();
            } else {
                throw new UnsupportedOperationException();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC15319m0.f30280a;
                int length = bArr2.length;
                for (byte b2 : bArr2) {
                    length = (length * 31) + b2;
                }
                if (length != 0) {
                    i2 = length;
                }
            } else if (!(value instanceof InterfaceC15295e0)) {
                i2 = value.hashCode();
            } else {
                throw new UnsupportedOperationException();
            }
            i += hashCode ^ i2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (this.f30353a) {
            Charset charset = AbstractC15319m0.f30280a;
            obj.getClass();
            obj2.getClass();
            return super.put(obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (this.f30353a) {
            for (Object obj : map.keySet()) {
                Charset charset = AbstractC15319m0.f30280a;
                obj.getClass();
                map.get(obj).getClass();
            }
            super.putAll(map);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.f30353a) {
            return super.remove(obj);
        }
        throw new UnsupportedOperationException();
    }

    public C15358z0(Map map) {
        super(map);
        this.f30353a = true;
    }
}
