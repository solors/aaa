package p674fe;

import kotlin.Metadata;
import kotlinx.coroutines.Waiter;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferedChannel.kt */
@Metadata
/* renamed from: fe.v */
/* loaded from: classes7.dex */
final class C33138v {
    @NotNull

    /* renamed from: a */
    public final Waiter f90502a;

    public C33138v(@NotNull Waiter waiter) {
        this.f90502a = waiter;
    }

    @NotNull
    public String toString() {
        return "WaiterEB(" + this.f90502a + ')';
    }
}
