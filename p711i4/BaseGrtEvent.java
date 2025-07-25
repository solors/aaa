package p711i4;

import android.os.Bundle;
import java.util.List;
import p633d4.C32848d;
import p633d4.EventParameter;
import p633d4.GrtAdImpressionData;
import p633d4.GrtPurchaseData;
import p681g4.BaseGrtModel;
import p694h4.LTVManager;
import p753k4.LogUtil;

/* renamed from: i4.c */
/* loaded from: classes6.dex */
public abstract class BaseGrtEvent<T extends BaseGrtModel> {

    /* renamed from: a */
    private final String f91885a = "GRT_BaseGrtEvent";

    /* renamed from: b */
    private T f91886b;

    /* renamed from: c */
    private UserArea f91887c;

    /* compiled from: BaseGrtEvent.java */
    /* renamed from: i4.c$a */
    /* loaded from: classes6.dex */
    public static class C33602a {

        /* renamed from: a */
        private EventParameter f91888a;

        /* renamed from: b */
        private BaseGrtModel.C33189a f91889b;

        C33602a() {
        }

        /* renamed from: a */
        public BaseGrtModel.C33189a m23164a() {
            return this.f91889b;
        }

        /* renamed from: b */
        public EventParameter m23163b() {
            return this.f91888a;
        }

        /* renamed from: c */
        public void m23162c(BaseGrtModel.C33189a c33189a) {
            this.f91889b = c33189a;
        }

        /* renamed from: d */
        public void m23161d(EventParameter eventParameter) {
            this.f91888a = eventParameter;
        }
    }

    public BaseGrtEvent(T t) {
        this.f91886b = t;
    }

    /* renamed from: h */
    private void m23170h(C33602a c33602a) {
        BaseGrtModel.C33189a m23164a = c33602a.m23164a();
        String m23139c = this.f91887c.m23139c();
        if (m23164a.m24430i() && m23164a.m24431h(m23139c)) {
            if (LogUtil.m18217a()) {
                LogUtil.m18216b("GRT_BaseGrtEvent", c33602a.m23163b().m25752b() + " not send, user mediaSource: " + m23139c + " , condition：" + m23164a.m24436c().toString());
                return;
            }
            return;
        }
        BaseGrtModel.C33189a.C33190a m24437b = m23164a.m24437b();
        String m23141a = this.f91887c.m23141a();
        if (m24437b.m24424b() && m24437b.m24425a(m23141a)) {
            if (LogUtil.m18217a()) {
                LogUtil.m18216b("GRT_BaseGrtEvent", c33602a.m23163b().m25752b() + " not send, user country: " + m23141a + " , condition：" + m23164a.m24437b().toString());
                return;
            }
            return;
        }
        int m23140b = this.f91887c.m23140b();
        BaseGrtModel.C33189a.C33191b m24432g = m23164a.m24432g();
        if (m24432g.m24420b() && m24432g.m24421a(m23140b)) {
            if (LogUtil.m18217a()) {
                LogUtil.m18216b("GRT_BaseGrtEvent", c33602a.m23163b().m25752b() + " not send, user livingDay: " + m23140b + " , condition：" + m23164a.m24432g().toString());
                return;
            }
            return;
        }
        C32848d.m25756j(c33602a.m23163b());
    }

    /* renamed from: a */
    public T m23173a() {
        return this.f91886b;
    }

    /* renamed from: b */
    public double m23172b() {
        return LTVManager.m23704c().m23702e();
    }

    /* renamed from: c */
    public UserArea m23171c() {
        return this.f91887c;
    }

    /* renamed from: i */
    public void m23169i(String str, Bundle bundle, BaseGrtModel.C33189a c33189a) {
        m23167k(str, bundle, null, c33189a.m24435d(), c33189a);
    }

    /* renamed from: j */
    public void m23168j(String str, Bundle bundle, Double d, BaseGrtModel.C33189a c33189a) {
        m23167k(str, bundle, d, c33189a.m24435d(), c33189a);
    }

    /* renamed from: k */
    public void m23167k(String str, Bundle bundle, Double d, List<String> list, BaseGrtModel.C33189a c33189a) {
        C33602a c33602a = new C33602a();
        EventParameter eventParameter = new EventParameter();
        eventParameter.m25748f(str);
        eventParameter.m25749e(bundle);
        eventParameter.m25746h(d);
        eventParameter.m25747g(list);
        c33602a.m23161d(eventParameter);
        c33602a.m23162c(c33189a);
        m23170h(c33602a);
    }

    /* renamed from: l */
    public void m23166l(String str, Bundle bundle, List<String> list, BaseGrtModel.C33189a c33189a) {
        m23167k(str, bundle, null, list, c33189a);
    }

    /* renamed from: m */
    public void m23165m(UserArea userArea) {
        this.f91887c = userArea;
    }

    /* renamed from: e */
    public void mo23155e() {
    }

    /* renamed from: f */
    public void mo23149f() {
    }

    /* renamed from: d */
    public void mo23144d(GrtAdImpressionData grtAdImpressionData) {
    }

    /* renamed from: g */
    public void mo23152g(GrtPurchaseData grtPurchaseData) {
    }
}
