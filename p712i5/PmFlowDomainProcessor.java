package p712i5;

import android.text.TextUtils;
import java.util.Map;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p682g5.LifeCycleManager;
import p682g5.SpManager;
import p695h5.BaseUserTagProcessor;
import p738j5.DataProcessUtils;

/* renamed from: i5.f */
/* loaded from: classes6.dex */
public class PmFlowDomainProcessor extends BaseUserTagProcessor {
    public PmFlowDomainProcessor(UserTagData userTagData) {
        super(userTagData);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        Map<String, ?> m24286b = BaseUserTagProcessor.m23691o(userTagInitParameter.m735a()).m24286b();
        if (m24286b != null && !m24286b.isEmpty()) {
            Map<String, String> m783w = m23687s().m823c().m783w();
            for (Map.Entry<String, ?> entry : m24286b.entrySet()) {
                m783w.put(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: g */
    public void mo711g(Map<String, String> map) {
        SpManager.C33210c m23691o = BaseUserTagProcessor.m23691o(LifeCycleManager.m24309f().m24308g());
        Map<String, String> m783w = m23687s().m823c().m783w();
        m23691o.m24287a();
        m783w.clear();
        if (DataProcessUtils.m18549h(map)) {
            return;
        }
        for (String str : map.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = map.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    m783w.put(str, str2);
                    m23691o.m24278j(str, str2);
                }
            }
        }
    }
}
