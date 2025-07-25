package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Regex.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MatchGroup {
    @NotNull

    /* renamed from: a */
    private final String f99449a;
    @NotNull

    /* renamed from: b */
    private final PrimitiveRanges f99450b;

    public MatchGroup(@NotNull String value, @NotNull PrimitiveRanges range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f99449a = value;
        this.f99450b = range;
    }

    @NotNull
    /* renamed from: a */
    public final String m16773a() {
        return this.f99449a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        if (Intrinsics.m17075f(this.f99449a, matchGroup.f99449a) && Intrinsics.m17075f(this.f99450b, matchGroup.f99450b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f99449a.hashCode() * 31) + this.f99450b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.f99449a + ", range=" + this.f99450b + ')';
    }
}
