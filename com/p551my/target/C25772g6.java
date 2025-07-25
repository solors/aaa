package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.common.MyTargetConfig;
import com.p551my.tracker.MyTracker;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.g6 */
/* loaded from: classes7.dex */
public final class C25772g6 extends AbstractC26021q1 {

    /* renamed from: com.my.target.g6$a */
    /* loaded from: classes7.dex */
    public static final class C25773a {

        /* renamed from: a */
        public static final String f66878a;

        static {
            String str;
            try {
                str = MyTracker.getTrackerConfig().getId();
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("MyTrackerHelper: Error occurred while working with myTracker, " + th.getMessage());
            }
            if (TextUtils.isEmpty(str)) {
                AbstractC25846ja.m43680a("MyTrackerHelper: myTracker id is empty");
                str = null;
            }
            f66878a = str;
        }
    }

    /* renamed from: a */
    public Map m43860a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        String str = C25773a.f66878a;
        if (str != null) {
            hashMap.put("mtr_id", str);
        }
        return hashMap;
    }
}
