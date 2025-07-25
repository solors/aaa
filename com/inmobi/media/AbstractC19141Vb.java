package com.inmobi.media;

import android.util.Log;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.Vb */
/* loaded from: classes6.dex */
public abstract class AbstractC19141Vb {

    /* renamed from: a */
    public static final ScheduledExecutorService f47871a = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public static final String m60625a(Thread thread, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put("message", error.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(error));
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (JSONException e) {
            e.toString();
            return "";
        }
    }

    /* renamed from: b */
    public static final boolean m60623b(StackTraceElement[] stackTraceElementArr) {
        boolean m16592R;
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        Regex regex = new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)");
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (m60626a(stackTraceElement, InMobiInterstitial.C18830a.class.getSuperclass()) || m60626a(stackTraceElement, InMobiInterstitial.C18830a.class) || m60626a(stackTraceElement, InMobiNative.NativeCallbacks.class) || m60626a(stackTraceElement, InMobiBanner.C18829a.class) || m60626a(stackTraceElement, InMobiBanner.C18829a.class.getSuperclass()) || (Intrinsics.m17075f(stackTraceElement.getClassName(), InMobiSdk.class.getName()) && Intrinsics.m17075f(stackTraceElement.getMethodName(), InMobiSdk.class.getDeclaredMethod("a", SdkInitializationListener.class, String.class).getName()))) {
                break;
            }
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String name = C18946H2.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            m16592R = C37690r.m16592R(className, name, false, 2, null);
            if (m16592R) {
                break;
            }
            String className2 = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (regex.m16770a(className2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final String m60624a(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(stackTraceElement.toString());
            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: a */
    public static final boolean m60627a(C19082R4 c19082r4) {
        Intrinsics.checkNotNullParameter(c19082r4, "<this>");
        if (c19082r4 instanceof C18960I2) {
            StackTraceElement[] stackTraceElementArr = ((C18960I2) c19082r4).f47337g;
            if (stackTraceElementArr == null) {
                Intrinsics.m17056y("stackTrace");
                stackTraceElementArr = null;
            }
            return m60623b(stackTraceElementArr);
        }
        if (c19082r4 instanceof C18944H0) {
            C18944H0 c18944h0 = (C18944H0) c19082r4;
            if (c18944h0.f47302g == 6) {
                return new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)").m16770a(c18944h0.f47303h);
            }
        } else if (c19082r4 instanceof C19529xc) {
            return m60623b(((C19529xc) c19082r4).f48908g);
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m60626a(StackTraceElement stackTraceElement, Class cls) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        if (cls != null && Intrinsics.m17075f(stackTraceElement.getClassName(), cls.getName())) {
            Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.m17075f(stackTraceElement.getMethodName(), method.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
