package androidx.compose.p015ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@RequiresApi(26)
@Metadata
/* renamed from: androidx.compose.ui.platform.AccessibilityNodeInfoVerificationHelperMethods */
/* loaded from: classes.dex */
public final class AccessibilityNodeInfoVerificationHelperMethods {
    @NotNull
    public static final AccessibilityNodeInfoVerificationHelperMethods INSTANCE = new AccessibilityNodeInfoVerificationHelperMethods();

    private AccessibilityNodeInfoVerificationHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAvailableExtraData(@NotNull AccessibilityNodeInfo node, @NotNull List<String> data) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(data, "data");
        node.setAvailableExtraData(data);
    }
}
