package androidx.compose.foundation.selection;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.foundation.selection.SelectableGroupKt */
/* loaded from: classes.dex */
public final class SelectableGroup {
    @NotNull
    public static final Modifier selectableGroup(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, SelectableGroupKt$selectableGroup$1.INSTANCE, 1, null);
    }
}
