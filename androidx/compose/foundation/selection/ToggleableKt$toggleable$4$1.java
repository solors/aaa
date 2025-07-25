package androidx.compose.foundation.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: Toggleable.kt */
@Metadata
/* loaded from: classes.dex */
final class ToggleableKt$toggleable$4$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onValueChange;
    final /* synthetic */ boolean $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableKt$toggleable$4$1(Function1<? super Boolean, Unit> function1, boolean z) {
        super(0);
        this.$onValueChange = function1;
        this.$value = z;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onValueChange.invoke(Boolean.valueOf(!this.$value));
    }
}
