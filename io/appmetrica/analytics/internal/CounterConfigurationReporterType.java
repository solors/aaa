package io.appmetrica.analytics.internal;

import com.ironsource.C21114v8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public enum CounterConfigurationReporterType {
    MAIN(C21114v8.C21122h.f54053Z),
    MANUAL("manual"),
    SELF_SDK("self_sdk"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH("crash");
    
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f95710a;

    @Metadata
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CounterConfigurationReporterType fromStringValue(@Nullable String str) {
            CounterConfigurationReporterType counterConfigurationReporterType;
            CounterConfigurationReporterType[] values = CounterConfigurationReporterType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    counterConfigurationReporterType = values[i];
                    if (Intrinsics.m17075f(counterConfigurationReporterType.getStringValue(), str)) {
                        break;
                    }
                    i++;
                } else {
                    counterConfigurationReporterType = null;
                    break;
                }
            }
            if (counterConfigurationReporterType == null) {
                return CounterConfigurationReporterType.MAIN;
            }
            return counterConfigurationReporterType;
        }

        private Companion() {
        }
    }

    CounterConfigurationReporterType(String str) {
        this.f95710a = str;
    }

    @NotNull
    public static final CounterConfigurationReporterType fromStringValue(@Nullable String str) {
        return Companion.fromStringValue(str);
    }

    @NotNull
    public final String getStringValue() {
        return this.f95710a;
    }
}
