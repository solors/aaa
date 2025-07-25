package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SwipeToDismiss.kt */
@Metadata
/* loaded from: classes.dex */
public final class SwipeToDismissKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SwipeToDismiss(@org.jetbrains.annotations.NotNull androidx.compose.material.DismissState r21, @org.jetbrains.annotations.Nullable androidx.compose.p015ui.Modifier r22, @org.jetbrains.annotations.Nullable java.util.Set<? extends androidx.compose.material.SwipeToDismiss> r23, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.material.SwipeToDismiss, ? extends androidx.compose.material.ThresholdConfig> r24, @org.jetbrains.annotations.NotNull p1076zd.InterfaceC45268n<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.NotNull p1076zd.InterfaceC45268n<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss(androidx.compose.material.DismissState, androidx.compose.ui.Modifier, java.util.Set, kotlin.jvm.functions.Function1, zd.n, zd.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeToDismiss getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return SwipeToDismiss.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return SwipeToDismiss.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return SwipeToDismiss.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return SwipeToDismiss.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return SwipeToDismiss.StartToEnd;
        }
        if (dismissValue != DismissValue.DismissedToStart || dismissValue2 != dismissValue3) {
            return null;
        }
        return SwipeToDismiss.EndToStart;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final DismissState rememberDismissState(@Nullable DismissValue dismissValue, @Nullable Function1<? super DismissValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1753522702);
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            function1 = SwipeToDismissKt$rememberDismissState$1.INSTANCE;
        }
        DismissState dismissState = (DismissState) RememberSaveable.m107195rememberSaveable(new Object[0], DismissState.Companion.Saver(function1), (String) null, (Functions<? extends Object>) new SwipeToDismissKt$rememberDismissState$2(dismissValue, function1), composer, 72, 4);
        composer.endReplaceableGroup();
        return dismissState;
    }
}
