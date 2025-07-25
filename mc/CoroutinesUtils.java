package mc;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl;
import kotlinx.coroutines.C37821y2;
import kotlinx.coroutines.InterfaceC37708b2;
import kotlinx.coroutines.InterfaceC37764l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mc.m */
/* loaded from: classes9.dex */
public final class CoroutinesUtils {
    @NotNull
    /* renamed from: a */
    public static final CoroutineContext m15228a(@Nullable InterfaceC37708b2 interfaceC37708b2) {
        return C37821y2.m16065a(interfaceC37708b2).plus(new C38270a(InterfaceC37764l0.f99607a8));
    }

    /* renamed from: b */
    public static /* synthetic */ CoroutineContext m15227b(InterfaceC37708b2 interfaceC37708b2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC37708b2 = null;
        }
        return m15228a(interfaceC37708b2);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata
    /* renamed from: mc.m$a */
    /* loaded from: classes9.dex */
    public static final class C38270a extends CoroutineContextImpl implements InterfaceC37764l0 {
        public C38270a(InterfaceC37764l0.C37766b c37766b) {
            super(c37766b);
        }

        @Override // kotlinx.coroutines.InterfaceC37764l0
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        }
    }
}
