package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.autofill.AutofillTree;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalAutofillTree$1 extends Lambda implements Functions<AutofillTree> {
    public static final CompositionLocalsKt$LocalAutofillTree$1 INSTANCE = new CompositionLocalsKt$LocalAutofillTree$1();

    CompositionLocalsKt$LocalAutofillTree$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final AutofillTree invoke() {
        CompositionLocals.noLocalProvidedFor("LocalAutofillTree");
        throw new ExceptionsH();
    }
}
