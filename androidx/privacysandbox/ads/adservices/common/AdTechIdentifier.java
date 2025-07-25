package androidx.privacysandbox.ads.adservices.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdTechIdentifier.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AdTechIdentifier {
    @NotNull
    private final String identifier;

    public AdTechIdentifier(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdTechIdentifier)) {
            return false;
        }
        return Intrinsics.m17075f(this.identifier, ((AdTechIdentifier) obj).identifier);
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.identifier);
    }
}
