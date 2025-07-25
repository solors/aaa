package p660f0;

import java.io.IOException;
import p677g0.AbstractC33178c;

/* renamed from: f0.i */
/* loaded from: classes2.dex */
public class FloatParser implements ValueParser<Float> {

    /* renamed from: a */
    public static final FloatParser f90256a = new FloatParser();

    private FloatParser() {
    }

    @Override // p660f0.ValueParser
    /* renamed from: b */
    public Float mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        return Float.valueOf(C33073p.m24985g(abstractC33178c) * f);
    }
}
