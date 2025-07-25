package p1048y;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.List;
import p707i0.Keyframe;
import p707i0.LottieValueCallback;

/* renamed from: y.a */
/* loaded from: classes2.dex */
public abstract class BaseKeyframeAnimation<K, A> {

    /* renamed from: c */
    private final InterfaceC44992d<K> f118346c;
    @Nullable

    /* renamed from: e */
    protected LottieValueCallback<A> f118348e;

    /* renamed from: a */
    final List<InterfaceC44990b> f118344a = new ArrayList(1);

    /* renamed from: b */
    private boolean f118345b = false;

    /* renamed from: d */
    protected float f118347d = 0.0f;
    @Nullable

    /* renamed from: f */
    private A f118349f = null;

    /* renamed from: g */
    private float f118350g = -1.0f;

    /* renamed from: h */
    private float f118351h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC44990b {
        /* renamed from: e */
        void mo1153e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y.a$c */
    /* loaded from: classes2.dex */
    public static final class C44991c<T> implements InterfaceC44992d<T> {
        private C44991c() {
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: a */
        public Keyframe<T> mo1151a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: b */
        public float mo1150b() {
            return 0.0f;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: c */
        public boolean mo1149c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: d */
        public boolean mo1148d(float f) {
            return false;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: e */
        public float mo1147e() {
            return 1.0f;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y.a$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC44992d<T> {
        /* renamed from: a */
        Keyframe<T> mo1151a();

        @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        /* renamed from: b */
        float mo1150b();

        /* renamed from: c */
        boolean mo1149c(float f);

        /* renamed from: d */
        boolean mo1148d(float f);

        @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
        /* renamed from: e */
        float mo1147e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y.a$e */
    /* loaded from: classes2.dex */
    public static final class C44993e<T> implements InterfaceC44992d<T> {

        /* renamed from: a */
        private final List<? extends Keyframe<T>> f118352a;

        /* renamed from: c */
        private Keyframe<T> f118354c = null;

        /* renamed from: d */
        private float f118355d = -1.0f;
        @NonNull

        /* renamed from: b */
        private Keyframe<T> f118353b = m1152f(0.0f);

        C44993e(List<? extends Keyframe<T>> list) {
            this.f118352a = list;
        }

        /* renamed from: f */
        private Keyframe<T> m1152f(float f) {
            List<? extends Keyframe<T>> list = this.f118352a;
            Keyframe<T> keyframe = list.get(list.size() - 1);
            if (f >= keyframe.m23252e()) {
                return keyframe;
            }
            for (int size = this.f118352a.size() - 2; size >= 1; size--) {
                Keyframe<T> keyframe2 = this.f118352a.get(size);
                if (this.f118353b != keyframe2 && keyframe2.m23256a(f)) {
                    return keyframe2;
                }
            }
            return this.f118352a.get(0);
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        @NonNull
        /* renamed from: a */
        public Keyframe<T> mo1151a() {
            return this.f118353b;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: b */
        public float mo1150b() {
            return this.f118352a.get(0).m23252e();
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: c */
        public boolean mo1149c(float f) {
            Keyframe<T> keyframe = this.f118354c;
            Keyframe<T> keyframe2 = this.f118353b;
            if (keyframe == keyframe2 && this.f118355d == f) {
                return true;
            }
            this.f118354c = keyframe2;
            this.f118355d = f;
            return false;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: d */
        public boolean mo1148d(float f) {
            if (this.f118353b.m23256a(f)) {
                return !this.f118353b.m23249h();
            }
            this.f118353b = m1152f(f);
            return true;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: e */
        public float mo1147e() {
            List<? extends Keyframe<T>> list = this.f118352a;
            return list.get(list.size() - 1).m23255b();
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: y.a$f */
    /* loaded from: classes2.dex */
    public static final class C44994f<T> implements InterfaceC44992d<T> {
        @NonNull

        /* renamed from: a */
        private final Keyframe<T> f118356a;

        /* renamed from: b */
        private float f118357b = -1.0f;

        C44994f(List<? extends Keyframe<T>> list) {
            this.f118356a = list.get(0);
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: a */
        public Keyframe<T> mo1151a() {
            return this.f118356a;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: b */
        public float mo1150b() {
            return this.f118356a.m23252e();
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: c */
        public boolean mo1149c(float f) {
            if (this.f118357b == f) {
                return true;
            }
            this.f118357b = f;
            return false;
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: d */
        public boolean mo1148d(float f) {
            return !this.f118356a.m23249h();
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        /* renamed from: e */
        public float mo1147e() {
            return this.f118356a.m23255b();
        }

        @Override // p1048y.BaseKeyframeAnimation.InterfaceC44992d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        this.f118346c = m1154o(list);
    }

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    /* renamed from: g */
    private float m1157g() {
        if (this.f118350g == -1.0f) {
            this.f118350g = this.f118346c.mo1150b();
        }
        return this.f118350g;
    }

    /* renamed from: o */
    private static <T> InterfaceC44992d<T> m1154o(List<? extends Keyframe<T>> list) {
        if (list.isEmpty()) {
            return new C44991c();
        }
        if (list.size() == 1) {
            return new C44994f(list);
        }
        return new C44993e(list);
    }

    /* renamed from: a */
    public void m1162a(InterfaceC44990b interfaceC44990b) {
        this.f118344a.add(interfaceC44990b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Keyframe<K> m1161b() {
        L.m103402a("BaseKeyframeAnimation#getCurrentKeyframe");
        Keyframe<K> mo1151a = this.f118346c.mo1151a();
        L.m103401b("BaseKeyframeAnimation#getCurrentKeyframe");
        return mo1151a;
    }

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    /* renamed from: c */
    float mo1110c() {
        if (this.f118351h == -1.0f) {
            this.f118351h = this.f118346c.mo1147e();
        }
        return this.f118351h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public float m1160d() {
        Keyframe<K> m1161b = m1161b();
        if (m1161b.m23249h()) {
            return 0.0f;
        }
        return m1161b.f91833d.getInterpolation(m1159e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m1159e() {
        if (this.f118345b) {
            return 0.0f;
        }
        Keyframe<K> m1161b = m1161b();
        if (m1161b.m23249h()) {
            return 0.0f;
        }
        return (this.f118347d - m1161b.m23252e()) / (m1161b.m23255b() - m1161b.m23252e());
    }

    /* renamed from: f */
    public float m1158f() {
        return this.f118347d;
    }

    /* renamed from: h */
    public A mo1109h() {
        A mo1108i;
        float m1159e = m1159e();
        if (this.f118348e == null && this.f118346c.mo1149c(m1159e)) {
            return this.f118349f;
        }
        Keyframe<K> m1161b = m1161b();
        Interpolator interpolator = m1161b.f91834e;
        if (interpolator != null && m1161b.f91835f != null) {
            mo1108i = mo1130j(m1161b, m1159e, interpolator.getInterpolation(m1159e), m1161b.f91835f.getInterpolation(m1159e));
        } else {
            mo1108i = mo1108i(m1161b, m1160d());
        }
        this.f118349f = mo1108i;
        return mo1108i;
    }

    /* renamed from: i */
    abstract A mo1108i(Keyframe<K> keyframe, float f);

    /* renamed from: j */
    protected A mo1130j(Keyframe<K> keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo1107k() {
        for (int i = 0; i < this.f118344a.size(); i++) {
            this.f118344a.get(i).mo1153e();
        }
    }

    /* renamed from: l */
    public void m1156l() {
        this.f118345b = true;
    }

    /* renamed from: m */
    public void mo1106m(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        if (this.f118346c.isEmpty()) {
            return;
        }
        if (f < m1157g()) {
            f = m1157g();
        } else if (f > mo1110c()) {
            f = mo1110c();
        }
        if (f == this.f118347d) {
            return;
        }
        this.f118347d = f;
        if (this.f118346c.mo1148d(f)) {
            mo1107k();
        }
    }

    /* renamed from: n */
    public void m1155n(@Nullable LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.f118348e;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.m23245c(null);
        }
        this.f118348e = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.m23245c(this);
        }
    }
}
