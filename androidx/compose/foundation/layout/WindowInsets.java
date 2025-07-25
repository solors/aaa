package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsets.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public interface WindowInsets {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowInsets.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    int getBottom(@NotNull Density density);

    int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection);

    int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection);

    int getTop(@NotNull Density density);
}
