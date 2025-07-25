package androidx.compose.p015ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.platform.TypefaceDirtyTracker */
/* loaded from: classes.dex */
public final class TypefaceDirtyTracker {
    @NotNull
    private final Object initial;
    @NotNull
    private final State<Object> resolveResult;

    public TypefaceDirtyTracker(@NotNull State<? extends Object> resolveResult) {
        Intrinsics.checkNotNullParameter(resolveResult, "resolveResult");
        this.resolveResult = resolveResult;
        this.initial = resolveResult.getValue();
    }

    @NotNull
    public final Object getInitial() {
        return this.initial;
    }

    @NotNull
    public final State<Object> getResolveResult() {
        return this.resolveResult;
    }

    @NotNull
    public final Typeface getTypeface() {
        return (Typeface) this.initial;
    }

    public final boolean isStaleResolvedFont() {
        if (this.resolveResult.getValue() != this.initial) {
            return true;
        }
        return false;
    }
}
