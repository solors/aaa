package com.google.common.cache;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
abstract class Striped64 extends Number {

    /* renamed from: f */
    static final ThreadLocal<int[]> f39689f = new ThreadLocal<>();

    /* renamed from: g */
    static final Random f39690g = new Random();

    /* renamed from: h */
    static final int f39691h = Runtime.getRuntime().availableProcessors();

    /* renamed from: i */
    private static final Unsafe f39692i;

    /* renamed from: j */
    private static final long f39693j;

    /* renamed from: k */
    private static final long f39694k;

    /* renamed from: b */
    volatile transient Cell[] f39695b;

    /* renamed from: c */
    volatile transient long f39696c;

    /* renamed from: d */
    volatile transient int f39697d;

    /* loaded from: classes4.dex */
    static final class Cell {

        /* renamed from: b */
        private static final Unsafe f39698b;

        /* renamed from: c */
        private static final long f39699c;

        /* renamed from: a */
        volatile long f39700a;

        static {
            try {
                Unsafe m69827a = Striped64.m69827a();
                f39698b = m69827a;
                f39699c = m69827a.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        Cell(long j) {
            this.f39700a = j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean m69820a(long j, long j2) {
            return f39698b.compareAndSwapLong(this, f39699c, j, j2);
        }
    }

    static {
        try {
            Unsafe m69823e = m69823e();
            f39692i = m69823e;
            f39693j = m69823e.objectFieldOffset(Striped64.class.getDeclaredField(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM));
            f39694k = m69823e.objectFieldOffset(Striped64.class.getDeclaredField("d"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Unsafe m69827a() {
        return m69823e();
    }

    /* renamed from: e */
    private static Unsafe m69823e() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
                    @Override // java.security.PrivilegedExceptionAction
                    public Unsafe run() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m69826b(long j, long j2) {
        return f39692i.compareAndSwapLong(this, f39693j, j, j2);
    }

    /* renamed from: c */
    final boolean m69825c() {
        return f39692i.compareAndSwapInt(this, f39694k, 0, 1);
    }

    /* renamed from: d */
    abstract long mo69824d(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m69822f(long j) {
        Cell[] cellArr = this.f39695b;
        this.f39696c = j;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.f39700a = j;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ee A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m69821g(long r17, int[] r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.m69821g(long, int[], boolean):void");
    }
}
