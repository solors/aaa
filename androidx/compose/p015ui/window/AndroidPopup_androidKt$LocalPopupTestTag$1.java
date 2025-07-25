package androidx.compose.p015ui.window;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidPopup.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1 */
/* loaded from: classes.dex */
final class AndroidPopup_androidKt$LocalPopupTestTag$1 extends Lambda implements Functions<String> {
    public static final AndroidPopup_androidKt$LocalPopupTestTag$1 INSTANCE = new AndroidPopup_androidKt$LocalPopupTestTag$1();

    AndroidPopup_androidKt$LocalPopupTestTag$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final String invoke() {
        return "DEFAULT_TEST_TAG";
    }
}
