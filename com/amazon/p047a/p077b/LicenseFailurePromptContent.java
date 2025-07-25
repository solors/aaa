package com.amazon.p047a.p077b;

import com.amazon.p047a.p048a.p061i.PromptContent;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.amazon.a.b.e */
/* loaded from: classes2.dex */
public class LicenseFailurePromptContent {

    /* renamed from: a */
    public static final PromptContent f2809a;

    /* renamed from: b */
    public static final PromptContent f2810b;

    /* renamed from: c */
    public static final PromptContent f2811c;

    /* renamed from: d */
    public static final PromptContent f2812d;

    /* renamed from: e */
    public static final PromptContent f2813e;

    /* renamed from: f */
    public static final PromptContent f2814f;

    /* renamed from: g */
    public static final PromptContent f2815g;

    /* renamed from: h */
    private static final String f2816h = "Quit";

    /* renamed from: i */
    private static final String f2817i = "Help";

    /* renamed from: j */
    private static final String f2818j = "Update";

    static {
        String[] strArr = {f2816h, f2817i};
        PromptContent.EnumC3530a enumC3530a = PromptContent.EnumC3530a.DEFAULT;
        PromptContent.EnumC3530a enumC3530a2 = PromptContent.EnumC3530a.HELP;
        f2809a = new PromptContent(new String[]{"Amazon Appstore required"}, "Amazon Appstore is not installed on your device. Please install Amazon Appstore and sign in to Amazon to use this app.", strArr, new PromptContent.EnumC3530a[]{enumC3530a, enumC3530a2}, true, true, 1, 1);
        f2810b = new PromptContent("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", f2816h, true, false);
        f2811c = new PromptContent(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{f2816h, f2817i}, new PromptContent.EnumC3530a[]{enumC3530a, enumC3530a2}, true, true, 1, 2);
        f2812d = new PromptContent("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", f2816h, true, false);
        f2813e = new PromptContent(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{f2816h, f2817i}, new PromptContent.EnumC3530a[]{enumC3530a, enumC3530a2}, true, true, 1, 3);
        f2814f = new PromptContent(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, "An internal error occurred, please try opening this app again", f2816h, true, false);
        f2815g = new PromptContent("App update required", "Please update this app from the Amazon Appstore.", new String[]{f2816h, f2818j}, new PromptContent.EnumC3530a[]{enumC3530a, PromptContent.EnumC3530a.DEEPLINK}, true, false, 0);
    }

    private LicenseFailurePromptContent() {
    }
}
