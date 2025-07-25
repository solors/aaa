package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Composables.kt */
@Metadata
/* loaded from: classes.dex */
public final class ComposablesKt$ReusableComposeNode$1<T> extends Lambda implements Functions<T> {
    final /* synthetic */ Functions<T> $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposablesKt$ReusableComposeNode$1(Functions<? extends T> functions) {
        super(0);
        this.$factory = functions;
    }

    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final T invoke() {
        return this.$factory.invoke();
    }
}
