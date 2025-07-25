package p702hc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sc.Type;

/* compiled from: HttpResponsePipeline.kt */
@Metadata
/* renamed from: hc.d */
/* loaded from: classes9.dex */
public final class C33496d {
    @NotNull

    /* renamed from: a */
    private final Type f91430a;
    @NotNull

    /* renamed from: b */
    private final Object f91431b;

    public C33496d(@NotNull Type expectedType, @NotNull Object response) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f91430a = expectedType;
        this.f91431b = response;
    }

    @NotNull
    /* renamed from: a */
    public final Type m23621a() {
        return this.f91430a;
    }

    @NotNull
    /* renamed from: b */
    public final Object m23620b() {
        return this.f91431b;
    }

    @NotNull
    /* renamed from: c */
    public final Object m23619c() {
        return this.f91431b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33496d)) {
            return false;
        }
        C33496d c33496d = (C33496d) obj;
        if (Intrinsics.m17075f(this.f91430a, c33496d.f91430a) && Intrinsics.m17075f(this.f91431b, c33496d.f91431b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f91430a.hashCode() * 31) + this.f91431b.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f91430a + ", response=" + this.f91431b + ')';
    }
}
