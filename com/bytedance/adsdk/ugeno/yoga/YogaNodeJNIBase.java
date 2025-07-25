package com.bytedance.adsdk.ugeno.yoga;

import com.bytedance.adsdk.ugeno.yoga.p226bg.InterfaceC7150bg;
import java.util.ArrayList;
import java.util.List;

@InterfaceC7150bg
/* loaded from: classes3.dex */
public abstract class YogaNodeJNIBase extends AbstractC7144PX implements Cloneable {

    /* renamed from: IL */
    private YogaNodeJNIBase f15373IL;
    @InterfaceC7150bg
    private float[] arr;

    /* renamed from: bX */
    private List<YogaNodeJNIBase> f15374bX;

    /* renamed from: bg */
    protected long f15375bg;
    private InterfaceC7147WR eqN;

    /* renamed from: iR */
    private boolean f15376iR;
    private Object ldr;
    @InterfaceC7150bg
    private int mLayoutDirection;

    /* renamed from: zx */
    private InterfaceC7148bX f15377zx;

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f15376iR = true;
        if (j != 0) {
            this.f15375bg = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @InterfaceC7150bg
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.f15374bX;
        if (list != null) {
            list.remove(i);
            this.f15374bX.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f15373IL = this;
            return yogaNodeJNIBase.f15375bg;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: Kg */
    public void mo89888Kg(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f15375bg, f);
    }

    /* renamed from: VB */
    public boolean m89887VB() {
        if (this.eqN != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: WR */
    public void mo89885WR(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f15375bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bX */
    public YogaNodeJNIBase mo89876bg(int i) {
        List<YogaNodeJNIBase> list = this.f15374bX;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @InterfaceC7150bg
    public final float baseline(float f, float f2) {
        return this.f15377zx.m89858bg(this, f, f2);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: eo */
    public YogaNodeJNIBase mo89895IL() {
        return this.f15373IL;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: eqN */
    public YogaNodeJNIBase mo89893IL(int i) {
        List<YogaNodeJNIBase> list = this.f15374bX;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.f15373IL = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f15375bg, remove.f15375bg);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: iR */
    public void mo89861iR(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f15375bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    public void ldr(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f15375bg, f);
    }

    @InterfaceC7150bg
    public final long measure(float f, int i, float f2, int i2) {
        if (m89887VB()) {
            return this.eqN.mo89896bg(this, f, EnumC7151eo.m89857bg(i), f2, EnumC7151eo.m89857bg(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: zx */
    public void mo89859zx(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f15375bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: Kg */
    public float mo89889Kg() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: WR */
    public Object mo89886WR() {
        return this.ldr;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public int mo89879bg() {
        List<YogaNodeJNIBase> list = this.f15374bX;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: eo */
    public void mo89863eo(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f15375bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: iR */
    public float mo89862iR() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    public float ldr() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: zx */
    public float mo89860zx() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    /* renamed from: IL */
    private void m89891IL(AbstractC7144PX abstractC7144PX) {
        mo89886WR();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89872bg(AbstractC7144PX abstractC7144PX, int i) {
        if (abstractC7144PX instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC7144PX;
            if (yogaNodeJNIBase.f15373IL == null) {
                if (this.f15374bX == null) {
                    this.f15374bX = new ArrayList(4);
                }
                this.f15374bX.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.f15373IL = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.f15375bg, yogaNodeJNIBase.f15375bg, i);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: IL */
    public void mo89892IL(EnumC7134IL enumC7134IL) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f15375bg, enumC7134IL.m89946bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bX */
    public void mo89881bX(EnumC7134IL enumC7134IL) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f15375bg, enumC7134IL.m89946bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: IL */
    public void mo89894IL(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f15375bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bX */
    public void mo89883bX(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f15375bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: IL */
    public void mo89890IL(EnumC7157zx enumC7157zx, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f15375bg, enumC7157zx.m89845bg(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bX */
    public void mo89880bX(EnumC7157zx enumC7157zx, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f15375bg, enumC7157zx.m89845bg(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    public void eqN(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f15375bg, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bX */
    public void mo89884bX() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f15375bg);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    public void eqN() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f15375bg);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public int mo89873bg(AbstractC7144PX abstractC7144PX) {
        List<YogaNodeJNIBase> list = this.f15374bX;
        if (list == null) {
            return -1;
        }
        return list.indexOf(abstractC7144PX);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89877bg(float f, float f2) {
        m89891IL((AbstractC7144PX) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f15374bX;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.m89891IL(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f15375bg;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f15375bg, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89870bg(EnumC7152eqN enumC7152eqN) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f15375bg, enumC7152eqN.m89856bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89868bg(EnumC7154ldr enumC7154ldr) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f15375bg, enumC7154ldr.m89852bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89869bg(EnumC7153iR enumC7153iR) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f15375bg, enumC7153iR.m89855bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89875bg(EnumC7134IL enumC7134IL) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f15375bg, enumC7134IL.m89946bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89874bg(EnumC7143Lq enumC7143Lq) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f15375bg, enumC7143Lq.m89902bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89867bg(EnumC7155xxp enumC7155xxp) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f15375bg, enumC7155xxp.m89849bg());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89878bg(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f15375bg, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89866bg(EnumC7157zx enumC7157zx, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f15375bg, enumC7157zx.m89845bg(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89871bg(InterfaceC7147WR interfaceC7147WR) {
        this.eqN = interfaceC7147WR;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f15375bg, interfaceC7147WR != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC7144PX
    /* renamed from: bg */
    public void mo89865bg(Object obj) {
        this.ldr = obj;
    }
}
