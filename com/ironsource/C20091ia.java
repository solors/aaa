package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C20688qf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.ia */
/* loaded from: classes6.dex */
public class C20091ia {

    /* renamed from: a */
    private final Map<String, C20039ha> f50563a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C20039ha> f50564b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, C20039ha> f50565c = new LinkedHashMap();

    /* renamed from: b */
    private Map<String, C20039ha> m57988b(C20688qf.EnumC20693e enumC20693e) {
        if (enumC20693e.name().equalsIgnoreCase(C20688qf.EnumC20693e.RewardedVideo.name())) {
            return this.f50563a;
        }
        if (enumC20693e.name().equalsIgnoreCase(C20688qf.EnumC20693e.Interstitial.name())) {
            return this.f50564b;
        }
        if (enumC20693e.name().equalsIgnoreCase(C20688qf.EnumC20693e.Banner.name())) {
            return this.f50565c;
        }
        return null;
    }

    /* renamed from: a */
    public C20039ha m57992a(C20688qf.EnumC20693e enumC20693e, C20473mi c20473mi) {
        C20039ha c20039ha = new C20039ha(c20473mi);
        m57990a(enumC20693e, c20473mi.m56302e(), c20039ha);
        return c20039ha;
    }

    /* renamed from: a */
    public C20039ha m57991a(C20688qf.EnumC20693e enumC20693e, String str) {
        Map<String, C20039ha> m57988b;
        if (TextUtils.isEmpty(str) || (m57988b = m57988b(enumC20693e)) == null) {
            return null;
        }
        return m57988b.get(str);
    }

    /* renamed from: b */
    public void m57987b(C20688qf.EnumC20693e enumC20693e, String str) {
        Map<String, C20039ha> m57988b;
        C20039ha remove;
        if (TextUtils.isEmpty(str) || (m57988b = m57988b(enumC20693e)) == null || (remove = m57988b.remove(str)) == null) {
            return;
        }
        remove.m58217a();
    }

    /* renamed from: a */
    public C20039ha m57989a(C20688qf.EnumC20693e enumC20693e, String str, Map<String, String> map, InterfaceC19592an interfaceC19592an) {
        C20039ha c20039ha = new C20039ha(str, str, map, interfaceC19592an);
        m57990a(enumC20693e, str, c20039ha);
        return c20039ha;
    }

    /* renamed from: a */
    public Collection<C20039ha> m57993a(C20688qf.EnumC20693e enumC20693e) {
        Map<String, C20039ha> m57988b = m57988b(enumC20693e);
        return m57988b != null ? m57988b.values() : new ArrayList();
    }

    /* renamed from: a */
    private void m57990a(C20688qf.EnumC20693e enumC20693e, String str, C20039ha c20039ha) {
        Map<String, C20039ha> m57988b;
        if (TextUtils.isEmpty(str) || c20039ha == null || (m57988b = m57988b(enumC20693e)) == null) {
            return;
        }
        m57988b.put(str, c20039ha);
    }
}
