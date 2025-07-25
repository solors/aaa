package com.ironsource;

import com.ironsource.mediationsdk.metadata.C20419a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.os */
/* loaded from: classes6.dex */
public final class C20605os {
    @NotNull

    /* renamed from: a */
    public static final C20605os f52348a = new C20605os();

    private C20605os() {
    }

    /* renamed from: a */
    private final JSONArray m55908a() {
        ConcurrentHashMap<String, List<String>> m53713d = C21333zs.f54830a.m53713d();
        if (m53713d.containsKey(C20419a.f51682f)) {
            return new JSONArray((Collection) m53713d.get(C20419a.f51682f));
        }
        return null;
    }

    /* renamed from: b */
    public final void m55903b() {
        m55905a(this, 70, null, null, 6, null);
    }

    /* renamed from: c */
    public final void m55902c() {
        m55905a(this, 71, null, null, 6, null);
    }

    /* renamed from: d */
    public final void m55901d() {
        m55905a(this, 73, null, null, 6, null);
    }

    /* renamed from: a */
    public final void m55907a(int i) {
        m55906a(72, Integer.valueOf(i), null);
    }

    /* renamed from: a */
    private final void m55906a(int i, Integer num, String str) {
        C21333zs c21333zs = C21333zs.f54830a;
        JSONObject m53721a = c21333zs.m53721a(false);
        if (num != null) {
            m53721a.put("errorCode", num.intValue());
            JSONArray m55908a = m55908a();
            if (m55908a != null) {
                m53721a.put(C20419a.f51682f, m55908a);
            }
        }
        if (str != null) {
            m53721a.put("reason", str);
        }
        c21333zs.m53736a(i, m53721a);
    }

    /* renamed from: a */
    static /* synthetic */ void m55905a(C20605os c20605os, int i, Integer num, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        c20605os.m55906a(i, num, str);
    }

    /* renamed from: a */
    public final void m55904a(@NotNull String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        m55906a(74, Integer.valueOf((int) IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }
}
