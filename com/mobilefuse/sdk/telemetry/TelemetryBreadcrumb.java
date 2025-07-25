package com.mobilefuse.sdk.telemetry;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryBreadcrumb.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TelemetryBreadcrumb {
    @NotNull
    private final String category;
    @Nullable
    private final Map<String, String> data;
    @NotNull
    private final String message;
    private final long timestamp;

    public TelemetryBreadcrumb(@NotNull String message, @NotNull String category, @Nullable Map<String, String> map, long j) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        this.message = message;
        this.category = category;
        this.data = map;
        this.timestamp = j;
    }

    public static /* synthetic */ TelemetryBreadcrumb copy$default(TelemetryBreadcrumb telemetryBreadcrumb, String str, String str2, Map map, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = telemetryBreadcrumb.message;
        }
        if ((i & 2) != 0) {
            str2 = telemetryBreadcrumb.category;
        }
        String str3 = str2;
        Map<String, String> map2 = map;
        if ((i & 4) != 0) {
            map2 = telemetryBreadcrumb.data;
        }
        Map map3 = map2;
        if ((i & 8) != 0) {
            j = telemetryBreadcrumb.timestamp;
        }
        return telemetryBreadcrumb.copy(str, str3, map3, j);
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @NotNull
    public final String component2() {
        return this.category;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.data;
    }

    public final long component4() {
        return this.timestamp;
    }

    @NotNull
    public final TelemetryBreadcrumb copy(@NotNull String message, @NotNull String category, @Nullable Map<String, String> map, long j) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        return new TelemetryBreadcrumb(message, category, map, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TelemetryBreadcrumb) {
                TelemetryBreadcrumb telemetryBreadcrumb = (TelemetryBreadcrumb) obj;
                if (!Intrinsics.m17075f(this.message, telemetryBreadcrumb.message) || !Intrinsics.m17075f(this.category, telemetryBreadcrumb.category) || !Intrinsics.m17075f(this.data, telemetryBreadcrumb.data) || this.timestamp != telemetryBreadcrumb.timestamp) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Map<String, String> getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.message;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.category;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i3 = map.hashCode();
        }
        return ((i5 + i3) * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "TelemetryBreadcrumb(message=" + this.message + ", category=" + this.category + ", data=" + this.data + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ TelemetryBreadcrumb(String str, String str2, Map map, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i & 8) != 0 ? System.currentTimeMillis() / 1000 : j);
    }
}
