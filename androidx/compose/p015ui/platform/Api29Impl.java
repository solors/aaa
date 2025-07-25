package androidx.compose.p015ui.platform;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidAccessibilityManager.android.kt */
@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.platform.Api29Impl */
/* loaded from: classes.dex */
public final class Api29Impl {
    @NotNull
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    @DoNotInline
    public final int getRecommendedTimeoutMillis(@NotNull AccessibilityManager accessibilityManager, int i, int i2) {
        int recommendedTimeoutMillis;
        Intrinsics.checkNotNullParameter(accessibilityManager, "accessibilityManager");
        recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i, i2);
        return recommendedTimeoutMillis;
    }
}
