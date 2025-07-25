package com.iab.omid.library.fyber.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.weakreference.C18157a;

/* renamed from: com.iab.omid.library.fyber.internal.e */
/* loaded from: classes6.dex */
public class C18112e {

    /* renamed from: a */
    private final C18157a f45569a;

    /* renamed from: b */
    private final String f45570b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f45571c;

    /* renamed from: d */
    private final String f45572d;

    public C18112e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f45569a = new C18157a(view);
        this.f45570b = view.getClass().getCanonicalName();
        this.f45571c = friendlyObstructionPurpose;
        this.f45572d = str;
    }

    /* renamed from: a */
    public String m63968a() {
        return this.f45572d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m63967b() {
        return this.f45571c;
    }

    /* renamed from: c */
    public C18157a m63966c() {
        return this.f45569a;
    }

    /* renamed from: d */
    public String m63965d() {
        return this.f45570b;
    }
}
