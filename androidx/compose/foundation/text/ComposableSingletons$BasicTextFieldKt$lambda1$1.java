package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: BasicTextField.kt */
@Metadata
/* renamed from: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$BasicTextFieldKt$lambda1$1 extends Lambda implements InterfaceC45268n<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public static final ComposableSingletons$BasicTextFieldKt$lambda1$1 INSTANCE = new ComposableSingletons$BasicTextFieldKt$lambda1$1();

    ComposableSingletons$BasicTextFieldKt$lambda1$1() {
        super(3);
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i & 14) == 0) {
            i |= composer.changed(innerTextField) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            innerTextField.mo105910invoke(composer, Integer.valueOf(i & 14));
        }
    }
}
