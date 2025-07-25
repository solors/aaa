package com.bytedance.adsdk.ugeno.yoga;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.yDt */
/* loaded from: classes3.dex */
public class C7156yDt extends YogaNodeJNIBase {
    /* renamed from: PX */
    public void m89846PX() {
        long j = this.f15375bg;
        if (j != 0) {
            this.f15375bg = 0L;
            YogaNative.jni_YGNodeDeallocateJNI(j);
        }
    }

    protected void finalize() throws Throwable {
        try {
            m89846PX();
        } finally {
            super.finalize();
        }
    }
}
