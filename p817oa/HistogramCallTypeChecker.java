package p817oa;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: oa.j */
/* loaded from: classes8.dex */
public abstract class HistogramCallTypeChecker {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38501j f102770a;

    /* compiled from: HistogramCallTypeChecker.kt */
    @Metadata
    /* renamed from: oa.j$a */
    /* loaded from: classes8.dex */
    static final class C39126a extends Lambda implements Functions<ConcurrentHashMap<String, Unit>> {

        /* renamed from: g */
        public static final C39126a f102771g = new C39126a();

        C39126a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final ConcurrentHashMap<String, Unit> invoke() {
            return new ConcurrentHashMap<>();
        }
    }

    public HistogramCallTypeChecker() {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C39126a.f102771g);
        this.f102770a = m14554a;
    }

    /* renamed from: b */
    private final ConcurrentHashMap<String, Unit> m13878b() {
        return (ConcurrentHashMap) this.f102770a.getValue();
    }

    /* renamed from: a */
    public final boolean m13879a(@NotNull String histogramName) {
        Intrinsics.checkNotNullParameter(histogramName, "histogramName");
        if (m13878b().containsKey(histogramName) || m13878b().putIfAbsent(histogramName, Unit.f99208a) != null) {
            return false;
        }
        return true;
    }
}
