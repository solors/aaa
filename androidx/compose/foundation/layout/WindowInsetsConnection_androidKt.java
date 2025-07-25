package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.CompositionLocals;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1 */
    private static final float f377P1 = 0.175f;

    /* renamed from: P2 */
    private static final float f378P2 = 0.35000002f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
    private static final float StartTension = 0.5f;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = log;
        DecelMinusOne = log - 1.0d;
    }

    @ExperimentalLayoutApi
    @NotNull
    public static final Modifier imeNestedScroll(@NotNull Modifier modifier) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C0500x91d9d996();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, WindowInsetsConnection_androidKt$imeNestedScroll$2.INSTANCE);
    }

    @Composable
    @ExperimentalLayoutApi
    @NotNull
    /* renamed from: rememberWindowInsetsConnection-VRgvIgI  reason: not valid java name */
    public static final NestedScrollModifier m106374rememberWindowInsetsConnectionVRgvIgI(@NotNull AndroidWindowInsets windowInsets, int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        composer.startReplaceableGroup(-1011341039);
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.INSTANCE;
            composer.endReplaceableGroup();
            return doNothingNestedScrollConnection;
        }
        SideCalculator m106343chooseCalculatorni1skBw = SideCalculator.Companion.m106343chooseCalculatorni1skBw(i, (LayoutDirection) composer.consume(CompositionLocals.getLocalLayoutDirection()));
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocals.getLocalDensity());
        Object[] objArr = {windowInsets, view, m106343chooseCalculatorni1skBw, density};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new WindowInsetsNestedScrollConnection(windowInsets, view, m106343chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) rememberedValue;
        EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, new C0502x76e50d25(windowInsetsNestedScrollConnection), composer, 8);
        composer.endReplaceableGroup();
        return windowInsetsNestedScrollConnection;
    }
}
