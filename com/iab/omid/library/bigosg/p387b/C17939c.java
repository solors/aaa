package com.iab.omid.library.bigosg.p387b;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bigosg.p390e.C17957a;

/* renamed from: com.iab.omid.library.bigosg.b.c */
/* loaded from: classes6.dex */
public class C17939c {

    /* renamed from: a */
    private final C17957a f45200a;

    /* renamed from: b */
    private final String f45201b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f45202c;

    /* renamed from: d */
    private final String f45203d;

    public C17939c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f45200a = new C17957a(view);
        this.f45201b = view.getClass().getCanonicalName();
        this.f45202c = friendlyObstructionPurpose;
        this.f45203d = str;
    }

    /* renamed from: a */
    public C17957a m64641a() {
        return this.f45200a;
    }

    /* renamed from: b */
    public String m64640b() {
        return this.f45201b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose m64639c() {
        return this.f45202c;
    }

    /* renamed from: d */
    public String m64638d() {
        return this.f45203d;
    }
}
