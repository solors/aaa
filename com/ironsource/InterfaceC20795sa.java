package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.sa */
/* loaded from: classes6.dex */
public interface InterfaceC20795sa<T> extends InterfaceC20057hn {
    @NotNull
    /* renamed from: b */
    String mo55368b();

    /* renamed from: b */
    void mo55367b(@NotNull C21314zf c21314zf);

    @NotNull
    /* renamed from: c */
    InterfaceC20093ic mo55366c();

    /* renamed from: h */
    default boolean m55365h() {
        return mo55363j().exists();
    }

    @NotNull
    /* renamed from: i */
    Function1<Result<? extends T>, Unit> mo55364i();

    @NotNull
    /* renamed from: j */
    C21314zf mo55363j();

    @NotNull
    /* renamed from: k */
    InterfaceC19766de mo55362k();

    /* renamed from: l */
    default void m55361l() {
        mo55362k().mo55529a(this);
        if (mo55363j().exists()) {
            IronSourceStorageUtils.deleteFile(mo55363j());
        }
        try {
            mo55362k().mo55526a(mo55363j(), mo55366c().value(), 5, 5);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            Function1<Result<? extends T>, Unit> mo55364i = mo55364i();
            Result.C38506a c38506a = Result.f101870c;
            mo55364i.invoke(Result.m14550a(Result.m14549b(C38508r.m14540a(e))));
        }
    }
}
