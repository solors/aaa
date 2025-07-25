package p660f0;

import java.io.IOException;
import p677g0.AbstractC33178c;

/* renamed from: f0.o */
/* loaded from: classes2.dex */
public class IntegerParser implements ValueParser<Integer> {

    /* renamed from: a */
    public static final IntegerParser f90267a = new IntegerParser();

    private IntegerParser() {
    }

    @Override // p660f0.ValueParser
    /* renamed from: b */
    public Integer mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        return Integer.valueOf(Math.round(C33073p.m24985g(abstractC33178c) * f));
    }
}
