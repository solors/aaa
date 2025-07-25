package ie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;
import p804nd.C38497f;

@Metadata
/* renamed from: ie.l */
/* loaded from: classes8.dex */
public final class FastServiceLoader {
    @NotNull

    /* renamed from: a */
    public static final FastServiceLoader f92105a = new FastServiceLoader();

    private FastServiceLoader() {
    }

    /* renamed from: a */
    private final <S> S m22952a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m22951b(Class<S> cls, ClassLoader classLoader) {
        List<S> m17553Z0;
        try {
            return m22949d(cls, classLoader);
        } catch (Throwable unused) {
            m17553Z0 = _Collections.m17553Z0(ServiceLoader.load(cls, classLoader));
            return m17553Z0;
        }
    }

    /* renamed from: e */
    private final List<String> m22948e(URL url) {
        boolean m16624M;
        String m16599N0;
        String m16585U0;
        String m16599N02;
        String url2 = url.toString();
        m16624M = StringsJVM.m16624M(url2, "jar", false, 2, null);
        if (m16624M) {
            m16599N0 = C37690r.m16599N0(url2, "jar:file:", null, 2, null);
            m16585U0 = C37690r.m16585U0(m16599N0, '!', null, 2, null);
            m16599N02 = C37690r.m16599N0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m16585U0, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m16599N02)), "UTF-8"));
                List<String> m22947f = f92105a.m22947f(bufferedReader);
                Closeable.m1220a(bufferedReader, null);
                jarFile.close();
                return m22947f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        C38497f.m14566a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> m22947f2 = f92105a.m22947f(bufferedReader2);
            Closeable.m1220a(bufferedReader2, null);
            return m22947f2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                Closeable.m1220a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    /* renamed from: f */
    private final List<String> m22947f(BufferedReader bufferedReader) {
        List<String> m17553Z0;
        String m16583V0;
        CharSequence m16571b1;
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                m17553Z0 = _Collections.m17553Z0(linkedHashSet);
                return m17553Z0;
            }
            m16583V0 = C37690r.m16583V0(readLine, "#", null, 2, null);
            m16571b1 = C37690r.m16571b1(m16583V0);
            String obj = m16571b1.toString();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i < obj.length()) {
                    char charAt = obj.charAt(i);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                if (obj.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    @NotNull
    /* renamed from: c */
    public final List<MainDispatcherFactory> m22950c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!C33644m.m22940a()) {
            return m22951b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return m22951b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    @NotNull
    /* renamed from: d */
    public final <S> List<S> m22949d(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        Set m17547e1;
        int m17154x;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            MutableCollections.m17624D(arrayList, f92105a.m22948e(url));
        }
        m17547e1 = _Collections.m17547e1(arrayList);
        if (!m17547e1.isEmpty()) {
            Set<String> set = m17547e1;
            m17154x = C37566w.m17154x(set, 10);
            ArrayList arrayList2 = new ArrayList(m17154x);
            for (String str : set) {
                arrayList2.add(f92105a.m22952a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
