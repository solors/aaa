package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.C7056IL;
import com.bytedance.adsdk.ugeno.core.C7078eqN;
import com.bytedance.adsdk.ugeno.core.InterfaceC7071bX;
import com.bytedance.adsdk.ugeno.core.p217IL.InterfaceC7058bX;
import com.bytedance.adsdk.ugeno.eqN.C7101bg;
import com.bytedance.adsdk.ugeno.eqN.C7111ldr;
import com.bytedance.adsdk.ugeno.eqN.InterfaceC7109eqN;
import com.bytedance.adsdk.ugeno.p213bX.InterfaceC7034bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.ugeno.eqN */
/* loaded from: classes3.dex */
public class C7085eqN {

    /* renamed from: bg */
    private static volatile C7085eqN f15239bg;

    /* renamed from: IL */
    private List<C7056IL> f15240IL;

    /* renamed from: bX */
    private InterfaceC7071bX f15241bX;
    private InterfaceC7036bg eqN;
    private InterfaceC7058bX ldr;

    /* renamed from: zx */
    private InterfaceC7034bg f15242zx;

    private C7085eqN() {
    }

    /* renamed from: bg */
    public static C7085eqN m90061bg() {
        if (f15239bg == null) {
            synchronized (C7085eqN.class) {
                if (f15239bg == null) {
                    f15239bg = new C7085eqN();
                }
            }
        }
        return f15239bg;
    }

    /* renamed from: zx */
    private void m90057zx() {
        ArrayList arrayList = new ArrayList();
        this.f15240IL = arrayList;
        InterfaceC7071bX interfaceC7071bX = this.f15241bX;
        if (interfaceC7071bX != null) {
            arrayList.addAll(interfaceC7071bX.mo84937bg());
        }
        C7078eqN.m90092bg(this.f15240IL);
    }

    /* renamed from: IL */
    public InterfaceC7036bg m90063IL() {
        return this.eqN;
    }

    /* renamed from: bX */
    public InterfaceC7034bg m90062bX() {
        return this.f15242zx;
    }

    public InterfaceC7058bX eqN() {
        return this.ldr;
    }

    /* renamed from: bg */
    public void m90060bg(Context context, InterfaceC7071bX interfaceC7071bX, InterfaceC7036bg interfaceC7036bg) {
        this.f15241bX = interfaceC7071bX;
        this.eqN = interfaceC7036bg;
        m90057zx();
    }

    /* renamed from: bg */
    public void m90059bg(InterfaceC7034bg interfaceC7034bg) {
        this.f15242zx = interfaceC7034bg;
    }

    /* renamed from: bg */
    public void m90058bg(InterfaceC7109eqN interfaceC7109eqN) {
        ArrayList arrayList = new ArrayList(new C7101bg().mo90026bg());
        if (interfaceC7109eqN != null) {
            arrayList.addAll(interfaceC7109eqN.mo90026bg());
        }
        C7111ldr.m90024bg(arrayList);
    }
}
