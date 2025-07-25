package p852qf;

import com.ironsource.C21114v8;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.C39241g;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import p868rf.SubstituteLoggingEvent;

/* compiled from: LoggerFactory.java */
/* renamed from: qf.b */
/* loaded from: classes10.dex */
public final class C39417b {

    /* renamed from: a */
    static volatile int f103629a;

    /* renamed from: b */
    static final SubstituteLoggerFactory f103630b = new SubstituteLoggerFactory();

    /* renamed from: c */
    static final NOPLoggerFactory f103631c = new NOPLoggerFactory();

    /* renamed from: d */
    static boolean f103632d = C39241g.m13363f("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    private static final String[] f103633e = {"1.6", "1.7"};

    /* renamed from: f */
    private static String f103634f = "org/slf4j/impl/StaticLoggerBinder.class";

    private C39417b() {
    }

    /* renamed from: a */
    private static final void m12748a() {
        Set<URL> set;
        try {
            try {
                if (!m12737l()) {
                    set = m12743f();
                    m12729t(set);
                } else {
                    set = null;
                }
                StaticLoggerBinder.getSingleton();
                f103629a = 3;
                m12730s(set);
            } catch (Exception e) {
                m12744e(e);
                throw new IllegalStateException("Unexpected initialization failure", e);
            } catch (NoClassDefFoundError e2) {
                if (m12736m(e2.getMessage())) {
                    f103629a = 4;
                    C39241g.m13366c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    C39241g.m13366c("Defaulting to no-operation (NOP) logger implementation");
                    C39241g.m13366c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                } else {
                    m12744e(e2);
                    throw e2;
                }
            } catch (NoSuchMethodError e3) {
                String message = e3.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f103629a = 2;
                    C39241g.m13366c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    C39241g.m13366c("Your binding is version 1.5.5 or earlier.");
                    C39241g.m13366c("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            }
        } finally {
            m12733p();
        }
    }

    /* renamed from: b */
    private static void m12747b(SubstituteLoggingEvent substituteLoggingEvent, int i) {
        if (substituteLoggingEvent.m12252a().m13377e()) {
            m12746c(i);
        } else if (!substituteLoggingEvent.m12252a().m13376f()) {
            m12745d();
        }
    }

    /* renamed from: c */
    private static void m12746c(int i) {
        C39241g.m13366c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C39241g.m13366c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C39241g.m13366c("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: d */
    private static void m12745d() {
        C39241g.m13366c("The following set of substitute loggers may have been accessed");
        C39241g.m13366c("during the initialization phase. Logging calls during this");
        C39241g.m13366c("phase were not honored. However, subsequent logging calls to these");
        C39241g.m13366c("loggers will work as normally expected.");
        C39241g.m13366c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: e */
    static void m12744e(Throwable th) {
        f103629a = 2;
        C39241g.m13365d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: f */
    static Set<URL> m12743f() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C39417b.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(f103634f);
            } else {
                resources = classLoader.getResources(f103634f);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e) {
            C39241g.m13365d("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    private static void m12742g() {
        SubstituteLoggerFactory substituteLoggerFactory = f103630b;
        synchronized (substituteLoggerFactory) {
            substituteLoggerFactory.m13369e();
            for (SubstituteLogger substituteLogger : substituteLoggerFactory.m13370d()) {
                substituteLogger.m13373i(m12739j(substituteLogger.getName()));
            }
        }
    }

    /* renamed from: h */
    public static ILoggerFactory m12741h() {
        if (f103629a == 0) {
            synchronized (C39417b.class) {
                if (f103629a == 0) {
                    f103629a = 1;
                    m12734o();
                }
            }
        }
        int i = f103629a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return f103631c;
                    }
                    throw new IllegalStateException("Unreachable code");
                }
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            }
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        return f103630b;
    }

    /* renamed from: i */
    public static InterfaceC39416a m12740i(Class<?> cls) {
        Class<?> m13368a;
        InterfaceC39416a m12739j = m12739j(cls.getName());
        if (f103632d && (m13368a = C39241g.m13368a()) != null && m12735n(cls, m13368a)) {
            C39241g.m13366c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", m12739j.getName(), m13368a.getName()));
            C39241g.m13366c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return m12739j;
    }

    /* renamed from: j */
    public static InterfaceC39416a m12739j(String str) {
        return m12741h().mo12749a(str);
    }

    /* renamed from: k */
    private static boolean m12738k(Set<URL> set) {
        if (set.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static boolean m12737l() {
        String m13362g = C39241g.m13362g("java.vendor.url");
        if (m13362g == null) {
            return false;
        }
        return m13362g.toLowerCase().contains("android");
    }

    /* renamed from: m */
    private static boolean m12736m(String str) {
        if (str == null) {
            return false;
        }
        if (!str.contains("org/slf4j/impl/StaticLoggerBinder") && !str.contains("org.slf4j.impl.StaticLoggerBinder")) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m12735n(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: o */
    private static final void m12734o() {
        m12748a();
        if (f103629a == 3) {
            m12728u();
        }
    }

    /* renamed from: p */
    private static void m12733p() {
        m12742g();
        m12732q();
        f103630b.m13372b();
    }

    /* renamed from: q */
    private static void m12732q() {
        LinkedBlockingQueue<SubstituteLoggingEvent> m13371c = f103630b.m13371c();
        int size = m13371c.size();
        ArrayList<SubstituteLoggingEvent> arrayList = new ArrayList(128);
        int i = 0;
        while (m13371c.drainTo(arrayList, 128) != 0) {
            for (SubstituteLoggingEvent substituteLoggingEvent : arrayList) {
                m12731r(substituteLoggingEvent);
                int i2 = i + 1;
                if (i == 0) {
                    m12747b(substituteLoggingEvent, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: r */
    private static void m12731r(SubstituteLoggingEvent substituteLoggingEvent) {
        if (substituteLoggingEvent == null) {
            return;
        }
        SubstituteLogger m12252a = substituteLoggingEvent.m12252a();
        String name = m12252a.getName();
        if (!m12252a.m13375g()) {
            if (!m12252a.m13376f()) {
                if (m12252a.m13377e()) {
                    m12252a.m13374h(substituteLoggingEvent);
                    return;
                } else {
                    C39241g.m13366c(name);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Delegate logger cannot be null at this state.");
    }

    /* renamed from: s */
    private static void m12730s(Set<URL> set) {
        if (set != null && m12738k(set)) {
            C39241g.m13366c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + C21114v8.C21123i.f54139e);
        }
    }

    /* renamed from: t */
    private static void m12729t(Set<URL> set) {
        if (m12738k(set)) {
            C39241g.m13366c("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C39241g.m13366c("Found binding in [" + it.next() + C21114v8.C21123i.f54139e);
            }
            C39241g.m13366c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: u */
    private static final void m12728u() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f103633e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (!z) {
                C39241g.m13366c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f103633e).toString());
                C39241g.m13366c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C39241g.m13365d("Unexpected problem occured during version sanity check", th);
        }
    }
}
