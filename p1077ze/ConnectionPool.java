package p1077ze;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p643df.TaskRunner;
import p658ef.RealConnectionPool;

@Metadata
/* renamed from: ze.k */
/* loaded from: classes10.dex */
public final class ConnectionPool {
    @NotNull

    /* renamed from: a */
    private final RealConnectionPool f119263a;

    public ConnectionPool(@NotNull RealConnectionPool delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f119263a = delegate;
    }

    @NotNull
    /* renamed from: a */
    public final RealConnectionPool m306a() {
        return this.f119263a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, @NotNull TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.f89614i, i, j, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
