package com.mbridge.msdk.dycreator.p421d;

import com.mbridge.msdk.dycreator.p425g.BaseAbstractSubject;
import com.mbridge.msdk.dycreator.p425g.ClickSubject;
import com.mbridge.msdk.dycreator.p425g.ConcreteSubject;
import com.mbridge.msdk.dycreator.p425g.EffectSubject;
import com.mbridge.msdk.dycreator.p425g.ReportSubject;

/* renamed from: com.mbridge.msdk.dycreator.d.a */
/* loaded from: classes6.dex */
public final class SubjectFactory {

    /* renamed from: a */
    private static volatile SubjectFactory f55952a;

    /* compiled from: SubjectFactory.java */
    /* renamed from: com.mbridge.msdk.dycreator.d.a$1 */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C218871 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55953a;

        static {
            int[] iArr = new int[EnumC21888a.values().length];
            f55953a = iArr;
            try {
                iArr[EnumC21888a.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55953a[EnumC21888a.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55953a[EnumC21888a.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55953a[EnumC21888a.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SubjectFactory.java */
    /* renamed from: com.mbridge.msdk.dycreator.d.a$a */
    /* loaded from: classes6.dex */
    public enum EnumC21888a {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private SubjectFactory() {
    }

    /* renamed from: a */
    public static SubjectFactory m52955a() {
        if (f55952a == null) {
            synchronized (SubjectFactory.class) {
                if (f55952a == null) {
                    f55952a = new SubjectFactory();
                }
            }
        }
        return f55952a;
    }

    /* renamed from: a */
    public final <T extends BaseAbstractSubject> T m52954a(EnumC21888a enumC21888a) {
        int i = C218871.f55953a[enumC21888a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return new ReportSubject();
                }
                return new EffectSubject();
            }
            return new ClickSubject();
        }
        return new ConcreteSubject();
    }
}
