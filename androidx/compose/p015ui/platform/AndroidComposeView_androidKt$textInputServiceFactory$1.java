package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.text.input.PlatformTextInputService;
import androidx.compose.p015ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt$textInputServiceFactory$1 */
/* loaded from: classes.dex */
final class AndroidComposeView_androidKt$textInputServiceFactory$1 extends Lambda implements Function1<PlatformTextInputService, TextInputService> {
    public static final AndroidComposeView_androidKt$textInputServiceFactory$1 INSTANCE = new AndroidComposeView_androidKt$textInputServiceFactory$1();

    AndroidComposeView_androidKt$textInputServiceFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final TextInputService invoke(@NotNull PlatformTextInputService it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextInputService(it);
    }
}
