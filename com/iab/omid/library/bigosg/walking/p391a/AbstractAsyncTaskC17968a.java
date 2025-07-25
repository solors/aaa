package com.iab.omid.library.bigosg.walking.p391a;

import com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.walking.a.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17968a extends AbstractAsyncTaskC17969b {

    /* renamed from: a */
    protected final HashSet<String> f45269a;

    /* renamed from: b */
    protected final JSONObject f45270b;

    /* renamed from: c */
    protected final long f45271c;

    public AbstractAsyncTaskC17968a(AbstractAsyncTaskC17969b.InterfaceC17971b interfaceC17971b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17971b);
        this.f45269a = new HashSet<>(hashSet);
        this.f45270b = jSONObject;
        this.f45271c = j;
    }
}
