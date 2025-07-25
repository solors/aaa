package p695h5;

import android.app.Application;
import java.util.List;
import java.util.Map;
import p040c5.ConfigData;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p682g5.LifeCycleManager;
import p682g5.SpManager;
import p738j5.GsonUtils;

/* renamed from: h5.d */
/* loaded from: classes6.dex */
public class RemoteTagProcessor extends BaseUserTagProcessor {
    public RemoteTagProcessor(UserTagData userTagData) {
        super(userTagData);
    }

    /* renamed from: t */
    private void m23683t(UserTagInitParameter userTagInitParameter) {
        Map<String, ?> m24286b = BaseUserTagProcessor.m23690p(userTagInitParameter.m735a()).m24286b();
        if (m24286b != null && !m24286b.isEmpty()) {
            Map<String, List<String>> m777a = m23687s().m821e().m777a();
            for (Map.Entry<String, ?> entry : m24286b.entrySet()) {
                m777a.put(entry.getKey(), GsonUtils.m18541a(ConfigData.C3427b.C3428a.m103625b(entry.getValue().toString())));
            }
        }
    }

    /* renamed from: u */
    private void m23682u(UserTagInitParameter userTagInitParameter) {
        Map<String, ?> m24286b = BaseUserTagProcessor.m23689q(userTagInitParameter.m735a()).m24286b();
        if (m24286b != null && !m24286b.isEmpty()) {
            Map<String, String> m776b = m23687s().m821e().m776b();
            for (Map.Entry<String, ?> entry : m24286b.entrySet()) {
                m776b.put(entry.getKey(), ConfigData.C3427b.C3429b.m103618c(entry.getValue().toString()));
            }
        }
    }

    /* renamed from: v */
    private void m23681v(ConfigData configData) {
        List<ConfigData.C3427b.C3428a> m103634c;
        ConfigData.C3427b m103647e = configData.m103647e();
        if (m103647e != null && (m103634c = m103647e.m103634c()) != null && !m103634c.isEmpty()) {
            Application m24308g = LifeCycleManager.m24309f().m24308g();
            SpManager.C33210c m23690p = BaseUserTagProcessor.m23690p(m24308g);
            Map<String, List<String>> m777a = m23687s().m821e().m777a();
            m23690p.m24287a();
            m777a.clear();
            SpManager.C33210c m23689q = BaseUserTagProcessor.m23689q(m24308g);
            Map<String, String> m776b = m23687s().m821e().m776b();
            for (ConfigData.C3427b.C3428a c3428a : m103634c) {
                String m103626a = c3428a.m103626a();
                m777a.put(m103626a, c3428a.m103624c());
                m23690p.m24278j(m103626a, c3428a.m103621f());
                m23689q.m24281g(m103626a);
                m776b.remove(m103626a);
            }
        }
    }

    /* renamed from: w */
    private void m23680w(ConfigData configData) {
        List<ConfigData.C3427b.C3429b> m103632e;
        ConfigData.C3427b m103647e = configData.m103647e();
        if (m103647e != null && (m103632e = m103647e.m103632e()) != null && !m103632e.isEmpty()) {
            SpManager.C33210c m23689q = BaseUserTagProcessor.m23689q(LifeCycleManager.m24309f().m24308g());
            Map<String, String> m776b = m23687s().m821e().m776b();
            m23689q.m24287a();
            m776b.clear();
            for (ConfigData.C3427b.C3429b c3429b : m103632e) {
                String m103620a = c3429b.m103620a();
                m776b.put(m103620a, c3429b.m103619b());
                m23689q.m24278j(m103620a, c3429b.m103615f());
            }
        }
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        m23682u(userTagInitParameter);
        m23683t(userTagInitParameter);
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: d */
    public void mo714d(ConfigData configData) {
        m23680w(configData);
        m23681v(configData);
    }
}
