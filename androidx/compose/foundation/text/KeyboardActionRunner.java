package androidx.compose.foundation.text;

import androidx.compose.p015ui.focus.FocusManager;
import androidx.compose.p015ui.focus.FocusTraversal;
import androidx.compose.p015ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyboardActionRunner.kt */
@Metadata
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8  reason: not valid java name */
    public void mo106596defaultKeyboardActionKlQnJC8(int i) {
        boolean m109508equalsimpl0;
        boolean m109508equalsimpl02;
        boolean m109508equalsimpl03;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m109508equalsimpl0(i, companion.m109515getNexteUduSuo())) {
            getFocusManager().mo107241moveFocus3ESFkO8(FocusTraversal.Companion.m107236getNextdhqQ8s());
        } else if (ImeAction.m109508equalsimpl0(i, companion.m109517getPreviouseUduSuo())) {
            getFocusManager().mo107241moveFocus3ESFkO8(FocusTraversal.Companion.m107238getPreviousdhqQ8s());
        } else {
            boolean z = true;
            if (ImeAction.m109508equalsimpl0(i, companion.m109513getDoneeUduSuo())) {
                m109508equalsimpl0 = true;
            } else {
                m109508equalsimpl0 = ImeAction.m109508equalsimpl0(i, companion.m109514getGoeUduSuo());
            }
            if (m109508equalsimpl0) {
                m109508equalsimpl02 = true;
            } else {
                m109508equalsimpl02 = ImeAction.m109508equalsimpl0(i, companion.m109518getSearcheUduSuo());
            }
            if (m109508equalsimpl02) {
                m109508equalsimpl03 = true;
            } else {
                m109508equalsimpl03 = ImeAction.m109508equalsimpl0(i, companion.m109519getSendeUduSuo());
            }
            if (!m109508equalsimpl03) {
                z = ImeAction.m109508equalsimpl0(i, companion.m109512getDefaulteUduSuo());
            }
            if (!z) {
                ImeAction.m109508equalsimpl0(i, companion.m109516getNoneeUduSuo());
            }
        }
    }

    @NotNull
    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.m17056y("focusManager");
        return null;
    }

    @NotNull
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.m17056y("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8  reason: not valid java name */
    public final void m106597runActionKlQnJC8(int i) {
        boolean m109508equalsimpl0;
        Function1<KeyboardActionScope, Unit> function1;
        ImeAction.Companion companion = ImeAction.Companion;
        Unit unit = null;
        if (ImeAction.m109508equalsimpl0(i, companion.m109513getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m109508equalsimpl0(i, companion.m109514getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m109508equalsimpl0(i, companion.m109515getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m109508equalsimpl0(i, companion.m109517getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m109508equalsimpl0(i, companion.m109518getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m109508equalsimpl0(i, companion.m109519getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m109508equalsimpl0(i, companion.m109512getDefaulteUduSuo())) {
                m109508equalsimpl0 = true;
            } else {
                m109508equalsimpl0 = ImeAction.m109508equalsimpl0(i, companion.m109516getNoneeUduSuo());
            }
            if (m109508equalsimpl0) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            unit = Unit.f99208a;
        }
        if (unit == null) {
            mo106596defaultKeyboardActionKlQnJC8(i);
        }
    }

    public final void setFocusManager(@NotNull FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(@NotNull KeyboardActions keyboardActions) {
        Intrinsics.checkNotNullParameter(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
