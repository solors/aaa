package p719ic;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p702hc.AbstractC33495c;

/* compiled from: ClientEvents.kt */
@Metadata
/* renamed from: ic.f */
/* loaded from: classes9.dex */
public final class C33622f {
    @NotNull

    /* renamed from: a */
    private final AbstractC33495c f92034a;
    @NotNull

    /* renamed from: b */
    private final Throwable f92035b;

    public C33622f(@NotNull AbstractC33495c response, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f92034a = response;
        this.f92035b = cause;
    }
}
