package androidx.compose.foundation.layout;

import androidx.compose.p015ui.input.nestedscroll.NestedScrollModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata
/* loaded from: classes.dex */
final class DoNothingNestedScrollConnection implements NestedScrollModifier {
    @NotNull
    public static final DoNothingNestedScrollConnection INSTANCE = new DoNothingNestedScrollConnection();

    private DoNothingNestedScrollConnection() {
    }
}
