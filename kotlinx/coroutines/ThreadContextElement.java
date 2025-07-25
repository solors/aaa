package kotlinx.coroutines;

import ie.C33645m0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.coroutines.a3 */
/* loaded from: classes7.dex */
public final class ThreadContextElement {
    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC37825z2<T> m16418a(@NotNull ThreadLocal<T> threadLocal, T t) {
        return new C33645m0(t, threadLocal);
    }
}
