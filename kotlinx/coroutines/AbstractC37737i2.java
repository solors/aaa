package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata
/* renamed from: kotlinx.coroutines.i2 */
/* loaded from: classes7.dex */
public abstract class AbstractC37737i2 extends CompletionHandler implements InterfaceC37731g1, InterfaceC37808v1 {

    /* renamed from: f */
    public C37745j2 f99561f;

    @Override // kotlinx.coroutines.InterfaceC37808v1
    @Nullable
    /* renamed from: a */
    public C37783o2 mo16085a() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC37731g1
    public void dispose() {
        m16315r().m16287M0(this);
    }

    @Override // kotlinx.coroutines.InterfaceC37808v1
    public boolean isActive() {
        return true;
    }

    @NotNull
    /* renamed from: r */
    public final C37745j2 m16315r() {
        C37745j2 c37745j2 = this.f99561f;
        if (c37745j2 != null) {
            return c37745j2;
        }
        Intrinsics.m17056y("job");
        return null;
    }

    /* renamed from: s */
    public final void m16314s(@NotNull C37745j2 c37745j2) {
        this.f99561f = c37745j2;
    }

    @Override // ie.C33653s
    @NotNull
    public String toString() {
        return DebugStrings.m16104a(this) + '@' + DebugStrings.m16103b(this) + "[job@" + DebugStrings.m16103b(m16315r()) + ']';
    }
}
