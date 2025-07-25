package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SystemGestureExclusion.kt */
@Metadata
/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    @Composable
    @RequiresApi(30)
    private static final Modifier excludeFromSystemGestureR(Function1<? super LayoutCoordinates, Rect> function1, Composer composer, int i) {
        composer.startReplaceableGroup(202618556);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(view) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SystemGestureExclusion(view, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SystemGestureExclusion systemGestureExclusion = (SystemGestureExclusion) rememberedValue;
        EffectsKt.DisposableEffect(systemGestureExclusion, new SystemGestureExclusionKt$excludeFromSystemGestureR$1(systemGestureExclusion), composer, 0);
        composer.endReplaceableGroup();
        return systemGestureExclusion;
    }

    @NotNull
    public static final Modifier systemGestureExclusion(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C0427x96d1b9f3() : InspectableValueKt.getNoInspectorInfo(), SystemGestureExclusionKt$systemGestureExclusion$2.INSTANCE);
    }

    @NotNull
    public static final Modifier systemGestureExclusion(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Rect> exclusion) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(exclusion, "exclusion");
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C0428x96d1b9f4(exclusion) : InspectableValueKt.getNoInspectorInfo(), new SystemGestureExclusionKt$systemGestureExclusion$4(exclusion));
    }
}
