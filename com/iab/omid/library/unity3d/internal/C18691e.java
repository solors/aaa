package com.iab.omid.library.unity3d.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.unity3d.weakreference.C18732a;

/* renamed from: com.iab.omid.library.unity3d.internal.e */
/* loaded from: classes6.dex */
public class C18691e {

    /* renamed from: a */
    private final C18732a f46762a;

    /* renamed from: b */
    private final String f46763b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f46764c;

    /* renamed from: d */
    private final String f46765d;

    public C18691e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f46762a = new C18732a(view);
        this.f46763b = view.getClass().getCanonicalName();
        this.f46764c = friendlyObstructionPurpose;
        this.f46765d = str;
    }

    /* renamed from: a */
    public String m61736a() {
        return this.f46765d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m61735b() {
        return this.f46764c;
    }

    /* renamed from: c */
    public C18732a m61734c() {
        return this.f46762a;
    }

    /* renamed from: d */
    public String m61733d() {
        return this.f46763b;
    }
}
