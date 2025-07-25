package com.monetization.ads.exo.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.monetization.ads.exo.drm.DrmInitData;
import com.monetization.ads.exo.drm.InterfaceC25505m;
import com.yandex.mobile.ads.impl.InterfaceC31680vt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi(18)
/* renamed from: com.monetization.ads.exo.drm.k */
/* loaded from: classes7.dex */
public final class C25502k implements InterfaceC25505m {
    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: a */
    public final void mo44408a(@Nullable InterfaceC25505m.InterfaceC25507b interfaceC25507b) {
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: b */
    public final int mo44399b() {
        return 1;
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: c */
    public final byte[] mo44395c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: d */
    public final InterfaceC31680vt mo44390d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: a */
    public final InterfaceC25505m.C25506a mo44401a(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: b */
    public final void mo44397b(byte[] bArr) {
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: c */
    public final void mo44393c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: a */
    public final InterfaceC25505m.C25509d mo44410a() {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    @Nullable
    /* renamed from: b */
    public final byte[] mo44396b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: a */
    public final Map<String, String> mo44403a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: a */
    public final boolean mo44405a(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    /* renamed from: a */
    public final void mo44400a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.monetization.ads.exo.drm.InterfaceC25505m
    public final void release() {
    }
}
