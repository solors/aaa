package p1025w8;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: w8.b */
/* loaded from: classes7.dex */
public final class SendBeaconConfiguration {
    @NotNull

    /* renamed from: a */
    private final Executor f117029a;
    @NotNull

    /* renamed from: b */
    private final String f117030b;

    @NotNull
    /* renamed from: a */
    public final String m2297a() {
        return this.f117030b;
    }

    @NotNull
    /* renamed from: b */
    public final Executor m2296b() {
        return this.f117029a;
    }

    @NotNull
    /* renamed from: c */
    public final SendBeaconPerWorkerLogger m2295c() {
        return null;
    }

    @NotNull
    /* renamed from: d */
    public final SendBeaconWorkerScheduler m2294d() {
        return null;
    }
}
