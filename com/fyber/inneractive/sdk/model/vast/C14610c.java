package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.response.InterfaceC15390i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.model.vast.c */
/* loaded from: classes4.dex */
public final class C14610c implements InterfaceC15390i {

    /* renamed from: a */
    public final EnumC14616i f27703a;

    /* renamed from: b */
    public EnumC14618k f27704b;

    /* renamed from: c */
    public final int f27705c;

    /* renamed from: d */
    public final int f27706d;

    /* renamed from: e */
    public final String f27707e;

    /* renamed from: f */
    public String f27708f;

    /* renamed from: g */
    public String f27709g;

    /* renamed from: h */
    public final int f27710h;

    /* renamed from: i */
    public final HashMap f27711i = new HashMap();

    public C14610c(EnumC14616i enumC14616i, int i, int i2, String str, int i3) {
        this.f27703a = enumC14616i;
        this.f27705c = i;
        this.f27706d = i2;
        this.f27707e = str;
        this.f27710h = i3;
    }

    /* renamed from: a */
    public final void m77756a(EnumC14630w enumC14630w, String str) {
        List list = (List) this.f27711i.get(enumC14630w);
        if (list == null) {
            list = new ArrayList();
            this.f27711i.put(enumC14630w, list);
        }
        if (list.contains(str)) {
            return;
        }
        list.add(str);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f27705c);
        sb2.append(" h:");
        sb2.append(this.f27706d);
        sb2.append(" type:");
        sb2.append(this.f27703a.toString());
        sb2.append(" creativeType: ");
        EnumC14618k enumC14618k = this.f27704b;
        if (enumC14618k != null) {
            str = enumC14618k.mimeType;
        } else {
            str = "none";
        }
        sb2.append(str);
        sb2.append(" ctr:");
        sb2.append(this.f27709g);
        sb2.append(" events:");
        sb2.append(this.f27711i);
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC15390i
    /* renamed from: a */
    public final List mo76574a(EnumC14630w enumC14630w) {
        if (enumC14630w == null || this.f27711i.isEmpty()) {
            return null;
        }
        return (List) this.f27711i.get(enumC14630w);
    }

    /* renamed from: a */
    public final JSONObject m77757a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(POBNativeConstants.NATIVE_IMAGE_WIDTH, this.f27705c);
            jSONObject.put("h", this.f27706d);
            jSONObject.put("type", this.f27703a.toString());
            EnumC14618k enumC14618k = this.f27704b;
            jSONObject.put("creativeType", enumC14618k != null ? enumC14618k.mimeType : "none");
            jSONObject.put("content", this.f27708f);
        } catch (JSONException e) {
            IAlog.m76529a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }
}
