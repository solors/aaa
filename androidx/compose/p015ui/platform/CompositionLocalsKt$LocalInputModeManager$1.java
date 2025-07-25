package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.input.InputModeManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalInputModeManager$1 extends Lambda implements Functions<InputModeManager> {
    public static final CompositionLocalsKt$LocalInputModeManager$1 INSTANCE = new CompositionLocalsKt$LocalInputModeManager$1();

    CompositionLocalsKt$LocalInputModeManager$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final InputModeManager invoke() {
        CompositionLocals.noLocalProvidedFor("LocalInputManager");
        throw new ExceptionsH();
    }
}
