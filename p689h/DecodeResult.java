package p689h;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: h.g */
/* loaded from: classes2.dex */
public final class DecodeResult {
    @NotNull

    /* renamed from: a */
    private final Drawable f91253a;

    /* renamed from: b */
    private final boolean f91254b;

    public DecodeResult(@NotNull Drawable drawable, boolean z) {
        this.f91253a = drawable;
        this.f91254b = z;
    }

    @NotNull
    /* renamed from: a */
    public final Drawable m23946a() {
        return this.f91253a;
    }

    /* renamed from: b */
    public final boolean m23945b() {
        return this.f91254b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecodeResult) {
            DecodeResult decodeResult = (DecodeResult) obj;
            if (Intrinsics.m17075f(this.f91253a, decodeResult.f91253a) && this.f91254b == decodeResult.f91254b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f91253a.hashCode() * 31) + Boolean.hashCode(this.f91254b);
    }
}
