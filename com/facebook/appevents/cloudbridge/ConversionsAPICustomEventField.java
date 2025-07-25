package com.facebook.appevents.cloudbridge;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p552ot.pubsub.p559g.C26542f;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@Metadata
/* loaded from: classes2.dex */
public enum ConversionsAPICustomEventField {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME(C26542f.C26543a.f69514l),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE(FirebaseAnalytics.Param.CONTENT_TYPE),
    DESCRIPTION("description"),
    LEVEL("level"),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS("success"),
    ORDER_ID("order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("currency");
    
    @NotNull
    private final String rawValue;

    ConversionsAPICustomEventField(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ConversionsAPICustomEventField[] valuesCustom() {
        ConversionsAPICustomEventField[] valuesCustom = values();
        return (ConversionsAPICustomEventField[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
