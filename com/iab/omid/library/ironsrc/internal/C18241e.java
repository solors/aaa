package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.weakreference.C18281a;

/* renamed from: com.iab.omid.library.ironsrc.internal.e */
/* loaded from: classes6.dex */
public class C18241e {

    /* renamed from: a */
    private final C18281a f45834a;

    /* renamed from: b */
    private final String f45835b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f45836c;

    /* renamed from: d */
    private final String f45837d;

    public C18241e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f45834a = new C18281a(view);
        this.f45835b = view.getClass().getCanonicalName();
        this.f45836c = friendlyObstructionPurpose;
        this.f45837d = str;
    }

    /* renamed from: a */
    public String m63471a() {
        return this.f45837d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m63470b() {
        return this.f45836c;
    }

    /* renamed from: c */
    public C18281a m63469c() {
        return this.f45834a;
    }

    /* renamed from: d */
    public String m63468d() {
        return this.f45835b;
    }
}
