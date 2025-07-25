package p761kc;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mc.StringValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Headers.kt */
@Metadata
/* renamed from: kc.k */
/* loaded from: classes9.dex */
public interface InterfaceC37464k extends StringValues {
    @NotNull

    /* renamed from: a */
    public static final C37465a f98887a = C37465a.f98888a;

    /* compiled from: Headers.kt */
    @Metadata
    /* renamed from: kc.k$a */
    /* loaded from: classes9.dex */
    public static final class C37465a {

        /* renamed from: a */
        static final /* synthetic */ C37465a f98888a = new C37465a();
        @NotNull

        /* renamed from: b */
        private static final InterfaceC37464k f98889b = Headers.f98863c;

        private C37465a() {
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC37464k m17955a() {
            return f98889b;
        }
    }

    /* compiled from: Headers.kt */
    @Metadata
    /* renamed from: kc.k$b */
    /* loaded from: classes9.dex */
    public static final class C37466b {
        /* renamed from: a */
        public static void m17954a(@NotNull InterfaceC37464k interfaceC37464k, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            StringValues.C38275a.m15211a(interfaceC37464k, body);
        }

        @Nullable
        /* renamed from: b */
        public static String m17953b(@NotNull InterfaceC37464k interfaceC37464k, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return StringValues.C38275a.m15210b(interfaceC37464k, name);
        }
    }
}
