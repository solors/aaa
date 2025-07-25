package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC20151jg;
import com.ironsource.InterfaceC20197k9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.tq */
/* loaded from: classes6.dex */
public final class C21043tq implements InterfaceC20151jg, InterfaceC20151jg.InterfaceC20152a {
    @NotNull

    /* renamed from: a */
    private final InterfaceC21093uq f53623a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC20286lq f53624b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC20197k9 f53625c;

    /* renamed from: d */
    private int f53626d;

    /* renamed from: e */
    private long f53627e;

    @Metadata
    /* renamed from: com.ironsource.tq$a */
    /* loaded from: classes6.dex */
    public static final class C21044a {
        @NotNull

        /* renamed from: a */
        public static final C21044a f53628a = new C21044a();

        /* renamed from: b */
        public static final int f53629b = -1;

        /* renamed from: c */
        public static final int f53630c = 0;

        /* renamed from: d */
        public static final long f53631d = -1;

        private C21044a() {
        }
    }

    public C21043tq(@NotNull InterfaceC21093uq storage, @NotNull InterfaceC20286lq initResponseStorage, @NotNull InterfaceC20197k9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f53623a = storage;
        this.f53624b = initResponseStorage;
        this.f53625c = currentTimeProvider;
        this.f53626d = -1;
        this.f53627e = -1L;
    }

    /* renamed from: b */
    private final int m54725b(Context context, InterfaceC21093uq interfaceC21093uq) {
        int mo54304b = interfaceC21093uq.mo54304b(context, 0) + 1;
        interfaceC21093uq.mo54305a(context, mo54304b);
        return mo54304b;
    }

    @Override // com.ironsource.InterfaceC20151jg
    /* renamed from: a */
    public long mo54729a() {
        return this.f53627e;
    }

    @Override // com.ironsource.InterfaceC20151jg
    /* renamed from: c */
    public int mo54724c() {
        return this.f53626d;
    }

    public /* synthetic */ C21043tq(InterfaceC21093uq interfaceC21093uq, InterfaceC20286lq interfaceC20286lq, InterfaceC20197k9 interfaceC20197k9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21093uq, (i & 2) != 0 ? new C20482mq() : interfaceC20286lq, (i & 4) != 0 ? new InterfaceC20197k9.C20198a() : interfaceC20197k9);
    }

    /* renamed from: a */
    private final long m54727a(Context context, InterfaceC21093uq interfaceC21093uq) {
        long mo54394a = interfaceC21093uq.mo54394a(context, -1L);
        if (this.f53624b.mo56248a(context) || mo54394a != -1) {
            return mo54394a;
        }
        long mo57675a = this.f53625c.mo57675a();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("set first session timestamp = " + mo57675a);
        interfaceC21093uq.mo54393b(context, mo57675a);
        return mo57675a;
    }

    @Override // com.ironsource.InterfaceC20151jg
    @NotNull
    /* renamed from: b */
    public String mo54726b() {
        String sessionId = IronSourceUtils.getSessionId();
        Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId()");
        return sessionId;
    }

    @Override // com.ironsource.InterfaceC20151jg.InterfaceC20152a
    /* renamed from: a */
    public void mo54728a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53626d = m54725b(context, this.f53623a);
        this.f53627e = m54727a(context, this.f53623a);
    }
}
