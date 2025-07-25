package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.y4 */
/* loaded from: classes3.dex */
public final class C10376y4 implements InterfaceC10347x4 {

    /* renamed from: a */
    public final File f23602a;

    /* renamed from: b */
    public final File f23603b;

    /* renamed from: c */
    public final File f23604c;

    public C10376y4(Context context, File precacheDirectory, File precacheQueueDirectory, File precachingInternalDirectory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(precacheDirectory, "precacheDirectory");
        Intrinsics.checkNotNullParameter(precacheQueueDirectory, "precacheQueueDirectory");
        Intrinsics.checkNotNullParameter(precachingInternalDirectory, "precachingInternalDirectory");
        this.f23602a = precacheDirectory;
        this.f23603b = precacheQueueDirectory;
        this.f23604c = precachingInternalDirectory;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10347x4
    /* renamed from: a */
    public File mo79906a(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new File(mo79904c(), id2);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10347x4
    /* renamed from: b */
    public File mo79905b() {
        return this.f23604c;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10347x4
    /* renamed from: c */
    public File mo79904c() {
        return this.f23602a;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10347x4
    /* renamed from: a */
    public File mo79907a() {
        return this.f23603b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C10376y4(android.content.Context r1, java.io.File r2, java.io.File r3, java.io.File r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L8
            java.io.File r2 = com.chartboost.sdk.impl.AbstractC10282v3.m80302b(r1)
        L8:
            r6 = r5 & 4
            if (r6 == 0) goto L10
            java.io.File r3 = com.chartboost.sdk.impl.AbstractC10282v3.m80301c(r1)
        L10:
            r5 = r5 & 8
            if (r5 == 0) goto L1b
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "exoplayer-cache"
            r4.<init>(r2, r5)
        L1b:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C10376y4.<init>(android.content.Context, java.io.File, java.io.File, java.io.File, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
