package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class AbtComponent {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, FirebaseABTesting> f42039a = new HashMap();

    /* renamed from: b */
    private final Context f42040b;

    /* renamed from: c */
    private final Provider<AnalyticsConnector> f42041c;

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting(otherwise = 3)
    public AbtComponent(Context context, Provider<AnalyticsConnector> provider) {
        this.f42040b = context;
        this.f42041c = provider;
    }

    @VisibleForTesting
    /* renamed from: a */
    protected FirebaseABTesting m67386a(String str) {
        return new FirebaseABTesting(this.f42040b, this.f42041c, str);
    }

    public synchronized FirebaseABTesting get(String str) {
        if (!this.f42039a.containsKey(str)) {
            this.f42039a.put(str, m67386a(str));
        }
        return this.f42039a.get(str);
    }
}
