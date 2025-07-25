package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.weakreference.C18037a;

/* renamed from: com.iab.omid.library.bytedance2.internal.e */
/* loaded from: classes6.dex */
public class C17994e {

    /* renamed from: a */
    private final C18037a f45326a;

    /* renamed from: b */
    private final String f45327b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f45328c;

    /* renamed from: d */
    private final String f45329d;

    public C17994e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f45326a = new C18037a(view);
        this.f45327b = view.getClass().getCanonicalName();
        this.f45328c = friendlyObstructionPurpose;
        this.f45329d = str;
    }

    /* renamed from: a */
    public String m64418a() {
        return this.f45329d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m64417b() {
        return this.f45328c;
    }

    /* renamed from: c */
    public C18037a m64416c() {
        return this.f45326a;
    }

    /* renamed from: d */
    public String m64415d() {
        return this.f45327b;
    }
}
