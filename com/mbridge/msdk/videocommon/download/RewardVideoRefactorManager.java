package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.mbridge.msdk.videocommon.download.h */
/* loaded from: classes6.dex */
public final class RewardVideoRefactorManager {

    /* renamed from: a */
    private AtomicBoolean f61391a;

    /* renamed from: b */
    private AtomicBoolean f61392b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RewardVideoRefactorManager.java */
    /* renamed from: com.mbridge.msdk.videocommon.download.h$a */
    /* loaded from: classes6.dex */
    public static final class C23251a {

        /* renamed from: a */
        private static final RewardVideoRefactorManager f61393a = new RewardVideoRefactorManager();
    }

    /* renamed from: a */
    public static RewardVideoRefactorManager m48154a() {
        return C23251a.f61393a;
    }

    /* renamed from: b */
    public final boolean m48151b(int i) {
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51822c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f61392b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f61392b = new AtomicBoolean(SameOptimizedController.m51814a().m51810a("r_v_r_f_c_r", false));
        } catch (Exception e) {
            this.f61392b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.f61392b.get();
    }

    private RewardVideoRefactorManager() {
    }

    /* renamed from: a */
    public final boolean m48153a(int i) {
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51822c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i == 94 || i == 287) {
            AtomicBoolean atomicBoolean = this.f61391a;
            if (atomicBoolean != null) {
                return atomicBoolean.get();
            }
            try {
                this.f61391a = new AtomicBoolean(SameOptimizedController.m51814a().m51810a("r_v_r_f_l", false));
            } catch (Exception e) {
                this.f61391a = new AtomicBoolean(false);
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
                }
            }
            return this.f61391a.get();
        }
        return false;
    }

    /* renamed from: a */
    public final int m48152a(String str, int i) {
        try {
            return SameOptimizedController.m51814a().m51813a(str, i);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("RewardVideoRefactorManager", "getRewardVideoCampaignRequestTimeout error: " + e.getMessage());
            }
            return i;
        }
    }
}
