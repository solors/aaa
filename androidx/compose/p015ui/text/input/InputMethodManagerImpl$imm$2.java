package androidx.compose.p015ui.text.input;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputMethodManager.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2 */
/* loaded from: classes.dex */
final class InputMethodManagerImpl$imm$2 extends Lambda implements Functions<InputMethodManager> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final InputMethodManager invoke() {
        Object systemService = this.$context.getSystemService("input_method");
        if (systemService != null) {
            return (InputMethodManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
