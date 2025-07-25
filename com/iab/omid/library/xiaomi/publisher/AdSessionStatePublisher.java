package com.iab.omid.library.xiaomi.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.xiaomi.adsession.ErrorType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2i.C32487coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32493cii2c2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32494ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicic.C32587coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32604c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32609cco22;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32613coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32615coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32697c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32704ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32705cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32708coo2iico;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {
    private C32708coo2iico c2oc2i;
    private EnumC18797a c2oc2o;
    private long cco22;
    private C32487coo2iico cioccoiococ;
    private C32587coi222o222 coi222o222;
    private String coo2iico;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.xiaomi.publisher.AdSessionStatePublisher$a */
    /* loaded from: classes6.dex */
    public enum EnumC18797a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        coo2iico();
        this.coo2iico = str;
        this.coi222o222 = new C32587coi222o222(null);
    }

    public C32708coo2iico c2oc2i() {
        return this.c2oc2i;
    }

    public boolean c2oc2o() {
        if (this.coi222o222.get() != null) {
            return true;
        }
        return false;
    }

    public void cco22() {
        C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), this.coo2iico);
    }

    public void cii2c2() {
        C32494ciii2coi2.coo2iico().coi222o222(ciii2coi2(), this.coo2iico);
    }

    public WebView ciii2coi2() {
        return this.coi222o222.get();
    }

    public C32487coo2iico cioccoiococ() {
        return this.cioccoiococ;
    }

    public void coi222o222() {
        this.coi222o222.clear();
    }

    public void coiic() {
        coo2iico((JSONObject) null);
    }

    public void coo2iico() {
        this.cco22 = C32609cco22.coi222o222();
        this.c2oc2o = EnumC18797a.AD_STATE_IDLE;
    }

    public void coi222o222(String str, long j) {
        if (j >= this.cco22) {
            this.c2oc2o = EnumC18797a.AD_STATE_VISIBLE;
            C32494ciii2coi2.coo2iico().coi222o222(ciii2coi2(), this.coo2iico, str);
        }
    }

    public void coo2iico(float f) {
        C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), this.coo2iico, f);
    }

    public void coi222o222(boolean z) {
        if (c2oc2o()) {
            C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), this.coo2iico, z ? "locked" : "unlocked");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coo2iico(WebView webView) {
        this.coi222o222 = new C32587coi222o222(webView);
    }

    public void coo2iico(ErrorType errorType, String str) {
        C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), this.coo2iico, errorType, str);
    }

    public void coo2iico(C32487coo2iico c32487coo2iico) {
        this.cioccoiococ = c32487coo2iico;
    }

    public void coo2iico(C32697c2oc2i c32697c2oc2i) {
        C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), this.coo2iico, c32697c2oc2i.c2oc2i());
    }

    public void coo2iico(C32707coiic c32707coiic, C32705cioccoiococ c32705cioccoiococ) {
        coo2iico(c32707coiic, c32705cioccoiococ, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void coo2iico(C32707coiic c32707coiic, C32705cioccoiococ c32705cioccoiococ, JSONObject jSONObject) {
        String coi222o222 = c32707coiic.coi222o222();
        JSONObject jSONObject2 = new JSONObject();
        C32604c2oc2i.coo2iico(jSONObject2, "environment", "app");
        C32604c2oc2i.coo2iico(jSONObject2, "adSessionType", c32705cioccoiococ.coo2iico());
        C32604c2oc2i.coo2iico(jSONObject2, "deviceInfo", C32613coi222o222.cioccoiococ());
        C32604c2oc2i.coo2iico(jSONObject2, "deviceCategory", C32615coo2iico.coo2iico().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C32604c2oc2i.coo2iico(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C32604c2oc2i.coo2iico(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, c32705cioccoiococ.cco22().coo2iico());
        C32604c2oc2i.coo2iico(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, c32705cioccoiococ.cco22().coi222o222());
        C32604c2oc2i.coo2iico(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C32604c2oc2i.coo2iico(jSONObject4, "libraryVersion", "1.4.13-Xiaomi");
        C32604c2oc2i.coo2iico(jSONObject4, "appId", C32493cii2c2.coi222o222().coo2iico().getApplicationContext().getPackageName());
        C32604c2oc2i.coo2iico(jSONObject2, "app", jSONObject4);
        if (c32705cioccoiococ.coi222o222() != null) {
            C32604c2oc2i.coo2iico(jSONObject2, "contentUrl", c32705cioccoiococ.coi222o222());
        }
        if (c32705cioccoiococ.c2oc2i() != null) {
            C32604c2oc2i.coo2iico(jSONObject2, "customReferenceData", c32705cioccoiococ.c2oc2i());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (C32704ciii2coi2 c32704ciii2coi2 : c32705cioccoiococ.cii2c2()) {
            C32604c2oc2i.coo2iico(jSONObject5, c32704ciii2coi2.coi222o222(), c32704ciii2coi2.c2oc2i());
        }
        C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), coi222o222, jSONObject2, jSONObject5, jSONObject);
    }

    public void coo2iico(C32708coo2iico c32708coo2iico) {
        this.c2oc2i = c32708coo2iico;
    }

    public void coo2iico(String str) {
        coo2iico(str, (JSONObject) null);
    }

    public void coo2iico(String str, long j) {
        if (j >= this.cco22) {
            EnumC18797a enumC18797a = this.c2oc2o;
            EnumC18797a enumC18797a2 = EnumC18797a.AD_STATE_NOTVISIBLE;
            if (enumC18797a != enumC18797a2) {
                this.c2oc2o = enumC18797a2;
                C32494ciii2coi2.coo2iico().coi222o222(ciii2coi2(), this.coo2iico, str);
            }
        }
    }

    public void coo2iico(String str, @Nullable JSONObject jSONObject) {
        C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), this.coo2iico, str, jSONObject);
    }

    public void coo2iico(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C32604c2oc2i.coo2iico(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C32494ciii2coi2.coo2iico().coo2iico(ciii2coi2(), jSONObject);
    }

    public void coo2iico(@Nullable JSONObject jSONObject) {
        C32494ciii2coi2.coo2iico().coi222o222(ciii2coi2(), this.coo2iico, jSONObject);
    }

    public void coo2iico(boolean z) {
        if (c2oc2o()) {
            C32494ciii2coi2.coo2iico().c2oc2i(ciii2coi2(), this.coo2iico, z ? "foregrounded" : "backgrounded");
        }
    }

    public void cicic() {
    }
}
