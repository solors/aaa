package com.iab.omid.library.pubnativenet.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubnativenet.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.pubnativenet.internal.f */
/* loaded from: classes6.dex */
public class C18510f {

    /* renamed from: b */
    private static final Pattern f46367b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18509e> f46368a = new ArrayList();

    /* renamed from: b */
    private C18509e m62471b(View view) {
        for (C18509e c18509e : this.f46368a) {
            if (c18509e.m62478c().get() == view) {
                return c18509e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18509e> m62476a() {
        return this.f46368a;
    }

    /* renamed from: c */
    public void m62470c(View view) {
        m62475a(view);
        C18509e m62471b = m62471b(view);
        if (m62471b != null) {
            this.f46368a.remove(m62471b);
        }
    }

    /* renamed from: a */
    private void m62475a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m62472b() {
        this.f46368a.clear();
    }

    /* renamed from: a */
    public void m62474a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m62475a(view);
        m62473a(str);
        if (m62471b(view) == null) {
            this.f46368a.add(new C18509e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m62473a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f46367b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
