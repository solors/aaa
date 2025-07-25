package androidx.compose.p015ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.p015ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTextToolbar.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar */
/* loaded from: classes.dex */
public final class AndroidTextToolbar implements TextToolbar {
    @Nullable
    private ActionMode actionMode;
    @NotNull
    private TextToolbarStatus status;
    @NotNull
    private final TextActionModeCallback textActionModeCallback;
    @NotNull
    private final View view;

    public AndroidTextToolbar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.textActionModeCallback = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), null, null, null, null, null, 62, null);
        this.status = TextToolbarStatus.Hidden;
    }

    @Override // androidx.compose.p015ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.p015ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.p015ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable Functions<Unit> functions, @Nullable Functions<Unit> functions2, @Nullable Functions<Unit> functions3, @Nullable Functions<Unit> functions4) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(functions);
        this.textActionModeCallback.setOnCutRequested(functions3);
        this.textActionModeCallback.setOnPasteRequested(functions2);
        this.textActionModeCallback.setOnSelectAllRequested(functions4);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
