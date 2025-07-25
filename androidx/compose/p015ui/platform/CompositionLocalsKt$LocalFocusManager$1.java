package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.focus.FocusManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalFocusManager$1 extends Lambda implements Functions<FocusManager> {
    public static final CompositionLocalsKt$LocalFocusManager$1 INSTANCE = new CompositionLocalsKt$LocalFocusManager$1();

    CompositionLocalsKt$LocalFocusManager$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final FocusManager invoke() {
        CompositionLocals.noLocalProvidedFor("LocalFocusManager");
        throw new ExceptionsH();
    }
}
