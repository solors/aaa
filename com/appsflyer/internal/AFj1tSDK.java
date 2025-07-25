package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes2.dex */
public final class AFj1tSDK implements AFj1ySDK {
    @Override // com.appsflyer.internal.AFj1ySDK
    @NotNull
    public final String AFInAppEventType() {
        Object m14549b;
        Object obj;
        try {
            Result.C38506a c38506a = Result.f101870c;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (obj != null) {
            m14549b = Result.m14549b((String) obj);
            if (Result.m14544g(m14549b)) {
                m14549b = "";
            }
            return (String) m14549b;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
