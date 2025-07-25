package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.e */
/* loaded from: classes7.dex */
public final class C24284e implements InterfaceC24292j<C24283d> {
    @NotNull

    /* renamed from: d */
    public static final C24285a f62886d = new C24285a(null);
    @NotNull

    /* renamed from: b */
    public final Context f62887b;
    @NotNull

    /* renamed from: c */
    public C24283d f62888c;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.e$a */
    /* loaded from: classes7.dex */
    public static final class C24285a {
        public /* synthetic */ C24285a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24285a() {
        }
    }

    public C24284e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f62887b = context;
        this.f62888c = new C24283d(m46670e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        this.f62888c = new C24283d(m46670e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        C24283d c24283d;
        boolean z = !Intrinsics.m17075f(new C24283d(m46670e()), this.f62888c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI needsRefresh: " + z + ", with adi: " + c24283d.m46671a(), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "ADISignalProvider";
    }

    /* renamed from: e */
    public final long m46670e() {
        try {
            return this.f62887b.getFilesDir().getTotalSpace();
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ADISignalProvider", "ADI Error", e, false, 8, null);
            return 0L;
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public C24283d mo46629d() {
        C24283d c24283d = this.f62888c;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "ADISignalProvider", "[CBT] ADI providing " + c24283d.m46671a(), false, 4, null);
        return c24283d;
    }
}
