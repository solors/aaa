package vc;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: vc.k */
/* loaded from: classes9.dex */
public final class CloseableJVM {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC38501j f116954a;

    /* compiled from: CloseableJVM.kt */
    @Metadata
    /* renamed from: vc.k$a */
    /* loaded from: classes9.dex */
    static final class C44561a extends Lambda implements Functions<Method> {

        /* renamed from: g */
        public static final C44561a f116955g = new C44561a();

        C44561a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        /* renamed from: b */
        public final Method invoke() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C44561a.f116955g);
        f116954a = m14554a;
    }

    /* renamed from: a */
    public static final void m2467a(@NotNull Throwable th, @NotNull Throwable other) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Method m2466b = m2466b();
        if (m2466b != null) {
            m2466b.invoke(th, other);
        }
    }

    /* renamed from: b */
    private static final Method m2466b() {
        return (Method) f116954a.getValue();
    }
}
