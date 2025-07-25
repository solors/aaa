package com.fyber.inneractive.sdk.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.y1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15356y1 {

    /* renamed from: a */
    public static final Unsafe f30344a;

    /* renamed from: b */
    public static final Class f30345b;

    /* renamed from: c */
    public static final AbstractC15353x1 f30346c;

    /* renamed from: d */
    public static final boolean f30347d;

    /* renamed from: e */
    public static final boolean f30348e;

    /* renamed from: f */
    public static final long f30349f;

    /* renamed from: g */
    public static final long f30350g;

    /* renamed from: h */
    public static final boolean f30351h;

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|2|3|4|(17:6|(1:(1:9)(1:(1:46)))(1:47)|10|(1:12)(1:44)|13|(1:15)(1:43)|16|(3:18|19|20)|35|36|37|(1:39)|(1:32)(1:25)|26|(1:28)|29|30)|48|10|(0)(0)|13|(0)(0)|16|(0)|35|36|37|(0)|(0)|32|26|(0)|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r3.getType() == java.lang.Long.TYPE) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    static {
        /*
            r0 = 0
            com.fyber.inneractive.sdk.protobuf.t1 r1 = new com.fyber.inneractive.sdk.protobuf.t1     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.lang.Throwable -> Ld
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30344a = r1
            java.lang.Class r2 = com.fyber.inneractive.sdk.protobuf.AbstractC15291d.f30243a
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30345b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r2 = m76664c(r2)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r3 = m76664c(r3)
            if (r1 != 0) goto L23
            goto L39
        L23:
            boolean r4 = com.fyber.inneractive.sdk.protobuf.AbstractC15291d.m76886a()
            if (r4 == 0) goto L3b
            if (r2 == 0) goto L31
            com.fyber.inneractive.sdk.protobuf.v1 r2 = new com.fyber.inneractive.sdk.protobuf.v1
            r2.<init>(r1)
            goto L40
        L31:
            if (r3 == 0) goto L39
            com.fyber.inneractive.sdk.protobuf.u1 r2 = new com.fyber.inneractive.sdk.protobuf.u1
            r2.<init>(r1)
            goto L40
        L39:
            r2 = r0
            goto L40
        L3b:
            com.fyber.inneractive.sdk.protobuf.w1 r2 = new com.fyber.inneractive.sdk.protobuf.w1
            r2.<init>(r1)
        L40:
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30346c = r2
            r1 = 0
            if (r2 != 0) goto L47
            r3 = r1
            goto L4b
        L47:
            boolean r3 = r2.mo76700b()
        L4b:
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30347d = r3
            if (r2 != 0) goto L51
            r3 = r1
            goto L55
        L51:
            boolean r3 = r2.mo76708a()
        L55:
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30348e = r3
            java.lang.Class<byte[]> r3 = byte[].class
            int r3 = m76673a(r3)
            long r3 = (long) r3
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30349f = r3
            java.lang.Class<boolean[]> r3 = boolean[].class
            m76673a(r3)
            m76667b(r3)
            java.lang.Class<int[]> r3 = int[].class
            m76673a(r3)
            m76667b(r3)
            java.lang.Class<long[]> r3 = long[].class
            m76673a(r3)
            m76667b(r3)
            java.lang.Class<float[]> r3 = float[].class
            m76673a(r3)
            m76667b(r3)
            java.lang.Class<double[]> r3 = double[].class
            m76673a(r3)
            m76667b(r3)
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            m76673a(r3)
            m76667b(r3)
            boolean r3 = com.fyber.inneractive.sdk.protobuf.AbstractC15291d.m76886a()
            java.lang.Class<java.nio.Buffer> r4 = java.nio.Buffer.class
            if (r3 == 0) goto La4
            java.lang.String r3 = "effectiveDirectAddress"
            java.lang.reflect.Field r3 = r4.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L9f
            goto La0
        L9f:
            r3 = r0
        La0:
            if (r3 == 0) goto La4
        La2:
            r0 = r3
            goto Lb7
        La4:
            java.lang.String r3 = "address"
            java.lang.reflect.Field r3 = r4.getDeclaredField(r3)     // Catch: java.lang.Throwable -> Lab
            goto Lac
        Lab:
            r3 = r0
        Lac:
            if (r3 == 0) goto Lb7
            java.lang.Class r4 = r3.getType()
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r4 != r5) goto Lb7
            goto La2
        Lb7:
            if (r0 == 0) goto Lc3
            if (r2 != 0) goto Lbc
            goto Lc3
        Lbc:
            sun.misc.Unsafe r2 = r2.f30338a
            long r2 = r2.objectFieldOffset(r0)
            goto Lc5
        Lc3:
            r2 = -1
        Lc5:
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30350g = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r2) goto Ld0
            r1 = 1
        Ld0:
            com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.f30351h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.AbstractC15356y1.<clinit>():void");
    }

    /* renamed from: a */
    public static int m76673a(Class cls) {
        if (f30348e) {
            return f30346c.f30338a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static void m76667b(Class cls) {
        if (f30348e) {
            f30346c.f30338a.arrayIndexScale(cls);
        }
    }

    /* renamed from: c */
    public static int m76663c(Object obj, long j) {
        return f30346c.f30338a.getInt(obj, j);
    }

    /* renamed from: d */
    public static long m76662d(Object obj, long j) {
        return f30346c.f30338a.getLong(obj, j);
    }

    /* renamed from: e */
    public static Object m76661e(Object obj, long j) {
        return f30346c.f30338a.getObject(obj, j);
    }

    /* renamed from: a */
    public static void m76670a(Object obj, long j, int i) {
        f30346c.f30338a.putInt(obj, j, i);
    }

    /* renamed from: b */
    public static byte m76666b(Object obj, long j) {
        return (byte) ((m76663c(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static boolean m76664c(Class cls) {
        if (AbstractC15291d.m76886a()) {
            try {
                Class cls2 = f30345b;
                Class cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m76665b(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m76670a(obj, j2, ((255 & b) << i) | (m76663c(obj, j2) & (~(255 << i))));
    }

    /* renamed from: a */
    public static void m76669a(Object obj, long j, long j2) {
        f30346c.f30338a.putLong(obj, j, j2);
    }

    /* renamed from: a */
    public static void m76674a(long j, Object obj, Object obj2) {
        f30346c.f30338a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    public static byte m76672a(Object obj, long j) {
        return (byte) ((m76663c(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: a */
    public static void m76671a(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m76663c = m76663c(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m76670a(obj, j2, ((255 & b) << i) | (m76663c & (~(255 << i))));
    }

    /* renamed from: a */
    public static void m76668a(Throwable th) {
        Logger logger = Logger.getLogger(AbstractC15356y1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
