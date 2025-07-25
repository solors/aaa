package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata
/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(Function1<? super Boolean, Unit> function1, boolean z) {
        super(0);
        this.$onExpandedChange = function1;
        this.$expanded = z;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onExpandedChange.invoke(Boolean.valueOf(!this.$expanded));
    }
}
