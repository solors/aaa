package com.bytedance.sdk.openadsdk.eqN;

import com.bytedance.sdk.openadsdk.eqN.p343bX.C9222bg;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.IL */
/* loaded from: classes3.dex */
public class C9114IL {

    /* renamed from: bg */
    public static final String f20338bg = C9222bg.InterfaceC9223bg.f20597bg;

    /* renamed from: IL */
    public static final String f20336IL = C9222bg.InterfaceC9223bg.f20595IL;

    /* renamed from: bX */
    public static final String f20337bX = C9222bg.InterfaceC9223bg.f20596bX;
    public static final String eqN = C9222bg.InterfaceC9223bg.eqN;

    /* renamed from: zx */
    public static final String f20340zx = C9222bg.InterfaceC9223bg.f20598zx;
    public static final String ldr = C9222bg.InterfaceC9223bg.ldr;

    /* renamed from: iR */
    public static final Set<String> f20339iR = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* renamed from: com.bytedance.sdk.openadsdk.eqN.IL$IL */
    /* loaded from: classes3.dex */
    public static class C9115IL {

        /* renamed from: IL */
        public static int f20341IL = 2;

        /* renamed from: bX */
        public static int f20342bX = 100;

        /* renamed from: bg */
        public static int f20343bg = 1;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.eqN.IL$bg */
    /* loaded from: classes3.dex */
    public static class C9116bg {

        /* renamed from: IL */
        public static String f20344IL = "openAdLandPageLinks";

        /* renamed from: bX */
        public static String f20345bX = "direct";

        /* renamed from: bg */
        public static String f20346bg = "openDetailPage";
        public static String eqN = "saLandingPageLinks";
    }

    /* renamed from: bg */
    public static boolean m83523bg(String str) {
        if (!"embeded_ad".equals(str) && !"banner_ad".equals(str) && !"interaction".equals(str) && !"slide_banner_ad".equals(str)) {
            return false;
        }
        return true;
    }
}
