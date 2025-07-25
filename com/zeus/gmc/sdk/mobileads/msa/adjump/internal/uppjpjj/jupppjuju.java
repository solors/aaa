package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj;

import com.amazon.p047a.p048a.p071o.KiwiConstants;

/* loaded from: classes8.dex */
public class jupppjuju {
    public static String jujujpjjp(String str, String str2) {
        try {
            return (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String jujujpjjp(String str) {
        return jujujpjjp(str, "");
    }
}
