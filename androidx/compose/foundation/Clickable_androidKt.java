package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p015ui.input.key.KeyEventType;
import androidx.compose.p015ui.input.key.KeyEvent_androidKt;
import androidx.compose.p015ui.input.key.Key_androidKt;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Clickable.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isClick-ZmokQxo  reason: not valid java name */
    public static final boolean m106106isClickZmokQxo(@NotNull KeyEvent isClick) {
        boolean z;
        Intrinsics.checkNotNullParameter(isClick, "$this$isClick");
        if (!KeyEventType.m108754equalsimpl0(KeyEvent_androidKt.m108762getTypeZmokQxo(isClick), KeyEventType.Companion.m108759getKeyUpCS__XNY())) {
            return false;
        }
        int m108771getNativeKeyCodeYVgTNJs = Key_androidKt.m108771getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m108761getKeyZmokQxo(isClick));
        if (m108771getNativeKeyCodeYVgTNJs != 23 && m108771getNativeKeyCodeYVgTNJs != 66 && m108771getNativeKeyCodeYVgTNJs != 160) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Composable
    @NotNull
    public static final Functions<Boolean> isComposeRootInScrollableContainer(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1990508712);
        Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        composer.endReplaceableGroup();
        return clickable_androidKt$isComposeRootInScrollableContainer$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
