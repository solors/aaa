package p1048y;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p035c0.Mask;
import p035c0.ShapeData;

/* renamed from: y.g */
/* loaded from: classes2.dex */
public class MaskKeyframeAnimation {

    /* renamed from: a */
    private final List<BaseKeyframeAnimation<ShapeData, Path>> f118359a;

    /* renamed from: b */
    private final List<BaseKeyframeAnimation<Integer, Integer>> f118360b;

    /* renamed from: c */
    private final List<Mask> f118361c;

    public MaskKeyframeAnimation(List<Mask> list) {
        this.f118361c = list;
        this.f118359a = new ArrayList(list.size());
        this.f118360b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f118359a.add(list.get(i).m103748b().mo103974a());
            this.f118360b.add(list.get(i).m103747c().mo103974a());
        }
    }

    /* renamed from: a */
    public List<BaseKeyframeAnimation<ShapeData, Path>> m1136a() {
        return this.f118359a;
    }

    /* renamed from: b */
    public List<Mask> m1135b() {
        return this.f118361c;
    }

    /* renamed from: c */
    public List<BaseKeyframeAnimation<Integer, Integer>> m1134c() {
        return this.f118360b;
    }
}
