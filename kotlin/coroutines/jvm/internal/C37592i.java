package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugMetadata.kt */
@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.i */
/* loaded from: classes7.dex */
public final class C37592i {
    @NotNull

    /* renamed from: a */
    public static final C37592i f99294a = new C37592i();
    @NotNull

    /* renamed from: b */
    private static final C37593a f99295b = new C37593a(null, null, null);
    @Nullable

    /* renamed from: c */
    private static C37593a f99296c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugMetadata.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    /* loaded from: classes7.dex */
    public static final class C37593a {
        @Nullable

        /* renamed from: a */
        public final Method f99297a;
        @Nullable

        /* renamed from: b */
        public final Method f99298b;
        @Nullable

        /* renamed from: c */
        public final Method f99299c;

        public C37593a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f99297a = method;
            this.f99298b = method2;
            this.f99299c = method3;
        }
    }

    private C37592i() {
    }

    /* renamed from: a */
    private final C37593a m17083a(ContinuationImpl continuationImpl) {
        try {
            C37593a c37593a = new C37593a(Class.class.getDeclaredMethod("getModule", new Class[0]), continuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), continuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f99296c = c37593a;
            return c37593a;
        } catch (Exception unused) {
            C37593a c37593a2 = f99295b;
            f99296c = c37593a2;
            return c37593a2;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String m17082b(@NotNull ContinuationImpl continuation) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        C37593a c37593a = f99296c;
        if (c37593a == null) {
            c37593a = m17083a(continuation);
        }
        if (c37593a == f99295b) {
            return null;
        }
        Method method = c37593a.f99297a;
        if (method != null) {
            obj = method.invoke(continuation.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = c37593a.f99298b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = c37593a.f99299c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
