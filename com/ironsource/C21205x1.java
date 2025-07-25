package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.x1 */
/* loaded from: classes6.dex */
public class C21205x1 {

    /* renamed from: a */
    private final int f54399a;

    /* renamed from: b */
    private final IronSource.AD_UNIT f54400b;

    /* renamed from: c */
    private final EnumC21207b f54401c;

    /* renamed from: d */
    private InterfaceC21162w1 f54402d;

    /* renamed from: e */
    private final AbstractC20325m7 f54403e;

    /* renamed from: f */
    public C21078ug f54404f;

    /* renamed from: g */
    public C20975sk f54405g;

    /* renamed from: h */
    public C20659pt f54406h;

    /* renamed from: i */
    public C20183k4 f54407i;

    /* renamed from: j */
    public C20125j0 f54408j;

    /* renamed from: k */
    public C21096ut f54409k;

    /* renamed from: l */
    private Map<EnumC21057u1, C21206a> f54410l;

    /* renamed from: m */
    private Map<EnumC21057u1, C21206a> f54411m;

    /* renamed from: n */
    private Map<EnumC21057u1, C21206a> f54412n;

    /* renamed from: o */
    private Map<EnumC21057u1, C21206a> f54413o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.x1$a */
    /* loaded from: classes6.dex */
    public static class C21206a {

        /* renamed from: a */
        private final int f54414a;

        /* renamed from: b */
        private final int f54415b;

        public C21206a(int i, int i2) {
            this.f54414a = i;
            this.f54415b = i2;
        }

        /* renamed from: a */
        int m54198a(EnumC21207b enumC21207b) {
            if (EnumC21207b.MEDIATION.equals(enumC21207b)) {
                return this.f54414a;
            }
            return this.f54415b;
        }
    }

    /* renamed from: com.ironsource.x1$b */
    /* loaded from: classes6.dex */
    public enum EnumC21207b {
        MEDIATION,
        PROVIDER
    }

    public C21205x1(IronSource.AD_UNIT ad_unit, EnumC21207b enumC21207b, InterfaceC21162w1 interfaceC21162w1) {
        this(ad_unit, enumC21207b, interfaceC21162w1, m54207a(ad_unit));
    }

    /* renamed from: a */
    private int m54206a(EnumC21057u1 enumC21057u1) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f54400b) && this.f54410l.containsKey(enumC21057u1)) {
                return this.f54410l.get(enumC21057u1).m54198a(this.f54401c);
            }
            if (IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f54400b) && this.f54411m.containsKey(enumC21057u1)) {
                return this.f54411m.get(enumC21057u1).m54198a(this.f54401c);
            }
            if (IronSource.AD_UNIT.BANNER.equals(this.f54400b) && this.f54412n.containsKey(enumC21057u1)) {
                return this.f54412n.get(enumC21057u1).m54198a(this.f54401c);
            }
            if (IronSource.AD_UNIT.NATIVE_AD.equals(this.f54400b) && this.f54413o.containsKey(enumC21057u1)) {
                return this.f54413o.get(enumC21057u1).m54198a(this.f54401c);
            }
            return -1;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    /* renamed from: d */
    private void m54201d() {
        HashMap hashMap = new HashMap();
        this.f54413o = hashMap;
        hashMap.put(EnumC21057u1.INIT_STARTED, new C21206a(IronSourceConstants.NT_MANAGER_INIT_STARTED, -1));
        this.f54413o.put(EnumC21057u1.INIT_ENDED, new C21206a(IronSourceConstants.NT_MANAGER_INIT_ENDED, -1));
        this.f54413o.put(EnumC21057u1.PLACEMENT_CAPPED, new C21206a(IronSourceConstants.NT_PLACEMENT_CAPPED, -1));
        this.f54413o.put(EnumC21057u1.AUCTION_REQUEST, new C21206a(IronSourceConstants.NT_AUCTION_REQUEST, -1));
        this.f54413o.put(EnumC21057u1.AUCTION_SUCCESS, new C21206a(IronSourceConstants.NT_AUCTION_SUCCESS, -1));
        this.f54413o.put(EnumC21057u1.AUCTION_FAILED, new C21206a(IronSourceConstants.NT_AUCTION_FAILED, -1));
        this.f54413o.put(EnumC21057u1.AUCTION_FAILED_NO_CANDIDATES, new C21206a(IronSourceConstants.NT_AUCTION_FAILED, -1));
        this.f54413o.put(EnumC21057u1.AUCTION_REQUEST_WATERFALL, new C21206a(IronSourceConstants.NT_AUCTION_REQUEST_WATERFALL, -1));
        this.f54413o.put(EnumC21057u1.AUCTION_RESULT_WATERFALL, new C21206a(IronSourceConstants.NT_AUCTION_RESPONSE_WATERFALL, -1));
        this.f54413o.put(EnumC21057u1.INIT_SUCCESS, new C21206a(-1, -1));
        this.f54413o.put(EnumC21057u1.INIT_FAILED, new C21206a(-1, -1));
        this.f54413o.put(EnumC21057u1.AD_OPENED, new C21206a(IronSourceConstants.NT_CALLBACK_SHOW, IronSourceConstants.NT_INSTANCE_SHOW));
        this.f54413o.put(EnumC21057u1.AD_CLICKED, new C21206a(IronSourceConstants.NT_CALLBACK_CLICK, IronSourceConstants.NT_INSTANCE_CLICK));
        this.f54413o.put(EnumC21057u1.LOAD_AD, new C21206a(4001, 4002));
        this.f54413o.put(EnumC21057u1.LOAD_AD_SUCCESS, new C21206a(IronSourceConstants.NT_CALLBACK_LOAD_SUCCESS, 4005));
        this.f54413o.put(EnumC21057u1.LOAD_AD_FAILED_WITH_REASON, new C21206a(IronSourceConstants.NT_CALLBACK_LOAD_ERROR, IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.f54413o.put(EnumC21057u1.LOAD_AD_NO_FILL, new C21206a(-1, IronSourceConstants.NT_INSTANCE_LOAD_NO_FILL));
        this.f54413o.put(EnumC21057u1.AD_FORMAT_CAPPED, new C21206a(IronSourceConstants.NT_AD_UNIT_CAPPED, -1));
        this.f54413o.put(EnumC21057u1.COLLECT_TOKEN, new C21206a(IronSourceConstants.NT_COLLECT_TOKENS, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN));
        this.f54413o.put(EnumC21057u1.COLLECT_TOKENS_COMPLETED, new C21206a(IronSourceConstants.NT_COLLECT_TOKENS_COMPLETED, -1));
        this.f54413o.put(EnumC21057u1.COLLECT_TOKENS_FAILED, new C21206a(IronSourceConstants.NT_COLLECT_TOKENS_FAILED, -1));
        this.f54413o.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN, new C21206a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, -1));
        this.f54413o.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_SUCCESS, new C21206a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS));
        this.f54413o.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_FAILED, new C21206a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED));
        this.f54413o.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new C21206a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT));
        this.f54413o.put(EnumC21057u1.DESTROY_AD, new C21206a(IronSourceConstants.NT_DESTROY, IronSourceConstants.NT_INSTANCE_DESTROY));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_BIDDING_DATA_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_NT_BIDDING_DATA_MISSING));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_OPENED, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new C21206a(88002, 88002));
        this.f54413o.put(EnumC21057u1.TROUBLESHOOT_NOTIFICATION_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, -1));
    }

    /* renamed from: b */
    void m54203b() {
        m54202c();
        m54200e();
        m54208a();
        m54201d();
    }

    /* renamed from: c */
    void m54202c() {
        HashMap hashMap = new HashMap();
        this.f54410l = hashMap;
        hashMap.put(EnumC21057u1.INIT_STARTED, new C21206a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        this.f54410l.put(EnumC21057u1.INIT_ENDED, new C21206a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        this.f54410l.put(EnumC21057u1.SESSION_CAPPED, new C21206a(-1, IronSourceConstants.IS_CAP_SESSION));
        this.f54410l.put(EnumC21057u1.PLACEMENT_CAPPED, new C21206a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        this.f54410l.put(EnumC21057u1.CHECK_PLACEMENT_CAPPED, new C21206a(IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED, -1));
        this.f54410l.put(EnumC21057u1.AUCTION_REQUEST, new C21206a(2000, -1));
        this.f54410l.put(EnumC21057u1.AUCTION_SUCCESS, new C21206a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        this.f54410l.put(EnumC21057u1.AUCTION_FAILED, new C21206a(2300, -1));
        this.f54410l.put(EnumC21057u1.AUCTION_FAILED_NO_CANDIDATES, new C21206a(2300, -1));
        this.f54410l.put(EnumC21057u1.AUCTION_REQUEST_WATERFALL, new C21206a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        this.f54410l.put(EnumC21057u1.AUCTION_RESULT_WATERFALL, new C21206a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        this.f54410l.put(EnumC21057u1.INIT_SUCCESS, new C21206a(-1, -1));
        this.f54410l.put(EnumC21057u1.INIT_FAILED, new C21206a(-1, -1));
        this.f54410l.put(EnumC21057u1.SHOW_AD_SUCCESS, new C21206a(IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, 2202));
        this.f54410l.put(EnumC21057u1.AD_OPENED, new C21206a(-1, 2005));
        this.f54410l.put(EnumC21057u1.AD_CLOSED, new C21206a(IronSourceConstants.IS_CALLBACK_AD_CLOSED, 2204));
        this.f54410l.put(EnumC21057u1.AD_CLICKED, new C21206a(IronSourceConstants.IS_CALLBACK_AD_CLICKED, 2006));
        this.f54410l.put(EnumC21057u1.AD_INFO_CHANGED, new C21206a(IronSourceConstants.IS_CALLBACK_AD_INFO_CHANGED, -1));
        this.f54410l.put(EnumC21057u1.LOAD_AD, new C21206a(2001, 2002));
        this.f54410l.put(EnumC21057u1.LOAD_AD_SUCCESS, new C21206a(2004, 2003));
        this.f54410l.put(EnumC21057u1.LOAD_AD_FAILED_WITH_REASON, new C21206a(2110, 2200));
        this.f54410l.put(EnumC21057u1.LOAD_AD_NO_FILL, new C21206a(-1, 2213));
        this.f54410l.put(EnumC21057u1.SHOW_AD, new C21206a(2100, 2201));
        this.f54410l.put(EnumC21057u1.SHOW_AD_FAILED, new C21206a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, 2203));
        this.f54410l.put(EnumC21057u1.AD_FORMAT_CAPPED, new C21206a(2303, -1));
        this.f54410l.put(EnumC21057u1.AD_UNIT_CAPPED, new C21206a(IronSourceConstants.IS_AD_UNIT_CAPPED, -1));
        this.f54410l.put(EnumC21057u1.COLLECT_TOKEN, new C21206a(IronSourceConstants.IS_COLLECT_TOKENS, -1));
        this.f54410l.put(EnumC21057u1.COLLECT_TOKENS_COMPLETED, new C21206a(IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, -1));
        this.f54410l.put(EnumC21057u1.COLLECT_TOKENS_FAILED, new C21206a(IronSourceConstants.IS_COLLECT_TOKENS_FAILED, -1));
        this.f54410l.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN, new C21206a(2020, -1));
        this.f54410l.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_SUCCESS, new C21206a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, -1));
        this.f54410l.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_FAILED, new C21206a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, -1));
        this.f54410l.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new C21206a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, -1));
        this.f54410l.put(EnumC21057u1.AD_READY_TRUE, new C21206a(2101, -1));
        this.f54410l.put(EnumC21057u1.AD_READY_FALSE, new C21206a(2102, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_BIDDING_DATA_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_CLOSED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new C21206a(88002, 88002));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_NOTIFICATION_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_LOAD, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_LOAD_WHILE_LOADED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_LOAD_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD_SUCCESS, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_LOAD_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD_FAILED, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_SHOW, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_SHOW, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_SHOW_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_SHOW_SUCCESS, -1));
        this.f54410l.put(EnumC21057u1.TROUBLESHOOT_SHOW_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_IS_SHOW_FAILED, -1));
    }

    /* renamed from: e */
    void m54200e() {
        HashMap hashMap = new HashMap();
        this.f54411m = hashMap;
        hashMap.put(EnumC21057u1.INIT_STARTED, new C21206a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.f54411m.put(EnumC21057u1.INIT_ENDED, new C21206a(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.f54411m.put(EnumC21057u1.SESSION_CAPPED, new C21206a(-1, IronSourceConstants.RV_CAP_SESSION));
        this.f54411m.put(EnumC21057u1.PLACEMENT_CAPPED, new C21206a(IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.f54411m.put(EnumC21057u1.AUCTION_REQUEST, new C21206a(IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.f54411m.put(EnumC21057u1.AUCTION_SUCCESS, new C21206a(IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.f54411m.put(EnumC21057u1.AUCTION_FAILED, new C21206a(1301, -1));
        this.f54411m.put(EnumC21057u1.AUCTION_FAILED_NO_CANDIDATES, new C21206a(1301, -1));
        this.f54411m.put(EnumC21057u1.AUCTION_REQUEST_WATERFALL, new C21206a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.f54411m.put(EnumC21057u1.AUCTION_RESULT_WATERFALL, new C21206a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.f54411m.put(EnumC21057u1.INIT_SUCCESS, new C21206a(-1, -1));
        this.f54411m.put(EnumC21057u1.INIT_FAILED, new C21206a(-1, -1));
        this.f54411m.put(EnumC21057u1.AD_VISIBLE, new C21206a(-1, 1206));
        this.f54411m.put(EnumC21057u1.AD_OPENED, new C21206a(-1, 1005));
        this.f54411m.put(EnumC21057u1.AD_CLOSED, new C21206a(-1, 1203));
        this.f54411m.put(EnumC21057u1.AD_STARTED, new C21206a(-1, IronSourceConstants.RV_INSTANCE_STARTED));
        this.f54411m.put(EnumC21057u1.AD_ENDED, new C21206a(-1, IronSourceConstants.RV_INSTANCE_ENDED));
        this.f54411m.put(EnumC21057u1.AD_CLICKED, new C21206a(-1, 1006));
        this.f54411m.put(EnumC21057u1.AD_REWARDED, new C21206a(-1, 1010));
        this.f54411m.put(EnumC21057u1.AD_AVAILABILITY_CHANGED_TRUE, new C21206a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f54411m.put(EnumC21057u1.AD_AVAILABILITY_CHANGED_FALSE, new C21206a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f54411m.put(EnumC21057u1.LOAD_AD, new C21206a(1000, 1001));
        this.f54411m.put(EnumC21057u1.LOAD_AD_SUCCESS, new C21206a(1003, 1002));
        this.f54411m.put(EnumC21057u1.LOAD_AD_FAILED, new C21206a(-1, 1200));
        this.f54411m.put(EnumC21057u1.LOAD_AD_FAILED_WITH_REASON, new C21206a(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f54411m.put(EnumC21057u1.LOAD_AD_NO_FILL, new C21206a(-1, 1213));
        this.f54411m.put(EnumC21057u1.SHOW_AD, new C21206a(IronSourceConstants.RV_API_SHOW_CALLED, 1201));
        this.f54411m.put(EnumC21057u1.SHOW_AD_CHANCE, new C21206a(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f54411m.put(EnumC21057u1.SHOW_AD_FAILED, new C21206a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, 1202));
        this.f54411m.put(EnumC21057u1.AD_FORMAT_CAPPED, new C21206a(IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        this.f54411m.put(EnumC21057u1.COLLECT_TOKEN, new C21206a(IronSourceConstants.RV_COLLECT_TOKENS, -1));
        this.f54411m.put(EnumC21057u1.COLLECT_TOKENS_COMPLETED, new C21206a(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, -1));
        this.f54411m.put(EnumC21057u1.COLLECT_TOKENS_FAILED, new C21206a(IronSourceConstants.RV_COLLECT_TOKENS_FAILED, -1));
        this.f54411m.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN, new C21206a(1020, -1));
        this.f54411m.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_SUCCESS, new C21206a(1021, 1021));
        this.f54411m.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_FAILED, new C21206a(1022, 1022));
        this.f54411m.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new C21206a(1023, 1023));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_BIDDING_DATA_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_CLOSED, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_LOAD_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_WATERFALL_OVERHEAD, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_NOTIFICATION_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f54411m.put(EnumC21057u1.TROUBLESHOOT_AD_EXPIRED, new C21206a(IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED, IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED));
    }

    /* renamed from: f */
    public void m54199f() {
        this.f54402d = null;
        this.f54406h = null;
        this.f54407i = null;
        this.f54404f = null;
        this.f54405g = null;
        this.f54408j = null;
        this.f54409k = null;
    }

    public C21205x1(IronSource.AD_UNIT ad_unit, EnumC21207b enumC21207b, InterfaceC21162w1 interfaceC21162w1, AbstractC20325m7 abstractC20325m7) {
        this.f54399a = -1;
        this.f54400b = ad_unit;
        this.f54401c = enumC21207b;
        this.f54402d = interfaceC21162w1;
        this.f54403e = abstractC20325m7 == null ? m54207a(ad_unit) : abstractC20325m7;
        m54203b();
        this.f54404f = new C21078ug(this);
        this.f54405g = new C20975sk(this);
        this.f54406h = new C20659pt(this);
        this.f54407i = new C20183k4(this);
        this.f54408j = new C20125j0(this);
        this.f54409k = new C21096ut(this);
    }

    /* renamed from: a */
    private static AbstractC20325m7 m54207a(IronSource.AD_UNIT ad_unit) {
        return ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) ? C20772rp.m55443i() : C20154ji.m57833i();
    }

    /* renamed from: a */
    void m54208a() {
        HashMap hashMap = new HashMap();
        this.f54412n = hashMap;
        hashMap.put(EnumC21057u1.INIT_STARTED, new C21206a(IronSourceConstants.BN_MANAGER_INIT_STARTED, -1));
        this.f54412n.put(EnumC21057u1.INIT_ENDED, new C21206a(IronSourceConstants.BN_MANAGER_INIT_ENDED, -1));
        this.f54412n.put(EnumC21057u1.PLACEMENT_CAPPED, new C21206a(IronSourceConstants.BN_PLACEMENT_CAPPED, -1));
        this.f54412n.put(EnumC21057u1.AUCTION_REQUEST, new C21206a(IronSourceConstants.BN_AUCTION_REQUEST, -1));
        this.f54412n.put(EnumC21057u1.AUCTION_SUCCESS, new C21206a(IronSourceConstants.BN_AUCTION_SUCCESS, -1));
        this.f54412n.put(EnumC21057u1.AUCTION_FAILED, new C21206a(IronSourceConstants.BN_AUCTION_FAILED, -1));
        this.f54412n.put(EnumC21057u1.AUCTION_FAILED_NO_CANDIDATES, new C21206a(IronSourceConstants.BN_AUCTION_FAILED, -1));
        this.f54412n.put(EnumC21057u1.AUCTION_REQUEST_WATERFALL, new C21206a(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, -1));
        this.f54412n.put(EnumC21057u1.AUCTION_RESULT_WATERFALL, new C21206a(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, -1));
        this.f54412n.put(EnumC21057u1.INIT_SUCCESS, new C21206a(-1, -1));
        this.f54412n.put(EnumC21057u1.INIT_FAILED, new C21206a(-1, -1));
        this.f54412n.put(EnumC21057u1.AD_OPENED, new C21206a(IronSourceConstants.BN_CALLBACK_SHOW, 3009));
        this.f54412n.put(EnumC21057u1.AD_CLICKED, new C21206a(IronSourceConstants.BN_CALLBACK_CLICK, 3008));
        this.f54412n.put(EnumC21057u1.LOAD_AD, new C21206a(3001, 3002));
        this.f54412n.put(EnumC21057u1.RELOAD_AD, new C21206a(IronSourceConstants.BN_RELOAD, IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f54412n.put(EnumC21057u1.LOAD_AD_SUCCESS, new C21206a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, 3005));
        this.f54412n.put(EnumC21057u1.RELOAD_AD_SUCCESS, new C21206a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f54412n.put(EnumC21057u1.LOAD_AD_FAILED_WITH_REASON, new C21206a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, 3300));
        this.f54412n.put(EnumC21057u1.RELOAD_AD_FAILED_WITH_REASON, new C21206a(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f54412n.put(EnumC21057u1.LOAD_AD_NO_FILL, new C21206a(-1, 3306));
        this.f54412n.put(EnumC21057u1.RELOAD_AD_NO_FILL, new C21206a(-1, IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL));
        this.f54412n.put(EnumC21057u1.AD_FORMAT_CAPPED, new C21206a(IronSourceConstants.BN_AD_UNIT_CAPPED, -1));
        this.f54412n.put(EnumC21057u1.COLLECT_TOKEN, new C21206a(IronSourceConstants.BN_COLLECT_TOKENS, -1));
        this.f54412n.put(EnumC21057u1.COLLECT_TOKENS_COMPLETED, new C21206a(IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, -1));
        this.f54412n.put(EnumC21057u1.COLLECT_TOKENS_FAILED, new C21206a(IronSourceConstants.BN_COLLECT_TOKENS_FAILED, -1));
        this.f54412n.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN, new C21206a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN, -1));
        this.f54412n.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_SUCCESS, new C21206a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS));
        this.f54412n.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_FAILED, new C21206a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED));
        this.f54412n.put(EnumC21057u1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new C21206a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT));
        this.f54412n.put(EnumC21057u1.DESTROY_AD, new C21206a(IronSourceConstants.BN_DESTROY, 3305));
        this.f54412n.put(EnumC21057u1.SKIP_RELOAD_AD, new C21206a(IronSourceConstants.BN_SKIP_RELOAD, -1));
        this.f54412n.put(EnumC21057u1.AD_LEFT_APPLICATION, new C21206a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, 3304));
        this.f54412n.put(EnumC21057u1.AD_PRESENT_SCREEN, new C21206a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN));
        this.f54412n.put(EnumC21057u1.AD_DISMISS_SCREEN, new C21206a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN));
        this.f54412n.put(EnumC21057u1.AD_VIEW_BOUND, new C21206a(IronSourceConstants.BN_BOUND, IronSourceConstants.BN_INSTANCE_BOUND));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_BIDDING_DATA_MISSING, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_OPENED, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new C21206a(88002, 88002));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_NOTIFICATION_ERROR, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, -1));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, -1));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_IMPRESSION_TIMEOUT, new C21206a(IronSourceConstants.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, -1));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new C21206a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, -1));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new C21206a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, -1));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new C21206a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, -1));
        this.f54412n.put(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new C21206a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, -1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m54205a(EnumC21057u1 enumC21057u1, Map<String, Object> map) {
        m54204a(enumC21057u1, map, Calendar.getInstance().getTimeInMillis());
    }

    /* renamed from: a */
    public void m54204a(EnumC21057u1 enumC21057u1, Map<String, Object> map, long j) {
        int m54206a = m54206a(enumC21057u1);
        if (-1 == m54206a) {
            return;
        }
        HashMap hashMap = new HashMap();
        InterfaceC21162w1 interfaceC21162w1 = this.f54402d;
        if (interfaceC21162w1 != null) {
            hashMap.putAll(interfaceC21162w1.mo53886a(enumC21057u1));
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f54403e.mo57283a(new C20200kb(m54206a, j, new JSONObject(hashMap)));
    }
}
