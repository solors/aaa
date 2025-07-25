package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.content.SharedPreferencesKt */
/* loaded from: classes.dex */
public final class SharedPreferences {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(@NotNull android.content.SharedPreferences sharedPreferences, boolean z, @NotNull Function1<? super SharedPreferences.Editor, Unit> action) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        action.invoke(editor);
        if (z) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    public static /* synthetic */ void edit$default(android.content.SharedPreferences sharedPreferences, boolean z, Function1 action, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        action.invoke(editor);
        if (z) {
            editor.commit();
        } else {
            editor.apply();
        }
    }
}
