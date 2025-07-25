package com.mobilefuse.sdk.telemetry;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.telemetry.TelemetryAction */
/* loaded from: classes7.dex */
public final class TelemetryDataModel {
    @NotNull
    private final List<TelemetryActionParam> extras;
    @NotNull
    private final LogLevel logLevel;
    @NotNull
    private final String sender;
    private final long timestamp;
    @NotNull
    private final TelemetryActionType type;

    public TelemetryDataModel(@NotNull String sender, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras, @NotNull LogLevel logLevel, long j) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.sender = sender;
        this.type = type;
        this.extras = extras;
        this.logLevel = logLevel;
        this.timestamp = j;
    }

    public static /* synthetic */ TelemetryDataModel copy$default(TelemetryDataModel telemetryDataModel, String str, TelemetryActionType telemetryActionType, List list, LogLevel logLevel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = telemetryDataModel.sender;
        }
        if ((i & 2) != 0) {
            telemetryActionType = telemetryDataModel.type;
        }
        TelemetryActionType telemetryActionType2 = telemetryActionType;
        List<TelemetryActionParam> list2 = list;
        if ((i & 4) != 0) {
            list2 = telemetryDataModel.extras;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            logLevel = telemetryDataModel.logLevel;
        }
        LogLevel logLevel2 = logLevel;
        if ((i & 16) != 0) {
            j = telemetryDataModel.timestamp;
        }
        return telemetryDataModel.copy(str, telemetryActionType2, list3, logLevel2, j);
    }

    @NotNull
    public final String component1() {
        return this.sender;
    }

    @NotNull
    public final TelemetryActionType component2() {
        return this.type;
    }

    @NotNull
    public final List<TelemetryActionParam> component3() {
        return this.extras;
    }

    @NotNull
    public final LogLevel component4() {
        return this.logLevel;
    }

    public final long component5() {
        return this.timestamp;
    }

    @NotNull
    public final TelemetryDataModel copy(@NotNull String sender, @NotNull TelemetryActionType type, @NotNull List<TelemetryActionParam> extras, @NotNull LogLevel logLevel, long j) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return new TelemetryDataModel(sender, type, extras, logLevel, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof TelemetryDataModel) {
                TelemetryDataModel telemetryDataModel = (TelemetryDataModel) obj;
                if (!Intrinsics.m17075f(this.sender, telemetryDataModel.sender) || !Intrinsics.m17075f(this.type, telemetryDataModel.type) || !Intrinsics.m17075f(this.extras, telemetryDataModel.extras) || !Intrinsics.m17075f(this.logLevel, telemetryDataModel.logLevel) || this.timestamp != telemetryDataModel.timestamp) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final List<TelemetryActionParam> getExtras() {
        return this.extras;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final String getSender() {
        return this.sender;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final TelemetryActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.sender;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        TelemetryActionType telemetryActionType = this.type;
        if (telemetryActionType != null) {
            i2 = telemetryActionType.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        List<TelemetryActionParam> list = this.extras;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        LogLevel logLevel = this.logLevel;
        if (logLevel != null) {
            i4 = logLevel.hashCode();
        }
        return ((i7 + i4) * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "TelemetryAction(sender=" + this.sender + ", type=" + this.type + ", extras=" + this.extras + ", logLevel=" + this.logLevel + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ TelemetryDataModel(String str, TelemetryActionType telemetryActionType, List list, LogLevel logLevel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, telemetryActionType, (i & 4) != 0 ? C37563v.m17166m() : list, (i & 8) != 0 ? LogLevel.DEBUG : logLevel, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }
}
