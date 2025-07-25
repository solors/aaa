package androidx.compose.p015ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAutofill.android.kt */
@RequiresApi(26)
@Metadata
/* renamed from: androidx.compose.ui.autofill.AutofillApi26Helper */
/* loaded from: classes.dex */
public final class AutofillApi26Helper {
    @NotNull
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @DoNotInline
    @RequiresApi(26)
    @Nullable
    public final AutofillId getAutofillId(@NotNull ViewStructure structure) {
        AutofillId autofillId;
        Intrinsics.checkNotNullParameter(structure, "structure");
        autofillId = structure.getAutofillId();
        return autofillId;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isDate(@NotNull AutofillValue value) {
        boolean isDate;
        Intrinsics.checkNotNullParameter(value, "value");
        isDate = value.isDate();
        return isDate;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isList(@NotNull AutofillValue value) {
        boolean isList;
        Intrinsics.checkNotNullParameter(value, "value");
        isList = value.isList();
        return isList;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isText(@NotNull AutofillValue value) {
        boolean isText;
        Intrinsics.checkNotNullParameter(value, "value");
        isText = value.isText();
        return isText;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isToggle(@NotNull AutofillValue value) {
        boolean isToggle;
        Intrinsics.checkNotNullParameter(value, "value");
        isToggle = value.isToggle();
        return isToggle;
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillHints(@NotNull ViewStructure structure, @NotNull String[] hints) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        Intrinsics.checkNotNullParameter(hints, "hints");
        structure.setAutofillHints(hints);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillId(@NotNull ViewStructure structure, @NotNull AutofillId parent, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        Intrinsics.checkNotNullParameter(parent, "parent");
        structure.setAutofillId(parent, i);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillType(@NotNull ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setAutofillType(i);
    }

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final CharSequence textValue(@NotNull AutofillValue value) {
        CharSequence textValue;
        Intrinsics.checkNotNullParameter(value, "value");
        textValue = value.getTextValue();
        Intrinsics.checkNotNullExpressionValue(textValue, "value.textValue");
        return textValue;
    }
}
