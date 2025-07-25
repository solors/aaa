package p660f0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.LottieComposition;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p677g0.AbstractC33178c;
import p690h0.C33454j;
import p690h0.MiscUtils;
import p707i0.Keyframe;

/* renamed from: f0.q */
/* loaded from: classes2.dex */
class KeyframeParser {

    /* renamed from: b */
    private static SparseArrayCompat<WeakReference<Interpolator>> f90271b;

    /* renamed from: a */
    private static final Interpolator f90270a = new LinearInterpolator();

    /* renamed from: c */
    static AbstractC33178c.C33179a f90272c = AbstractC33178c.C33179a.m24520a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static AbstractC33178c.C33179a f90273d = AbstractC33178c.C33179a.m24520a("x", "y");

    KeyframeParser() {
    }

    @Nullable
    /* renamed from: a */
    private static WeakReference<Interpolator> m24984a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (KeyframeParser.class) {
            weakReference = m24978g().get(i);
        }
        return weakReference;
    }

    /* renamed from: b */
    private static Interpolator m24983b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        Interpolator linearInterpolator;
        pointF.x = MiscUtils.m23873c(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.m23873c(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.m23873c(pointF2.x, -1.0f, 1.0f);
        float m23873c = MiscUtils.m23873c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = m23873c;
        int m23854i = C33454j.m23854i(pointF.x, pointF.y, pointF2.x, m23873c);
        WeakReference<Interpolator> m24984a = m24984a(m23854i);
        if (m24984a != null) {
            interpolator = m24984a.get();
        } else {
            interpolator = null;
        }
        if (m24984a == null || interpolator == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                m24977h(m23854i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> Keyframe<T> m24982c(AbstractC33178c abstractC33178c, LottieComposition lottieComposition, float f, ValueParser<T> valueParser, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m24980e(lottieComposition, abstractC33178c, f, valueParser);
        }
        if (z) {
            return m24981d(lottieComposition, abstractC33178c, f, valueParser);
        }
        return m24979f(abstractC33178c, f, valueParser);
    }

    /* renamed from: d */
    private static <T> Keyframe<T> m24981d(LottieComposition lottieComposition, AbstractC33178c abstractC33178c, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        abstractC33178c.mo24503e();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (abstractC33178c.mo24500i()) {
            switch (abstractC33178c.mo24493v(f90272c)) {
                case 0:
                    f2 = (float) abstractC33178c.mo24498l();
                    break;
                case 1:
                    t3 = valueParser.mo24962a(abstractC33178c, f);
                    break;
                case 2:
                    t2 = valueParser.mo24962a(abstractC33178c, f);
                    break;
                case 3:
                    pointF = C33073p.m24987e(abstractC33178c, 1.0f);
                    break;
                case 4:
                    pointF4 = C33073p.m24987e(abstractC33178c, 1.0f);
                    break;
                case 5:
                    if (abstractC33178c.mo24497m() == 1) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 6:
                    pointF2 = C33073p.m24987e(abstractC33178c, f);
                    break;
                case 7:
                    pointF3 = C33073p.m24987e(abstractC33178c, f);
                    break;
                default:
                    abstractC33178c.mo24491x();
                    break;
            }
        }
        abstractC33178c.mo24501h();
        if (z) {
            interpolator2 = f90270a;
            t = t3;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = m24983b(pointF, pointF4);
            } else {
                interpolator = f90270a;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t3, t, interpolator2, f2, null);
        keyframe.f91844o = pointF2;
        keyframe.f91845p = pointF3;
        return keyframe;
    }

    /* renamed from: e */
    private static <T> Keyframe<T> m24980e(LottieComposition lottieComposition, AbstractC33178c abstractC33178c, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolator;
        Interpolator m24983b;
        Interpolator m24983b2;
        T t;
        PointF pointF;
        Keyframe<T> keyframe;
        PointF pointF2;
        float f2;
        PointF pointF3;
        float f3;
        abstractC33178c.mo24503e();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f4 = 0.0f;
        PointF pointF11 = null;
        T t3 = null;
        while (abstractC33178c.mo24500i()) {
            switch (abstractC33178c.mo24493v(f90272c)) {
                case 0:
                    pointF2 = pointF4;
                    f4 = (float) abstractC33178c.mo24498l();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t2 = valueParser.mo24962a(abstractC33178c, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t3 = valueParser.mo24962a(abstractC33178c, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f4;
                    PointF pointF12 = pointF11;
                    if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_OBJECT) {
                        abstractC33178c.mo24503e();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (abstractC33178c.mo24500i()) {
                            int mo24493v = abstractC33178c.mo24493v(f90273d);
                            if (mo24493v != 0) {
                                if (mo24493v != 1) {
                                    abstractC33178c.mo24491x();
                                } else {
                                    AbstractC33178c.EnumC33180b mo24494t = abstractC33178c.mo24494t();
                                    AbstractC33178c.EnumC33180b enumC33180b = AbstractC33178c.EnumC33180b.NUMBER;
                                    if (mo24494t == enumC33180b) {
                                        f8 = (float) abstractC33178c.mo24498l();
                                        f6 = f8;
                                    } else {
                                        abstractC33178c.mo24504b();
                                        f6 = (float) abstractC33178c.mo24498l();
                                        if (abstractC33178c.mo24494t() == enumC33180b) {
                                            f8 = (float) abstractC33178c.mo24498l();
                                        } else {
                                            f8 = f6;
                                        }
                                        abstractC33178c.mo24502f();
                                    }
                                }
                            } else {
                                AbstractC33178c.EnumC33180b mo24494t2 = abstractC33178c.mo24494t();
                                AbstractC33178c.EnumC33180b enumC33180b2 = AbstractC33178c.EnumC33180b.NUMBER;
                                if (mo24494t2 == enumC33180b2) {
                                    f7 = (float) abstractC33178c.mo24498l();
                                    f5 = f7;
                                } else {
                                    abstractC33178c.mo24504b();
                                    f5 = (float) abstractC33178c.mo24498l();
                                    if (abstractC33178c.mo24494t() == enumC33180b2) {
                                        f7 = (float) abstractC33178c.mo24498l();
                                    } else {
                                        f7 = f5;
                                    }
                                    abstractC33178c.mo24502f();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f5, f6);
                        PointF pointF14 = new PointF(f7, f8);
                        abstractC33178c.mo24501h();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f4 = f2;
                        break;
                    } else {
                        pointF5 = C33073p.m24987e(abstractC33178c, f);
                        f4 = f2;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_OBJECT) {
                        abstractC33178c.mo24503e();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (abstractC33178c.mo24500i()) {
                            PointF pointF15 = pointF11;
                            int mo24493v2 = abstractC33178c.mo24493v(f90273d);
                            if (mo24493v2 != 0) {
                                pointF3 = pointF4;
                                if (mo24493v2 != 1) {
                                    abstractC33178c.mo24491x();
                                } else {
                                    AbstractC33178c.EnumC33180b mo24494t3 = abstractC33178c.mo24494t();
                                    AbstractC33178c.EnumC33180b enumC33180b3 = AbstractC33178c.EnumC33180b.NUMBER;
                                    if (mo24494t3 == enumC33180b3) {
                                        f12 = (float) abstractC33178c.mo24498l();
                                        f4 = f4;
                                        f10 = f12;
                                    } else {
                                        float f13 = f4;
                                        abstractC33178c.mo24504b();
                                        float mo24498l = (float) abstractC33178c.mo24498l();
                                        if (abstractC33178c.mo24494t() == enumC33180b3) {
                                            f3 = (float) abstractC33178c.mo24498l();
                                        } else {
                                            f3 = mo24498l;
                                        }
                                        abstractC33178c.mo24502f();
                                        f4 = f13;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f12 = f3;
                                        f10 = mo24498l;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f14 = f4;
                                AbstractC33178c.EnumC33180b mo24494t4 = abstractC33178c.mo24494t();
                                AbstractC33178c.EnumC33180b enumC33180b4 = AbstractC33178c.EnumC33180b.NUMBER;
                                if (mo24494t4 == enumC33180b4) {
                                    f11 = (float) abstractC33178c.mo24498l();
                                    f4 = f14;
                                    f9 = f11;
                                } else {
                                    abstractC33178c.mo24504b();
                                    f9 = (float) abstractC33178c.mo24498l();
                                    if (abstractC33178c.mo24494t() == enumC33180b4) {
                                        f11 = (float) abstractC33178c.mo24498l();
                                    } else {
                                        f11 = f9;
                                    }
                                    abstractC33178c.mo24502f();
                                    f4 = f14;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f4;
                        PointF pointF16 = new PointF(f9, f10);
                        PointF pointF17 = new PointF(f11, f12);
                        abstractC33178c.mo24501h();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f4 = f2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = C33073p.m24987e(abstractC33178c, f);
                        break;
                    }
                case 5:
                    if (abstractC33178c.mo24497m() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = C33073p.m24987e(abstractC33178c, f);
                    continue;
                case 7:
                    pointF4 = C33073p.m24987e(abstractC33178c, f);
                    continue;
                default:
                    pointF2 = pointF4;
                    abstractC33178c.mo24491x();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f15 = f4;
        PointF pointF19 = pointF11;
        abstractC33178c.mo24501h();
        if (z) {
            interpolator = f90270a;
            t = t2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = m24983b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                m24983b = m24983b(pointF7, pointF9);
                m24983b2 = m24983b(pointF8, pointF10);
                t = t3;
                interpolator = null;
                if (m24983b == null && m24983b2 != null) {
                    pointF = pointF19;
                    keyframe = new Keyframe<>(lottieComposition, t2, t, m24983b, m24983b2, f15, null);
                } else {
                    pointF = pointF19;
                    keyframe = new Keyframe<>(lottieComposition, t2, t, interpolator, f15, null);
                }
                keyframe.f91844o = pointF;
                keyframe.f91845p = pointF18;
                return keyframe;
            } else {
                interpolator = f90270a;
            }
            t = t3;
        }
        m24983b = null;
        m24983b2 = null;
        if (m24983b == null) {
        }
        pointF = pointF19;
        keyframe = new Keyframe<>(lottieComposition, t2, t, interpolator, f15, null);
        keyframe.f91844o = pointF;
        keyframe.f91845p = pointF18;
        return keyframe;
    }

    /* renamed from: f */
    private static <T> Keyframe<T> m24979f(AbstractC33178c abstractC33178c, float f, ValueParser<T> valueParser) throws IOException {
        return new Keyframe<>(valueParser.mo24962a(abstractC33178c, f));
    }

    /* renamed from: g */
    private static SparseArrayCompat<WeakReference<Interpolator>> m24978g() {
        if (f90271b == null) {
            f90271b = new SparseArrayCompat<>();
        }
        return f90271b;
    }

    /* renamed from: h */
    private static void m24977h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            f90271b.put(i, weakReference);
        }
    }
}
