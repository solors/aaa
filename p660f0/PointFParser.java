package p660f0;

import android.graphics.PointF;
import java.io.IOException;
import p677g0.AbstractC33178c;

/* renamed from: f0.y */
/* loaded from: classes2.dex */
public class PointFParser implements ValueParser<PointF> {

    /* renamed from: a */
    public static final PointFParser f90285a = new PointFParser();

    private PointFParser() {
    }

    @Override // p660f0.ValueParser
    /* renamed from: b */
    public PointF mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        AbstractC33178c.EnumC33180b mo24494t = abstractC33178c.mo24494t();
        if (mo24494t == AbstractC33178c.EnumC33180b.BEGIN_ARRAY) {
            return C33073p.m24987e(abstractC33178c, f);
        }
        if (mo24494t == AbstractC33178c.EnumC33180b.BEGIN_OBJECT) {
            return C33073p.m24987e(abstractC33178c, f);
        }
        if (mo24494t == AbstractC33178c.EnumC33180b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC33178c.mo24498l()) * f, ((float) abstractC33178c.mo24498l()) * f);
            while (abstractC33178c.mo24500i()) {
                abstractC33178c.mo24491x();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + mo24494t);
    }
}
