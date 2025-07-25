package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TelemetryActionParam {
    private final boolean includeToBreadcrumb;
    @NotNull
    private final TelemetryParamType type;
    @NotNull
    private final Object value;

    public TelemetryActionParam(@NotNull TelemetryParamType type, @NotNull Object value, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = type;
        this.value = value;
        this.includeToBreadcrumb = z;
    }

    public static /* synthetic */ TelemetryActionParam copy$default(TelemetryActionParam telemetryActionParam, TelemetryParamType telemetryParamType, Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            telemetryParamType = telemetryActionParam.type;
        }
        if ((i & 2) != 0) {
            obj = telemetryActionParam.value;
        }
        if ((i & 4) != 0) {
            z = telemetryActionParam.includeToBreadcrumb;
        }
        return telemetryActionParam.copy(telemetryParamType, obj, z);
    }

    @NotNull
    public final TelemetryParamType component1() {
        return this.type;
    }

    @NotNull
    public final Object component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.includeToBreadcrumb;
    }

    @NotNull
    public final TelemetryActionParam copy(@NotNull TelemetryParamType type, @NotNull Object value, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new TelemetryActionParam(type, value, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TelemetryActionParam) {
                TelemetryActionParam telemetryActionParam = (TelemetryActionParam) obj;
                if (!Intrinsics.m17075f(this.type, telemetryActionParam.type) || !Intrinsics.m17075f(this.value, telemetryActionParam.value) || this.includeToBreadcrumb != telemetryActionParam.includeToBreadcrumb) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean getIncludeToBreadcrumb() {
        return this.includeToBreadcrumb;
    }

    @NotNull
    public final TelemetryParamType getType() {
        return this.type;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        TelemetryParamType telemetryParamType = this.type;
        int i2 = 0;
        if (telemetryParamType != null) {
            i = telemetryParamType.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj = this.value;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z = this.includeToBreadcrumb;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    @NotNull
    public String toString() {
        return "TelemetryActionParam(type=" + this.type + ", value=" + this.value + ", includeToBreadcrumb=" + this.includeToBreadcrumb + ")";
    }

    public /* synthetic */ TelemetryActionParam(TelemetryParamType telemetryParamType, Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(telemetryParamType, obj, (i & 4) != 0 ? true : z);
    }
}
