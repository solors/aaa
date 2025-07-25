package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@Metadata
/* renamed from: kotlinx.coroutines.q2 */
/* loaded from: classes7.dex */
public final class C37792q2 implements InterfaceC37731g1, InterfaceC37803u {
    @NotNull

    /* renamed from: b */
    public static final C37792q2 f99638b = new C37792q2();

    private C37792q2() {
    }

    @Override // kotlinx.coroutines.InterfaceC37803u
    /* renamed from: b */
    public boolean mo16086b(@NotNull Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC37803u
    @Nullable
    public InterfaceC37708b2 getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.InterfaceC37731g1
    public void dispose() {
    }
}
