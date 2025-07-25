package p658ef;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1077ze.Route;

@Metadata
/* renamed from: ef.h */
/* loaded from: classes10.dex */
public final class RouteDatabase {
    @NotNull

    /* renamed from: a */
    private final Set<Route> f90222a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m25052a(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f90222a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m25051b(@NotNull Route failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f90222a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m25050c(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f90222a.contains(route);
    }
}
