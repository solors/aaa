package p985ta;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p671fb.ExpressionResolver;
import sb.Div;

@Metadata
/* renamed from: ta.b */
/* loaded from: classes8.dex */
public final class DivItemBuilderResult {
    @NotNull

    /* renamed from: a */
    private final Div f116535a;
    @NotNull

    /* renamed from: b */
    private final ExpressionResolver f116536b;

    public DivItemBuilderResult(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        this.f116535a = div;
        this.f116536b = expressionResolver;
    }

    @NotNull
    /* renamed from: a */
    public final Div m3150a() {
        return this.f116535a;
    }

    @NotNull
    /* renamed from: b */
    public final ExpressionResolver m3149b() {
        return this.f116536b;
    }

    @NotNull
    /* renamed from: c */
    public final Div m3148c() {
        return this.f116535a;
    }

    @NotNull
    /* renamed from: d */
    public final ExpressionResolver m3147d() {
        return this.f116536b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivItemBuilderResult)) {
            return false;
        }
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
        if (Intrinsics.m17075f(this.f116535a, divItemBuilderResult.f116535a) && Intrinsics.m17075f(this.f116536b, divItemBuilderResult.f116536b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f116535a.hashCode() * 31) + this.f116536b.hashCode();
    }

    @NotNull
    public String toString() {
        return "DivItemBuilderResult(div=" + this.f116535a + ", expressionResolver=" + this.f116536b + ')';
    }
}
