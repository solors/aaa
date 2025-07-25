package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class AFd1vSDK {
    public final String[] AFKeystoreWrapper;

    public AFd1vSDK(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            Pattern compile = Pattern.compile("[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null && compile.matcher(str).matches()) {
                    arrayList.add(str.toLowerCase(Locale.getDefault()));
                } else {
                    AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
                }
            }
            if (arrayList.contains("all")) {
                this.AFKeystoreWrapper = new String[]{"all"};
                return;
            } else if (!arrayList.isEmpty()) {
                this.AFKeystoreWrapper = (String[]) arrayList.toArray(new String[0]);
                return;
            } else {
                this.AFKeystoreWrapper = null;
                return;
            }
        }
        this.AFKeystoreWrapper = null;
    }
}
