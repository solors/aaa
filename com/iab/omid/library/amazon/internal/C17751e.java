package com.iab.omid.library.amazon.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.amazon.weakreference.C17794a;

/* renamed from: com.iab.omid.library.amazon.internal.e */
/* loaded from: classes6.dex */
public class C17751e {

    /* renamed from: a */
    private final C17794a f44812a;

    /* renamed from: b */
    private final String f44813b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f44814c;

    /* renamed from: d */
    private final String f44815d;

    public C17751e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f44812a = new C17794a(view);
        this.f44813b = view.getClass().getCanonicalName();
        this.f44814c = friendlyObstructionPurpose;
        this.f44815d = str;
    }

    /* renamed from: a */
    public String m65367a() {
        return this.f44815d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m65366b() {
        return this.f44814c;
    }

    /* renamed from: c */
    public C17794a m65365c() {
        return this.f44812a;
    }

    /* renamed from: d */
    public String m65364d() {
        return this.f44813b;
    }
}
