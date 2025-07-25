package com.facebook.appevents.cloudbridge;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@Metadata
/* loaded from: classes2.dex */
public enum CustomEventField {
    EVENT_TIME(Constants.LOG_TIME_APP_EVENT_KEY),
    EVENT_NAME(Constants.EVENT_NAME_EVENT_KEY),
    VALUE_TO_SUM(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM),
    CONTENT_IDS(AppEventsConstants.EVENT_PARAM_CONTENT_ID),
    CONTENTS(AppEventsConstants.EVENT_PARAM_CONTENT),
    CONTENT_TYPE(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE),
    DESCRIPTION(AppEventsConstants.EVENT_PARAM_DESCRIPTION),
    LEVEL(AppEventsConstants.EVENT_PARAM_LEVEL),
    MAX_RATING_VALUE(AppEventsConstants.EVENT_PARAM_MAX_RATING_VALUE),
    NUM_ITEMS(AppEventsConstants.EVENT_PARAM_NUM_ITEMS),
    PAYMENT_INFO_AVAILABLE(AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE),
    REGISTRATION_METHOD(AppEventsConstants.EVENT_PARAM_REGISTRATION_METHOD),
    SEARCH_STRING(AppEventsConstants.EVENT_PARAM_SEARCH_STRING),
    SUCCESS(AppEventsConstants.EVENT_PARAM_SUCCESS),
    ORDER_ID(AppEventsConstants.EVENT_PARAM_ORDER_ID),
    AD_TYPE("ad_type"),
    CURRENCY(AppEventsConstants.EVENT_PARAM_CURRENCY);
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String rawValue;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CustomEventField invoke(@NotNull String rawValue) {
            CustomEventField[] valuesCustom;
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (CustomEventField customEventField : CustomEventField.valuesCustom()) {
                if (Intrinsics.m17075f(customEventField.getRawValue(), rawValue)) {
                    return customEventField;
                }
            }
            return null;
        }
    }

    CustomEventField(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CustomEventField[] valuesCustom() {
        CustomEventField[] valuesCustom = values();
        return (CustomEventField[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
