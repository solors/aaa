package com.explorestack.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p734j1.C37263g;
import p734j1.C37264h;
import p767l1.C37892a;

/* renamed from: com.explorestack.iab.vast.processor.d */
/* loaded from: classes3.dex */
public class C10590d {
    @Nullable

    /* renamed from: b */
    private VastAd f24277b;
    @Nullable

    /* renamed from: c */
    private C37263g f24278c;
    @NonNull

    /* renamed from: a */
    private final List<String> f24276a = new ArrayList();

    /* renamed from: d */
    private boolean f24279d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public List<String> m78976a() {
        return this.f24276a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m78975b(@Nullable VastAd vastAd) {
        this.f24277b = vastAd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m78974c(@Nullable C37263g c37263g) {
        this.f24278c = c37263g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m78973d(@NonNull C37892a c37892a, @NonNull C37263g c37263g) {
        m78974c(c37263g);
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", c37263g.m18615a());
        List<String> m15835Y = c37892a.m15835Y();
        if (m15835Y != null && !m15835Y.isEmpty()) {
            for (String str : m15835Y) {
                String m18614a = C37264h.m18614a(str, bundle);
                if (!TextUtils.isEmpty(m18614a)) {
                    this.f24276a.add(m18614a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m78972e(boolean z) {
        this.f24279d = z;
    }

    @Nullable
    /* renamed from: f */
    public VastAd m78971f() {
        return this.f24277b;
    }

    @Nullable
    /* renamed from: g */
    public C37263g m78970g() {
        return this.f24278c;
    }

    /* renamed from: h */
    public boolean m78969h() {
        if (this.f24277b != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m78968i() {
        return this.f24279d;
    }
}
