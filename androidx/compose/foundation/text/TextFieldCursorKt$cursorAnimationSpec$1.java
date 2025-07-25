package androidx.compose.foundation.text;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldCursor.kt */
@Metadata
/* loaded from: classes.dex */
final class TextFieldCursorKt$cursorAnimationSpec$1 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {
    public static final TextFieldCursorKt$cursorAnimationSpec$1 INSTANCE = new TextFieldCursorKt$cursorAnimationSpec$1();

    TextFieldCursorKt$cursorAnimationSpec$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
        invoke2(keyframesSpecConfig);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1000);
        Float valueOf = Float.valueOf(1.0f);
        keyframes.m105462at(valueOf, 0);
        keyframes.m105462at(valueOf, 499);
        Float valueOf2 = Float.valueOf(0.0f);
        keyframes.m105462at(valueOf2, 500);
        keyframes.m105462at(valueOf2, 999);
    }
}
