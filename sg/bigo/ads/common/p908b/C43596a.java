package sg.bigo.ads.common.p908b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerLib;

/* renamed from: sg.bigo.ads.common.b.a */
/* loaded from: classes10.dex */
public final class C43596a {

    /* renamed from: a */
    private static String f114166a = "";

    /* renamed from: b */
    private static boolean f114167b = true;

    @NonNull
    /* renamed from: a */
    public static String m5329a(@NonNull Context context) {
        if (TextUtils.isEmpty(f114166a) && f114167b) {
            try {
                Object invoke = AppsFlyerLib.class.getMethod("getAppsFlyerUID", Context.class).invoke(AppsFlyerLib.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), context);
                if (invoke instanceof String) {
                    f114166a = (String) invoke;
                }
            } catch (Exception unused) {
                f114167b = false;
            }
            return f114166a;
        }
        return f114166a;
    }
}
