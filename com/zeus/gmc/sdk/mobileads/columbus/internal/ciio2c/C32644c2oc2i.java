package com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c;

import android.text.TextUtils;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.c2oc2i */
/* loaded from: classes8.dex */
public class C32644c2oc2i {
    private final String coi222o222;
    private final int coo2iico;
    public static final C32644c2oc2i c2oc2i = new C32644c2oc2i(0, "Fill OK");
    public static final C32644c2oc2i cioccoiococ = new C32644c2oc2i(1, "No Fill");
    public static final C32644c2oc2i c2oc2o = new C32644c2oc2i(2, "No Response");
    public static final C32644c2oc2i cco22 = new C32644c2oc2i(101, "native lack material");
    public static final C32644c2oc2i cii2c2 = new C32644c2oc2i(102, "video download fail");
    public static final C32644c2oc2i ciii2coi2 = new C32644c2oc2i(103, "video lack material");
    public static final C32644c2oc2i coiic = new C32644c2oc2i(104, "banner templateId or landingPageUrl is null");
    public static final C32644c2oc2i cicic = new C32644c2oc2i(105, "banner templateId is not banner ");
    public static final C32644c2oc2i cicc2iiccc = new C32644c2oc2i(106, "banner adinfo is null");
    public static final C32644c2oc2i ccoc2oic = new C32644c2oc2i(107, "banner width is <= 0");
    public static final C32644c2oc2i coiio2 = new C32644c2oc2i(108, "banner height is <= 0");
    public static final C32644c2oc2i c2oicci2 = new C32644c2oc2i(109, "banner ad sizes not matched");
    public static final C32644c2oc2i c22o22co22i = new C32644c2oc2i(110, "banner mAdSize is null");
    public static final C32644c2oc2i c222o2o2c2o = new C32644c2oc2i(111, "landingPage is null");
    public static final C32644c2oc2i cici2o2oo = new C32644c2oc2i(112, "banner ad type not match");

    public C32644c2oc2i(int i, String str) {
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
