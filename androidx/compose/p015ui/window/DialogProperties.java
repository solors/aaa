package androidx.compose.p015ui.window;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidDialog.android.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.window.DialogProperties */
/* loaded from: classes.dex */
public final class DialogProperties {
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    @NotNull
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    @ExperimentalComposeUiApi
    public DialogProperties() {
        this(false, false, null, false, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        if (this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth) {
            return true;
        }
        return false;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }

    @ExperimentalComposeUiApi
    public DialogProperties(boolean z, boolean z2, @NotNull SecureFlagPolicy securePolicy, boolean z3) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.securePolicy = securePolicy;
        this.usePlatformDefaultWidth = z3;
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogProperties(boolean z, boolean z2, @NotNull SecureFlagPolicy securePolicy) {
        this(z, z2, securePolicy, true);
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
    }
}
