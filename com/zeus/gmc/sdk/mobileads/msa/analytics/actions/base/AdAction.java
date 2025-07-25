package com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base;

import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.zeus.gmc.sdk.mobileads.msa.analytics.C32805atnntnannta;
import java.util.List;

/* loaded from: classes8.dex */
public class AdAction extends TrackAction {
    protected static final String AD_MONITOR = "_ad_monitor_";

    public AdAction(String str) {
        setCategory("ad");
        setAction(str);
        this.mMap.put(C32805atnntnannta.atntaanaa, str);
    }

    public AdAction addAdMonitor(List<String> list) {
        if (list != null) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    if (sb2.length() > 0) {
                        sb2.append(SignedToken.f2767c);
                    }
                    sb2.append(str);
                }
            }
            if (sb2.length() > 0) {
                addExtra("_ad_monitor_", sb2.toString());
            }
            this.mMap.put("_ad_monitor_", list);
        }
        return this;
    }

    public AdAction(String str, String str2) {
        setCategory(str);
        setAction(str2);
        this.mMap.put(C32805atnntnannta.atnaaata, str);
        this.mMap.put(C32805atnntnannta.atntaanaa, str2);
    }
}
