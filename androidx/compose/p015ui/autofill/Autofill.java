package androidx.compose.p015ui.autofill;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Autofill.kt */
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.autofill.Autofill */
/* loaded from: classes.dex */
public interface Autofill {
    void cancelAutofillForNode(@NotNull AutofillNode autofillNode);

    void requestAutofillForNode(@NotNull AutofillNode autofillNode);
}
