package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.activity.compose.BackHandlerKt */
/* loaded from: classes.dex */
public final class BackHandler {
    @Composable
    public static final void BackHandler(boolean z, @NotNull Functions<Unit> onBack, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer startRestartGroup = composer.startRestartGroup(-361453782);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changed(onBack)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                z = true;
            }
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onBack, startRestartGroup, (i3 >> 3) & 14);
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new OnBackPressedCallback(z) { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$backCallback$1$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        BackHandler.access$BackHandler$lambda$0(rememberUpdatedState).invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) rememberedValue;
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(-3686552);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(backHandlerKt$BackHandler$backCallback$1$1);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new BackHandlerKt$BackHandler$1$1(backHandlerKt$BackHandler$backCallback$1$1, z);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Functions) rememberedValue2, startRestartGroup, 0);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, new BackHandlerKt$BackHandler$2(onBackPressedDispatcher, lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1), startRestartGroup, 72);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackHandlerKt$BackHandler$3(z, onBack, i, i2));
        }
    }

    public static final Functions<Unit> BackHandler$lambda$0(State<? extends Functions<Unit>> state) {
        return state.getValue();
    }

    public static final /* synthetic */ Functions access$BackHandler$lambda$0(State state) {
        return BackHandler$lambda$0(state);
    }
}
