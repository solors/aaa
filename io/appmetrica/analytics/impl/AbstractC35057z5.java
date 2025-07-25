package io.appmetrica.analytics.impl;

import com.amazon.p047a.p048a.p059h.Metric;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z5 */
/* loaded from: classes9.dex */
public abstract class AbstractC35057z5 {

    /* renamed from: a */
    public static final List f95685a = CollectionUtils.createSortedListWithoutRepetitions("id", SDKAnalyticsEvents.PARAMETER_SESSION_ID, "session_type", "number_in_session", "type", "global_number", Metric.f2405b, "event_description");
}
