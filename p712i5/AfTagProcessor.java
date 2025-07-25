package p712i5;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p006a5.AfData;
import p006a5.AfDataManager;
import p040c5.ConfigData;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p682g5.LifeCycleManager;
import p695h5.BaseUserTagProcessor;
import p738j5.LogUtils;

/* renamed from: i5.b */
/* loaded from: classes6.dex */
public class AfTagProcessor extends BaseUserTagProcessor {

    /* renamed from: b */
    private final String f91924b;

    /* renamed from: c */
    private final String f91925c;

    /* renamed from: d */
    private final String f91926d;

    public AfTagProcessor(UserTagData userTagData) {
        super(userTagData);
        this.f91924b = "UserTag_AfDataProcessor";
        this.f91925c = "sp_key_optimize_goal";
        this.f91926d = "sp_key_optimize_model";
    }

    /* renamed from: t */
    public static Map<String, String> m23124t(Context context) {
        String m24282f = BaseUserTagProcessor.m23695k(context).m24282f("sp_key_af", "");
        if (TextUtils.isEmpty(m24282f)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(m24282f);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    private String m23123u(Context context) {
        return BaseUserTagProcessor.m23695k(context).m24282f("sp_key_optimize_goal", "");
    }

    /* renamed from: v */
    private String m23122v(Context context) {
        return BaseUserTagProcessor.m23695k(context).m24282f("sp_key_optimize_model", "");
    }

    /* renamed from: w */
    private void m23121w(Context context, Map<String, String> map) {
        if (map == null) {
            return;
        }
        try {
            BaseUserTagProcessor.m23695k(context).m24278j("sp_key_af", new JSONObject(map).toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: x */
    private void m23120x(Context context, String str) {
        BaseUserTagProcessor.m23695k(context).m24278j("sp_key_optimize_goal", str);
    }

    /* renamed from: y */
    private void m23119y(Context context, String str) {
        BaseUserTagProcessor.m23695k(context).m24278j("sp_key_optimize_model", str);
    }

    /* renamed from: z */
    private void m23118z(Map<String, String> map, boolean z) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setAfData ");
        if (z) {
            str = "from AF";
        } else {
            str = "form local";
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(map);
        LogUtils.m18537b("UserTag_AfDataProcessor", sb2.toString());
        if (map == null) {
            return;
        }
        if (z) {
            m23121w(LifeCycleManager.m24309f().m24308g(), map);
        }
        UserTagData.C45120a m823c = m23687s().m823c();
        AfData m105853c = AfDataManager.m105854b().m105853c();
        m105853c.m105870a(map);
        m823c.m809L(m105853c.m105863h());
        m823c.m819B(m105853c.m105865f());
        m823c.m818C(m105853c.m105864g());
        m823c.m780z(m105853c.m105867d());
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        Context m735a = userTagInitParameter.m735a();
        m23118z(m23124t(m735a), false);
        UserTagData.C45120a m823c = m23687s().m823c();
        m823c.m808M(m23123u(m735a));
        m823c.m807N(m23122v(m735a));
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: d */
    public void mo714d(ConfigData configData) {
        Application m24308g = LifeCycleManager.m24309f().m24308g();
        UserTagData.C45120a m823c = m23687s().m823c();
        Map<String, String> m103650b = configData.m103650b();
        if (m103650b != null && !m103650b.isEmpty()) {
            String str = m103650b.get("optimize_goal");
            if (!TextUtils.isEmpty(str)) {
                m23120x(m24308g, str);
                m823c.m808M(str);
            }
            String str2 = m103650b.get("optimize_model");
            if (!TextUtils.isEmpty(str2)) {
                m23119y(m24308g, str2);
                m823c.m807N(str2);
            }
        }
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: j */
    public void mo708j(Map<String, String> map) {
        m23118z(map, true);
    }
}
