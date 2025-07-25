package androidx.compose.p015ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInfo.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.WindowInfoKt */
/* loaded from: classes.dex */
public final class WindowInfoKt {
    @Composable
    public static final void WindowFocusObserver(@NotNull Function1<? super Boolean, Unit> onWindowFocusChanged, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(onWindowFocusChanged, "onWindowFocusChanged");
        Composer startRestartGroup = composer.startRestartGroup(127829799);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(onWindowFocusChanged)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            WindowInfo windowInfo = (WindowInfo) startRestartGroup.consume(CompositionLocals.getLocalWindowInfo());
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onWindowFocusChanged, startRestartGroup, i2 & 14);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(windowInfo) | startRestartGroup.changed(rememberUpdatedState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(windowInfo, (Function2) rememberedValue, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new WindowInfoKt$WindowFocusObserver$2(onWindowFocusChanged, i));
        }
    }
}
