package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class FirebaseABTesting {

    /* renamed from: a */
    private final Provider<AnalyticsConnector> f42036a;

    /* renamed from: b */
    private final String f42037b;
    @Nullable

    /* renamed from: c */
    private Integer f42038c = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.f42036a = provider;
        this.f42037b = str;
    }

    /* renamed from: a */
    private void m67398a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        this.f42036a.get().setConditionalUserProperty(conditionalUserProperty);
    }

    /* renamed from: b */
    private void m67397b(List<AbtExperimentInfo> list) {
        ArrayDeque arrayDeque = new ArrayDeque(m67394e());
        int m67391h = m67391h();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            while (arrayDeque.size() >= m67391h) {
                m67390i(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty m67402f = abtExperimentInfo.m67402f(this.f42037b);
            m67398a(m67402f);
            arrayDeque.offer(m67402f);
        }
    }

    /* renamed from: c */
    private static List<AbtExperimentInfo> m67396c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(AbtExperimentInfo.m67406b(map));
        }
        return arrayList;
    }

    /* renamed from: d */
    private boolean m67395d(List<AbtExperimentInfo> list, AbtExperimentInfo abtExperimentInfo) {
        String m67405c = abtExperimentInfo.m67405c();
        String m67403e = abtExperimentInfo.m67403e();
        for (AbtExperimentInfo abtExperimentInfo2 : list) {
            if (abtExperimentInfo2.m67405c().equals(m67405c) && abtExperimentInfo2.m67403e().equals(m67403e)) {
                return true;
            }
        }
        return false;
    }

    @WorkerThread
    /* renamed from: e */
    private List<AnalyticsConnector.ConditionalUserProperty> m67394e() {
        return this.f42036a.get().getConditionalUserProperties(this.f42037b, "");
    }

    /* renamed from: f */
    private ArrayList<AbtExperimentInfo> m67393f(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<>();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!m67395d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private ArrayList<AnalyticsConnector.ConditionalUserProperty> m67392g(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        ArrayList<AnalyticsConnector.ConditionalUserProperty> arrayList = new ArrayList<>();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!m67395d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.m67402f(this.f42037b));
            }
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: h */
    private int m67391h() {
        if (this.f42038c == null) {
            this.f42038c = Integer.valueOf(this.f42036a.get().getMaxUserProperties(this.f42037b));
        }
        return this.f42038c.intValue();
    }

    /* renamed from: i */
    private void m67390i(String str) {
        this.f42036a.get().clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: j */
    private void m67389j(Collection<AnalyticsConnector.ConditionalUserProperty> collection) {
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : collection) {
            m67390i(conditionalUserProperty.name);
        }
    }

    /* renamed from: k */
    private void m67388k(List<AbtExperimentInfo> list) throws AbtException {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List<AbtExperimentInfo> allExperiments = getAllExperiments();
        m67389j(m67392g(allExperiments, list));
        m67397b(m67393f(list, allExperiments));
    }

    /* renamed from: l */
    private void m67387l() throws AbtException {
        if (this.f42036a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    @WorkerThread
    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        m67387l();
        List<AnalyticsConnector.ConditionalUserProperty> m67394e = m67394e();
        ArrayList arrayList = new ArrayList();
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : m67394e) {
            arrayList.add(AbtExperimentInfo.m67407a(conditionalUserProperty));
        }
        return arrayList;
    }

    @WorkerThread
    public void removeAllExperiments() throws AbtException {
        m67387l();
        m67389j(m67394e());
    }

    @WorkerThread
    public void replaceAllExperiments(List<Map<String, String>> list) throws AbtException {
        m67387l();
        if (list != null) {
            m67388k(m67396c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    @WorkerThread
    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        m67387l();
        AbtExperimentInfo.m67400h(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map<String, String> m67401g = abtExperimentInfo.m67401g();
        m67401g.remove("triggerEvent");
        arrayList.add(AbtExperimentInfo.m67406b(m67401g));
        m67397b(arrayList);
    }

    @WorkerThread
    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
        m67387l();
        m67389j(m67392g(getAllExperiments(), list));
    }
}
