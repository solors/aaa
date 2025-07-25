package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.input.rotary.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1 */
/* loaded from: classes.dex */
public final class AndroidComposeView$rotaryInputModifier$1 extends Lambda implements Function1<RotaryScrollEvent, Boolean> {
    public static final AndroidComposeView$rotaryInputModifier$1 INSTANCE = new AndroidComposeView$rotaryInputModifier$1();

    AndroidComposeView$rotaryInputModifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull RotaryScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.FALSE;
    }
}
