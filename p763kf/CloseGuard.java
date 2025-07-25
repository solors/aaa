package p763kf;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kf.h */
/* loaded from: classes10.dex */
public final class CloseGuard {
    @NotNull

    /* renamed from: d */
    public static final C37522a f99195d = new C37522a(null);
    @Nullable

    /* renamed from: a */
    private final Method f99196a;
    @Nullable

    /* renamed from: b */
    private final Method f99197b;
    @Nullable

    /* renamed from: c */
    private final Method f99198c;

    /* compiled from: CloseGuard.kt */
    @Metadata
    /* renamed from: kf.h$a */
    /* loaded from: classes10.dex */
    public static final class C37522a {
        private C37522a() {
        }

        public /* synthetic */ C37522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final CloseGuard m17643a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod(KiwiConstants.f2714as, new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new CloseGuard(method, method3, method2);
        }
    }

    public CloseGuard(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f99196a = method;
        this.f99197b = method2;
        this.f99198c = method3;
    }

    @Nullable
    /* renamed from: a */
    public final Object m17645a(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.f99196a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f99197b;
                Intrinsics.m17074g(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m17644b(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f99198c;
            Intrinsics.m17074g(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
