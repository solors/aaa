package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: WithLifecycleState.kt */
@Metadata
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2<R> extends Lambda implements Functions<R> {
    final /* synthetic */ Functions<R> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(Functions<? extends R> functions) {
        super(0);
        this.$block = functions;
    }

    @Override // kotlin.jvm.functions.Functions
    public final R invoke() {
        return this.$block.invoke();
    }
}
