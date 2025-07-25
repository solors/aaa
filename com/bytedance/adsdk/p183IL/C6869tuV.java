package com.bytedance.adsdk.p183IL;

import android.util.Pair;
import com.bytedance.adsdk.p183IL.ldr.C6862eqN;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.adsdk.IL.tuV */
/* loaded from: classes3.dex */
public class C6869tuV {

    /* renamed from: bg */
    private boolean f14762bg = false;

    /* renamed from: IL */
    private final Set<Object> f14760IL = new C6770bg();

    /* renamed from: bX */
    private final Map<String, C6862eqN> f14761bX = new HashMap();
    private final Comparator<Pair<String, Float>> eqN = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.IL.tuV.1
        @Override // java.util.Comparator
        /* renamed from: bg */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m90593bg(boolean z) {
        this.f14762bg = z;
    }

    /* renamed from: bg */
    public void m90594bg(String str, float f) {
        if (this.f14762bg) {
            C6862eqN c6862eqN = this.f14761bX.get(str);
            if (c6862eqN == null) {
                c6862eqN = new C6862eqN();
                this.f14761bX.put(str, c6862eqN);
            }
            c6862eqN.m90623bg(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.f14760IL.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
