package p753k4;

import android.os.Bundle;
import java.util.ArrayList;
import p633d4.C32848d;
import p633d4.EventParameter;
import p649e4.C32925g;

/* renamed from: k4.e */
/* loaded from: classes6.dex */
public class StatsUtils {

    /* renamed from: a */
    private static volatile boolean f98670a;

    /* renamed from: a */
    private static void m18212a(String str, Bundle bundle) {
        EventParameter eventParameter = new EventParameter();
        eventParameter.m25748f(str);
        eventParameter.m25749e(bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.add("learnings");
        eventParameter.m25747g(arrayList);
        C32848d.m25756j(eventParameter);
    }

    /* renamed from: b */
    public static void m18211b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("error_code", str);
        bundle.putString("error_msg", str2);
        m18212a("uac_config_get_error", bundle);
    }

    /* renamed from: c */
    public static void m18210c() {
        if (f98670a) {
            return;
        }
        f98670a = true;
        Bundle bundle = new Bundle();
        bundle.putString("config_version", C32925g.m25520f().m25516j());
        m18212a("uac_config_get_warn", bundle);
    }
}
