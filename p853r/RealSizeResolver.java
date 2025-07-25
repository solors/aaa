package p853r;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: r.f */
/* loaded from: classes2.dex */
public final class RealSizeResolver implements SizeResolver {
    @NotNull

    /* renamed from: b */
    private final C39424i f103642b;

    public RealSizeResolver(@NotNull C39424i c39424i) {
        this.f103642b = c39424i;
    }

    @Override // p853r.SizeResolver
    @Nullable
    /* renamed from: b */
    public Object mo12721b(@NotNull Continuation<? super C39424i> continuation) {
        return this.f103642b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RealSizeResolver) && Intrinsics.m17075f(this.f103642b, ((RealSizeResolver) obj).f103642b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f103642b.hashCode();
    }
}
