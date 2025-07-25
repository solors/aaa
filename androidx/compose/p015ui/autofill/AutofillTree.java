package androidx.compose.p015ui.autofill;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutofillTree.kt */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.autofill.AutofillTree */
/* loaded from: classes.dex */
public final class AutofillTree {
    public static final int $stable = 8;
    @NotNull
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    @NotNull
    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    @Nullable
    public final Unit performAutofill(int i, @NotNull String value) {
        Function1<String, Unit> onFill;
        Intrinsics.checkNotNullParameter(value, "value");
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i));
        if (autofillNode != null && (onFill = autofillNode.getOnFill()) != null) {
            onFill.invoke(value);
            return Unit.f99208a;
        }
        return null;
    }

    public final void plusAssign(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
