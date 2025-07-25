package p712i5;

import android.text.TextUtils;
import java.util.Map;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p682g5.LifeCycleManager;
import p682g5.SpManager;
import p695h5.BaseUserTagProcessor;
import p738j5.DataProcessUtils;

/* renamed from: i5.e */
/* loaded from: classes6.dex */
public class MoFlowDomainProcessor extends BaseUserTagProcessor {
    public MoFlowDomainProcessor(UserTagData userTagData) {
        super(userTagData);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        Map<String, ?> m24286b = BaseUserTagProcessor.m23692n(userTagInitParameter.m735a()).m24286b();
        if (DataProcessUtils.m18549h(m24286b)) {
            return;
        }
        Map<String, String> m787s = m23687s().m823c().m787s();
        for (Map.Entry<String, ?> entry : m24286b.entrySet()) {
            m787s.put(entry.getKey(), entry.getValue().toString());
        }
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: h */
    public void mo710h(Map<String, String> map) {
        SpManager.C33210c m23692n = BaseUserTagProcessor.m23692n(LifeCycleManager.m24309f().m24308g());
        Map<String, String> m787s = m23687s().m823c().m787s();
        m23692n.m24287a();
        m787s.clear();
        if (DataProcessUtils.m18549h(map)) {
            return;
        }
        for (String str : map.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = map.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    m787s.put(str, str2);
                    m23692n.m24278j(str, str2);
                }
            }
        }
    }
}
