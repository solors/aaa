package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class Finalizer implements Runnable {

    /* renamed from: f */
    private static final Logger f39487f = Logger.getLogger(Finalizer.class.getName());

    /* renamed from: g */
    private static final Constructor<Thread> f39488g;

    /* renamed from: h */
    private static final Field f39489h;

    /* renamed from: i */
    public static final /* synthetic */ int f39490i = 0;

    /* renamed from: b */
    private final WeakReference<Class<?>> f39491b;

    /* renamed from: c */
    private final PhantomReference<Object> f39492c;

    /* renamed from: d */
    private final ReferenceQueue<Object> f39493d;

    static {
        Field field;
        Constructor<Thread> m69986b = m69986b();
        f39488g = m69986b;
        if (m69986b == null) {
            field = m69984d();
        } else {
            field = null;
        }
        f39489h = field;
    }

    private Finalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.f39493d = referenceQueue;
        this.f39491b = new WeakReference<>(cls);
        this.f39492c = phantomReference;
    }

    /* renamed from: a */
    private boolean m69987a(Reference<?> reference) {
        Method m69985c = m69985c();
        if (m69985c == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.f39492c) {
                return false;
            }
            try {
                m69985c.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                f39487f.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.f39493d.poll();
        } while (reference != null);
        return true;
    }

    /* renamed from: b */
    private static Constructor<Thread> m69986b() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private Method m69985c() {
        Class<?> cls = this.f39491b.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    private static Field m69984d() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f39487f.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        com.google.common.base.internal.Finalizer.f39487f.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:15:0x0052, B:17:0x0056), top: B:25:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void startFinalizer(java.lang.Class<?> r5, java.lang.ref.ReferenceQueue<java.lang.Object> r6, java.lang.ref.PhantomReference<java.lang.Object> r7) {
        /*
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "com.google.common.base.FinalizableReference"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L68
            com.google.common.base.internal.Finalizer r0 = new com.google.common.base.internal.Finalizer
            r0.<init>(r5, r6, r7)
            java.lang.Class<com.google.common.base.internal.Finalizer> r5 = com.google.common.base.internal.Finalizer.class
            java.lang.String r5 = r5.getName()
            java.lang.reflect.Constructor<java.lang.Thread> r6 = com.google.common.base.internal.Finalizer.f39488g
            r7 = 1
            r1 = 0
            if (r6 == 0) goto L47
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Throwable -> L3d
            r2[r7] = r0     // Catch: java.lang.Throwable -> L3d
            r3 = 2
            r2[r3] = r5     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L3d
            r4 = 3
            r2[r4] = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3d
            r4 = 4
            r2[r4] = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r6 = r6.newInstance(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r6 = (java.lang.Thread) r6     // Catch: java.lang.Throwable -> L3d
            goto L48
        L3d:
            r6 = move-exception
            java.util.logging.Logger r2 = com.google.common.base.internal.Finalizer.f39487f
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            java.lang.String r4 = "Failed to create a thread without inherited thread-local values"
            r2.log(r3, r4, r6)
        L47:
            r6 = r1
        L48:
            if (r6 != 0) goto L4f
            java.lang.Thread r6 = new java.lang.Thread
            r6.<init>(r1, r0, r5)
        L4f:
            r6.setDaemon(r7)
            java.lang.reflect.Field r5 = com.google.common.base.internal.Finalizer.f39489h     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L64
            r5.set(r6, r1)     // Catch: java.lang.Throwable -> L5a
            goto L64
        L5a:
            r5 = move-exception
            java.util.logging.Logger r7 = com.google.common.base.internal.Finalizer.f39487f
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            java.lang.String r1 = "Failed to clear thread local values inherited by reference finalizer thread."
            r7.log(r0, r1, r5)
        L64:
            r6.start()
            return
        L68:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Expected com.google.common.base.FinalizableReference."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.internal.Finalizer.startFinalizer(java.lang.Class, java.lang.ref.ReferenceQueue, java.lang.ref.PhantomReference):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        while (m69987a(this.f39493d.remove())) {
        }
    }
}
