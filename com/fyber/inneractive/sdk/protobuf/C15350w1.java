package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.w1 */
/* loaded from: classes4.dex */
public final class C15350w1 extends AbstractC15353x1 {
    public C15350w1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final boolean mo76708a() {
        if (super.mo76708a()) {
            try {
                Class<?> cls = this.f30338a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                AbstractC15356y1.m76668a(th);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r3.getType() == java.lang.Long.TYPE) goto L13;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo76700b() {
        /*
            r11 = this;
            java.lang.String r0 = "copyMemory"
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "getLong"
            sun.misc.Unsafe r3 = r11.f30338a
            r4 = 0
            if (r3 != 0) goto Ld
            goto Lbf
        Ld:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = "objectFieldOffset"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
            r7[r4] = r8     // Catch: java.lang.Throwable -> Lbb
            r3.getMethod(r5, r7)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lbb
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lbb
            r8[r4] = r1     // Catch: java.lang.Throwable -> Lbb
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lbb
            r3.getMethod(r2, r8)     // Catch: java.lang.Throwable -> Lbb
            boolean r3 = com.fyber.inneractive.sdk.protobuf.AbstractC15291d.m76886a()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class<java.nio.Buffer> r8 = java.nio.Buffer.class
            r9 = 0
            if (r3 == 0) goto L3e
            java.lang.String r3 = "effectiveDirectAddress"
            java.lang.reflect.Field r3 = r8.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
            r3 = r9
        L3a:
            if (r3 == 0) goto L3e
        L3c:
            r9 = r3
            goto L51
        L3e:
            java.lang.String r3 = "address"
            java.lang.reflect.Field r3 = r8.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r3 = r9
        L46:
            if (r3 == 0) goto L51
            java.lang.Class r8 = r3.getType()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lbb
            if (r8 != r10) goto L51
            goto L3c
        L51:
            if (r9 != 0) goto L54
            goto Lbf
        L54:
            sun.misc.Unsafe r3 = r11.f30338a     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "getByte"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lb6
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "putByte"
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb6
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> Lb6
            r9[r6] = r10     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "getInt"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lb6
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "putInt"
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb6
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb6
            r9[r6] = r10     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lb6
            r8[r4] = r5     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r2, r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "putLong"
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb6
            r8[r4] = r5     // Catch: java.lang.Throwable -> Lb6
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r2, r8)     // Catch: java.lang.Throwable -> Lb6
            r2 = 3
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lb6
            r8[r4] = r5     // Catch: java.lang.Throwable -> Lb6
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lb6
            r8[r7] = r5     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r0, r8)     // Catch: java.lang.Throwable -> Lb6
            r8 = 5
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Lb6
            r8[r4] = r1     // Catch: java.lang.Throwable -> Lb6
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lb6
            r8[r7] = r1     // Catch: java.lang.Throwable -> Lb6
            r8[r2] = r5     // Catch: java.lang.Throwable -> Lb6
            r1 = 4
            r8[r1] = r5     // Catch: java.lang.Throwable -> Lb6
            r3.getMethod(r0, r8)     // Catch: java.lang.Throwable -> Lb6
            return r6
        Lb6:
            r0 = move-exception
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.m76668a(r0)
            return r4
        Lbb:
            r0 = move-exception
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.m76668a(r0)
        Lbf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C15350w1.mo76700b():boolean");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: c */
    public final double mo76698c(Object obj, long j) {
        return this.f30338a.getDouble(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: d */
    public final float mo76697d(Object obj, long j) {
        return this.f30338a.getFloat(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76704a(Object obj, long j, byte b) {
        this.f30338a.putByte(obj, j, b);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final boolean mo76705a(Object obj, long j) {
        return this.f30338a.getBoolean(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76701a(Object obj, long j, boolean z) {
        this.f30338a.putBoolean(obj, j, z);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76702a(Object obj, long j, float f) {
        this.f30338a.putFloat(obj, j, f);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76703a(Object obj, long j, double d) {
        this.f30338a.putDouble(obj, j, d);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final byte mo76707a(long j) {
        return this.f30338a.getByte(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: a */
    public final void mo76706a(long j, byte[] bArr, long j2) {
        this.f30338a.copyMemory((Object) null, j, bArr, AbstractC15356y1.f30349f, j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15353x1
    /* renamed from: b */
    public final byte mo76699b(Object obj, long j) {
        return this.f30338a.getByte(obj, j);
    }
}
