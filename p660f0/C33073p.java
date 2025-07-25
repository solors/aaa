package p660f0;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p677g0.AbstractC33178c;

/* compiled from: JsonUtils.java */
/* renamed from: f0.p */
/* loaded from: classes2.dex */
class C33073p {

    /* renamed from: a */
    private static final AbstractC33178c.C33179a f90268a = AbstractC33178c.C33179a.m24520a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonUtils.java */
    /* renamed from: f0.p$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C33074a {

        /* renamed from: a */
        static final /* synthetic */ int[] f90269a;

        static {
            int[] iArr = new int[AbstractC33178c.EnumC33180b.values().length];
            f90269a = iArr;
            try {
                iArr[AbstractC33178c.EnumC33180b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90269a[AbstractC33178c.EnumC33180b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90269a[AbstractC33178c.EnumC33180b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    private static PointF m24991a(AbstractC33178c abstractC33178c, float f) throws IOException {
        abstractC33178c.mo24504b();
        float mo24498l = (float) abstractC33178c.mo24498l();
        float mo24498l2 = (float) abstractC33178c.mo24498l();
        while (abstractC33178c.mo24494t() != AbstractC33178c.EnumC33180b.END_ARRAY) {
            abstractC33178c.mo24491x();
        }
        abstractC33178c.mo24502f();
        return new PointF(mo24498l * f, mo24498l2 * f);
    }

    /* renamed from: b */
    private static PointF m24990b(AbstractC33178c abstractC33178c, float f) throws IOException {
        float mo24498l = (float) abstractC33178c.mo24498l();
        float mo24498l2 = (float) abstractC33178c.mo24498l();
        while (abstractC33178c.mo24500i()) {
            abstractC33178c.mo24491x();
        }
        return new PointF(mo24498l * f, mo24498l2 * f);
    }

    /* renamed from: c */
    private static PointF m24989c(AbstractC33178c abstractC33178c, float f) throws IOException {
        abstractC33178c.mo24503e();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (abstractC33178c.mo24500i()) {
            int mo24493v = abstractC33178c.mo24493v(f90268a);
            if (mo24493v != 0) {
                if (mo24493v != 1) {
                    abstractC33178c.mo24492w();
                    abstractC33178c.mo24491x();
                } else {
                    f3 = m24985g(abstractC33178c);
                }
            } else {
                f2 = m24985g(abstractC33178c);
            }
        }
        abstractC33178c.mo24501h();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    /* renamed from: d */
    public static int m24988d(AbstractC33178c abstractC33178c) throws IOException {
        abstractC33178c.mo24504b();
        int mo24498l = (int) (abstractC33178c.mo24498l() * 255.0d);
        int mo24498l2 = (int) (abstractC33178c.mo24498l() * 255.0d);
        int mo24498l3 = (int) (abstractC33178c.mo24498l() * 255.0d);
        while (abstractC33178c.mo24500i()) {
            abstractC33178c.mo24491x();
        }
        abstractC33178c.mo24502f();
        return Color.argb(255, mo24498l, mo24498l2, mo24498l3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static PointF m24987e(AbstractC33178c abstractC33178c, float f) throws IOException {
        int i = C33074a.f90269a[abstractC33178c.mo24494t().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m24989c(abstractC33178c, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + abstractC33178c.mo24494t());
            }
            return m24991a(abstractC33178c, f);
        }
        return m24990b(abstractC33178c, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static List<PointF> m24986f(AbstractC33178c abstractC33178c, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC33178c.mo24504b();
        while (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_ARRAY) {
            abstractC33178c.mo24504b();
            arrayList.add(m24987e(abstractC33178c, f));
            abstractC33178c.mo24502f();
        }
        abstractC33178c.mo24502f();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static float m24985g(AbstractC33178c abstractC33178c) throws IOException {
        AbstractC33178c.EnumC33180b mo24494t = abstractC33178c.mo24494t();
        int i = C33074a.f90269a[mo24494t.ordinal()];
        if (i != 1) {
            if (i == 2) {
                abstractC33178c.mo24504b();
                float mo24498l = (float) abstractC33178c.mo24498l();
                while (abstractC33178c.mo24500i()) {
                    abstractC33178c.mo24491x();
                }
                abstractC33178c.mo24502f();
                return mo24498l;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + mo24494t);
        }
        return (float) abstractC33178c.mo24498l();
    }
}
