package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composers.kt */
@Metadata
/* renamed from: se.s */
/* loaded from: classes8.dex */
public final class C42726s extends C42725r {

    /* renamed from: c */
    private final boolean f111889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42726s(@NotNull InterfaceC42743z0 writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f111889c = z;
    }

    @Override // se.C42725r
    /* renamed from: m */
    public void mo6680m(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f111889c) {
            super.mo6680m(value);
        } else {
            super.m6689j(value);
        }
    }
}
