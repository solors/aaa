package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedVisibility.kt */
@Metadata
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$3 extends Lambda implements Function1<Boolean, Boolean> {
    public static final AnimatedVisibilityKt$AnimatedVisibility$3 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$3();

    AnimatedVisibilityKt$AnimatedVisibility$3() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(boolean z) {
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
