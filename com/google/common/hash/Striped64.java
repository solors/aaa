package com.google.common.hash;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class Striped64 extends Number {

    /* renamed from: f */
    static final ThreadLocal<int[]> f41190f = new ThreadLocal<>();

    /* renamed from: g */
    static final Random f41191g = new Random();

    /* renamed from: h */
    static final int f41192h = Runtime.getRuntime().availableProcessors();

    /* renamed from: i */
    private static final Unsafe f41193i;

    /* renamed from: j */
    private static final long f41194j;

    /* renamed from: k */
    private static final long f41195k;

    /* renamed from: b */
    volatile transient Cell[] f41196b;

    /* renamed from: c */
    volatile transient long f41197c;

    /* renamed from: d */
    volatile transient int f41198d;

    /* loaded from: classes4.dex */
    static final class Cell {

        /* renamed from: b */
        private static final Unsafe f41199b;

        /* renamed from: c */
        private static final long f41200c;

        /* renamed from: a */
        volatile long f41201a;

        static {
            try {
                Unsafe m68280a = Striped64.m68280a();
                f41199b = m68280a;
                f41200c = m68280a.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        Cell(long j) {
            this.f41201a = j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean m68273a(long j, long j2) {
            return f41199b.compareAndSwapLong(this, f41200c, j, j2);
        }
    }

    static {
        try {
            Unsafe m68276e = m68276e();
            f41193i = m68276e;
            f41194j = m68276e.objectFieldOffset(Striped64.class.getDeclaredField(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM));
            f41195k = m68276e.objectFieldOffset(Striped64.class.getDeclaredField("d"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Unsafe m68280a() {
        return m68276e();
    }

    /* renamed from: e */
    private static Unsafe m68276e() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.Striped64.1
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
    public final boolean m68279b(long j, long j2) {
        return f41193i.compareAndSwapLong(this, f41194j, j, j2);
    }

    /* renamed from: c */
    final boolean m68278c() {
        return f41193i.compareAndSwapInt(this, f41195k, 0, 1);
    }

    /* renamed from: d */
    abstract long mo68277d(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m68275f(long j) {
        Cell[] cellArr = this.f41196b;
        this.f41197c = j;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.f41201a = j;
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
    public final void m68274g(long r17, int[] r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.m68274g(long, int[], boolean):void");
    }
}
