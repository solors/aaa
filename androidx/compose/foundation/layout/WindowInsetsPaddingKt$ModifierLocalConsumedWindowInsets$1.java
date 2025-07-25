package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsPadding.kt */
@Metadata
/* loaded from: classes.dex */
final class WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1 extends Lambda implements Functions<WindowInsets> {
    public static final WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1 INSTANCE = new WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1();

    WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WindowInsets invoke() {
        return WindowInsetsKt.WindowInsets(0, 0, 0, 0);
    }
}
