package com.iab.omid.library.mobilefuse.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mobilefuse.weakreference.C18414a;

/* renamed from: com.iab.omid.library.mobilefuse.internal.e */
/* loaded from: classes6.dex */
public class C18369e {

    /* renamed from: a */
    private final C18414a f46093a;

    /* renamed from: b */
    private final String f46094b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f46095c;

    /* renamed from: d */
    private final String f46096d;

    public C18369e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f46093a = new C18414a(view);
        this.f46094b = view.getClass().getCanonicalName();
        this.f46095c = friendlyObstructionPurpose;
        this.f46096d = str;
    }

    /* renamed from: a */
    public String m62986a() {
        return this.f46096d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m62985b() {
        return this.f46095c;
    }

    /* renamed from: c */
    public C18414a m62984c() {
        return this.f46093a;
    }

    /* renamed from: d */
    public String m62983d() {
        return this.f46094b;
    }
}
