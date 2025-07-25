package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* compiled from: CompletableDeferred.kt */
@Metadata
/* renamed from: kotlinx.coroutines.z */
/* loaded from: classes7.dex */
public final class C37822z {
    @NotNull
    /* renamed from: a */
    public static final <T> CompletableDeferred<T> m16063a(@Nullable InterfaceC37708b2 interfaceC37708b2) {
        return new C37818y(interfaceC37708b2);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableDeferred m16062b(InterfaceC37708b2 interfaceC37708b2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC37708b2 = null;
        }
        return m16063a(interfaceC37708b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> boolean m16061c(@NotNull CompletableDeferred<T> completableDeferred, @NotNull Object obj) {
        Throwable m14546e = Result.m14546e(obj);
        if (m14546e == null) {
            return completableDeferred.mo16069n(obj);
        }
        return completableDeferred.mo16073b(m14546e);
    }
}
