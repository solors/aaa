package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.p */
/* loaded from: classes10.dex */
public class ForwardingTimeout extends C39196c1 {
    @NotNull

    /* renamed from: b */
    private C39196c1 f102981b;

    public ForwardingTimeout(@NotNull C39196c1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f102981b = delegate;
    }

    @NotNull
    /* renamed from: b */
    public final C39196c1 m13485b() {
        return this.f102981b;
    }

    @NotNull
    /* renamed from: c */
    public final ForwardingTimeout m13484c(@NotNull C39196c1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f102981b = delegate;
        return this;
    }

    @Override // okio.C39196c1
    @NotNull
    public C39196c1 clearDeadline() {
        return this.f102981b.clearDeadline();
    }

    @Override // okio.C39196c1
    @NotNull
    public C39196c1 clearTimeout() {
        return this.f102981b.clearTimeout();
    }

    @Override // okio.C39196c1
    public long deadlineNanoTime() {
        return this.f102981b.deadlineNanoTime();
    }

    @Override // okio.C39196c1
    public boolean hasDeadline() {
        return this.f102981b.hasDeadline();
    }

    @Override // okio.C39196c1
    public void throwIfReached() throws IOException {
        this.f102981b.throwIfReached();
    }

    @Override // okio.C39196c1
    @NotNull
    public C39196c1 timeout(long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f102981b.timeout(j, unit);
    }

    @Override // okio.C39196c1
    public long timeoutNanos() {
        return this.f102981b.timeoutNanos();
    }

    @Override // okio.C39196c1
    @NotNull
    public C39196c1 deadlineNanoTime(long j) {
        return this.f102981b.deadlineNanoTime(j);
    }
}
