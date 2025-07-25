package p1032x;

import java.util.ArrayList;
import java.util.List;
import p035c0.ShapeTrimPath;
import p1048y.BaseKeyframeAnimation;
import p629d0.BaseLayer;

/* renamed from: x.s */
/* loaded from: classes2.dex */
public class TrimPathContent implements InterfaceC44659c, BaseKeyframeAnimation.InterfaceC44990b {

    /* renamed from: a */
    private final String f117303a;

    /* renamed from: b */
    private final boolean f117304b;

    /* renamed from: c */
    private final List<BaseKeyframeAnimation.InterfaceC44990b> f117305c = new ArrayList();

    /* renamed from: d */
    private final ShapeTrimPath.EnumC3412a f117306d;

    /* renamed from: e */
    private final BaseKeyframeAnimation<?, Float> f117307e;

    /* renamed from: f */
    private final BaseKeyframeAnimation<?, Float> f117308f;

    /* renamed from: g */
    private final BaseKeyframeAnimation<?, Float> f117309g;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.f117303a = shapeTrimPath.m103690c();
        this.f117304b = shapeTrimPath.m103686g();
        this.f117306d = shapeTrimPath.m103687f();
        BaseKeyframeAnimation<Float, Float> mo103974a = shapeTrimPath.m103688e().mo103974a();
        this.f117307e = mo103974a;
        BaseKeyframeAnimation<Float, Float> mo103974a2 = shapeTrimPath.m103691b().mo103974a();
        this.f117308f = mo103974a2;
        BaseKeyframeAnimation<Float, Float> mo103974a3 = shapeTrimPath.m103689d().mo103974a();
        this.f117309g = mo103974a3;
        baseLayer.m25862i(mo103974a);
        baseLayer.m25862i(mo103974a2);
        baseLayer.m25862i(mo103974a3);
        mo103974a.m1162a(this);
        mo103974a2.m1162a(this);
        mo103974a3.m1162a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2082b(BaseKeyframeAnimation.InterfaceC44990b interfaceC44990b) {
        this.f117305c.add(interfaceC44990b);
    }

    /* renamed from: d */
    public BaseKeyframeAnimation<?, Float> m2081d() {
        return this.f117308f;
    }

    @Override // p1048y.BaseKeyframeAnimation.InterfaceC44990b
    /* renamed from: e */
    public void mo1153e() {
        for (int i = 0; i < this.f117305c.size(); i++) {
            this.f117305c.get(i).mo1153e();
        }
    }

    /* renamed from: g */
    public BaseKeyframeAnimation<?, Float> m2079g() {
        return this.f117309g;
    }

    /* renamed from: h */
    public BaseKeyframeAnimation<?, Float> m2078h() {
        return this.f117307e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public ShapeTrimPath.EnumC3412a m2077i() {
        return this.f117306d;
    }

    /* renamed from: j */
    public boolean m2076j() {
        return this.f117304b;
    }

    @Override // p1032x.InterfaceC44659c
    /* renamed from: f */
    public void mo2080f(List<InterfaceC44659c> list, List<InterfaceC44659c> list2) {
    }
}
