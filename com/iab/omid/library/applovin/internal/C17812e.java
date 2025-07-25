package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.applovin.weakreference.C17855a;

/* renamed from: com.iab.omid.library.applovin.internal.e */
/* loaded from: classes6.dex */
public class C17812e {

    /* renamed from: a */
    private final C17855a f44941a;

    /* renamed from: b */
    private final String f44942b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f44943c;

    /* renamed from: d */
    private final String f44944d;

    public C17812e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f44941a = new C17855a(view);
        this.f44942b = view.getClass().getCanonicalName();
        this.f44943c = friendlyObstructionPurpose;
        this.f44944d = str;
    }

    /* renamed from: a */
    public String m65126a() {
        return this.f44944d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m65125b() {
        return this.f44943c;
    }

    /* renamed from: c */
    public C17855a m65124c() {
        return this.f44941a;
    }

    /* renamed from: d */
    public String m65123d() {
        return this.f44942b;
    }
}
