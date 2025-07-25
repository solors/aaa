package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.videocommon.a */
/* loaded from: classes6.dex */
public final class TemplateWebviewCache {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C23237a> f61223a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, C23237a> f61224b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, C23237a> f61225c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static ConcurrentHashMap<String, C23237a> f61226d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static ConcurrentHashMap<String, C23237a> f61227e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static ConcurrentHashMap<String, C23237a> f61228f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static ConcurrentHashMap<String, C23237a> f61229g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static ConcurrentHashMap<String, C23237a> f61230h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static ConcurrentHashMap<String, C23237a> f61231i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private static ConcurrentHashMap<String, C23237a> f61232j = new ConcurrentHashMap<>();

    /* compiled from: TemplateWebviewCache.java */
    /* renamed from: com.mbridge.msdk.videocommon.a$a */
    /* loaded from: classes6.dex */
    public static class C23237a {

        /* renamed from: a */
        private WindVaneWebView f61233a;

        /* renamed from: b */
        private boolean f61234b;

        /* renamed from: a */
        public final WindVaneWebView m48413a() {
            return this.f61233a;
        }

        /* renamed from: b */
        public final String m48395b() {
            WindVaneWebView windVaneWebView = this.f61233a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        /* renamed from: c */
        public final boolean m48389c() {
            return this.f61234b;
        }

        /* renamed from: a */
        public final void m48408a(WindVaneWebView windVaneWebView) {
            this.f61233a = windVaneWebView;
        }

        /* renamed from: a */
        public final void m48406a(String str) {
            WindVaneWebView windVaneWebView = this.f61233a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        /* renamed from: a */
        public final void m48396a(boolean z) {
            this.f61234b = z;
        }
    }

    /* renamed from: a */
    public static C23237a m48421a(String str) {
        if (f61229g.containsKey(str)) {
            return f61229g.get(str);
        }
        if (f61230h.containsKey(str)) {
            return f61230h.get(str);
        }
        if (f61231i.containsKey(str)) {
            return f61231i.get(str);
        }
        if (f61232j.containsKey(str)) {
            return f61232j.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static void m48417b(String str) {
        if (f61229g.containsKey(str)) {
            f61229g.remove(str);
        }
        if (f61231i.containsKey(str)) {
            f61231i.remove(str);
        }
        if (f61230h.containsKey(str)) {
            f61230h.remove(str);
        }
        if (f61232j.containsKey(str)) {
            f61232j.remove(str);
        }
    }

    /* renamed from: c */
    public static void m48416c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f61229g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f61229g.remove(str2);
                }
            }
        } else {
            f61229g.clear();
        }
        f61230h.clear();
    }

    /* renamed from: d */
    public static void m48415d(String str) {
        for (Map.Entry<String, C23237a> entry : f61229g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f61229g.remove(entry.getKey());
            }
        }
    }

    /* renamed from: e */
    public static void m48414e(String str) {
        for (Map.Entry<String, C23237a> entry : f61230h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f61230h.remove(entry.getKey());
            }
        }
    }

    /* renamed from: a */
    public static void m48420a(String str, C23237a c23237a, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                f61230h.put(str, c23237a);
            } else {
                f61229g.put(str, c23237a);
            }
        } else if (z2) {
            f61232j.put(str, c23237a);
        } else {
            f61231i.put(str, c23237a);
        }
    }

    /* renamed from: b */
    public static void m48419b(int i, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C23237a> concurrentHashMap = f61224b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C23237a> concurrentHashMap2 = f61227e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                }
            } else if (i != 287) {
                if (i != 288) {
                    ConcurrentHashMap<String, C23237a> concurrentHashMap3 = f61223a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C23237a> concurrentHashMap4 = f61226d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C23237a> concurrentHashMap5 = f61225c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C23237a> concurrentHashMap6 = f61228f;
                if (concurrentHashMap6 != null) {
                    concurrentHashMap6.remove(requestIdNotice);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m48424a() {
        f61231i.clear();
        f61232j.clear();
    }

    /* renamed from: a */
    public static C23237a m48423a(int i, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i != 94) {
                if (i != 287) {
                    if (i != 288) {
                        ConcurrentHashMap<String, C23237a> concurrentHashMap = f61223a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f61223a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C23237a> concurrentHashMap2 = f61226d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f61226d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C23237a> concurrentHashMap3 = f61225c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f61225c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C23237a> concurrentHashMap4 = f61228f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f61228f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C23237a> concurrentHashMap5 = f61224b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f61224b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C23237a> concurrentHashMap6 = f61227e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f61227e.get(requestIdNotice);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m48418b(int i, String str, C23237a c23237a) {
        try {
            if (i == 94) {
                if (f61227e == null) {
                    f61227e = new ConcurrentHashMap<>();
                }
                f61227e.put(str, c23237a);
            } else if (i == 287) {
                if (f61228f == null) {
                    f61228f = new ConcurrentHashMap<>();
                }
                f61228f.put(str, c23237a);
            } else if (i != 288) {
                if (f61223a == null) {
                    f61223a = new ConcurrentHashMap<>();
                }
                f61223a.put(str, c23237a);
            } else {
                if (f61226d == null) {
                    f61226d = new ConcurrentHashMap<>();
                }
                f61226d.put(str, c23237a);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m48422a(int i, String str, C23237a c23237a) {
        try {
            if (i == 94) {
                if (f61224b == null) {
                    f61224b = new ConcurrentHashMap<>();
                }
                f61224b.put(str, c23237a);
            } else if (i != 287) {
            } else {
                if (f61225c == null) {
                    f61225c = new ConcurrentHashMap<>();
                }
                f61225c.put(str, c23237a);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
