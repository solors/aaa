package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;

/* renamed from: com.mbridge.msdk.foundation.same.b */
/* loaded from: classes6.dex */
public class MBridgeRefactor {

    /* renamed from: a */
    private static volatile MBridgeRefactor f56499a;

    /* renamed from: b */
    private Boolean f56500b = null;

    private MBridgeRefactor() {
    }

    /* renamed from: a */
    public static MBridgeRefactor m52291a() {
        if (f56499a == null) {
            synchronized (MBridgeRefactor.class) {
                if (f56499a == null) {
                    f56499a = new MBridgeRefactor();
                }
            }
        }
        return f56499a;
    }

    /* renamed from: b */
    public final Boolean m52289b() {
        return this.f56500b;
    }

    /* renamed from: a */
    public final boolean m52290a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("new_bridge_reward_video")) {
            Boolean valueOf = Boolean.valueOf(SameOptimizedController.m51814a().m51809a("new_bridge_reward_video", false, false));
            this.f56500b = valueOf;
            return valueOf.booleanValue();
        } else if (str.equals("new_bridge_reward_show")) {
            return SameOptimizedController.m51814a().m51809a("new_bridge_reward_show", false, false);
        } else {
            return false;
        }
    }
}
