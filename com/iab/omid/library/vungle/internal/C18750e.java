package com.iab.omid.library.vungle.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.vungle.weakreference.C18795a;

/* renamed from: com.iab.omid.library.vungle.internal.e */
/* loaded from: classes6.dex */
public class C18750e {

    /* renamed from: a */
    private final C18795a f46889a;

    /* renamed from: b */
    private final String f46890b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f46891c;

    /* renamed from: d */
    private final String f46892d;

    public C18750e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f46889a = new C18795a(view);
        this.f46890b = view.getClass().getCanonicalName();
        this.f46891c = friendlyObstructionPurpose;
        this.f46892d = str;
    }

    /* renamed from: a */
    public String m61505a() {
        return this.f46892d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m61504b() {
        return this.f46891c;
    }

    /* renamed from: c */
    public C18795a m61503c() {
        return this.f46889a;
    }

    /* renamed from: d */
    public String m61502d() {
        return this.f46890b;
    }
}
