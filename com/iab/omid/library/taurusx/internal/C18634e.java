package com.iab.omid.library.taurusx.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.taurusx.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.taurusx.weakreference.C18675a;

/* renamed from: com.iab.omid.library.taurusx.internal.e */
/* loaded from: classes6.dex */
public class C18634e {

    /* renamed from: a */
    private final C18675a f46634a;

    /* renamed from: b */
    private final String f46635b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f46636c;

    /* renamed from: d */
    private final String f46637d;

    public C18634e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f46634a = new C18675a(view);
        this.f46635b = view.getClass().getCanonicalName();
        this.f46636c = friendlyObstructionPurpose;
        this.f46637d = str;
    }

    /* renamed from: a */
    public String m61971a() {
        return this.f46637d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m61970b() {
        return this.f46636c;
    }

    /* renamed from: c */
    public C18675a m61969c() {
        return this.f46634a;
    }

    /* renamed from: d */
    public String m61968d() {
        return this.f46635b;
    }
}
