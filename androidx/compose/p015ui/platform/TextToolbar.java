package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextToolbar.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.TextToolbar */
/* loaded from: classes.dex */
public interface TextToolbar {

    /* compiled from: TextToolbar.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.TextToolbar$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, Functions functions, Functions functions2, Functions functions3, Functions functions4, int i, Object obj) {
        Functions functions5;
        Functions functions6;
        Functions functions7;
        Functions functions8;
        if (obj == null) {
            if ((i & 2) != 0) {
                functions5 = null;
            } else {
                functions5 = functions;
            }
            if ((i & 4) != 0) {
                functions6 = null;
            } else {
                functions6 = functions2;
            }
            if ((i & 8) != 0) {
                functions7 = null;
            } else {
                functions7 = functions3;
            }
            if ((i & 16) != 0) {
                functions8 = null;
            } else {
                functions8 = functions4;
            }
            textToolbar.showMenu(rect, functions5, functions6, functions7, functions8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }

    @NotNull
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(@NotNull Rect rect, @Nullable Functions<Unit> functions, @Nullable Functions<Unit> functions2, @Nullable Functions<Unit> functions3, @Nullable Functions<Unit> functions4);
}
