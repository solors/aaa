package androidx.compose.material;

import androidx.compose.p015ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Text.kt */
@Metadata
/* loaded from: classes.dex */
final class TextKt$LocalTextStyle$1 extends Lambda implements Functions<TextStyle> {
    public static final TextKt$LocalTextStyle$1 INSTANCE = new TextKt$LocalTextStyle$1();

    TextKt$LocalTextStyle$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final TextStyle invoke() {
        return TextStyle.Companion.getDefault();
    }
}
