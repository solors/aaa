package androidx.compose.p015ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAutofill.android.kt */
@RequiresApi(23)
@Metadata
/* renamed from: androidx.compose.ui.autofill.AutofillApi23Helper */
/* loaded from: classes.dex */
public final class AutofillApi23Helper {
    @NotNull
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final int addChildCount(@NotNull ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.addChildCount(i);
    }

    @DoNotInline
    @RequiresApi(23)
    @Nullable
    public final ViewStructure newChild(@NotNull ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.newChild(i);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setDimens(@NotNull ViewStructure structure, int i, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setDimens(i, i2, i3, i4, i5, i6);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setId(@NotNull ViewStructure structure, int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setId(i, str, str2, str3);
    }
}
