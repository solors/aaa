package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldScroll.kt */
@Metadata
/* loaded from: classes.dex */
final class TextFieldScrollerPosition$Companion$Saver$2 extends Lambda implements Function1<List<? extends Object>, TextFieldScrollerPosition> {
    public static final TextFieldScrollerPosition$Companion$Saver$2 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$2();

    TextFieldScrollerPosition$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final TextFieldScrollerPosition invoke(@NotNull List<? extends Object> restored) {
        Intrinsics.checkNotNullParameter(restored, "restored");
        return new TextFieldScrollerPosition(((Boolean) restored.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal, ((Float) restored.get(0)).floatValue());
    }
}
