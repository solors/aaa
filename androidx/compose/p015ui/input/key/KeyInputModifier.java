package androidx.compose.p015ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p015ui.focus.FocusModifier;
import androidx.compose.p015ui.focus.FocusModifierKt;
import androidx.compose.p015ui.focus.FocusTraversalKt;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.layout.OnPlacedModifier;
import androidx.compose.p015ui.modifier.ModifierLocalConsumer;
import androidx.compose.p015ui.modifier.ModifierLocalProvider;
import androidx.compose.p015ui.modifier.ModifierLocalReadScope;
import androidx.compose.p015ui.modifier.ProvidableModifierLocal;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyInputModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.key.KeyInputModifier */
/* loaded from: classes.dex */
public final class KeyInputModifier implements ModifierLocalConsumer, ModifierLocalProvider<KeyInputModifier>, OnPlacedModifier {
    @Nullable
    private FocusModifier focusModifier;
    @Nullable
    private LayoutNode layoutNode;
    @Nullable
    private final Function1<KeyEvent, Boolean> onKeyEvent;
    @Nullable
    private final Function1<KeyEvent, Boolean> onPreviewKeyEvent;
    @Nullable
    private KeyInputModifier parent;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputModifier(@Nullable Function1<? super KeyEvent, Boolean> function1, @Nullable Function1<? super KeyEvent, Boolean> function12) {
        this.onKeyEvent = function1;
        this.onPreviewKeyEvent = function12;
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<KeyInputModifier> getKey() {
        return KeyInputModifierKt.getModifierLocalKeyInput();
    }

    @Nullable
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Nullable
    public final Function1<KeyEvent, Boolean> getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @Nullable
    public final Function1<KeyEvent, Boolean> getOnPreviewKeyEvent() {
        return this.onPreviewKeyEvent;
    }

    @Nullable
    public final KeyInputModifier getParent() {
        return this.parent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    @NotNull
    public KeyInputModifier getValue() {
        return this;
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        MutableVector<KeyInputModifier> keyInputChildren;
        MutableVector<KeyInputModifier> keyInputChildren2;
        Intrinsics.checkNotNullParameter(scope, "scope");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier != null && (keyInputChildren2 = focusModifier.getKeyInputChildren()) != null) {
            keyInputChildren2.remove(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) scope.getCurrent(FocusModifierKt.getModifierLocalParentFocusModifier());
        this.focusModifier = focusModifier2;
        if (focusModifier2 != null && (keyInputChildren = focusModifier2.getKeyInputChildren()) != null) {
            keyInputChildren.add(this);
        }
        this.parent = (KeyInputModifier) scope.getCurrent(KeyInputModifierKt.getModifierLocalKeyInput());
    }

    @Override // androidx.compose.p015ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.layoutNode = ((LayoutNodeWrapper) coordinates).getLayoutNode$ui_release();
    }

    /* renamed from: processKeyInput-ZmokQxo  reason: not valid java name */
    public final boolean m108768processKeyInputZmokQxo(@NotNull KeyEvent keyEvent) {
        FocusModifier findActiveFocusNode;
        KeyInputModifier findLastKeyInputModifier;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier != null && (findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusModifier)) != null && (findLastKeyInputModifier = FocusTraversalKt.findLastKeyInputModifier(findActiveFocusNode)) != null) {
            if (findLastKeyInputModifier.m108770propagatePreviewKeyEventZmokQxo(keyEvent)) {
                return true;
            }
            return findLastKeyInputModifier.m108769propagateKeyEventZmokQxo(keyEvent);
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    /* renamed from: propagateKeyEvent-ZmokQxo  reason: not valid java name */
    public final boolean m108769propagateKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Function1<KeyEvent, Boolean> function1 = this.onKeyEvent;
        if (function1 != null) {
            bool = function1.invoke(KeyEvent.m108744boximpl(keyEvent));
        } else {
            bool = null;
        }
        if (Intrinsics.m17075f(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        KeyInputModifier keyInputModifier = this.parent;
        if (keyInputModifier != null) {
            return keyInputModifier.m108769propagateKeyEventZmokQxo(keyEvent);
        }
        return false;
    }

    /* renamed from: propagatePreviewKeyEvent-ZmokQxo  reason: not valid java name */
    public final boolean m108770propagatePreviewKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        KeyInputModifier keyInputModifier = this.parent;
        if (keyInputModifier != null) {
            bool = Boolean.valueOf(keyInputModifier.m108770propagatePreviewKeyEventZmokQxo(keyEvent));
        } else {
            bool = null;
        }
        if (Intrinsics.m17075f(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        Function1<KeyEvent, Boolean> function1 = this.onPreviewKeyEvent;
        if (function1 != null) {
            return function1.invoke(KeyEvent.m108744boximpl(keyEvent)).booleanValue();
        }
        return false;
    }
}
