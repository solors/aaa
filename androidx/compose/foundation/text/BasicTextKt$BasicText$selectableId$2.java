package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: BasicText.kt */
@Metadata
/* loaded from: classes.dex */
final class BasicTextKt$BasicText$selectableId$2 extends Lambda implements Functions<Long> {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$selectableId$2(SelectionRegistrar selectionRegistrar) {
        super(0);
        this.$selectionRegistrar = selectionRegistrar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Long invoke() {
        SelectionRegistrar selectionRegistrar = this.$selectionRegistrar;
        return Long.valueOf(selectionRegistrar != null ? selectionRegistrar.nextSelectableId() : 0L);
    }
}
