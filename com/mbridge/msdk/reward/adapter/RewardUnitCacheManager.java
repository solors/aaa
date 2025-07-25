package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, RewardUnitSetting> rewardUnitSettings;

    /* renamed from: com.mbridge.msdk.reward.adapter.RewardUnitCacheManager$a */
    /* loaded from: classes6.dex */
    private static final class C22674a {

        /* renamed from: a */
        private static final RewardUnitCacheManager f58770a = new RewardUnitCacheManager();
    }

    public static RewardUnitCacheManager getInstance() {
        return C22674a.f58770a;
    }

    public final void add(String str, String str2, RewardUnitSetting rewardUnitSetting) {
        try {
            String str3 = str + "_" + str2;
            if (rewardUnitSetting != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, rewardUnitSetting);
        } catch (Exception e) {
            SameLogTool.m51824b(TAG, e.getMessage());
        }
    }

    public final RewardUnitSetting get(String str, String str2) {
        try {
            try {
                return this.rewardUnitSettings.remove(str + "_" + str2);
            } catch (Exception e) {
                SameLogTool.m51824b(TAG, e.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }
}
