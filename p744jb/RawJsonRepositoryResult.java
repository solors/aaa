package p744jb;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: jb.o */
/* loaded from: classes8.dex */
public final class RawJsonRepositoryResult {
    @NotNull

    /* renamed from: a */
    private final Set<String> f98577a;
    @NotNull

    /* renamed from: b */
    private final List<RawJsonRepositoryException> f98578b;

    public RawJsonRepositoryResult(@NotNull Set<String> ids, @NotNull List<RawJsonRepositoryException> errors) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f98577a = ids;
        this.f98578b = errors;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryResult)) {
            return false;
        }
        RawJsonRepositoryResult rawJsonRepositoryResult = (RawJsonRepositoryResult) obj;
        if (Intrinsics.m17075f(this.f98577a, rawJsonRepositoryResult.f98577a) && Intrinsics.m17075f(this.f98578b, rawJsonRepositoryResult.f98578b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f98577a.hashCode() * 31) + this.f98578b.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryRemoveResult(ids=" + this.f98577a + ", errors=" + this.f98578b + ')';
    }
}
