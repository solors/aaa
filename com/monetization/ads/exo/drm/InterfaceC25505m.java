package com.monetization.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.InterfaceC31680vt;
import com.yandex.mobile.ads.impl.le1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.monetization.ads.exo.drm.m */
/* loaded from: classes7.dex */
public interface InterfaceC25505m {

    /* renamed from: com.monetization.ads.exo.drm.m$a */
    /* loaded from: classes7.dex */
    public static final class C25506a {

        /* renamed from: a */
        private final byte[] f66201a;

        /* renamed from: b */
        private final String f66202b;

        public C25506a(String str, byte[] bArr) {
            this.f66201a = bArr;
            this.f66202b = str;
        }

        /* renamed from: a */
        public final byte[] m44415a() {
            return this.f66201a;
        }

        /* renamed from: b */
        public final String m44414b() {
            return this.f66202b;
        }
    }

    /* renamed from: com.monetization.ads.exo.drm.m$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC25507b {
    }

    /* renamed from: com.monetization.ads.exo.drm.m$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC25508c {
        /* renamed from: a */
        InterfaceC25505m mo44413a(UUID uuid);
    }

    /* renamed from: com.monetization.ads.exo.drm.m$d */
    /* loaded from: classes7.dex */
    public static final class C25509d {

        /* renamed from: a */
        private final byte[] f66203a;

        /* renamed from: b */
        private final String f66204b;

        public C25509d(String str, byte[] bArr) {
            this.f66203a = bArr;
            this.f66204b = str;
        }

        /* renamed from: a */
        public final byte[] m44412a() {
            return this.f66203a;
        }

        /* renamed from: b */
        public final String m44411b() {
            return this.f66204b;
        }
    }

    /* renamed from: a */
    C25506a mo44401a(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: a */
    C25509d mo44410a();

    /* renamed from: a */
    Map<String, String> mo44403a(byte[] bArr);

    /* renamed from: a */
    void mo44408a(@Nullable InterfaceC25507b interfaceC25507b);

    /* renamed from: a */
    void mo44400a(byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    boolean mo44405a(String str, byte[] bArr);

    /* renamed from: b */
    int mo44399b();

    /* renamed from: b */
    void mo44397b(byte[] bArr);

    @Nullable
    /* renamed from: b */
    byte[] mo44396b(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: c */
    void mo44393c(byte[] bArr) throws DeniedByServerException;

    /* renamed from: c */
    byte[] mo44395c() throws MediaDrmException;

    /* renamed from: d */
    InterfaceC31680vt mo44390d(byte[] bArr) throws MediaCryptoException;

    void release();

    /* renamed from: a */
    default void mo44402a(byte[] bArr, le1 le1Var) {
    }
}
