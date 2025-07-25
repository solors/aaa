package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: JobSupport.kt */
@Metadata
/* renamed from: kotlinx.coroutines.u1 */
/* loaded from: classes7.dex */
public final class C37805u1 implements InterfaceC37808v1 {
    @NotNull

    /* renamed from: b */
    private final C37783o2 f99648b;

    public C37805u1(@NotNull C37783o2 c37783o2) {
        this.f99648b = c37783o2;
    }

    @Override // kotlinx.coroutines.InterfaceC37808v1
    @NotNull
    /* renamed from: a */
    public C37783o2 mo16085a() {
        return this.f99648b;
    }

    @Override // kotlinx.coroutines.InterfaceC37808v1
    public boolean isActive() {
        return false;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
