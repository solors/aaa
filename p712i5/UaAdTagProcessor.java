package p712i5;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import p040c5.ConfigData;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p682g5.LifeCycleManager;
import p682g5.SpManager;
import p695h5.BaseUserTagProcessor;
import p738j5.LogUtils;

/* renamed from: i5.g */
/* loaded from: classes6.dex */
public class UaAdTagProcessor extends BaseUserTagProcessor {

    /* renamed from: b */
    private final String f91934b;

    /* renamed from: c */
    private final String f91935c;

    public UaAdTagProcessor(UserTagData userTagData) {
        super(userTagData);
        this.f91934b = "UserTag_UaAdTagProcessor";
        this.f91935c = "sp_key_ua_ad_content_tag";
    }

    /* renamed from: t */
    private String m23106t(Context context) {
        return BaseUserTagProcessor.m23695k(context).m24282f("sp_key_ua_ad_content_tag", "");
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        Context m735a = userTagInitParameter.m735a();
        Map<String, String> m782x = m23687s().m823c().m782x();
        String m23106t = m23106t(m735a);
        if (!TextUtils.isEmpty(m23106t)) {
            LogUtils.m18537b("UserTag_UaAdTagProcessor", "add last ua_ad_content_tag: " + m23106t);
            m782x.put("ua_ad_content_tag", m23106t);
        }
        Map<String, ?> m24286b = BaseUserTagProcessor.m23688r(m735a).m24286b();
        if (m24286b != null && !m24286b.isEmpty()) {
            LogUtils.m18537b("UserTag_UaAdTagProcessor", "local ua_ad_tag: " + m24286b);
            for (Map.Entry<String, ?> entry : m24286b.entrySet()) {
                m782x.put(entry.getKey(), entry.getValue().toString());
            }
            return;
        }
        LogUtils.m18537b("UserTag_UaAdTagProcessor", "local ua_ad_tag is empty");
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: d */
    public void mo714d(ConfigData configData) {
        Map<String, String> m103648d = configData.m103648d();
        if (m103648d != null && !m103648d.isEmpty()) {
            LogUtils.m18537b("UserTag_UaAdTagProcessor", "remote ua_ad_tag: " + m103648d);
            SpManager.C33210c m23688r = BaseUserTagProcessor.m23688r(LifeCycleManager.m24309f().m24308g());
            Map<String, String> m782x = m23687s().m823c().m782x();
            m23688r.m24287a();
            m782x.clear();
            for (Map.Entry<String, String> entry : m103648d.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    m782x.put(key, value);
                    m23688r.m24278j(key, value);
                }
            }
            return;
        }
        LogUtils.m18537b("UserTag_UaAdTagProcessor", "remote ua_ad_tag is empty");
    }
}
