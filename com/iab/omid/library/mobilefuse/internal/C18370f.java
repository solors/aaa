package com.iab.omid.library.mobilefuse.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.mobilefuse.internal.f */
/* loaded from: classes6.dex */
public class C18370f {

    /* renamed from: b */
    private static final Pattern f46097b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18369e> f46098a = new ArrayList();

    /* renamed from: b */
    private C18369e m62977b(View view) {
        for (C18369e c18369e : this.f46098a) {
            if (c18369e.m62984c().get() == view) {
                return c18369e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18369e> m62982a() {
        return this.f46098a;
    }

    /* renamed from: c */
    public void m62976c(View view) {
        m62981a(view);
        C18369e m62977b = m62977b(view);
        if (m62977b != null) {
            this.f46098a.remove(m62977b);
        }
    }

    /* renamed from: a */
    private void m62981a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m62978b() {
        this.f46098a.clear();
    }

    /* renamed from: a */
    public void m62980a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m62981a(view);
        m62979a(str);
        if (m62977b(view) == null) {
            this.f46098a.add(new C18369e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m62979a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f46097b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
