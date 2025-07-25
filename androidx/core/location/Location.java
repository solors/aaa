package androidx.core.location;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.location.LocationKt */
/* loaded from: classes.dex */
public final class Location {
    public static final double component1(@NotNull android.location.Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLatitude();
    }

    public static final double component2(@NotNull android.location.Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLongitude();
    }
}
