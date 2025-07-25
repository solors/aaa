package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import com.bytedance.adsdk.p195bg.C6975iR;
import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6952IL;
import com.bytedance.adsdk.p195bg.p196IL.eqN.InterfaceC6957zx;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p201bg.C6951bg;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.eo */
/* loaded from: classes3.dex */
public class C6926eo implements InterfaceC6913bg {

    /* renamed from: IL */
    private String f14823IL;

    /* renamed from: bX */
    private C6951bg f14824bX;

    /* renamed from: bg */
    private InterfaceC6913bg[] f14825bg;

    public C6926eo(String str) {
        this.f14823IL = str;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: IL */
    public String mo90470IL() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14823IL);
        sb2.append("(");
        InterfaceC6913bg[] interfaceC6913bgArr = this.f14825bg;
        if (interfaceC6913bgArr != null && interfaceC6913bgArr.length > 0) {
            int i = 0;
            while (true) {
                InterfaceC6913bg[] interfaceC6913bgArr2 = this.f14825bg;
                if (i >= interfaceC6913bgArr2.length) {
                    break;
                }
                sb2.append(interfaceC6913bgArr2[i].mo90470IL());
                sb2.append(",");
                i++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* renamed from: bg */
    public void m90474bg(InterfaceC6913bg[] interfaceC6913bgArr) {
        this.f14825bg = interfaceC6913bgArr;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        C6951bg c6951bg = new C6951bg();
        this.f14824bX = c6951bg;
        c6951bg.m90455bg(this.f14823IL);
        Object[] objArr = new Object[this.f14825bg.length];
        int i = 0;
        while (true) {
            InterfaceC6913bg[] interfaceC6913bgArr = this.f14825bg;
            if (i < interfaceC6913bgArr.length) {
                InterfaceC6913bg interfaceC6913bg = interfaceC6913bgArr[i];
                if (interfaceC6913bg != null) {
                    objArr[i] = interfaceC6913bg.mo90468bg(map);
                }
                i++;
            } else {
                this.f14824bX.m90454bg(objArr);
                return C6975iR.m90393bg(this.f14823IL).mo90392bg(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public InterfaceC6957zx mo90469bg() {
        return EnumC6952IL.METHOD;
    }
}
