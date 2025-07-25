package io.appmetrica.analytics.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.B5 */
/* loaded from: classes9.dex */
public abstract class AbstractC33786B5 {

    /* renamed from: a */
    public static final List f92607a = CollectionUtils.createSortedListWithoutRepetitions("id", "type", "report_request_parameters", "session_description");

    /* renamed from: b */
    public static final String f92608b;

    /* renamed from: c */
    public static final String f92609c;

    static {
        Locale locale = Locale.US;
        f92608b = String.format(locale, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", "id", "type", "events", SDKAnalyticsEvents.PARAMETER_SESSION_ID, "session_type");
        f92609c = String.format(locale, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", "events", "id", "events", "events", SDKAnalyticsEvents.PARAMETER_SESSION_ID, "sessions", "id", "id");
    }
}
