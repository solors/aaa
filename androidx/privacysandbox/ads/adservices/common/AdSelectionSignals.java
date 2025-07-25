package androidx.privacysandbox.ads.adservices.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdSelectionSignals.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AdSelectionSignals {
    @NotNull
    private final String signals;

    public AdSelectionSignals(@NotNull String signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        this.signals = signals;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionSignals)) {
            return false;
        }
        return Intrinsics.m17075f(this.signals, ((AdSelectionSignals) obj).signals);
    }

    @NotNull
    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionSignals: " + this.signals;
    }
}
