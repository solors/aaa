package org.slf4j.helpers;

import java.io.PrintStream;

/* compiled from: Util.java */
/* renamed from: org.slf4j.helpers.g */
/* loaded from: classes10.dex */
public final class C39241g {

    /* renamed from: a */
    private static C39243b f103068a = null;

    /* renamed from: b */
    private static boolean f103069b = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Util.java */
    /* renamed from: org.slf4j.helpers.g$b */
    /* loaded from: classes10.dex */
    public static final class C39243b extends SecurityManager {
        private C39243b() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private C39241g() {
    }

    /* renamed from: a */
    public static Class<?> m13368a() {
        int i;
        C39243b m13367b = m13367b();
        if (m13367b == null) {
            return null;
        }
        Class<?>[] classContext = m13367b.getClassContext();
        String name = C39241g.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    /* renamed from: b */
    private static C39243b m13367b() {
        C39243b c39243b = f103068a;
        if (c39243b != null) {
            return c39243b;
        }
        if (f103069b) {
            return null;
        }
        C39243b m13364e = m13364e();
        f103068a = m13364e;
        f103069b = true;
        return m13364e;
    }

    /* renamed from: c */
    public static final void m13366c(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    /* renamed from: d */
    public static final void m13365d(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: e */
    private static C39243b m13364e() {
        try {
            return new C39243b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m13363f(String str) {
        String m13362g = m13362g(str);
        if (m13362g == null) {
            return false;
        }
        return m13362g.equalsIgnoreCase("true");
    }

    /* renamed from: g */
    public static String m13362g(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("null input");
    }
}
