package com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.ldr.bg.eqN.bg.bg */
/* loaded from: classes3.dex */
public class C7708bg implements InterfaceC7706bg {

    /* renamed from: IL */
    private InterfaceC7707IL f16861IL;

    /* renamed from: Kg */
    private String f16862Kg;

    /* renamed from: PX */
    private int f16863PX;

    /* renamed from: VB */
    private String f16864VB;

    /* renamed from: WR */
    private String f16865WR;

    /* renamed from: bX */
    private byte f16866bX;

    /* renamed from: bg */
    protected JSONObject f16867bg;

    /* renamed from: eo */
    private byte f16868eo;
    private byte eqN;

    /* renamed from: iR */
    private long f16869iR;
    private long ldr;

    /* renamed from: zx */
    private long f16870zx;

    public C7708bg(String str, JSONObject jSONObject) {
        this.f16865WR = str;
        this.f16867bg = jSONObject;
    }

    /* renamed from: bX */
    public static InterfaceC7706bg m87986bX(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("priority");
            C7708bg c7708bg = new C7708bg();
            c7708bg.mo87984bg((byte) optInt);
            c7708bg.mo87996IL((byte) optInt2);
            c7708bg.mo87980bg(jSONObject.optJSONObject("event"));
            c7708bg.mo87981bg(jSONObject.optString("localId"));
            c7708bg.mo87994IL(jSONObject.optString("genTime"));
            c7708bg.mo87983bg(jSONObject.optInt(AppsFlyerProperties.CHANNEL));
            return c7708bg;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: IL */
    public byte mo87997IL() {
        return this.f16868eo;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: Kg */
    public long mo87993Kg() {
        return this.f16870zx;
    }

    /* renamed from: PX */
    public String m87992PX() {
        return this.f16862Kg;
    }

    /* renamed from: VB */
    public String m87991VB() {
        return this.f16864VB;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: WR */
    public long mo87990WR() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bg */
    public InterfaceC7707IL mo87985bg() {
        return this.f16861IL;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: eo */
    public int mo87979eo() {
        return this.f16863PX;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    public byte eqN() {
        return this.f16866bX;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: iR */
    public synchronized JSONObject mo87978iR() {
        InterfaceC7707IL interfaceC7707IL;
        if (this.f16867bg == null && (interfaceC7707IL = this.f16861IL) != null) {
            this.f16867bg = interfaceC7707IL.mo83385bg(m87991VB());
        }
        return this.f16867bg;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    public String ldr() {
        if (!TextUtils.isEmpty(this.f16865WR)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.f16865WR);
                jSONObject.put("event", mo87978iR());
                jSONObject.put("genTime", m87992PX());
                jSONObject.put("priority", (int) this.eqN);
                jSONObject.put("type", (int) this.f16866bX);
                jSONObject.put(AppsFlyerProperties.CHANNEL, this.f16863PX);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: zx */
    public byte mo87977zx() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: IL */
    public void mo87994IL(String str) {
        this.f16862Kg = str;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bg */
    public void mo87980bg(JSONObject jSONObject) {
        this.f16867bg = jSONObject;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: IL */
    public void mo87995IL(long j) {
        this.ldr = j;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bg */
    public void mo87984bg(byte b) {
        this.f16866bX = b;
    }

    public C7708bg(String str, InterfaceC7707IL interfaceC7707IL) {
        this.f16865WR = str;
        this.f16861IL = interfaceC7707IL;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: IL */
    public void mo87996IL(byte b) {
        this.eqN = b;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bg */
    public void mo87981bg(String str) {
        this.f16865WR = str;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bg */
    public void mo87982bg(long j) {
        this.f16870zx = j;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bg */
    public void mo87983bg(int i) {
        this.f16863PX = i;
    }

    private C7708bg() {
    }

    /* renamed from: bX */
    public void m87988bX(byte b) {
        this.f16868eo = b;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bX */
    public String mo87989bX() {
        return this.f16865WR;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg
    /* renamed from: bX */
    public void mo87987bX(long j) {
        this.f16869iR = j;
    }
}
