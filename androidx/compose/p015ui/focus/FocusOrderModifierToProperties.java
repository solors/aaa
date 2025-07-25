package androidx.compose.p015ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusOrderModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusOrderModifierToProperties */
/* loaded from: classes.dex */
public final class FocusOrderModifierToProperties implements Function1<FocusProperties, Unit> {
    @NotNull
    private final FocusOrderModifier modifier;

    public FocusOrderModifierToProperties(@NotNull FocusOrderModifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.modifier = modifier;
    }

    @NotNull
    public final FocusOrderModifier getModifier() {
        return this.modifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
        invoke2(focusProperties);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.modifier.populateFocusOrder(new FocusOrder(focusProperties));
    }
}
