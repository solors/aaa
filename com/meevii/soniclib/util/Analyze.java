package com.meevii.soniclib.util;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class Analyze {
    public static void sendEvent(Context context, String str, Map<String, String> map) {
        try {
            Object invoke = FirebaseAnalytics.class.getMethod("getInstance", Context.class).invoke(null, context);
            Method method = FirebaseAnalytics.class.getMethod("logEvent", String.class, Bundle.class);
            Bundle bundle = new Bundle();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
            method.invoke(invoke, str, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
