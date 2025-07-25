package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionManager.kt */
@Metadata
/* loaded from: classes.dex */
final class SelectionManager$onSelectionChange$1 extends Lambda implements Function1<Selection, Unit> {
    public static final SelectionManager$onSelectionChange$1 INSTANCE = new SelectionManager$onSelectionChange$1();

    SelectionManager$onSelectionChange$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Selection selection) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
        invoke2(selection);
        return Unit.f99208a;
    }
}
