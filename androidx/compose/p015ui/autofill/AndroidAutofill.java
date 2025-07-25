package androidx.compose.p015ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidAutofill.android.kt */
@RequiresApi(26)
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.autofill.AndroidAutofill */
/* loaded from: classes.dex */
public final class AndroidAutofill implements Autofill {
    @NotNull
    private final AutofillManager autofillManager;
    @NotNull
    private final AutofillTree autofillTree;
    @NotNull
    private final View view;

    public AndroidAutofill(@NotNull View view, @NotNull AutofillTree autofillTree) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autofillTree, "autofillTree");
        this.view = view;
        this.autofillTree = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.autofillManager = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    @Override // androidx.compose.p015ui.autofill.Autofill
    public void cancelAutofillForNode(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    @NotNull
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @NotNull
    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.p015ui.autofill.Autofill
    public void requestAutofillForNode(@NotNull AutofillNode autofillNode) {
        Rect androidRect;
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        AutofillManager autofillManager = this.autofillManager;
        View view = this.view;
        int id2 = autofillNode.getId();
        androidx.compose.p015ui.geometry.Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox != null && (androidRect = RectHelper_androidKt.toAndroidRect(boundingBox)) != null) {
            autofillManager.notifyViewEntered(view, id2, androidRect);
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }
}
