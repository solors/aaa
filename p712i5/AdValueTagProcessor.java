package p712i5;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import p028b5.UserTagAdData;
import p040c5.ConfigData;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p650e5.AdValueData;
import p665f5.AdValueTag;
import p682g5.LifeCycleManager;
import p695h5.BaseUserTagProcessor;
import p738j5.LogUtils;

/* renamed from: i5.a */
/* loaded from: classes6.dex */
public class AdValueTagProcessor extends BaseUserTagProcessor {

    /* renamed from: g */
    private static String f91917g = "sp_key_ad_inter_ecpm_new";

    /* renamed from: h */
    private static String f91918h = "sp_key_ad_value_tag_new";

    /* renamed from: b */
    private final String f91919b;

    /* renamed from: c */
    private final int f91920c;

    /* renamed from: d */
    private ConfigData.C3426a f91921d;

    /* renamed from: e */
    private boolean f91922e;

    /* renamed from: f */
    private int f91923f;

    public AdValueTagProcessor(UserTagData userTagData) {
        super(userTagData);
        this.f91919b = "UserTag_AdValueProcessor";
        this.f91920c = 3;
    }

    /* renamed from: t */
    private double m23131t(Context context) {
        try {
            return Double.parseDouble(BaseUserTagProcessor.m23695k(context).m24282f(f91917g, "0"));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: u */
    private String m23130u(Context context) {
        return BaseUserTagProcessor.m23695k(context).m24282f(f91918h, "");
    }

    /* renamed from: v */
    private void m23129v(Context context, double d) {
        BaseUserTagProcessor.m23695k(context).m24278j(f91917g, String.valueOf(d));
    }

    /* renamed from: w */
    private void m23128w(Context context, String str) {
        BaseUserTagProcessor.m23695k(context).m24278j(f91918h, str);
    }

    /* renamed from: x */
    public static void m23127x(String str) {
        f91917g = str;
    }

    /* renamed from: y */
    public static void m23126y(String str) {
        f91918h = str;
    }

    /* renamed from: z */
    private void m23125z() {
        ConfigData.C3426a c3426a;
        AdValueTag adValueTag;
        double m23131t = m23131t(LifeCycleManager.m24309f().m24308g());
        if (m23131t != 0.0d && (c3426a = this.f91921d) != null && !c3426a.m103639c()) {
            if (m23131t >= this.f91921d.m103641a()) {
                adValueTag = AdValueTag.HIGH;
            } else if (m23131t >= this.f91921d.m103640b()) {
                adValueTag = AdValueTag.MEDIUM;
            } else {
                adValueTag = AdValueTag.LOW;
            }
            m23128w(LifeCycleManager.m24309f().m24308g(), adValueTag.m24944b());
            m23687s().m823c().m781y(new AdValueData(adValueTag, Double.valueOf(m23131t)));
        }
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: b */
    public void mo716b(UserTagAdData userTagAdData) {
        if (!userTagAdData.m103915e()) {
            return;
        }
        Application m24308g = LifeCycleManager.m24309f().m24308g();
        double m23131t = m23131t(m24308g);
        double m103917c = userTagAdData.m103917c();
        if (this.f91922e) {
            int i = this.f91923f + 1;
            this.f91923f = i;
            if (i <= 3 && m103917c >= m23131t) {
                LogUtils.m18537b("UserTag_AdValueProcessor", "updateInterEcpm: " + m103917c);
                m23129v(m24308g, m103917c);
                m23125z();
                return;
            }
        }
        LogUtils.m18537b("UserTag_AdValueProcessor", "not update ecpm");
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        String m23130u = m23130u(userTagInitParameter.m735a());
        double m23131t = m23131t(userTagInitParameter.m735a());
        if (!TextUtils.isEmpty(m23130u)) {
            m23687s().m823c().m781y(AdValueData.m25500c(m23130u, m23131t));
        } else if (m23131t == 0.0d) {
            this.f91922e = true;
        }
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: d */
    public void mo714d(ConfigData configData) {
        this.f91921d = configData.m103649c();
        if (TextUtils.isEmpty(m23130u(LifeCycleManager.m24309f().m24308g()))) {
            m23125z();
        }
    }
}
