package p636d7;

import androidx.browser.customtabs.CustomTabsCallback;
import p772l6.PushEvent;

/* renamed from: d7.h */
/* loaded from: classes5.dex */
public class PushShowFailUtil {
    /* renamed from: a */
    public static void m25693a(String str, int i) {
        PushEvent.m15656r(str, i, "local");
    }

    /* renamed from: b */
    public static void m25692b(String str, int i) {
        PushEvent.m15656r(str, i, CustomTabsCallback.ONLINE_EXTRAS_KEY);
    }
}
