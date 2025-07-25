package p866rc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PipelinePhase.kt */
@Metadata
/* renamed from: rc.h */
/* loaded from: classes9.dex */
public final class C39471h {
    @NotNull

    /* renamed from: a */
    private final String f103783a;

    public C39471h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f103783a = name;
    }

    @NotNull
    /* renamed from: a */
    public final String m12542a() {
        return this.f103783a;
    }

    @NotNull
    public String toString() {
        return "Phase('" + this.f103783a + "')";
    }
}
