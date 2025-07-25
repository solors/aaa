package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: RippleTheme.kt */
@Metadata
/* loaded from: classes.dex */
final class RippleThemeKt$LocalRippleTheme$1 extends Lambda implements Functions<RippleTheme> {
    public static final RippleThemeKt$LocalRippleTheme$1 INSTANCE = new RippleThemeKt$LocalRippleTheme$1();

    RippleThemeKt$LocalRippleTheme$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final RippleTheme invoke() {
        return DebugRippleTheme.INSTANCE;
    }
}
