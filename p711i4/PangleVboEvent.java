package p711i4;

import p633d4.C32848d;
import p681g4.BaseGrtModel;
import p681g4.PangleVboModel;
import p753k4.LogUtil;

/* renamed from: i4.l */
/* loaded from: classes6.dex */
public class PangleVboEvent extends BaseGrtEvent<PangleVboModel> {

    /* renamed from: d */
    private final String f91907d;

    public PangleVboEvent(PangleVboModel pangleVboModel) {
        super(pangleVboModel);
        this.f91907d = "GRT_PangleVboEvent";
    }

    @Override // p711i4.BaseGrtEvent
    /* renamed from: f */
    public void mo23149f() {
        super.mo23149f();
        BaseGrtModel.C33189a m24344b = m23173a().m24344b();
        UserArea m23171c = m23171c();
        String m23139c = m23171c.m23139c();
        if (m24344b.m24430i() && m24344b.m24431h(m23139c)) {
            return;
        }
        BaseGrtModel.C33189a.C33190a m24437b = m24344b.m24437b();
        String m23141a = m23171c.m23141a();
        if (m24437b.m24424b() && m24437b.m24425a(m23141a)) {
            return;
        }
        int m23140b = m23171c.m23140b();
        BaseGrtModel.C33189a.C33191b m24432g = m24344b.m24432g();
        if (m24432g.m24420b() && m24432g.m24421a(m23140b)) {
            return;
        }
        LogUtil.m18216b("GRT_PangleVboEvent", "send pangle VBO event");
        C32848d.m25755k();
    }
}
