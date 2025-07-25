package p759ka;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ka.i */
/* loaded from: classes8.dex */
public final class FunctionArgument {
    @NotNull

    /* renamed from: a */
    private final EvaluableType f98802a;

    /* renamed from: b */
    private final boolean f98803b;

    public FunctionArgument(@NotNull EvaluableType type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f98802a = type;
        this.f98803b = z;
    }

    @NotNull
    /* renamed from: a */
    public final EvaluableType m18054a() {
        return this.f98802a;
    }

    /* renamed from: b */
    public final boolean m18053b() {
        return this.f98803b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) obj;
        if (this.f98802a == functionArgument.f98802a && this.f98803b == functionArgument.f98803b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f98802a.hashCode() * 31;
        boolean z = this.f98803b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "FunctionArgument(type=" + this.f98802a + ", isVariadic=" + this.f98803b + ')';
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluableType, (i & 2) != 0 ? false : z);
    }
}
