package sg.bigo.ads.common.p933u.p935b;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p906aa.C43592c;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p933u.C43806f;
import sg.bigo.ads.common.p933u.InterfaceC43783a;

/* renamed from: sg.bigo.ads.common.u.b.c */
/* loaded from: classes10.dex */
public abstract class AbstractC43797c<T extends InterfaceC43783a> {

    /* renamed from: i */
    public final int f114615i;

    /* renamed from: j */
    public final T f114616j;
    @Nullable

    /* renamed from: k */
    public Executor f114617k;

    /* renamed from: l */
    public long f114618l = 15000;

    /* renamed from: m */
    public final Map<String, Set<String>> f114619m = new HashMap();

    /* renamed from: n */
    public final boolean f114620n;

    public AbstractC43797c(int i, @NonNull T t, boolean z) {
        this.f114615i = i;
        this.f114616j = t;
        this.f114620n = z;
        m4975a("BIGO-Ad-Request-Id", String.valueOf(i));
        m4975a("User-Agent", C43592c.m5332c(C43617a.f114190a));
    }

    @NonNull
    /* renamed from: b */
    private Set<String> m4973b(@NonNull String str) {
        Set<String> set = this.f114619m.get(str);
        if (set == null) {
            HashSet hashSet = new HashSet();
            this.f114619m.put(str, hashSet);
            return hashSet;
        }
        return set;
    }

    @NonNull
    /* renamed from: a */
    public String mo4977a() {
        return "GET";
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo4972c() {
        return null;
    }

    @Nullable
    /* renamed from: d */
    public String mo4971d() {
        return null;
    }

    /* renamed from: e */
    public int mo4970e() {
        return -1;
    }

    /* renamed from: f */
    public boolean mo4969f() {
        return false;
    }

    @NonNull
    /* renamed from: g */
    public final String m4968g() {
        return this.f114616j.mo4525a();
    }

    /* renamed from: a */
    public final void m4976a(String str) {
        m4973b(str).clear();
    }

    @Nullable
    /* renamed from: b */
    public C43806f mo4974b() {
        return null;
    }

    /* renamed from: a */
    public final void m4975a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        m4973b(str).add(str2);
    }

    /* renamed from: h */
    public void mo4089h() {
    }
}
