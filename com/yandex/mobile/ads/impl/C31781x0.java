package com.yandex.mobile.ads.impl;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* renamed from: com.yandex.mobile.ads.impl.x0 */
/* loaded from: classes8.dex */
public final class C31781x0 {
    @NotNull

    /* renamed from: a */
    private static final String f87449a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";
    @NotNull

    /* renamed from: b */
    private static final Map<Integer, String> f87450b;

    static {
        Map<Integer, String> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(16, "ActivityInfo.CONFIG_KEYBOARD"), C38513v.m14532a(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), C38513v.m14532a(128, "ActivityInfo.CONFIG_ORIENTATION"), C38513v.m14532a(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), C38513v.m14532a(512, "ActivityInfo.CONFIG_UI_MODE"), C38513v.m14532a(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), C38513v.m14532a(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));
        f87450b = m17281m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m27716a(@NotNull ActivityInfo adActivity) {
        String str;
        Intrinsics.checkNotNullParameter(adActivity, "adActivity");
        Map<Integer, String> map = f87450b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, String> next = it.next();
            int intValue = next.getKey().intValue();
            String value = next.getValue();
            if ((intValue & adActivity.configChanges) == 0) {
                str = value;
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((String) next2) != null) {
                str = next2;
                break;
            }
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        String m28089a = C31714w0.m28089a(new Object[]{str2}, 1, f87449a, "format(...)");
        throw new em0(m28089a, m28089a);
    }
}
