package p752k3;

import com.amazon.device.ads.DtbConstants;

/* renamed from: k3.l */
/* loaded from: classes5.dex */
public class SdkURLs {

    /* renamed from: a */
    public static String f98663a = "https://webchat.helpshift.com/latest/android/webChat.js";

    /* renamed from: b */
    public static String f98664b = "https://webchat.helpshift.com/latest/android/android-mapping.json";

    /* renamed from: c */
    public static String f98665c = "https://d2duuy9yo5pldo.cloudfront.net/hc-android-mapping.json";

    /* renamed from: d */
    public static String f98666d = "https://d2duuy9yo5pldo.cloudfront.net/android/helpcenter.js";

    /* renamed from: a */
    public static void m18240a(String str, String str2) {
        if (!C37383m.m18236d(str)) {
            f98663a = DtbConstants.HTTPS + str + "/latest/android/webChat.js";
            f98664b = DtbConstants.HTTPS + str + "/latest/android/android-mapping.json";
        }
        if (!C37383m.m18236d(str2)) {
            f98666d = DtbConstants.HTTPS + str2 + "/android/helpcenter.js";
            f98665c = DtbConstants.HTTPS + str2 + "/hc-android-mapping.json";
        }
    }
}
