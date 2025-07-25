package p033bc;

import ec.C33050y;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsJVM;
import mc.Attributes;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientEngineCapability.kt */
@Metadata
/* renamed from: bc.f */
/* loaded from: classes9.dex */
public final class C3386f {
    @NotNull

    /* renamed from: a */
    private static final Attributes<Map<HttpClientEngineCapability<?>, Object>> f1689a = new Attributes<>("EngineCapabilities");
    @NotNull

    /* renamed from: b */
    private static final Set<C33050y.C33053b> f1690b;

    static {
        Set<C33050y.C33053b> m17127d;
        m17127d = SetsJVM.m17127d(C33050y.f90092d);
        f1690b = m17127d;
    }

    @NotNull
    /* renamed from: a */
    public static final Attributes<Map<HttpClientEngineCapability<?>, Object>> m103819a() {
        return f1689a;
    }
}
