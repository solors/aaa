package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;

/* loaded from: classes7.dex */
public class SdkConfigHintBuilder {

    /* renamed from: com.smaato.sdk.core.util.SdkConfigHintBuilder$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27298a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71933a;

        static {
            int[] iArr = new int[AdFormat.values().length];
            f71933a = iArr;
            try {
                iArr[AdFormat.RICH_MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71933a[AdFormat.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @NonNull
    public String buildSdkModuleMissedHintForAdFormat(@NonNull AdFormat adFormat) {
        String str;
        String str2;
        int i = C27298a.f71933a[adFormat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            str = Constants.VIDEO;
            str2 = "com.smaato.sdk.vast:module-video";
        } else {
            str = "Rich Media";
            str2 = "com.smaato.sdk.richmedia:module-richmedia";
        }
        return String.format("In order to show %s ads, add %s SOMA SDK module to your app build configuration", str, str2);
    }
}
