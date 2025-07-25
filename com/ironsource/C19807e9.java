package com.ironsource;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.e9 */
/* loaded from: classes6.dex */
public final class C19807e9 implements InterfaceC20795sa<C21314zf> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20093ic f49868a;
    @NotNull

    /* renamed from: b */
    private final String f49869b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC19766de f49870c;
    @NotNull

    /* renamed from: d */
    private final Function1<Result<? extends C21314zf>, Unit> f49871d;
    @NotNull

    /* renamed from: e */
    private C21314zf f49872e;

    /* JADX WARN: Multi-variable type inference failed */
    public C19807e9(@NotNull InterfaceC20093ic fileUrl, @NotNull String destinationPath, @NotNull InterfaceC19766de downloadManager, @NotNull Function1<? super Result<? extends C21314zf>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.f49868a = fileUrl;
        this.f49869b = destinationPath;
        this.f49870c = downloadManager;
        this.f49871d = onFinish;
        this.f49872e = new C21314zf(mo55368b());
    }

    @Override // com.ironsource.InterfaceC20057hn
    /* renamed from: a */
    public void mo55123a(@NotNull C21314zf file) {
        Intrinsics.checkNotNullParameter(file, "file");
        mo55364i().invoke(Result.m14550a(Result.m14549b(file)));
    }

    @Override // com.ironsource.InterfaceC20795sa
    @NotNull
    /* renamed from: b */
    public String mo55368b() {
        return this.f49869b;
    }

    @Override // com.ironsource.InterfaceC20795sa
    @NotNull
    /* renamed from: c */
    public InterfaceC20093ic mo55366c() {
        return this.f49868a;
    }

    @Override // com.ironsource.InterfaceC20795sa
    @NotNull
    /* renamed from: i */
    public Function1<Result<? extends C21314zf>, Unit> mo55364i() {
        return this.f49871d;
    }

    @Override // com.ironsource.InterfaceC20795sa
    @NotNull
    /* renamed from: j */
    public C21314zf mo55363j() {
        return this.f49872e;
    }

    @Override // com.ironsource.InterfaceC20795sa
    @NotNull
    /* renamed from: k */
    public InterfaceC19766de mo55362k() {
        return this.f49870c;
    }

    @Override // com.ironsource.InterfaceC20057hn
    /* renamed from: a */
    public void mo55122a(@Nullable C21314zf c21314zf, @NotNull C20757rf error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends C21314zf>, Unit> mo55364i = mo55364i();
        Result.C38506a c38506a = Result.f101870c;
        mo55364i.invoke(Result.m14550a(Result.m14549b(C38508r.m14540a(new Exception("Unable to download mobileController.html: " + error.m55491b())))));
    }

    @Override // com.ironsource.InterfaceC20795sa
    /* renamed from: b */
    public void mo55367b(@NotNull C21314zf c21314zf) {
        Intrinsics.checkNotNullParameter(c21314zf, "<set-?>");
        this.f49872e = c21314zf;
    }
}
