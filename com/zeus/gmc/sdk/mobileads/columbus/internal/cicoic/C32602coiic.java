package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

import android.text.TextUtils;
import com.ironsource.C21216x8;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.coiic */
/* loaded from: classes8.dex */
public class C32602coiic {
    private final String coi222o222;
    private final int coo2iico;
    public static final C32602coiic c2oc2i = new C32602coiic(1000, "Network Error");
    public static final C32602coiic cioccoiococ = new C32602coiic(2000, "File size < 0");
    public static final C32602coiic c2oc2o = new C32602coiic(3000, "url error");
    public static final C32602coiic cco22 = new C32602coiic(4000, "params error");
    public static final C32602coiic cii2c2 = new C32602coiic(5000, "exception");
    public static final C32602coiic ciii2coi2 = new C32602coiic(5001, C21216x8.f54468v);

    public C32602coiic(int i, String str) {
        str = TextUtils.isEmpty(str) ? "Unknown Error" : str;
        this.coo2iico = i;
        this.coi222o222 = str;
    }

    public String coi222o222() {
        return this.coi222o222;
    }

    public int coo2iico() {
        return this.coo2iico;
    }
}
