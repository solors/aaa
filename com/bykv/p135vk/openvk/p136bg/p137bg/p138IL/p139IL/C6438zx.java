package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p140IL.C6378bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.C6400IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.C6401bX;
import com.bytedance.sdk.component.utils.C7741PX;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.zx */
/* loaded from: classes3.dex */
public class C6438zx {

    /* renamed from: IL */
    static volatile C6401bX f13431IL;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: VB */
    private static volatile Context f13433VB;

    /* renamed from: WR */
    public static volatile Integer f13434WR;

    /* renamed from: bg */
    static volatile C6400IL f13436bg;

    /* renamed from: eo */
    private static volatile C6378bX f13437eo;
    public static volatile boolean eqN;
    static volatile boolean ldr;

    /* renamed from: bX */
    public static final boolean f13435bX = C7741PX.eqN();

    /* renamed from: zx */
    static volatile boolean f13439zx = true;

    /* renamed from: iR */
    static volatile int f13438iR = 0;

    /* renamed from: Kg */
    public static volatile int f13432Kg = 3;

    /* renamed from: IL */
    public static void m91957IL(boolean z) {
        ldr = z;
    }

    /* renamed from: bX */
    public static C6400IL m91956bX() {
        return f13436bg;
    }

    /* renamed from: bg */
    public static Context m91955bg() {
        return f13433VB;
    }

    /* renamed from: IL */
    public static C6401bX m91958IL() {
        return f13431IL;
    }

    /* renamed from: bg */
    public static void m91952bg(boolean z) {
        f13439zx = z;
    }

    /* renamed from: bg */
    public static void m91954bg(int i) {
        f13438iR = i;
    }

    /* renamed from: bg */
    public static void m91953bg(C6401bX c6401bX, Context context) {
        if (c6401bX != null && context != null) {
            f13433VB = context.getApplicationContext();
            if (f13431IL != null) {
                return;
            }
            if (f13436bg == null) {
                f13431IL = c6401bX;
                f13437eo = C6378bX.m92085bg(context);
                f13431IL.m92040bg(new C6401bX.InterfaceC6409bg() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.zx.1
                    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.C6401bX.InterfaceC6409bg
                    /* renamed from: bg */
                    public void mo91951bg(String str) {
                        if (C6438zx.f13435bX) {
                            Log.i("TAG_PROXY_DiskLruCache", "new cache created: ".concat(String.valueOf(str)));
                        }
                    }

                    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.C6401bX.InterfaceC6409bg
                    /* renamed from: bg */
                    public void mo91950bg(Set<String> set) {
                        C6438zx.f13437eo.m92080bg(set, 0);
                        if (C6438zx.f13435bX) {
                            Log.i("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(String.valueOf(set)));
                        }
                    }
                });
                C6428ldr m91986bg = C6428ldr.m91986bg();
                m91986bg.m91983bg(c6401bX);
                m91986bg.m91984bg(f13437eo);
                C6412eqN m92026bX = C6412eqN.m92026bX();
                m92026bX.m92022bg(c6401bX);
                m92026bX.m92023bg(f13437eo);
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
    }
}
