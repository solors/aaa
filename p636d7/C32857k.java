package p636d7;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;

/* compiled from: ResourceUtil.java */
/* renamed from: d7.k */
/* loaded from: classes5.dex */
public class C32857k {
    /* renamed from: a */
    public static String m25682a(Context context, int i) {
        try {
            return context.getResources().getResourceName(i);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static int m25681b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            String[] split = str.split(":", 2);
            String[] split2 = split[1].split(RemoteSettings.FORWARD_SLASH_STRING, 2);
            String str2 = split[0];
            String str3 = split2[0];
            return context.getResources().getIdentifier(split2[1], str3, str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
