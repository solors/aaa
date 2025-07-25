package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: SemanticsModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsModifierKt$clearAndSetSemantics$2 */
/* loaded from: classes.dex */
final class SemanticsModifierKt$clearAndSetSemantics$2 extends Lambda implements InterfaceC45268n<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1<SemanticsPropertyReceiver, Unit> $properties;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsModifierKt$clearAndSetSemantics$2(Function1<? super SemanticsPropertyReceiver, Unit> function1) {
        super(3);
        this.$properties = function1;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1495908050);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Integer.valueOf(SemanticsModifierCore.Companion.generateSemanticsId());
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(((Number) rememberedValue).intValue(), false, true, this.$properties);
        composer.endReplaceableGroup();
        return semanticsModifierCore;
    }
}
