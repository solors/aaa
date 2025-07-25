package com.zeus.gmc.sdk.mobileads.msa.analytics.experience;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.puujujuupp.C32791uppjpjj;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32818atnaaata;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.experience.atnntnannta */
/* loaded from: classes8.dex */
public class C32809atnntnannta {
    public static final String atnntnannta = "upload_log_pref";

    private C32809atnntnannta() {
    }

    public static boolean atnntnannta(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), atnntnannta, 0) == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return atnntnannta();
        }
    }

    public static boolean atnntnannta() {
        return TextUtils.isEmpty(C32818atnaaata.atnntnannta("ro.miui.ui.version.code", null)) && TextUtils.isEmpty(C32818atnaaata.atnntnannta(C32791uppjpjj.uppjpjj, null));
    }
}
