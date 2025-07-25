package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.k */
/* loaded from: classes6.dex */
public final class C19334k {

    /* renamed from: a */
    public int f48418a;

    /* renamed from: b */
    public int f48419b;

    /* renamed from: c */
    public String f48420c;

    /* renamed from: d */
    public final WeakReference f48421d;

    /* renamed from: e */
    public final HashSet f48422e;

    /* renamed from: f */
    public final String f48423f;

    /* renamed from: g */
    public final ArrayList f48424g;

    /* renamed from: h */
    public final Set f48425h;

    public C19334k(String batchId, Set rawAssets, InterfaceC19169Y0 listener, String str, int i) {
        str = (i & 16) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(rawAssets, "rawAssets");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f48421d = new WeakReference(listener);
        this.f48424g = new ArrayList();
        this.f48422e = new HashSet();
        this.f48425h = rawAssets;
        this.f48423f = str;
    }

    public final String toString() {
        return "AdAssetBatch{rawAssets=" + this.f48425h + ", batchDownloadSuccessCount=" + this.f48418a + ", batchDownloadFailureCount=" + this.f48419b + '}';
    }
}
