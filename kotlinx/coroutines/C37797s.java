package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompletionState.kt */
@Metadata
/* renamed from: kotlinx.coroutines.s */
/* loaded from: classes7.dex */
public final class C37797s extends CompletionState {
    @NotNull

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f99640c = AtomicIntegerFieldUpdater.newUpdater(C37797s.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C37797s(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C37797s.<init>(kotlin.coroutines.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean m16105c() {
        return f99640c.compareAndSet(this, 0, 1);
    }
}
