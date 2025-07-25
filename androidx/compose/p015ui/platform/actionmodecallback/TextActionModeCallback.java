package androidx.compose.p015ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextActionModeCallback.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback */
/* loaded from: classes.dex */
public final class TextActionModeCallback {
    @Nullable
    private final Functions<Unit> onActionModeDestroy;
    @Nullable
    private Functions<Unit> onCopyRequested;
    @Nullable
    private Functions<Unit> onCutRequested;
    @Nullable
    private Functions<Unit> onPasteRequested;
    @Nullable
    private Functions<Unit> onSelectAllRequested;
    @NotNull
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, Functions<Unit> functions) {
        if (functions != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else if (functions == null && menu.findItem(menuItemOption.getId()) != null) {
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(@NotNull Menu menu, @NotNull MenuItemOption item) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(item, "item");
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    @Nullable
    public final Functions<Unit> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    @Nullable
    public final Functions<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @Nullable
    public final Functions<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    @Nullable
    public final Functions<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @Nullable
    public final Functions<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        Intrinsics.m17074g(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            Functions<Unit> functions = this.onCopyRequested;
            if (functions != null) {
                functions.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            Functions<Unit> functions2 = this.onPasteRequested;
            if (functions2 != null) {
                functions2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            Functions<Unit> functions3 = this.onCutRequested;
            if (functions3 != null) {
                functions3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            Functions<Unit> functions4 = this.onSelectAllRequested;
            if (functions4 != null) {
                functions4.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.onCopyRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Copy);
                }
                if (this.onPasteRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Paste);
                }
                if (this.onCutRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Cut);
                }
                if (this.onSelectAllRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void onDestroyActionMode() {
        Functions<Unit> functions = this.onActionModeDestroy;
        if (functions != null) {
            functions.invoke();
        }
    }

    public final boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (actionMode != null && menu != null) {
            updateMenuItems$ui_release(menu);
            return true;
        }
        return false;
    }

    public final void setOnCopyRequested(@Nullable Functions<Unit> functions) {
        this.onCopyRequested = functions;
    }

    public final void setOnCutRequested(@Nullable Functions<Unit> functions) {
        this.onCutRequested = functions;
    }

    public final void setOnPasteRequested(@Nullable Functions<Unit> functions) {
        this.onPasteRequested = functions;
    }

    public final void setOnSelectAllRequested(@Nullable Functions<Unit> functions) {
        this.onSelectAllRequested = functions;
    }

    public final void setRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public TextActionModeCallback(@Nullable Functions<Unit> functions, @NotNull Rect rect, @Nullable Functions<Unit> functions2, @Nullable Functions<Unit> functions3, @Nullable Functions<Unit> functions4, @Nullable Functions<Unit> functions5) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.onActionModeDestroy = functions;
        this.rect = rect;
        this.onCopyRequested = functions2;
        this.onPasteRequested = functions3;
        this.onCutRequested = functions4;
        this.onSelectAllRequested = functions5;
    }

    public /* synthetic */ TextActionModeCallback(Functions functions, Rect rect, Functions functions2, Functions functions3, Functions functions4, Functions functions5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : functions, (i & 2) != 0 ? Rect.Companion.getZero() : rect, (i & 4) != 0 ? null : functions2, (i & 8) != 0 ? null : functions3, (i & 16) != 0 ? null : functions4, (i & 32) != 0 ? null : functions5);
    }
}
