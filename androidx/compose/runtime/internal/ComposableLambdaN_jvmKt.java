package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComposableLambdaN.jvm.kt */
@Metadata
/* loaded from: classes.dex */
public final class ComposableLambdaN_jvmKt {
    private static final int SLOTS_PER_INT = 10;

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambdaN composableLambdaN(@NotNull Composer composer, int i, boolean z, int i2, @NotNull Object block) {
        ComposableLambdaNImpl composableLambdaNImpl;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(i);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaNImpl = new ComposableLambdaNImpl(i, z, i2);
            composer.updateRememberedValue(composableLambdaNImpl);
        } else if (rememberedValue != null) {
            composableLambdaNImpl = (ComposableLambdaNImpl) rememberedValue;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
        }
        composableLambdaNImpl.update(block);
        composer.endReplaceableGroup();
        return composableLambdaNImpl;
    }

    @ComposeCompilerApi
    @NotNull
    public static final ComposableLambdaN composableLambdaNInstance(int i, boolean z, int i2, @NotNull Object block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ComposableLambdaNImpl composableLambdaNImpl = new ComposableLambdaNImpl(i, z, i2);
        composableLambdaNImpl.update(block);
        return composableLambdaNImpl;
    }
}
