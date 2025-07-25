package com.bytedance.sdk.component.p257iR.p258IL;

import android.text.TextUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7215eqN;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.sdk.component.iR.IL.bX */
/* loaded from: classes3.dex */
public abstract class AbstractC7611bX {

    /* renamed from: bX */
    protected AbstractC7194VB f16596bX;
    int ldr;

    /* renamed from: zx */
    String f16598zx;
    protected String eqN = null;

    /* renamed from: iR */
    protected final Map<String, String> f16597iR = new HashMap();

    /* renamed from: Kg */
    protected String f16594Kg = null;

    /* renamed from: WR */
    protected boolean f16595WR = false;

    public AbstractC7611bX(AbstractC7194VB abstractC7194VB) {
        this.f16596bX = abstractC7194VB;
        try {
            m88399bX(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: IL */
    public void m88402IL(String str) {
        this.f16594Kg = str;
    }

    /* renamed from: bX */
    public void m88399bX(String str) {
        this.eqN = str;
    }

    /* renamed from: bg */
    public void m88396bg(String str) {
        this.f16598zx = str;
    }

    public void eqN(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f16597iR.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: IL */
    public void m88401IL(String str, String str2) {
        this.f16597iR.put(str, str2);
    }

    /* renamed from: bX */
    public String m88400bX() {
        return this.eqN;
    }

    /* renamed from: bg */
    public void m88398bg(int i) {
        this.ldr = i;
    }

    /* renamed from: IL */
    public void mo88395IL() {
        AbstractC7194VB abstractC7194VB;
        if (this.eqN == null || (abstractC7194VB = this.f16596bX) == null) {
            return;
        }
        AbstractC7215eqN mo89616bg = abstractC7194VB.mo89616bg();
        synchronized (mo89616bg) {
            for (InterfaceC7177IL interfaceC7177IL : mo89616bg.mo89603bX()) {
                if (this.eqN.equals(interfaceC7177IL.mo89626bg().mo89644bg())) {
                    interfaceC7177IL.mo89627bX();
                }
            }
            for (InterfaceC7177IL interfaceC7177IL2 : mo89616bg.eqN()) {
                if (this.eqN.equals(interfaceC7177IL2.mo89626bg().mo89644bg())) {
                    interfaceC7177IL2.mo89627bX();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public void m88397bg(AbstractC7191Ta.C7192bg c7192bg) {
        if (c7192bg != null && this.f16597iR.size() > 0) {
            for (Map.Entry<String, String> entry : this.f16597iR.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    c7192bg.m89657IL(key, value);
                }
            }
        }
    }
}
