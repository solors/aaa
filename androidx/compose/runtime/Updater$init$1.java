package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
final class Updater$init$1<T> extends Lambda implements Function2<T, Unit, Unit> {
    final /* synthetic */ Function1<T, Unit> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Updater$init$1(Function1<? super T, Unit> function1) {
        super(2);
        this.$block = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Object obj, Unit unit) {
        invoke2((Updater$init$1<T>) obj, unit);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(T t, @NotNull Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$block.invoke(t);
    }
}
