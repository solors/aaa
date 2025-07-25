package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Lazy.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class Lazy_androidKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final Object getDefaultLazyLayoutKey(int i) {
        return new DefaultLazyKey(i);
    }
}
