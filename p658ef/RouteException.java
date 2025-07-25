package p658ef;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38497f;

@Metadata
/* renamed from: ef.i */
/* loaded from: classes10.dex */
public final class RouteException extends RuntimeException {
    @NotNull

    /* renamed from: b */
    private final IOException f90223b;
    @NotNull

    /* renamed from: c */
    private IOException f90224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f90223b = firstConnectException;
        this.f90224c = firstConnectException;
    }

    /* renamed from: a */
    public final void m25049a(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        C38497f.m14566a(this.f90223b, e);
        this.f90224c = e;
    }

    @NotNull
    /* renamed from: b */
    public final IOException m25048b() {
        return this.f90223b;
    }

    @NotNull
    /* renamed from: c */
    public final IOException m25047c() {
        return this.f90224c;
    }
}
