package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.layout.RelocationRequesterModifierKt */
/* loaded from: classes.dex */
public final class RelocationRequesterModifier {
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier relocationRequester(@NotNull Modifier modifier, @NotNull Object relocationRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(relocationRequester, "relocationRequester");
        return modifier;
    }
}
