package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.UnitSetting;
import com.mbridge.msdk.videocommon.listener.VideoDownloadListener;
import com.mbridge.msdk.videocommon.p538d.RewardSettingManager;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.b */
/* loaded from: classes6.dex */
public class DownLoadManager {

    /* renamed from: a */
    private static volatile DownLoadManager f61370a;

    /* renamed from: b */
    private boolean f61371b = false;

    /* renamed from: c */
    private ConcurrentHashMap<String, UnitCacheCtroller> f61372c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, CampaignDownLoadTask>>> f61373d;

    /* renamed from: e */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f61374e;

    /* renamed from: f */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignDownLoadTask>> f61375f;

    private DownLoadManager() {
    }

    public static DownLoadManager getInstance() {
        if (f61370a == null) {
            synchronized (DownLoadManager.class) {
                if (f61370a == null) {
                    f61370a = new DownLoadManager();
                }
            }
        }
        return f61370a;
    }

    /* renamed from: a */
    public final CampaignDownLoadTask m48173a(String str, String str2) {
        UnitCacheCtroller m48166c = m48166c(str);
        if (m48166c != null) {
            return m48166c.m48118a(str2);
        }
        return null;
    }

    /* renamed from: b */
    public final CopyOnWriteArrayList<CampaignDownLoadTask> m48170b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignDownLoadTask>> concurrentHashMap = this.f61375f;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f61375f.get(str);
    }

    /* renamed from: c */
    public final UnitCacheCtroller m48166c(String str) {
        ConcurrentHashMap<String, UnitCacheCtroller> concurrentHashMap = this.f61372c;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            return this.f61372c.get(str);
        }
        return null;
    }

    public UnitCacheCtroller createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i, VideoDownloadListener videoDownloadListener) {
        UnitCacheCtroller unitCacheCtroller;
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.f61372c.containsKey(str)) {
            unitCacheCtroller = this.f61372c.get(str);
            if (unitCacheCtroller == null) {
                unitCacheCtroller = new UnitCacheCtroller(context, copyOnWriteArrayList, str, i);
                this.f61372c.put(str, unitCacheCtroller);
            }
            if (i != 94 && i != 287) {
                unitCacheCtroller.m48119a(videoDownloadListener);
            } else {
                unitCacheCtroller.m48115a(copyOnWriteArrayList.get(0).getRequestId(), videoDownloadListener);
            }
            unitCacheCtroller.m48114a(copyOnWriteArrayList);
        } else {
            unitCacheCtroller = new UnitCacheCtroller(context, copyOnWriteArrayList, str, i);
            if (videoDownloadListener != null) {
                unitCacheCtroller.m48119a(videoDownloadListener);
            }
            this.f61372c.put(str, unitCacheCtroller);
        }
        return unitCacheCtroller;
    }

    public void load(String str) {
        UnitCacheCtroller m48166c = m48166c(str);
        if (m48166c != null) {
            m48166c.m48127a();
        }
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<CampaignEx> m48174a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f61374e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f61374e.get(str);
    }

    /* renamed from: b */
    public final void m48168b(String str, CopyOnWriteArrayList<CampaignDownLoadTask> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignDownLoadTask>> concurrentHashMap = this.f61375f;
        if (concurrentHashMap == null) {
            this.f61375f = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.f61375f.put(str, copyOnWriteArrayList);
    }

    /* renamed from: a */
    public final void m48172a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f61374e;
        if (concurrentHashMap == null) {
            this.f61374e = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.f61374e.put(str, copyOnWriteArrayList);
    }

    /* renamed from: b */
    public final int m48169b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, CampaignDownLoadTask>> m48104c;
        CampaignDownLoadTask value;
        CampaignEx m48192l;
        ConcurrentHashMap<String, UnitCacheCtroller> concurrentHashMap = this.f61372c;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, UnitCacheCtroller> entry : concurrentHashMap.entrySet()) {
                UnitCacheCtroller value2 = entry.getValue();
                if (value2 != null && (m48104c = value2.m48104c()) != null) {
                    int size = m48104c.size();
                    for (int i = 0; i < size; i++) {
                        Map<String, CampaignDownLoadTask> map = m48104c.get(i);
                        if (map != null) {
                            Iterator<Map.Entry<String, CampaignDownLoadTask>> it = map.entrySet().iterator();
                            if (it.hasNext() && (value = it.next().getValue()) != null && (m48192l = value.m48192l()) != null) {
                                String videoUrlEncode = m48192l.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return value.m48194k();
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean m48177a(int i, String str, boolean z) {
        try {
            UnitCacheCtroller m48166c = m48166c(str);
            if (m48166c != null) {
                return m48166c.m48125a(i, z) != null;
            }
            return false;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
                return false;
            }
            return false;
        }
    }

    public UnitCacheCtroller createUnitCache(Context context, String str, CampaignEx campaignEx, int i, VideoDownloadListener videoDownloadListener) {
        UnitCacheCtroller unitCacheCtroller;
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f61372c.containsKey(str)) {
            unitCacheCtroller = this.f61372c.get(str);
            if (unitCacheCtroller == null) {
                unitCacheCtroller = new UnitCacheCtroller(context, campaignEx, str, i);
                this.f61372c.put(str, unitCacheCtroller);
            }
            if (i != 94 && i != 287) {
                unitCacheCtroller.m48119a(videoDownloadListener);
            } else {
                unitCacheCtroller.m48115a(campaignEx.getRequestId(), videoDownloadListener);
            }
            unitCacheCtroller.m48124a(campaignEx);
        } else {
            unitCacheCtroller = new UnitCacheCtroller(context, campaignEx, str, i);
            if (videoDownloadListener != null) {
                unitCacheCtroller.m48119a(videoDownloadListener);
            }
            this.f61372c.put(str, unitCacheCtroller);
        }
        return unitCacheCtroller;
    }

    /* renamed from: a */
    public final boolean m48176a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list) {
        return m48175a(i, str, z, i2, z2, i3, list, false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ab, code lost:
        r14.f61375f = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
        if (r3.containsKey(r16) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b9, code lost:
        r14.f61375f.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01be, code lost:
        r3 = r14.f61374e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c0, code lost:
        if (r3 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c2, code lost:
        r14.f61374e = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ce, code lost:
        if (r3.containsKey(r16) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d0, code lost:
        r14.f61374e.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d5, code lost:
        if (r2 == null) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01db, code lost:
        if (r2.size() <= 0) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01dd, code lost:
        r3 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r4 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r5 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f4, code lost:
        if (r2.hasNext() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f6, code lost:
        r6 = r2.next();
        r7 = new java.util.concurrent.ConcurrentHashMap();
        r8 = r6.m48192l();
        r7.put(r8.getId() + r8.getVideoUrlEncode() + r8.getBidToken(), r6);
        r3.add(r7);
        r4.add(r8);
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0230, code lost:
        r14.f61373d.put(r16, r3);
        r14.f61374e.put(r16, r4);
        r14.f61375f.put(r16, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
        if (r5.size() >= r18) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018b, code lost:
        if (r4.size() > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0190, code lost:
        r3 = r14.f61373d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
        if (r3 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
        r14.f61373d = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a0, code lost:
        if (r3.containsKey(r16) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
        r14.f61373d.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a7, code lost:
        r3 = r14.f61375f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a9, code lost:
        if (r3 != null) goto L161;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m48175a(int r15, java.lang.String r16, boolean r17, int r18, boolean r19, int r20, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r21, boolean r22, com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper r23) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.DownLoadManager.m48175a(int, java.lang.String, boolean, int, boolean, int, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.d.e):boolean");
    }

    /* renamed from: b */
    public final void m48167b(boolean z) {
        if (z) {
            if (this.f61371b) {
                return;
            }
        } else {
            this.f61371b = false;
        }
        ConcurrentHashMap<String, UnitCacheCtroller> concurrentHashMap = this.f61372c;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, UnitCacheCtroller> entry : concurrentHashMap.entrySet()) {
                entry.getValue().m48127a();
            }
        }
    }

    /* renamed from: a */
    public final void m48171a(boolean z) {
        this.f61371b = z;
        ConcurrentHashMap<String, UnitCacheCtroller> concurrentHashMap = this.f61372c;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, UnitCacheCtroller> entry : concurrentHashMap.entrySet()) {
                UnitCacheCtroller value = entry.getValue();
                if (value != null) {
                    value.m48111b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m48178a() {
        ConcurrentHashMap<String, UnitCacheCtroller> concurrentHashMap = this.f61372c;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, UnitCacheCtroller> entry : concurrentHashMap.entrySet()) {
                UnitCacheCtroller value = entry.getValue();
                String key = entry.getKey();
                try {
                    RewardUnitSetting m48341a = RewardSettingManager.m48344a().m48341a(MBSDKContext.m52746m().m52779k(), key);
                    if (m48341a != null) {
                        if (m48341a.m48259w() == 2) {
                            value.m48111b();
                        } else {
                            value.m48127a();
                        }
                    }
                } catch (Exception e) {
                    SameLogTool.m51824b("DownLoadManager", e.getMessage());
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            UnitSetting m53274d = SettingManager.m53286a().m53274d(MBSDKContext.m52746m().m52779k(), key);
                            if (m53274d == null) {
                                m53274d = UnitSetting.m53250e(key);
                            }
                            if (m53274d.m53323k() == 2) {
                                value.m48111b();
                            } else {
                                value.m48127a();
                            }
                        }
                    } catch (Exception e2) {
                        SameLogTool.m51824b("DownLoadManager", e2.getMessage());
                    }
                }
            }
        }
    }
}
