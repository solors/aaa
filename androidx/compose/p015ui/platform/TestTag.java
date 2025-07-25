package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.platform.TestTagKt */
/* loaded from: classes.dex */
public final class TestTag {
    @Stable
    @NotNull
    public static final Modifier testTag(@NotNull Modifier modifier, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return SemanticsModifierKt.semantics$default(modifier, false, new TestTagKt$testTag$1(tag), 1, null);
    }
}
