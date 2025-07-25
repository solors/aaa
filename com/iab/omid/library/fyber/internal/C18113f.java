package com.iab.omid.library.fyber.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.fyber.internal.f */
/* loaded from: classes6.dex */
public class C18113f {

    /* renamed from: b */
    private static final Pattern f45573b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18112e> f45574a = new ArrayList();

    /* renamed from: b */
    private C18112e m63959b(View view) {
        for (C18112e c18112e : this.f45574a) {
            if (c18112e.m63966c().get() == view) {
                return c18112e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18112e> m63964a() {
        return this.f45574a;
    }

    /* renamed from: c */
    public void m63958c(View view) {
        m63963a(view);
        C18112e m63959b = m63959b(view);
        if (m63959b != null) {
            this.f45574a.remove(m63959b);
        }
    }

    /* renamed from: a */
    private void m63963a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m63960b() {
        this.f45574a.clear();
    }

    /* renamed from: a */
    public void m63962a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m63963a(view);
        m63961a(str);
        if (m63959b(view) == null) {
            this.f45574a.add(new C18112e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m63961a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f45573b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
