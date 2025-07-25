package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidScrollable.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class AndroidScrollable_androidKt {
    @Composable
    @NotNull
    public static final ScrollConfig platformScrollConfig(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1485272842);
        AndroidConfig androidConfig = AndroidConfig.INSTANCE;
        composer.endReplaceableGroup();
        return androidConfig;
    }
}
