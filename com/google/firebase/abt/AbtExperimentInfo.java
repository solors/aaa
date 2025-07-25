package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class AbtExperimentInfo {

    /* renamed from: g */
    private static final String[] f42028g = {RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    @VisibleForTesting

    /* renamed from: h */
    static final DateFormat f42029h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    private final String f42030a;

    /* renamed from: b */
    private final String f42031b;

    /* renamed from: c */
    private final String f42032c;

    /* renamed from: d */
    private final Date f42033d;

    /* renamed from: e */
    private final long f42034e;

    /* renamed from: f */
    private final long f42035f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j, long j2) {
        this.f42030a = str;
        this.f42031b = str2;
        this.f42032c = str3;
        this.f42033d = date;
        this.f42034e = j;
        this.f42035f = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbtExperimentInfo m67407a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str = conditionalUserProperty.triggerEventName;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(conditionalUserProperty.name, String.valueOf(conditionalUserProperty.value), str, new Date(conditionalUserProperty.creationTimestamp), conditionalUserProperty.triggerTimeout, conditionalUserProperty.timeToLive);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbtExperimentInfo m67406b(Map<String, String> map) throws AbtException {
        String str;
        m67399i(map);
        try {
            Date parse = f42029h.parse(map.get("experimentStartTime"));
            long parseLong = Long.parseLong(map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong(map.get("timeToLiveMillis"));
            String str2 = map.get(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID);
            String str3 = map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = map.get("triggerEvent");
            } else {
                str = "";
            }
            return new AbtExperimentInfo(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m67400h(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        m67399i(abtExperimentInfo.m67401g());
    }

    /* renamed from: i */
    private static void m67399i(Map<String, String> map) throws AbtException {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f42028g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m67405c() {
        return this.f42030a;
    }

    /* renamed from: d */
    long m67404d() {
        return this.f42033d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m67403e() {
        return this.f42031b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AnalyticsConnector.ConditionalUserProperty m67402f(String str) {
        String str2;
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = str;
        conditionalUserProperty.creationTimestamp = m67404d();
        conditionalUserProperty.name = this.f42030a;
        conditionalUserProperty.value = this.f42031b;
        if (TextUtils.isEmpty(this.f42032c)) {
            str2 = null;
        } else {
            str2 = this.f42032c;
        }
        conditionalUserProperty.triggerEventName = str2;
        conditionalUserProperty.triggerTimeout = this.f42034e;
        conditionalUserProperty.timeToLive = this.f42035f;
        return conditionalUserProperty;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: g */
    public Map<String, String> m67401g() {
        HashMap hashMap = new HashMap();
        hashMap.put(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, this.f42030a);
        hashMap.put("variantId", this.f42031b);
        hashMap.put("triggerEvent", this.f42032c);
        hashMap.put("experimentStartTime", f42029h.format(this.f42033d));
        hashMap.put("triggerTimeoutMillis", Long.toString(this.f42034e));
        hashMap.put("timeToLiveMillis", Long.toString(this.f42035f));
        return hashMap;
    }
}
