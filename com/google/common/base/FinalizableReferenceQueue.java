package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.internal.Finalizer;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class FinalizableReferenceQueue implements Closeable {

    /* renamed from: f */
    private static final Logger f39381f = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    /* renamed from: g */
    private static final Method f39382g = m70076e(m70075f(new SystemLoader(), new DecoupledLoader(), new DirectLoader()));

    /* renamed from: b */
    final ReferenceQueue<Object> f39383b;

    /* renamed from: c */
    final PhantomReference<Object> f39384c;

    /* renamed from: d */
    final boolean f39385d;

    /* loaded from: classes4.dex */
    static class DecoupledLoader implements FinalizerLoader {
        DecoupledLoader() {
        }

        /* renamed from: a */
        URL m70074a() throws IOException {
            String str;
            String concat = String.valueOf("com.google.common.base.internal.Finalizer".replace('.', '/')).concat(".class");
            URL resource = getClass().getClassLoader().getResource(concat);
            if (resource != null) {
                String url = resource.toString();
                if (!url.endsWith(concat)) {
                    if (url.length() != 0) {
                        str = "Unsupported path style: ".concat(url);
                    } else {
                        str = new String("Unsupported path style: ");
                    }
                    throw new IOException(str);
                }
                return new URL(resource, url.substring(0, url.length() - concat.length()));
            }
            throw new FileNotFoundException(concat);
        }

        /* renamed from: b */
        URLClassLoader m70073b(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public Class<?> loadFinalizer() {
            try {
                return m70073b(m70074a()).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e) {
                FinalizableReferenceQueue.f39381f.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e);
                return null;
            }
        }
    }

    /* loaded from: classes4.dex */
    static class DirectLoader implements FinalizerLoader {
        DirectLoader() {
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public Class<?> loadFinalizer() {
            try {
                int i = Finalizer.f39490i;
                return Finalizer.class;
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface FinalizerLoader {
        Class<?> loadFinalizer();
    }

    /* loaded from: classes4.dex */
    static class SystemLoader implements FinalizerLoader {
        @VisibleForTesting

        /* renamed from: a */
        static boolean f39386a;

        SystemLoader() {
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public Class<?> loadFinalizer() {
            if (f39386a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.f39381f.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public FinalizableReferenceQueue() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f39383b = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f39384c = phantomReference;
        boolean z = false;
        try {
            f39382g.invoke(null, FinalizableReference.class, referenceQueue, phantomReference);
            z = true;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th) {
            f39381f.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
        }
        this.f39385d = z;
    }

    /* renamed from: e */
    static Method m70076e(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    private static Class<?> m70075f(FinalizerLoader... finalizerLoaderArr) {
        for (FinalizerLoader finalizerLoader : finalizerLoaderArr) {
            Class<?> loadFinalizer = finalizerLoader.loadFinalizer();
            if (loadFinalizer != null) {
                return loadFinalizer;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    void m70077b() {
        if (this.f39385d) {
            return;
        }
        while (true) {
            Reference<? extends Object> poll = this.f39383b.poll();
            if (poll != null) {
                poll.clear();
                try {
                    ((FinalizableReference) poll).finalizeReferent();
                } catch (Throwable th) {
                    f39381f.log(Level.SEVERE, "Error cleaning up after reference.", th);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39384c.enqueue();
        m70077b();
    }
}
