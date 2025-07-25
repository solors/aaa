package com.explorestack.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10541v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.explorestack.iab.mraid.o */
/* loaded from: classes3.dex */
public class C10487o {

    /* renamed from: a */
    private final boolean f23960a;

    /* renamed from: b */
    private final boolean f23961b;

    public C10487o(@NonNull Context context, @Nullable List<String> list) {
        C10541v c10541v = new C10541v(context);
        boolean z = true;
        this.f23960a = m79480b("sms", list) && c10541v.m79178a();
        this.f23961b = (m79480b("tel", list) && c10541v.m79178a()) ? z : false;
    }

    /* renamed from: b */
    private boolean m79480b(@NonNull String str, @Nullable List<String> list) {
        if (list != null && list.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m79481a() {
        return false;
    }

    /* renamed from: c */
    public boolean m79479c() {
        return false;
    }

    /* renamed from: d */
    public boolean m79478d() {
        return this.f23960a;
    }

    /* renamed from: e */
    public boolean m79477e() {
        return false;
    }

    /* renamed from: f */
    public boolean m79476f() {
        return this.f23961b;
    }

    public C10487o(@NonNull Context context, @Nullable String[] strArr) {
        this(context, strArr != null ? Arrays.asList(strArr) : null);
    }
}
