package com.zeus.gmc.sdk.mobileads.columbus.internal.ccoio;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccoio.coi222o222 */
/* loaded from: classes8.dex */
public class C32561coi222o222 {
    private static final String c2oc2i = "ResourceDownloadTracker";
    private boolean coi222o222;
    private String coo2iico;

    public C32561coi222o222(Context context, String str, long j, String str2) {
        this.coo2iico = str;
    }

    public void coi222o222() {
        MLog.m25892d(c2oc2i, "endSession");
        if (TextUtils.isEmpty(this.coo2iico)) {
            MLog.m25883w(c2oc2i, "url is empty! do not track!");
        } else if (!this.coi222o222) {
            MLog.m25883w(c2oc2i, "not finished! do not track!");
        }
    }

    public void coo2iico() {
        this.coi222o222 = true;
    }

    public void coo2iico(String str) {
        this.coi222o222 = true;
    }

    public void c2oc2i() {
    }
}
