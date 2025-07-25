package p035c0;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;
import p1032x.ContentGroup;
import p1032x.InterfaceC44659c;
import p629d0.BaseLayer;

/* renamed from: c0.n */
/* loaded from: classes2.dex */
public class ShapeGroup implements ContentModel {

    /* renamed from: a */
    private final String f1793a;

    /* renamed from: b */
    private final List<ContentModel> f1794b;

    /* renamed from: c */
    private final boolean f1795c;

    public ShapeGroup(String str, List<ContentModel> list, boolean z) {
        this.f1793a = str;
        this.f1794b = list;
        this.f1795c = z;
    }

    @Override // p035c0.ContentModel
    /* renamed from: a */
    public InterfaceC44659c mo103692a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new ContentGroup(lottieDrawable, baseLayer, this);
    }

    /* renamed from: b */
    public List<ContentModel> m103710b() {
        return this.f1794b;
    }

    /* renamed from: c */
    public String m103709c() {
        return this.f1793a;
    }

    /* renamed from: d */
    public boolean m103708d() {
        return this.f1795c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f1793a + "' Shapes: " + Arrays.toString(this.f1794b.toArray()) + '}';
    }
}
