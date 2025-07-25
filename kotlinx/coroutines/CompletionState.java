package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.coroutines.c0 */
/* loaded from: classes7.dex */
public class CompletionState {
    @NotNull

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f99519b = AtomicIntegerFieldUpdater.newUpdater(CompletionState.class, "_handled");
    private volatile int _handled;
    @NotNull

    /* renamed from: a */
    public final Throwable f99520a;

    public CompletionState(@NotNull Throwable th, boolean z) {
        this.f99520a = th;
        this._handled = z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean m16399a() {
        if (f99519b.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m16398b() {
        return f99519b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return DebugStrings.m16104a(this) + '[' + this.f99520a + ']';
    }

    public /* synthetic */ CompletionState(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
