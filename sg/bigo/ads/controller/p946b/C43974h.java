package sg.bigo.ads.controller.p946b;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.common.AbstractC43610e;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;

/* renamed from: sg.bigo.ads.controller.b.h */
/* loaded from: classes10.dex */
public final class C43974h extends AbstractC43610e {

    /* renamed from: a */
    private Map<String, C43976i> f115213a;

    public C43974h(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.common.AbstractC43610e
    /* renamed from: a */
    public final String mo4447a() {
        return "bigoad_slots.dat";
    }

    @Override // sg.bigo.ads.common.AbstractC43610e
    /* renamed from: b */
    public final String mo4443b() {
        return "SlotData";
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Map<String, C43976i> map = this.f115213a;
        if (map != null) {
            for (C43976i c43976i : map.values()) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(c43976i);
            }
        }
        return "SlotData[" + sb2.toString() + ']';
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC43528l m4446a(String str) {
        Map<String, C43976i> map = this.f115213a;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        List<C43976i> m5121a = C43722n.m5121a(parcel, new InterfaceC43615f.InterfaceC43616a<C43976i>() { // from class: sg.bigo.ads.controller.b.h.1
            @Override // sg.bigo.ads.common.InterfaceC43615f.InterfaceC43616a
            /* renamed from: a */
            public final /* synthetic */ C43976i mo4414a() {
                return new C43976i();
            }
        });
        HashMap hashMap = new HashMap();
        for (C43976i c43976i : m5121a) {
            hashMap.put(c43976i.mo4427l(), c43976i);
        }
        this.f115213a = hashMap;
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC43528l m4444a(@NonNull AbstractC43532b abstractC43532b) {
        InterfaceC43528l mo5456h = abstractC43532b.mo5456h();
        return mo5456h != null ? mo5456h : m4446a(abstractC43532b.f114037a);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        Map<String, C43976i> map = this.f115213a;
        if (map != null) {
            arrayList.addAll(map.values());
        }
        C43722n.m5123a(parcel, arrayList);
    }

    /* renamed from: a */
    public final void m4445a(@NonNull JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            C43976i c43976i = new C43976i();
            if (c43976i.mo4439a(optJSONObject)) {
                hashMap.put(c43976i.mo4427l(), c43976i);
            }
        }
        this.f115213a = hashMap;
    }
}
