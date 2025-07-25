package com.mbridge.msdk.video.dynview.p516b;

import android.view.View;
import com.mbridge.msdk.video.dynview.ViewOption;
import com.mbridge.msdk.video.dynview.p528j.UIEnergizeWrapper;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b.b */
/* loaded from: classes6.dex */
public class UIEnergize {

    /* renamed from: a */
    private static volatile UIEnergize f60219a;

    private UIEnergize() {
    }

    /* renamed from: a */
    public static UIEnergize m49034a() {
        UIEnergize uIEnergize;
        if (f60219a == null) {
            synchronized (UIEnergize.class) {
                if (f60219a == null) {
                    f60219a = new UIEnergize();
                }
                uIEnergize = f60219a;
            }
            return uIEnergize;
        }
        return f60219a;
    }

    /* renamed from: a */
    public final void m49033a(View view, ViewOption viewOption, Map<String, Object> map) {
        if (viewOption == null) {
            return;
        }
        int m49025h = viewOption.m49025h();
        if (m49025h == 1) {
            new UIEnergizeWrapper().m48889a(view, map);
        } else if (m49025h == 2) {
            new UIEnergizeWrapper().m48890a(view, viewOption, map);
        } else if (m49025h == 3) {
            new UIEnergizeWrapper().m48891a(view, viewOption);
        } else if (m49025h == 4) {
            new UIEnergizeWrapper().m48887b(view, viewOption, map);
        } else if (m49025h != 5) {
        } else {
            new UIEnergizeWrapper();
        }
    }
}
