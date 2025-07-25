package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.graphics.Path;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6709Kg;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6730yDt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.Kg */
/* loaded from: classes3.dex */
public class C6773Kg {

    /* renamed from: IL */
    private final List<AbstractC6781bg<Integer, Integer>> f14483IL;

    /* renamed from: bX */
    private final List<C6709Kg> f14484bX;

    /* renamed from: bg */
    private final List<AbstractC6781bg<C6730yDt, Path>> f14485bg;

    public C6773Kg(List<C6709Kg> list) {
        this.f14484bX = list;
        this.f14485bg = new ArrayList(list.size());
        this.f14483IL = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f14485bg.add(list.get(i).m91065IL().mo90885bg());
            this.f14483IL.add(list.get(i).m91064bX().mo90885bg());
        }
    }

    /* renamed from: IL */
    public List<AbstractC6781bg<C6730yDt, Path>> m90858IL() {
        return this.f14485bg;
    }

    /* renamed from: bX */
    public List<AbstractC6781bg<Integer, Integer>> m90857bX() {
        return this.f14483IL;
    }

    /* renamed from: bg */
    public List<C6709Kg> m90856bg() {
        return this.f14484bX;
    }
}
