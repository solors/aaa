package androidx.compose.p015ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewInterop.android.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.compose.ui.node.ViewAdapter */
/* loaded from: classes.dex */
public interface ViewAdapter {
    void didInsert(@NotNull View view, @NotNull ViewGroup viewGroup);

    void didUpdate(@NotNull View view, @NotNull ViewGroup viewGroup);

    int getId();

    void willInsert(@NotNull View view, @NotNull ViewGroup viewGroup);
}
