package androidx.compose.p015ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidAccessibilityManager.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidAccessibilityManager */
/* loaded from: classes.dex */
public final class AndroidAccessibilityManager implements AccessibilityManager {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int FlagContentControls = 4;
    @Deprecated
    public static final int FlagContentIcons = 1;
    @Deprecated
    public static final int FlagContentText = 2;
    @NotNull
    private final AccessibilityManager accessibilityManager;

    /* compiled from: AndroidAccessibilityManager.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.AndroidAccessibilityManager$Companion */
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AndroidAccessibilityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("accessibility");
        if (systemService != null) {
            this.accessibilityManager = (AccessibilityManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p015ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3) {
        int i = z;
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            i = (z ? 1 : 0) | true;
        }
        if (z3) {
            i = (i == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j, i);
            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                return recommendedTimeoutMillis;
            }
        } else if (!z3 || !this.accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
