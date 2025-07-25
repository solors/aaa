package com.bytedance.sdk.openadsdk.rri.p354bg;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8965rri;
import com.bytedance.sdk.openadsdk.utils.ayS;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.rri.bg.zx */
/* loaded from: classes3.dex */
public class C9370zx {

    /* renamed from: bg */
    private static final Map<Integer, AbstractC9361IL> f20898bg = new ConcurrentHashMap();

    /* renamed from: com.bytedance.sdk.openadsdk.rri.bg.zx$bg */
    /* loaded from: classes3.dex */
    public static class C9371bg {

        /* renamed from: IL */
        public int f20899IL = -1;

        /* renamed from: bg */
        public int f20900bg;

        public C9371bg(int i) {
            this.f20900bg = i;
        }
    }

    /* renamed from: IL */
    public static void m82922IL(Integer num) {
        f20898bg.remove(num);
    }

    /* renamed from: bX */
    private static boolean m82921bX(AbstractC8967tuV abstractC8967tuV) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (abstractC8967tuV == null) {
            return false;
        }
        String m82462bg = ayS.m82462bg(abstractC8967tuV);
        if (!"open_ad".equals(m82462bg) && !"fullscreen_interstitial_ad".equals(m82462bg) && !"rewarded_video".equals(m82462bg)) {
            z = false;
        } else {
            z = true;
        }
        if (z && !C8965rri.m84166IL(abstractC8967tuV)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && abstractC8967tuV.mo83989vb() != 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && abstractC8967tuV.mo83989vb() != 33) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || !AbstractC8967tuV.m83978zx(abstractC8967tuV) || abstractC8967tuV.Dxa() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: bg */
    public static void m82920bg(View view, AbstractC8967tuV abstractC8967tuV, C9371bg c9371bg) {
        if (view == null || abstractC8967tuV == null || abstractC8967tuV.JxS()) {
            return;
        }
        boolean m82921bX = m82921bX(abstractC8967tuV);
        if (C8965rri.m84166IL(abstractC8967tuV) && c9371bg != null) {
            c9371bg.f20900bg = -1;
        }
        m82916bg(m82919bg(view, abstractC8967tuV, m82921bX, c9371bg));
    }

    /* renamed from: IL */
    public static Integer m82923IL(AbstractC8967tuV abstractC8967tuV) {
        return Integer.valueOf((abstractC8967tuV.waE() + abstractC8967tuV.mo84069Ys()).hashCode());
    }

    /* renamed from: bg */
    private static AbstractC9361IL m82919bg(View view, AbstractC8967tuV abstractC8967tuV, boolean z, C9371bg c9371bg) {
        if (view == null || abstractC8967tuV == null || abstractC8967tuV.mo84069Ys() == null) {
            return null;
        }
        Integer m82923IL = m82923IL(abstractC8967tuV);
        Map<Integer, AbstractC9361IL> map = f20898bg;
        if (map.containsKey(m82923IL)) {
            AbstractC9361IL abstractC9361IL = map.get(m82923IL);
            if (abstractC9361IL != null) {
                abstractC9361IL.m82942bg(view);
            }
            return abstractC9361IL;
        }
        AbstractC9361IL m82941bg = AbstractC9361IL.m82941bg(z, m82923IL, view, abstractC8967tuV, c9371bg);
        map.put(m82923IL, m82941bg);
        return m82941bg;
    }

    /* renamed from: bg */
    private static void m82916bg(AbstractC9361IL abstractC9361IL) {
        if (abstractC9361IL == null) {
            return;
        }
        abstractC9361IL.mo82936bg();
    }

    /* renamed from: bg */
    public static void m82917bg(AbstractC8967tuV abstractC8967tuV, int i) {
        if (abstractC8967tuV == null || abstractC8967tuV.mo84069Ys() == null) {
            return;
        }
        m82915bg(f20898bg.get(m82923IL(abstractC8967tuV)), i);
    }

    /* renamed from: bg */
    public static void m82915bg(AbstractC9361IL abstractC9361IL, int i) {
        if (abstractC9361IL == null) {
            return;
        }
        abstractC9361IL.m82943bg(i);
    }

    /* renamed from: bg */
    public static void m82918bg(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null || abstractC8967tuV.mo84069Ys() == null) {
            return;
        }
        Integer m82923IL = m82923IL(abstractC8967tuV);
        Map<Integer, AbstractC9361IL> map = f20898bg;
        AbstractC9361IL abstractC9361IL = map.get(m82923IL);
        if (abstractC9361IL != null) {
            abstractC9361IL.m82940eo();
        }
        m82922IL(m82923IL);
        if (map.size() <= 0) {
            C9367iR.m82928bg();
        }
    }

    /* renamed from: bg */
    public static AbstractC9361IL m82914bg(Integer num) {
        return f20898bg.get(num);
    }
}
