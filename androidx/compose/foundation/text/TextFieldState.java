package androidx.compose.foundation.text;

import androidx.compose.p015ui.focus.FocusManager;
import androidx.compose.p015ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p015ui.graphics.Paint;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.TextStyle;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.input.EditProcessor;
import androidx.compose.p015ui.text.input.ImeAction;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.p015ui.text.input.TextInputSession;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoreTextField.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextFieldState {
    @NotNull
    private final SnapshotState handleState$delegate;
    @NotNull
    private final SnapshotState hasFocus$delegate;
    @Nullable
    private TextInputSession inputSession;
    @NotNull
    private final KeyboardActionRunner keyboardActionRunner;
    @Nullable
    private LayoutCoordinates layoutCoordinates;
    @NotNull
    private final SnapshotState layoutResult$delegate;
    @NotNull
    private final Function1<ImeAction, Unit> onImeActionPerformed;
    @NotNull
    private final Function1<TextFieldValue, Unit> onValueChange;
    @NotNull
    private Function1<? super TextFieldValue, Unit> onValueChangeOriginal;
    @NotNull
    private final EditProcessor processor;
    @NotNull
    private final RecomposeScope recomposeScope;
    @NotNull
    private final Paint selectionPaint;
    @NotNull
    private final SnapshotState showCursorHandle$delegate;
    private boolean showFloatingToolbar;
    @NotNull
    private final SnapshotState showSelectionHandleEnd$delegate;
    @NotNull
    private final SnapshotState showSelectionHandleStart$delegate;
    @NotNull
    private TextDelegate textDelegate;

    public TextFieldState(@NotNull TextDelegate textDelegate, @NotNull RecomposeScope recomposeScope) {
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        SnapshotState mutableStateOf$default3;
        SnapshotState mutableStateOf$default4;
        SnapshotState mutableStateOf$default5;
        SnapshotState mutableStateOf$default6;
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.processor = new EditProcessor();
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.layoutResult$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.handleState$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle$delegate = mutableStateOf$default6;
        this.keyboardActionRunner = new KeyboardActionRunner();
        this.onValueChangeOriginal = TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.onValueChange = new TextFieldState$onValueChange$1(this);
        this.onImeActionPerformed = new TextFieldState$onImeActionPerformed$1(this);
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    @NotNull
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    @Nullable
    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @Nullable
    public final TextLayoutResultProxy getLayoutResult() {
        return (TextLayoutResultProxy) this.layoutResult$delegate.getValue();
    }

    @NotNull
    public final Function1<ImeAction, Unit> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange() {
        return this.onValueChange;
    }

    @NotNull
    public final EditProcessor getProcessor() {
        return this.processor;
    }

    @NotNull
    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    @NotNull
    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    @NotNull
    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setHandleState(@NotNull HandleState handleState) {
        Intrinsics.checkNotNullParameter(handleState, "<set-?>");
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(@Nullable TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(@Nullable TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResult$delegate.setValue(textLayoutResultProxy);
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar = z;
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(@NotNull TextDelegate textDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "<set-?>");
        this.textDelegate = textDelegate;
    }

    /* renamed from: update-aKPr-nQ  reason: not valid java name */
    public final void m106662updateaKPrnQ(@NotNull AnnotatedString visualText, @NotNull TextStyle textStyle, boolean z, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @NotNull KeyboardActions keyboardActions, @NotNull FocusManager focusManager, long j) {
        List m17166m;
        Intrinsics.checkNotNullParameter(visualText, "visualText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.mo107411setColor8_81llA(j);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        TextDelegate textDelegate = this.textDelegate;
        m17166m = C37563v.m17166m();
        this.textDelegate = CoreText.m106591updateTextDelegatex_uQXYA$default(textDelegate, visualText, textStyle, density, fontFamilyResolver, z, 0, 0, m17166m, 192, null);
    }
}
