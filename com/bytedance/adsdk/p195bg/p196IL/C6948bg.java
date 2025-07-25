package com.bytedance.adsdk.p195bg.p196IL;

import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.AbstractC6946ldr;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6938IL;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6939Kg;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6940WR;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6941bX;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6942bg;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6943eo;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6944eqN;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6945iR;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.C6947zx;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6958IL;
import com.bytedance.adsdk.p195bg.p204bg.C6972IL;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.bg */
/* loaded from: classes3.dex */
public class C6948bg {

    /* renamed from: bg */
    private static final InterfaceC6937bg f14830bg;

    /* renamed from: IL */
    private final InterfaceC6937bg f14831IL;

    /* renamed from: bX */
    private InterfaceC6913bg f14832bX;
    private Deque<InterfaceC6913bg> eqN = new LinkedList();

    /* renamed from: zx */
    private String f14833zx;

    static {
        int i = 8;
        AbstractC6946ldr[] abstractC6946ldrArr = {new C6943eo(), new C6944eqN(), new C6940WR(), new C6938IL(), new C6947zx(), new C6942bg(), new C6945iR(), new C6941bX(), new C6939Kg()};
        final InterfaceC6937bg interfaceC6937bg = new InterfaceC6937bg() { // from class: com.bytedance.adsdk.bg.IL.bg.1
            @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg
            /* renamed from: bg */
            public int mo90458bg(String str, int i2, Deque<InterfaceC6913bg> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final AbstractC6946ldr abstractC6946ldr = abstractC6946ldrArr[i];
            i--;
            interfaceC6937bg = new InterfaceC6937bg() { // from class: com.bytedance.adsdk.bg.IL.bg.2
                @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg
                /* renamed from: bg */
                public int mo90458bg(String str, int i2, Deque<InterfaceC6913bg> deque) {
                    return AbstractC6946ldr.this.mo90463bg(str, i2, deque, interfaceC6937bg);
                }
            };
        }
        f14830bg = interfaceC6937bg;
    }

    private C6948bg(String str, InterfaceC6937bg interfaceC6937bg) {
        this.f14831IL = interfaceC6937bg;
        this.f14833zx = str;
        try {
            m90462bg();
        } catch (Exception e) {
            throw new C6972IL(str, e);
        }
    }

    /* renamed from: bg */
    public static C6948bg m90461bg(String str) {
        return new C6948bg(str, f14830bg);
    }

    /* renamed from: bg */
    private void m90462bg() {
        int length = this.f14833zx.length();
        int i = 0;
        while (i < length) {
            int mo90458bg = this.f14831IL.mo90458bg(this.f14833zx, i, this.eqN);
            if (mo90458bg == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.f14833zx.substring(0, i));
            }
            i = mo90458bg;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            InterfaceC6913bg pollFirst = this.eqN.pollFirst();
            if (pollFirst != null) {
                arrayList.add(0, pollFirst);
            } else {
                this.f14832bX = C6958IL.m90441bg(arrayList, this.f14833zx, i);
                this.eqN = null;
                return;
            }
        }
    }

    /* renamed from: bg */
    public <T> T m90459bg(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("default_key", jSONObject);
        return (T) m90460bg(hashMap);
    }

    /* renamed from: bg */
    public <T> T m90460bg(Map<String, JSONObject> map) {
        return (T) this.f14832bX.mo90468bg(map);
    }
}
