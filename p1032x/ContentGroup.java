package p1032x;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import p001a0.KeyPath;
import p001a0.KeyPathElement;
import p023b0.AnimatableTransform;
import p035c0.ContentModel;
import p035c0.ShapeGroup;
import p1016w.LPaint;
import p1048y.BaseKeyframeAnimation;
import p1048y.TransformKeyframeAnimation;
import p629d0.BaseLayer;
import p690h0.C33454j;
import p707i0.LottieValueCallback;

/* renamed from: x.d */
/* loaded from: classes2.dex */
public class ContentGroup implements DrawingContent, PathContent, BaseKeyframeAnimation.InterfaceC44990b, KeyPathElement {

    /* renamed from: a */
    private Paint f117191a;

    /* renamed from: b */
    private RectF f117192b;

    /* renamed from: c */
    private final Matrix f117193c;

    /* renamed from: d */
    private final Path f117194d;

    /* renamed from: e */
    private final RectF f117195e;

    /* renamed from: f */
    private final String f117196f;

    /* renamed from: g */
    private final boolean f117197g;

    /* renamed from: h */
    private final List<InterfaceC44659c> f117198h;

    /* renamed from: i */
    private final LottieDrawable f117199i;
    @Nullable

    /* renamed from: j */
    private List<PathContent> f117200j;
    @Nullable

    /* renamed from: k */
    private TransformKeyframeAnimation f117201k;

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeGroup shapeGroup) {
        this(lottieDrawable, baseLayer, shapeGroup.m103709c(), shapeGroup.m103708d(), m2108b(lottieDrawable, baseLayer, shapeGroup.m103710b()), m2107h(shapeGroup.m103710b()));
    }

    /* renamed from: b */
    private static List<InterfaceC44659c> m2108b(LottieDrawable lottieDrawable, BaseLayer baseLayer, List<ContentModel> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC44659c mo103692a = list.get(i).mo103692a(lottieDrawable, baseLayer);
            if (mo103692a != null) {
                arrayList.add(mo103692a);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: h */
    static AnimatableTransform m2107h(List<ContentModel> list) {
        for (int i = 0; i < list.size(); i++) {
            ContentModel contentModel = list.get(i);
            if (contentModel instanceof AnimatableTransform) {
                return (AnimatableTransform) contentModel;
            }
        }
        return null;
    }

    /* renamed from: k */
    private boolean m2104k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f117198h.size(); i2++) {
            if ((this.f117198h.get(i2) instanceof DrawingContent) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p1032x.DrawingContent
    /* renamed from: a */
    public void mo2088a(RectF rectF, Matrix matrix, boolean z) {
        this.f117193c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f117201k;
        if (transformKeyframeAnimation != null) {
            this.f117193c.preConcat(transformKeyframeAnimation.m1115f());
        }
        this.f117195e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f117198h.size() - 1; size >= 0; size--) {
            InterfaceC44659c interfaceC44659c = this.f117198h.get(size);
            if (interfaceC44659c instanceof DrawingContent) {
                ((DrawingContent) interfaceC44659c).mo2088a(this.f117195e, this.f117193c, z);
                rectF.union(this.f117195e);
            }
        }
    }

    @Override // p1032x.DrawingContent
    /* renamed from: c */
    public void mo2084c(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int intValue;
        if (this.f117197g) {
            return;
        }
        this.f117193c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f117201k;
        if (transformKeyframeAnimation != null) {
            this.f117193c.preConcat(transformKeyframeAnimation.m1115f());
            if (this.f117201k.m1113h() == null) {
                intValue = 100;
            } else {
                intValue = this.f117201k.m1113h().mo1109h().intValue();
            }
            i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
        }
        if (this.f117199i.m103329O() && m2104k() && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f117192b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo2088a(this.f117192b, this.f117193c, true);
            this.f117191a.setAlpha(i);
            C33454j.m23850m(canvas, this.f117192b, this.f117191a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f117198h.size() - 1; size >= 0; size--) {
            InterfaceC44659c interfaceC44659c = this.f117198h.get(size);
            if (interfaceC44659c instanceof DrawingContent) {
                ((DrawingContent) interfaceC44659c).mo2084c(canvas, this.f117193c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // p001a0.KeyPathElement
    /* renamed from: d */
    public <T> void mo2083d(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f117201k;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.m1118c(t, lottieValueCallback);
        }
    }

    @Override // p1048y.BaseKeyframeAnimation.InterfaceC44990b
    /* renamed from: e */
    public void mo1153e() {
        this.f117199i.invalidateSelf();
    }

    @Override // p1032x.InterfaceC44659c
    /* renamed from: f */
    public void mo2080f(List<InterfaceC44659c> list, List<InterfaceC44659c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f117198h.size());
        arrayList.addAll(list);
        for (int size = this.f117198h.size() - 1; size >= 0; size--) {
            InterfaceC44659c interfaceC44659c = this.f117198h.get(size);
            interfaceC44659c.mo2080f(arrayList, this.f117198h.subList(0, size));
            arrayList.add(interfaceC44659c);
        }
    }

    @Override // p001a0.KeyPathElement
    /* renamed from: g */
    public void mo2086g(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        if (!keyPath.m105887g(getName(), i) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            keyPath2 = keyPath2.m105893a(getName());
            if (keyPath.m105891c(getName(), i)) {
                list.add(keyPath2.m105885i(this));
            }
        }
        if (keyPath.m105886h(getName(), i)) {
            int m105889e = i + keyPath.m105889e(getName(), i);
            for (int i2 = 0; i2 < this.f117198h.size(); i2++) {
                InterfaceC44659c interfaceC44659c = this.f117198h.get(i2);
                if (interfaceC44659c instanceof KeyPathElement) {
                    ((KeyPathElement) interfaceC44659c).mo2086g(keyPath, m105889e, list, keyPath2);
                }
            }
        }
    }

    @Override // p1032x.InterfaceC44659c
    public String getName() {
        return this.f117196f;
    }

    @Override // p1032x.PathContent
    public Path getPath() {
        this.f117193c.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f117201k;
        if (transformKeyframeAnimation != null) {
            this.f117193c.set(transformKeyframeAnimation.m1115f());
        }
        this.f117194d.reset();
        if (this.f117197g) {
            return this.f117194d;
        }
        for (int size = this.f117198h.size() - 1; size >= 0; size--) {
            InterfaceC44659c interfaceC44659c = this.f117198h.get(size);
            if (interfaceC44659c instanceof PathContent) {
                this.f117194d.addPath(((PathContent) interfaceC44659c).getPath(), this.f117193c);
            }
        }
        return this.f117194d;
    }

    /* renamed from: i */
    public List<PathContent> m2106i() {
        if (this.f117200j == null) {
            this.f117200j = new ArrayList();
            for (int i = 0; i < this.f117198h.size(); i++) {
                InterfaceC44659c interfaceC44659c = this.f117198h.get(i);
                if (interfaceC44659c instanceof PathContent) {
                    this.f117200j.add((PathContent) interfaceC44659c);
                }
            }
        }
        return this.f117200j;
    }

    /* renamed from: j */
    public Matrix m2105j() {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f117201k;
        if (transformKeyframeAnimation != null) {
            return transformKeyframeAnimation.m1115f();
        }
        this.f117193c.reset();
        return this.f117193c;
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z, List<InterfaceC44659c> list, @Nullable AnimatableTransform animatableTransform) {
        this.f117191a = new LPaint();
        this.f117192b = new RectF();
        this.f117193c = new Matrix();
        this.f117194d = new Path();
        this.f117195e = new RectF();
        this.f117196f = str;
        this.f117199i = lottieDrawable;
        this.f117197g = z;
        this.f117198h = list;
        if (animatableTransform != null) {
            TransformKeyframeAnimation m103984b = animatableTransform.m103984b();
            this.f117201k = m103984b;
            m103984b.m1120a(baseLayer);
            this.f117201k.m1119b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC44659c interfaceC44659c = list.get(size);
            if (interfaceC44659c instanceof GreedyContent) {
                arrayList.add((GreedyContent) interfaceC44659c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((GreedyContent) arrayList.get(size2)).mo2087b(list.listIterator(list.size()));
        }
    }
}
