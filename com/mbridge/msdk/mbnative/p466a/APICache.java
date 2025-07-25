package com.mbridge.msdk.mbnative.p466a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p434db.CampaignDao;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.a.a */
/* loaded from: classes6.dex */
public final class APICache extends AbsNativeCache<String, List<Campaign>> {

    /* renamed from: a */
    private CampaignDao f57399a = CampaignDao.m52635a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()));

    /* renamed from: b */
    private int f57400b;

    public APICache(int i) {
        this.f57400b = i;
    }

    @Override // com.mbridge.msdk.mbnative.p466a.AbsNativeCache
    /* renamed from: b */
    public final /* synthetic */ List<Campaign> mo51348b(String str, int i) {
        String str2 = str;
        List<CampaignEx> m52630a = this.f57399a.m52630a(str2, i, 1, this.f57400b);
        if (m52630a == null) {
            return null;
        }
        if (m51353a(m52630a, 1)) {
            for (int i2 = 0; i2 < m52630a.size(); i2++) {
                CampaignEx campaignEx = m52630a.get(i2);
                campaignEx.setCacheLevel(2);
                this.f57399a.m52634a(campaignEx, str2, 1);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m52630a);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.p466a.AbsNativeCache
    /* renamed from: a */
    public final /* synthetic */ List<Campaign> mo51352a(String str, int i) {
        String str2 = str;
        List<CampaignEx> m52630a = this.f57399a.m52630a(str2, i, 2, this.f57400b);
        if (m52630a == null) {
            return null;
        }
        if (m51353a(m52630a, 2)) {
            this.f57399a.m52631a(str2, 2, this.f57400b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m52630a);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.p466a.AbsNativeCache
    /* renamed from: a */
    public final /* synthetic */ void mo51351a(String str, List<Campaign> list) {
        String str2 = str;
        List<Campaign> list2 = list;
        if (TextUtils.isEmpty(str2) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.f57399a.m52627a(str2, 1, this.f57400b, false);
        this.f57399a.m52627a(str2, 2, this.f57400b, false);
        for (int i = 0; i < list2.size(); i++) {
            CampaignEx campaignEx = (CampaignEx) list2.get(i);
            campaignEx.setCacheLevel(1);
            this.f57399a.m52634a(campaignEx, str2, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.p466a.AbsNativeCache
    /* renamed from: a */
    public final /* synthetic */ void mo51350a(String str, List<Campaign> list, String str2) {
        final String str3 = str;
        final List<Campaign> list2 = list;
        boolean z = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str3) || list2 == null || list2.size() <= 0) {
            return;
        }
        this.f57399a.m52627a(str3, 1, this.f57400b, z);
        this.f57399a.m52627a(str3, 2, this.f57400b, z);
        ThreadPoolUtils.m52227b().execute(new Runnable() { // from class: com.mbridge.msdk.mbnative.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                for (int i = 0; i < list2.size(); i++) {
                    CampaignEx campaignEx = (CampaignEx) list2.get(i);
                    campaignEx.setCacheLevel(1);
                    APICache.this.f57399a.m52634a(campaignEx, str3, 1);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m51353a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L64
            int r1 = r10.size()
            if (r1 <= 0) goto L64
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r10 = r10.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10
            long r3 = r10.getTimestamp()
            r5 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            if (r11 == r10) goto L40
            r7 = 2
            if (r11 == r7) goto L22
            r5 = 0
            goto L5e
        L22:
            com.mbridge.msdk.c.h r11 = com.mbridge.msdk.p411c.SettingManager.m53286a()
            com.mbridge.msdk.foundation.controller.c r7 = com.mbridge.msdk.foundation.controller.MBSDKContext.m52746m()
            java.lang.String r7 = r7.m52779k()
            com.mbridge.msdk.c.g r11 = r11.m53279b(r7)
            if (r11 != 0) goto L3b
            com.mbridge.msdk.p411c.SettingManager.m53286a()
            com.mbridge.msdk.c.g r11 = com.mbridge.msdk.p411c.SettingManagerDiff.m53265a()
        L3b:
            long r7 = r11.m53459ad()
            goto L5d
        L40:
            com.mbridge.msdk.c.h r11 = com.mbridge.msdk.p411c.SettingManager.m53286a()
            com.mbridge.msdk.foundation.controller.c r7 = com.mbridge.msdk.foundation.controller.MBSDKContext.m52746m()
            java.lang.String r7 = r7.m52779k()
            com.mbridge.msdk.c.g r11 = r11.m53279b(r7)
            if (r11 != 0) goto L59
            com.mbridge.msdk.p411c.SettingManager.m53286a()
            com.mbridge.msdk.c.g r11 = com.mbridge.msdk.p411c.SettingManagerDiff.m53265a()
        L59:
            long r7 = r11.m53460ac()
        L5d:
            long r5 = r5 * r7
        L5e:
            long r1 = r1 - r3
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 <= 0) goto L64
            return r10
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.p466a.APICache.m51353a(java.util.List, int):boolean");
    }

    @Override // com.mbridge.msdk.mbnative.p466a.AbsNativeCache
    /* renamed from: a */
    public final void mo51349a(String str, Campaign campaign, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.f57399a.m52626a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z)) {
                this.f57399a.m52621a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f57400b, z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
