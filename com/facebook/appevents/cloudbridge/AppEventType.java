package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@Metadata
/* loaded from: classes2.dex */
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;
    
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppEventType invoke(@NotNull String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            if (Intrinsics.m17075f(rawValue, "MOBILE_APP_INSTALL")) {
                return AppEventType.MOBILE_APP_INSTALL;
            }
            if (Intrinsics.m17075f(rawValue, "CUSTOM_APP_EVENTS")) {
                return AppEventType.CUSTOM;
            }
            return AppEventType.OTHER;
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AppEventType[] valuesCustom() {
        AppEventType[] valuesCustom = values();
        return (AppEventType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
