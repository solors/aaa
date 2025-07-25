package p695h5;

import java.util.List;
import java.util.Map;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p682g5.LifeCycleManager;
import p682g5.SpManager;
import p738j5.GsonUtils;

/* renamed from: h5.c */
/* loaded from: classes6.dex */
public class LocalTagProcessor extends BaseUserTagProcessor {
    public LocalTagProcessor(UserTagData userTagData) {
        super(userTagData);
    }

    /* renamed from: t */
    private void m23686t(UserTagInitParameter userTagInitParameter) {
        Map<String, ?> m24286b = BaseUserTagProcessor.m23694l(userTagInitParameter.m735a()).m24286b();
        if (m24286b != null && !m24286b.isEmpty()) {
            Map<String, List<String>> m779a = m23687s().m822d().m779a();
            for (Map.Entry<String, ?> entry : m24286b.entrySet()) {
                m779a.put(entry.getKey(), GsonUtils.m18541a(entry.getValue().toString()));
            }
        }
    }

    /* renamed from: u */
    private void m23685u(UserTagInitParameter userTagInitParameter) {
        Map<String, ?> m24286b = BaseUserTagProcessor.m23693m(userTagInitParameter.m735a()).m24286b();
        if (m24286b != null && !m24286b.isEmpty()) {
            Map<String, String> m778b = m23687s().m822d().m778b();
            for (Map.Entry<String, ?> entry : m24286b.entrySet()) {
                m778b.put(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    /* renamed from: v */
    private void m23684v(String str, SpManager.C33210c c33210c, Map<?, ?> map) {
        c33210c.m24281g(str);
        map.remove(str);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        m23685u(userTagInitParameter);
        m23686t(userTagInitParameter);
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: e */
    public void mo713e(String str, List<String> list) {
        SpManager.C33210c m23694l = BaseUserTagProcessor.m23694l(LifeCycleManager.m24309f().m24308g());
        m23687s().m822d().m779a().put(str, list);
        m23694l.m24278j(str, GsonUtils.m18539c(list));
        m23684v(str, BaseUserTagProcessor.m23693m(LifeCycleManager.m24309f().m24308g()), m23687s().m822d().m778b());
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: f */
    public void mo712f(String str) {
        m23684v(str, BaseUserTagProcessor.m23693m(LifeCycleManager.m24309f().m24308g()), m23687s().m822d().m778b());
        m23684v(str, BaseUserTagProcessor.m23694l(LifeCycleManager.m24309f().m24308g()), m23687s().m822d().m779a());
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: i */
    public void mo709i(String str, String str2) {
        SpManager.C33210c m23693m = BaseUserTagProcessor.m23693m(LifeCycleManager.m24309f().m24308g());
        m23687s().m822d().m778b().put(str, str2);
        m23693m.m24278j(str, str2);
        m23684v(str, BaseUserTagProcessor.m23694l(LifeCycleManager.m24309f().m24308g()), m23687s().m822d().m779a());
    }
}
