package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.modifier.ModifierLocalConsumer;
import androidx.compose.p015ui.modifier.ModifierLocalProvider;
import androidx.compose.p015ui.modifier.ModifierLocalReadScope;
import androidx.compose.p015ui.modifier.ProvidableModifierLocal;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusRequesterModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusRequesterModifierLocal */
/* loaded from: classes.dex */
public final class FocusRequesterModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<FocusRequesterModifierLocal> {
    @NotNull
    private final MutableVector<FocusModifier> focusModifiers;
    @NotNull
    private final FocusRequester focusRequester;
    @Nullable
    private FocusRequesterModifierLocal parent;

    public FocusRequesterModifierLocal(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.focusRequester = focusRequester;
        this.focusModifiers = new MutableVector<>(new FocusModifier[16], 0);
        focusRequester.getFocusRequesterModifierLocals$ui_release().add(this);
    }

    public final void addFocusModifier(@NotNull FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.add(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifier(focusModifier);
        }
    }

    public final void addFocusModifiers(@NotNull MutableVector<FocusModifier> newModifiers) {
        Intrinsics.checkNotNullParameter(newModifiers, "newModifiers");
        MutableVector<FocusModifier> mutableVector = this.focusModifiers;
        mutableVector.addAll(mutableVector.getSize(), newModifiers);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifiers(newModifiers);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r7.indexOf(r5) < r7.indexOf(r6)) goto L28;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p015ui.focus.FocusModifier findFocusNode() {
        /*
            r9 = this;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusModifier> r0 = r9.focusModifiers
            int r1 = r0.getSize()
            r2 = 0
            if (r1 <= 0) goto L8a
            java.lang.Object[] r0 = r0.getContent()
            r3 = 0
        Le:
            r4 = r0[r3]
            androidx.compose.ui.focus.FocusModifier r4 = (androidx.compose.p015ui.focus.FocusModifier) r4
            if (r2 == 0) goto L85
            androidx.compose.ui.node.LayoutNodeWrapper r5 = r2.getLayoutNodeWrapper()
            if (r5 == 0) goto L85
            androidx.compose.ui.node.LayoutNode r5 = r5.getLayoutNode$ui_release()
            if (r5 != 0) goto L21
            goto L85
        L21:
            androidx.compose.ui.node.LayoutNodeWrapper r6 = r4.getLayoutNodeWrapper()
            if (r6 == 0) goto L86
            androidx.compose.ui.node.LayoutNode r6 = r6.getLayoutNode$ui_release()
            if (r6 != 0) goto L2e
            goto L86
        L2e:
            int r7 = r5.getDepth$ui_release()
            int r8 = r6.getDepth$ui_release()
            if (r7 <= r8) goto L40
            androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
            kotlin.jvm.internal.Intrinsics.m17074g(r5)
            goto L2e
        L40:
            int r7 = r6.getDepth$ui_release()
            int r8 = r5.getDepth$ui_release()
            if (r7 <= r8) goto L52
            androidx.compose.ui.node.LayoutNode r6 = r6.getParent$ui_release()
            kotlin.jvm.internal.Intrinsics.m17074g(r6)
            goto L40
        L52:
            androidx.compose.ui.node.LayoutNode r7 = r5.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r8 = r6.getParent$ui_release()
            boolean r7 = kotlin.jvm.internal.Intrinsics.m17075f(r7, r8)
            if (r7 != 0) goto L6f
            androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
            kotlin.jvm.internal.Intrinsics.m17074g(r5)
            androidx.compose.ui.node.LayoutNode r6 = r6.getParent$ui_release()
            kotlin.jvm.internal.Intrinsics.m17074g(r6)
            goto L52
        L6f:
            androidx.compose.ui.node.LayoutNode r7 = r5.getParent$ui_release()
            kotlin.jvm.internal.Intrinsics.m17074g(r7)
            androidx.compose.runtime.collection.MutableVector r7 = r7.get_children$ui_release()
            int r5 = r7.indexOf(r5)
            int r6 = r7.indexOf(r6)
            if (r5 >= r6) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.FocusRequesterModifierLocal.findFocusNode():androidx.compose.ui.focus.FocusModifier");
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<FocusRequesterModifierLocal> getKey() {
        return FocusRequesterModifierKt.getModifierLocalFocusRequester();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    @NotNull
    public FocusRequesterModifierLocal getValue() {
        return this;
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) scope.getCurrent(FocusRequesterModifierKt.getModifierLocalFocusRequester());
        if (!Intrinsics.m17075f(focusRequesterModifierLocal, this.parent)) {
            FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.parent;
            if (focusRequesterModifierLocal2 != null) {
                focusRequesterModifierLocal2.removeFocusModifiers(this.focusModifiers);
            }
            if (focusRequesterModifierLocal != null) {
                focusRequesterModifierLocal.addFocusModifiers(this.focusModifiers);
            }
            this.parent = focusRequesterModifierLocal;
        }
    }

    public final void removeFocusModifier(@NotNull FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.remove(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifier(focusModifier);
        }
    }

    public final void removeFocusModifiers(@NotNull MutableVector<FocusModifier> removedModifiers) {
        Intrinsics.checkNotNullParameter(removedModifiers, "removedModifiers");
        this.focusModifiers.removeAll(removedModifiers);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifiers(removedModifiers);
        }
    }
}
