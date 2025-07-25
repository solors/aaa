package androidx.compose.p015ui;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.focus.FocusEventModifier;
import androidx.compose.p015ui.focus.FocusRequesterModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComposedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.ComposedModifierKt$materialize$1 */
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$1 extends Lambda implements Function1<Modifier.Element, Boolean> {
    public static final ComposedModifierKt$materialize$1 INSTANCE = new ComposedModifierKt$materialize$1();

    ComposedModifierKt$materialize$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Modifier.Element it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(((it instanceof ComposedModifier) || (it instanceof FocusEventModifier) || (it instanceof FocusRequesterModifier)) ? false : true);
    }
}
