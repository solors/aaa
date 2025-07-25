package p696h6;

import android.app.Application;
import android.text.TextUtils;
import com.meevii.adsdk.common.SharedProxy;
import java.util.Random;
import p1054y5.AdLifecycleManager;

/* renamed from: h6.h */
/* loaded from: classes6.dex */
public class SampleUtils {

    /* renamed from: a */
    private static Integer f91353a;

    /* renamed from: a */
    public static int m23665a() {
        Integer num = f91353a;
        if (num != null) {
            return num.intValue();
        }
        Application m1066f = AdLifecycleManager.m1067e().m1066f();
        String string = SharedProxy.getAdSdkSharedProxy(m1066f).getString("adsdk_sample_random_number", "");
        int nextInt = new Random().nextInt(10000);
        String m23676a = C33480c.m23676a();
        if (TextUtils.isEmpty(string)) {
            f91353a = Integer.valueOf(nextInt);
            SharedProxy adSdkSharedProxy = SharedProxy.getAdSdkSharedProxy(m1066f);
            adSdkSharedProxy.setString("adsdk_sample_random_number", m23676a + "_" + nextInt);
            return f91353a.intValue();
        }
        String[] split = string.split("_");
        String str = split[0];
        int parseInt = Integer.parseInt(split[1]);
        if (TextUtils.equals(str, m23676a)) {
            Integer valueOf = Integer.valueOf(parseInt);
            f91353a = valueOf;
            return valueOf.intValue();
        }
        f91353a = Integer.valueOf(nextInt);
        SharedProxy adSdkSharedProxy2 = SharedProxy.getAdSdkSharedProxy(m1066f);
        adSdkSharedProxy2.setString("adsdk_sample_random_number", m23676a + "_" + nextInt);
        return f91353a.intValue();
    }
}
