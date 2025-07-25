package com.iab.omid.library.pubmatic.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.pubmatic.weakreference.C18484a;

/* renamed from: com.iab.omid.library.pubmatic.internal.e */
/* loaded from: classes6.dex */
public class C18439e {

    /* renamed from: a */
    private final C18484a f46228a;

    /* renamed from: b */
    private final String f46229b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f46230c;

    /* renamed from: d */
    private final String f46231d;

    public C18439e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f46228a = new C18484a(view);
        this.f46229b = view.getClass().getCanonicalName();
        this.f46230c = friendlyObstructionPurpose;
        this.f46231d = str;
    }

    /* renamed from: a */
    public String m62733a() {
        return this.f46231d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m62732b() {
        return this.f46230c;
    }

    /* renamed from: c */
    public C18484a m62731c() {
        return this.f46228a;
    }

    /* renamed from: d */
    public String m62730d() {
        return this.f46229b;
    }
}
