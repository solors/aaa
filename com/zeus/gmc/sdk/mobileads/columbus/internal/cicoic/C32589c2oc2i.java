package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.c2oc2i */
/* loaded from: classes8.dex */
public class C32589c2oc2i implements Serializable {
    private String c2oc2o;
    private String cco22;
    private String cii2c2;
    private String coo2iico;
    private String coi222o222 = "";
    private String c2oc2i = "";
    private String cioccoiococ = "";
    private long ciii2coi2 = 0;

    public C32589c2oc2i(String str, String str2, String str3) {
        this.coo2iico = str2;
        this.c2oc2o = str;
        this.cii2c2 = str3;
        cco22();
    }

    private void cco22() {
        String coo2iico = C32594cicc2iiccc.coo2iico(this.coo2iico);
        this.coi222o222 = coo2iico + C32594cicc2iiccc.coo2iico(this.coo2iico, this.cii2c2);
        this.cioccoiococ = this.c2oc2o + RemoteSettings.FORWARD_SLASH_STRING + coo2iico + ".tmp";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c2oc2o);
        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb2.append(this.coi222o222);
        this.c2oc2i = sb2.toString();
    }

    public String c2oc2i() {
        return this.cco22;
    }

    public String c2oc2o() {
        return this.cioccoiococ;
    }

    public String cioccoiococ() {
        return this.c2oc2i;
    }

    public String coi222o222() {
        return this.coo2iico;
    }

    public void coo2iico(String str) {
        this.cco22 = str;
    }

    public String toString() {
        return "mDownloadUrl = " + this.cco22 + ",mFileName = " + this.coi222o222 + ",mLocalPath = " + this.c2oc2i + ",mLocalTempPath = " + this.cioccoiococ + ",mRootDir = " + this.c2oc2o + ",mLastDownloadUrl = " + this.cco22 + ",mContentLength = " + this.ciii2coi2;
    }

    public long coo2iico() {
        return this.ciii2coi2;
    }

    public void coo2iico(long j) {
        this.ciii2coi2 = j;
    }
}
