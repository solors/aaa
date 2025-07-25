package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.s8 */
/* loaded from: classes8.dex */
public final class C31338s8 {

    /* renamed from: a */
    private final hc1 f85047a;

    /* renamed from: b */
    private final WebView f85048b;

    /* renamed from: c */
    private final ArrayList f85049c;

    /* renamed from: d */
    private final HashMap f85050d;

    /* renamed from: e */
    private final String f85051e;

    /* renamed from: f */
    private final String f85052f;
    @Nullable

    /* renamed from: g */
    private final String f85053g;

    /* renamed from: h */
    private final EnumC31430t8 f85054h;

    private C31338s8(hc1 hc1Var, String str, List list) {
        EnumC31430t8 enumC31430t8 = EnumC31430t8.f85546d;
        ArrayList arrayList = new ArrayList();
        this.f85049c = arrayList;
        this.f85050d = new HashMap();
        this.f85047a = hc1Var;
        this.f85048b = null;
        this.f85051e = str;
        this.f85054h = enumC31430t8;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String uuid = UUID.randomUUID().toString();
                this.f85050d.put(uuid, (r52) it.next());
            }
        }
        this.f85053g = null;
        this.f85052f = null;
    }

    /* renamed from: a */
    public static C31338s8 m29826a(hc1 hc1Var, String str, List list) {
        if (list != null) {
            return new C31338s8(hc1Var, str, list);
        }
        throw new IllegalArgumentException("VerificationScriptResources is null");
    }

    @Nullable
    /* renamed from: b */
    public final String m29825b() {
        return this.f85053g;
    }

    /* renamed from: c */
    public final String m29824c() {
        return this.f85052f;
    }

    /* renamed from: d */
    public final Map<String, r52> m29823d() {
        return Collections.unmodifiableMap(this.f85050d);
    }

    /* renamed from: e */
    public final String m29822e() {
        return this.f85051e;
    }

    /* renamed from: f */
    public final hc1 m29821f() {
        return this.f85047a;
    }

    /* renamed from: g */
    public final List<r52> m29820g() {
        return Collections.unmodifiableList(this.f85049c);
    }

    /* renamed from: h */
    public final WebView m29819h() {
        return this.f85048b;
    }

    /* renamed from: a */
    public final EnumC31430t8 m29827a() {
        return this.f85054h;
    }
}
