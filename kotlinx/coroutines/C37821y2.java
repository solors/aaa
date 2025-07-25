package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Supervisor.kt */
@Metadata
/* renamed from: kotlinx.coroutines.y2 */
/* loaded from: classes7.dex */
public final class C37821y2 {
    @NotNull
    /* renamed from: a */
    public static final CompletableJob m16065a(@Nullable InterfaceC37708b2 interfaceC37708b2) {
        return new Supervisor(interfaceC37708b2);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableJob m16064b(InterfaceC37708b2 interfaceC37708b2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC37708b2 = null;
        }
        return m16065a(interfaceC37708b2);
    }
}
