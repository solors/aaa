package net.pubnative.lite.sdk.browser;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class BrowserManager {
    private static final String TAG = "BrowserManager";
    private final List<String> mPriorityList = new ArrayList();

    public void addBrowser(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mPriorityList.add(str);
        }
    }

    public void cleanPriorities() {
        this.mPriorityList.clear();
    }

    public boolean containsPriorities() {
        return !this.mPriorityList.isEmpty();
    }

    public List<String> getPackagePriorities() {
        return this.mPriorityList;
    }
}
