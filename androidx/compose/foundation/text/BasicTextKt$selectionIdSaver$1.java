package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicText.kt */
@Metadata
/* loaded from: classes.dex */
final class BasicTextKt$selectionIdSaver$1 extends Lambda implements Function2<SaverScope, Long, Long> {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(SelectionRegistrar selectionRegistrar) {
        super(2);
        this.$selectionRegistrar = selectionRegistrar;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Long mo105910invoke(SaverScope saverScope, Long l) {
        return invoke(saverScope, l.longValue());
    }

    @Nullable
    public final Long invoke(@NotNull SaverScope Saver, long j) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        if (SelectionRegistrarKt.hasSelection(this.$selectionRegistrar, j)) {
            return Long.valueOf(j);
        }
        return null;
    }
}
