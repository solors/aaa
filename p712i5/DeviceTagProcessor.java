package p712i5;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.learnings.usertag.debug.UserTagDebugManager;
import p040c5.ConfigData;
import p1068z4.UserTagData;
import p1068z4.UserTagInitParameter;
import p650e5.DeviceCategoryData;
import p650e5.DeviceResolutionData;
import p682g5.LifeCycleManager;
import p695h5.BaseUserTagProcessor;
import p738j5.C37294f;

/* renamed from: i5.c */
/* loaded from: classes6.dex */
public class DeviceTagProcessor extends BaseUserTagProcessor {

    /* renamed from: b */
    private final String f91927b;

    /* renamed from: c */
    private final String f91928c;

    public DeviceTagProcessor(UserTagData userTagData) {
        super(userTagData);
        this.f91927b = "sp_key_first_app_version";
        this.f91928c = "sp_key_first_install_time";
    }

    /* renamed from: v */
    public static String m23115v(Context context) {
        String m53570c = UserTagDebugManager.m53572a().m53570c();
        if (!TextUtils.isEmpty(m53570c)) {
            return m53570c;
        }
        return BaseUserTagProcessor.m23695k(context).m24282f("sp_key_user_id", "");
    }

    /* renamed from: w */
    private void m23114w(Context context, String str) {
        BaseUserTagProcessor.m23695k(context).m24278j("sp_key_first_app_version", str);
    }

    /* renamed from: x */
    private void m23113x(Context context, long j) {
        BaseUserTagProcessor.m23695k(context).m24279i("sp_key_first_install_time", j);
    }

    /* renamed from: y */
    private void m23112y(Context context, String str) {
        BaseUserTagProcessor.m23695k(context).m24278j("sp_key_user_id", str);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        String str;
        Context m735a = userTagInitParameter.m735a();
        UserTagData.C45120a m823c = m23687s().m823c();
        long m734b = userTagInitParameter.m734b();
        m823c.m817D(C37294f.m18534b(m735a));
        m823c.m820A(C37294f.m18535a(m735a));
        m823c.m815F(C37294f.m18532d());
        m823c.m814G(C37294f.m18533c(m735a) / 1024.0d);
        m823c.m813H(DeviceResolutionData.m25496c(m735a));
        m823c.m816E(DeviceCategoryData.m25497c(m735a));
        m823c.m806O(Build.VERSION.RELEASE);
        String m23117t = m23117t(m735a);
        if (TextUtils.isEmpty(m23117t)) {
            if (C37294f.m18528h(userTagInitParameter.m735a())) {
                str = C37294f.m18535a(m735a);
            } else {
                str = "0";
            }
            m23117t = str;
            m23114w(m735a, m23117t);
        }
        m823c.m811J(m23117t);
        long m23116u = m23116u(m735a);
        if (m23116u <= 0) {
            m23113x(m735a, m734b);
        } else {
            m734b = m23116u;
        }
        m823c.m810K(m734b);
    }

    @Override // p695h5.BaseUserTagProcessor, p695h5.IUserTagProcessor
    /* renamed from: d */
    public void mo714d(ConfigData configData) {
        Application m24308g = LifeCycleManager.m24309f().m24308g();
        ConfigData.C3427b m103647e = configData.m103647e();
        if (m103647e == null) {
            return;
        }
        String m103633d = m103647e.m103633d();
        if (!TextUtils.isEmpty(m103633d)) {
            m23112y(m24308g, m103633d);
        }
        UserTagData.C45120a m823c = m23687s().m823c();
        String m103636a = m103647e.m103636a();
        if (!TextUtils.isEmpty(m103636a) && TextUtils.equals("0", m823c.m792n())) {
            m823c.m811J(m103636a);
            m23114w(m24308g, m103636a);
        }
        long m103635b = m103647e.m103635b();
        if (m103635b > 0 && m823c.m791o() <= 0) {
            m823c.m810K(m103635b);
            m23113x(m24308g, m103635b);
        }
    }

    /* renamed from: t */
    public String m23117t(Context context) {
        return BaseUserTagProcessor.m23695k(context).m24282f("sp_key_first_app_version", "");
    }

    /* renamed from: u */
    public long m23116u(Context context) {
        return BaseUserTagProcessor.m23695k(context).m24283e("sp_key_first_install_time", 0L);
    }
}
