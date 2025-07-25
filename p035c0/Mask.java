package p035c0;

import p023b0.AnimatableIntegerValue;
import p023b0.AnimatableShapeValue;

/* renamed from: c0.g */
/* loaded from: classes2.dex */
public class Mask {

    /* renamed from: a */
    private final EnumC3405a f1742a;

    /* renamed from: b */
    private final AnimatableShapeValue f1743b;

    /* renamed from: c */
    private final AnimatableIntegerValue f1744c;

    /* renamed from: d */
    private final boolean f1745d;

    /* compiled from: Mask.java */
    /* renamed from: c0.g$a */
    /* loaded from: classes2.dex */
    public enum EnumC3405a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(EnumC3405a enumC3405a, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.f1742a = enumC3405a;
        this.f1743b = animatableShapeValue;
        this.f1744c = animatableIntegerValue;
        this.f1745d = z;
    }

    /* renamed from: a */
    public EnumC3405a m103749a() {
        return this.f1742a;
    }

    /* renamed from: b */
    public AnimatableShapeValue m103748b() {
        return this.f1743b;
    }

    /* renamed from: c */
    public AnimatableIntegerValue m103747c() {
        return this.f1744c;
    }

    /* renamed from: d */
    public boolean m103746d() {
        return this.f1745d;
    }
}
