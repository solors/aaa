package androidx.compose.p015ui.platform;

import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidViewConfiguration.android.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidViewConfiguration */
/* loaded from: classes.dex */
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    @NotNull
    private final ViewConfiguration viewConfiguration;

    public AndroidViewConfiguration(@NotNull ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.p015ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // androidx.compose.p015ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.p015ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.p015ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return this.viewConfiguration.getScaledTouchSlop();
    }
}
