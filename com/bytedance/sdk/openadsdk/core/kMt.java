package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class kMt {

    /* renamed from: bg */
    public static ConcurrentHashMap<Integer, kMt> f19756bg = new ConcurrentHashMap<>();

    /* renamed from: IL */
    private String f19757IL = "";

    /* renamed from: bX */
    private String f19758bX = "";
    private int eqN;
    private String ldr;

    /* renamed from: zx */
    private int f19759zx;

    private void ldr() {
        this.f19757IL = "";
        this.f19758bX = "";
        this.eqN = 0;
        this.f19759zx = 0;
    }

    /* renamed from: IL */
    public String m84376IL() {
        return this.f19757IL;
    }

    /* renamed from: bX */
    public String m84373bX() {
        return this.f19758bX;
    }

    /* renamed from: bg */
    public String m84370bg() {
        return this.ldr;
    }

    public int eqN() {
        return this.eqN;
    }

    /* renamed from: zx */
    public int m84367zx() {
        return this.f19759zx;
    }

    /* renamed from: bX */
    public static void m84372bX(int i) {
        kMt kmt;
        if (i == 0) {
            return;
        }
        if (f19756bg == null) {
            f19756bg = new ConcurrentHashMap<>();
        }
        if (!f19756bg.containsKey(Integer.valueOf(i)) || (kmt = f19756bg.get(Integer.valueOf(i))) == null) {
            return;
        }
        kmt.m84375IL(1);
    }

    /* renamed from: IL */
    public void m84375IL(int i) {
        this.f19759zx = i;
    }

    /* renamed from: bg */
    public void m84369bg(int i) {
        this.eqN = i;
    }

    /* renamed from: IL */
    public static void m84374IL(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null || TextUtils.isEmpty(abstractC8967tuV.mo84097Ny())) {
            return;
        }
        Integer valueOf = Integer.valueOf(abstractC8967tuV.IGR());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (f19756bg == null) {
            f19756bg = new ConcurrentHashMap<>();
        }
        kMt kmt = f19756bg.containsKey(valueOf) ? f19756bg.get(valueOf) : null;
        if (kmt == null) {
            kmt = new kMt();
        }
        String waE = abstractC8967tuV.waE();
        if (TextUtils.isEmpty(waE) || !waE.equals(kmt.m84370bg())) {
            kmt.ldr();
            kmt.m84368bg(abstractC8967tuV);
            f19756bg.put(valueOf, kmt);
        }
    }

    /* renamed from: bg */
    public void m84368bg(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV != null) {
            String waE = abstractC8967tuV.waE();
            if (!TextUtils.isEmpty(waE)) {
                this.ldr = waE;
            }
            String GvG = abstractC8967tuV.GvG();
            if (TextUtils.isEmpty(GvG) && abstractC8967tuV.HXG()) {
                GvG = abstractC8967tuV.mo84012hi().m85466WR();
            }
            if (!TextUtils.isEmpty(GvG)) {
                String[] split = GvG.split(RemoteSettings.FORWARD_SLASH_STRING);
                if (split.length >= 3) {
                    this.f19757IL = split[2];
                }
            }
            if (abstractC8967tuV.RiO() == null || TextUtils.isEmpty(abstractC8967tuV.RiO().m84265bX())) {
                return;
            }
            this.f19758bX = abstractC8967tuV.RiO().m84265bX();
        }
    }

    /* renamed from: bX */
    public static void m84371bX(AbstractC8967tuV abstractC8967tuV) {
        kMt kmt;
        if (abstractC8967tuV == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(abstractC8967tuV.IGR());
        if (valueOf.intValue() == 0) {
            return;
        }
        if (f19756bg == null) {
            f19756bg = new ConcurrentHashMap<>();
        }
        if (!f19756bg.containsKey(valueOf) || (kmt = f19756bg.get(valueOf)) == null) {
            return;
        }
        kmt.m84369bg(1);
    }
}
