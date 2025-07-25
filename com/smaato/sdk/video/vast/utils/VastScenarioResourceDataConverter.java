package com.smaato.sdk.video.vast.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;

/* loaded from: classes7.dex */
public class VastScenarioResourceDataConverter {
    @Nullable
    public String getUriFromResources(@NonNull VastScenarioResourceData vastScenarioResourceData, int i, int i2) {
        String str;
        String str2 = "100%";
        if (i == 0) {
            str = "100%";
        } else {
            str = i + "px";
        }
        if (i2 != 0) {
            str2 = i2 + "px";
        }
        StaticResource staticResource = vastScenarioResourceData.staticResources;
        if (staticResource != null) {
            return VastScenarioResourceHtmlHelper.m38702c(staticResource, str, str2);
        }
        String str3 = "";
        if (!TextUtils.isEmpty(vastScenarioResourceData.htmlResources)) {
            String str4 = vastScenarioResourceData.htmlResources;
            if (str4 != null) {
                str3 = str4;
            }
            return VastScenarioResourceHtmlHelper.m38704a(str3, str, str2);
        } else if (!TextUtils.isEmpty(vastScenarioResourceData.iFrameResources)) {
            String str5 = vastScenarioResourceData.iFrameResources;
            if (str5 != null) {
                str3 = str5;
            }
            return VastScenarioResourceHtmlHelper.m38703b(str3, str, str2);
        } else {
            return null;
        }
    }
}
