package ke;

import kotlin.Metadata;
import kotlinx.coroutines.DebugStrings;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tasks.kt */
@Metadata
/* renamed from: ke.k */
/* loaded from: classes8.dex */
public final class C37511k extends AbstractRunnableC37508h {
    @NotNull

    /* renamed from: d */
    public final Runnable f99162d;

    public C37511k(@NotNull Runnable runnable, long j, @NotNull InterfaceC37509i interfaceC37509i) {
        super(j, interfaceC37509i);
        this.f99162d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f99162d.run();
        } finally {
            this.f99160c.mo17678a();
        }
    }

    @NotNull
    public String toString() {
        return "Task[" + DebugStrings.m16104a(this.f99162d) + '@' + DebugStrings.m16103b(this.f99162d) + ", " + this.f99159b + ", " + this.f99160c + ']';
    }
}
