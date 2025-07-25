package com.iab.omid.library.smaato.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.smaato.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.smaato.weakreference.C18617a;

/* renamed from: com.iab.omid.library.smaato.internal.e */
/* loaded from: classes6.dex */
public class C18572e {

    /* renamed from: a */
    private final C18617a f46498a;

    /* renamed from: b */
    private final String f46499b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f46500c;

    /* renamed from: d */
    private final String f46501d;

    public C18572e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f46498a = new C18617a(view);
        this.f46499b = view.getClass().getCanonicalName();
        this.f46500c = friendlyObstructionPurpose;
        this.f46501d = str;
    }

    /* renamed from: a */
    public String m62227a() {
        return this.f46501d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m62226b() {
        return this.f46500c;
    }

    /* renamed from: c */
    public C18617a m62225c() {
        return this.f46498a;
    }

    /* renamed from: d */
    public String m62224d() {
        return this.f46499b;
    }
}
