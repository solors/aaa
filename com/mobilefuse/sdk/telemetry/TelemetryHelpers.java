package com.mobilefuse.sdk.telemetry;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryHelpers.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TelemetryHelpers {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final SimpleDateFormat timeLogFormat = new SimpleDateFormat("mm:ss.SS", Locale.getDefault());

    /* compiled from: TelemetryHelpers.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SimpleDateFormat getTimeLogFormat() {
            return TelemetryHelpers.timeLogFormat;
        }
    }
}
