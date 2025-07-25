package androidx.compose.p015ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutofillCallback.android.kt */
@RequiresApi(26)
@Metadata
/* renamed from: androidx.compose.ui.autofill.AutofillCallback */
/* loaded from: classes.dex */
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    @NotNull
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(@NotNull View view, int i, int i2) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAutofillEvent(view, i, i2);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void register(@NotNull AndroidAutofill autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.getAutofillManager().registerCallback(this);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void unregister(@NotNull AndroidAutofill autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.getAutofillManager().unregisterCallback(this);
    }
}
