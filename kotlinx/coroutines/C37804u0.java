package kotlinx.coroutines;

import ie.C33638i0;
import ie.C33659x;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DefaultExecutor.kt */
@Metadata
/* renamed from: kotlinx.coroutines.u0 */
/* loaded from: classes7.dex */
public final class C37804u0 {

    /* renamed from: a */
    private static final boolean f99646a = C33638i0.m22975f("kotlinx.coroutines.main.delay", false);
    @NotNull

    /* renamed from: b */
    private static final InterfaceC37814x0 f99647b = m16087b();

    @NotNull
    /* renamed from: a */
    public static final InterfaceC37814x0 m16088a() {
        return f99647b;
    }

    /* renamed from: b */
    private static final InterfaceC37814x0 m16087b() {
        if (!f99646a) {
            return DefaultExecutor.f99642i;
        }
        MainCoroutineDispatcher m16376c = Dispatchers.m16376c();
        if (!C33659x.m22875c(m16376c) && (m16376c instanceof InterfaceC37814x0)) {
            return (InterfaceC37814x0) m16376c;
        }
        return DefaultExecutor.f99642i;
    }
}
