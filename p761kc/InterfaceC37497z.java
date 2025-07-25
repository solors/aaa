package p761kc;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mc.StringValues;
import org.jetbrains.annotations.NotNull;

/* compiled from: Parameters.kt */
@Metadata
/* renamed from: kc.z */
/* loaded from: classes9.dex */
public interface InterfaceC37497z extends StringValues {
    @NotNull

    /* renamed from: b */
    public static final C37498a f99111b = C37498a.f99112a;

    /* compiled from: Parameters.kt */
    @Metadata
    /* renamed from: kc.z$a */
    /* loaded from: classes9.dex */
    public static final class C37498a {

        /* renamed from: a */
        static final /* synthetic */ C37498a f99112a = new C37498a();
        @NotNull

        /* renamed from: b */
        private static final InterfaceC37497z f99113b = C37457f.f98864c;

        private C37498a() {
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC37497z m17738a() {
            return f99113b;
        }
    }

    /* compiled from: Parameters.kt */
    @Metadata
    /* renamed from: kc.z$b */
    /* loaded from: classes9.dex */
    public static final class C37499b {
        /* renamed from: a */
        public static void m17737a(@NotNull InterfaceC37497z interfaceC37497z, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            StringValues.C38275a.m15211a(interfaceC37497z, body);
        }
    }
}
