package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.SemanticsPropertyKey;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.MagnifierKt */
/* loaded from: classes.dex */
public final class Magnifier {
    @NotNull
    private static final SemanticsPropertyKey<Functions<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    @NotNull
    public static final SemanticsPropertyKey<Functions<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i) {
        if (i >= 28) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }

    @RequiresApi(28)
    @SuppressLint({"ModifierInspectorInfo"})
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull Function1<? super Density, Offset> sourceCenter, @NotNull Function1<? super Density, Offset> magnifierCenter, float f, @NotNull MagnifierStyle style, @Nullable Function1<? super DpSize, Unit> function1, @NotNull PlatformMagnifierFactory platformMagnifierFactory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new MagnifierKt$magnifier$4(sourceCenter, magnifierCenter, f, function1, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function12, float f, MagnifierStyle magnifierStyle, Function1 function13, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = MagnifierKt$magnifier$1.INSTANCE;
        }
        Function1 function14 = function12;
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            magnifierStyle = MagnifierStyle.Companion.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i & 16) != 0) {
            function13 = null;
        }
        return magnifier(modifier, function1, function14, f2, magnifierStyle2, function13);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier magnifier(@NotNull Modifier modifier, @NotNull Function1<? super Density, Offset> sourceCenter, @NotNull Function1<? super Density, Offset> magnifierCenter, float f, @NotNull MagnifierStyle style, @Nullable Function1<? super DpSize, Unit> function1) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Function1 magnifierKt$magnifier$$inlined$debugInspectorInfo$1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(sourceCenter, magnifierCenter, f, style) : InspectableValueKt.getNoInspectorInfo();
        Modifier modifier2 = Modifier.Companion;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifier2 = magnifier(modifier2, sourceCenter, magnifierCenter, f, style, function1, PlatformMagnifierFactory.Companion.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, magnifierKt$magnifier$$inlined$debugInspectorInfo$1, modifier2);
    }
}
