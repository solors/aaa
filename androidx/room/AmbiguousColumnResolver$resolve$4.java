package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata
/* loaded from: classes2.dex */
final class AmbiguousColumnResolver$resolve$4 extends Lambda implements Function1<List<? extends AmbiguousColumnResolver.Match>, Unit> {
    final /* synthetic */ C37609n0<AmbiguousColumnResolver.Solution> $bestSolution;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmbiguousColumnResolver$resolve$4(C37609n0<AmbiguousColumnResolver.Solution> c37609n0) {
        super(1);
        this.$bestSolution = c37609n0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends AmbiguousColumnResolver.Match> list) {
        invoke2((List<AmbiguousColumnResolver.Match>) list);
        return Unit.f99208a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<AmbiguousColumnResolver.Match> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ?? build = AmbiguousColumnResolver.Solution.Companion.build(it);
        if (build.compareTo(this.$bestSolution.f99327b) < 0) {
            this.$bestSolution.f99327b = build;
        }
    }
}
