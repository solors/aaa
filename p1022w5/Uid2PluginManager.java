package p1022w5;

import android.content.Context;
import android.util.Log;
import com.meevii.adsdk.common.util.LogUtil;
import com.meevii.adsdk.uid2plugin.MeeviiAdPlugin;

/* renamed from: w5.a */
/* loaded from: classes6.dex */
public class Uid2PluginManager {
    /* renamed from: a */
    public static void m2356a(Context context) {
        try {
            MeeviiAdPlugin.init(context);
            LogUtil.m48060i("ADSDK_Uid2Manager", "init");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m2355b(Context context, String str) {
        try {
            MeeviiAdPlugin.registerUid2(context, str);
            Log.i("ADSDK_Uid2Manager", "registerUid2: " + str);
        } catch (Throwable unused) {
        }
    }
}
