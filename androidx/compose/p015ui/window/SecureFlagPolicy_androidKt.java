package androidx.compose.p015ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: SecureFlagPolicy.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.SecureFlagPolicy_androidKt */
/* loaded from: classes.dex */
public final class SecureFlagPolicy_androidKt {

    /* compiled from: SecureFlagPolicy.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.window.SecureFlagPolicy_androidKt$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean shouldApplySecureFlag(@NotNull SecureFlagPolicy secureFlagPolicy, boolean z) {
        Intrinsics.checkNotNullParameter(secureFlagPolicy, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return z;
        }
        return false;
    }
}
