package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.c9 */
/* loaded from: classes6.dex */
public final class C19689c9 implements InterfaceC19633be {
    @NotNull

    /* renamed from: a */
    private final String f49423a;
    @NotNull

    /* renamed from: b */
    private final String f49424b;

    /* renamed from: c */
    private final boolean f49425c;
    @NotNull

    /* renamed from: d */
    private final C21143vn f49426d;

    public C19689c9() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC19633be
    @NotNull
    /* renamed from: a */
    public C21143vn mo59175a() {
        return this.f49426d;
    }

    @Override // com.ironsource.InterfaceC19633be
    @NotNull
    /* renamed from: b */
    public String mo59174b() {
        return this.f49424b;
    }

    @Override // com.ironsource.InterfaceC19633be
    @NotNull
    /* renamed from: c */
    public String mo59173c() {
        return this.f49423a;
    }

    @Override // com.ironsource.InterfaceC19633be
    /* renamed from: d */
    public boolean mo59172d() {
        return this.f49425c;
    }

    public C19689c9(@NotNull String controllerUrl, @NotNull String cacheFolder, boolean z, @NotNull C21143vn rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.f49423a = controllerUrl;
        this.f49424b = cacheFolder;
        this.f49425c = z;
        this.f49426d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C19689c9(java.lang.String r2, java.lang.String r3, boolean r4, com.ironsource.C21143vn r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            java.lang.String r0 = ""
            if (r7 == 0) goto L7
            r2 = r0
        L7:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            r3 = r0
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L11
            r4 = 0
        L11:
            r6 = r6 & 8
            if (r6 == 0) goto L1a
            com.ironsource.vn r5 = new com.ironsource.vn
            r5.<init>(r2)
        L1a:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19689c9.<init>(java.lang.String, java.lang.String, boolean, com.ironsource.vn, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
