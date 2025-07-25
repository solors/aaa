package ie;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC37731g1;
import kotlinx.coroutines.InterfaceC37780o;
import kotlinx.coroutines.InterfaceC37814x0;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainDispatchers.kt */
@Metadata
/* renamed from: ie.y */
/* loaded from: classes8.dex */
public final class C33660y extends MainCoroutineDispatcher implements InterfaceC37814x0 {
    @Nullable

    /* renamed from: b */
    private final Throwable f92152b;
    @Nullable

    /* renamed from: c */
    private final String f92153c;

    public C33660y(@Nullable Throwable th, @Nullable String str) {
        this.f92152b = th;
        this.f92153c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void m22871s() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f92152b
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f92153c
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f92152b
            r1.<init>(r0, r2)
            throw r1
        L36:
            ie.C33659x.m22874d()
            nd.i r0 = new nd.i
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.C33660y.m22871s():java.lang.Void");
    }

    @Override // kotlinx.coroutines.InterfaceC37814x0
    @NotNull
    public InterfaceC37731g1 invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        m22871s();
        throw new ExceptionsH();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        m22871s();
        throw new ExceptionsH();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i) {
        m22871s();
        throw new ExceptionsH();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    /* renamed from: r */
    public Void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        m22871s();
        throw new ExceptionsH();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f92152b != null) {
            str = ", cause=" + this.f92152b;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC37814x0
    @NotNull
    /* renamed from: u */
    public Void scheduleResumeAfterDelay(long j, @NotNull InterfaceC37780o<? super Unit> interfaceC37780o) {
        m22871s();
        throw new ExceptionsH();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    @NotNull
    public MainCoroutineDispatcher getImmediate() {
        return this;
    }
}
