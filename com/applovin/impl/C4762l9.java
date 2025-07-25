package com.applovin.impl;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.C5829x6;
import com.applovin.impl.InterfaceC5899y7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.l9 */
/* loaded from: classes2.dex */
public final class C4762l9 implements InterfaceC5899y7 {

    /* renamed from: d */
    public static final InterfaceC5899y7.InterfaceC5902c f7708d = new InterfaceC5899y7.InterfaceC5902c() { // from class: com.applovin.impl.zy
        @Override // com.applovin.impl.InterfaceC5899y7.InterfaceC5902c
        /* renamed from: a */
        public final InterfaceC5899y7 mo92304a(UUID uuid) {
            InterfaceC5899y7 m97771b;
            m97771b = C4762l9.m97771b(uuid);
            return m97771b;
        }
    };

    /* renamed from: a */
    private final UUID f7709a;

    /* renamed from: b */
    private final MediaDrm f7710b;

    /* renamed from: c */
    private int f7711c;

    /* renamed from: com.applovin.impl.l9$a */
    /* loaded from: classes2.dex */
    private static class C4763a {
        /* renamed from: a */
        public static boolean m97764a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }
    }

    private C4762l9(UUID uuid) {
        AbstractC4100b1.m100583a(uuid);
        AbstractC4100b1.m100579a(!AbstractC5538t2.f10799b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7709a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m97775a(uuid));
        this.f7710b = mediaDrm;
        this.f7711c = 1;
        if (AbstractC5538t2.f10801d.equals(uuid) && m97767e()) {
            m97779a(mediaDrm);
        }
    }

    /* renamed from: e */
    private static boolean m97767e() {
        return "ASUS_Z00AD".equals(AbstractC5863xp.f12154d);
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: b */
    public InterfaceC5899y7.C5903d mo92801b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f7710b.getProvisionRequest();
        return new InterfaceC5899y7.C5903d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: c */
    public int mo92798c() {
        return 2;
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: f */
    public C4704k9 mo92795d(byte[] bArr) {
        boolean z;
        if (AbstractC5863xp.f12151a < 21 && AbstractC5538t2.f10801d.equals(this.f7709a) && "L3".equals(m97776a("securityLevel"))) {
            z = true;
        } else {
            z = false;
        }
        return new C4704k9(m97775a(this.f7709a), bArr, z);
    }

    /* renamed from: a */
    private static void m97779a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: e */
    private static byte[] m97766e(byte[] bArr) {
        int indexOf;
        C4066ah c4066ah = new C4066ah(bArr);
        int m100772m = c4066ah.m100772m();
        short m100770o = c4066ah.m100770o();
        short m100770o2 = c4066ah.m100770o();
        if (m100770o == 1 && m100770o2 == 1) {
            short m100770o3 = c4066ah.m100770o();
            Charset charset = Charsets.UTF_16LE;
            String m100794a = c4066ah.m100794a(m100770o3, charset);
            if (m100794a.contains("<LA_URL>")) {
                return bArr;
            }
            if (m100794a.indexOf("</DATA>") == -1) {
                AbstractC5063oc.m96800d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = m100794a.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + m100794a.substring(indexOf);
            int i = m100772m + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort(m100770o);
            allocate.putShort(m100770o2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        AbstractC5063oc.m96802c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: c */
    public void mo92797c(byte[] bArr) {
        this.f7710b.closeSession(bArr);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC5899y7 m97771b(UUID uuid) {
        try {
            return m97769c(uuid);
        } catch (C5523sp unused) {
            AbstractC5063oc.m96805b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C4381f7();
        }
    }

    /* renamed from: c */
    public static C4762l9 m97769c(UUID uuid) {
        try {
            return new C4762l9(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C5523sp(1, e);
        } catch (Exception e2) {
            throw new C5523sp(2, e2);
        }
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: a */
    public InterfaceC5899y7.C5900a mo92803a(byte[] bArr, List list, int i, HashMap hashMap) {
        C5829x6.C5831b c5831b;
        byte[] bArr2;
        String str;
        if (list != null) {
            c5831b = m97773a(this.f7709a, list);
            bArr2 = m97770b(this.f7709a, (byte[]) AbstractC4100b1.m100583a(c5831b.f11941f));
            str = m97774a(this.f7709a, c5831b.f11940d);
        } else {
            c5831b = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f7710b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] m97772a = m97772a(this.f7709a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && c5831b != null && !TextUtils.isEmpty(c5831b.f11939c)) {
            defaultUrl = c5831b.f11939c;
        }
        return new InterfaceC5899y7.C5900a(m97772a, defaultUrl, AbstractC5863xp.f12151a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: d */
    public byte[] mo92796d() {
        return this.f7710b.openSession();
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: b */
    public Map mo92800b(byte[] bArr) {
        return this.f7710b.queryKeyStatus(bArr);
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: b */
    public byte[] mo92799b(byte[] bArr, byte[] bArr2) {
        if (AbstractC5538t2.f10800c.equals(this.f7709a)) {
            bArr2 = AbstractC4563i3.m98551b(bArr2);
        }
        return this.f7710b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m97770b(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = com.applovin.impl.AbstractC5538t2.f10802e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.applovin.impl.AbstractC4655ji.m98168a(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = m97766e(r4)
            byte[] r4 = com.applovin.impl.AbstractC4655ji.m98171a(r0, r4)
        L18:
            int r1 = com.applovin.impl.AbstractC5863xp.f12151a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.applovin.impl.AbstractC5538t2.f10801d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.AbstractC5863xp.f12153c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.AbstractC5863xp.f12154d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = com.applovin.impl.AbstractC4655ji.m98168a(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C4762l9.m97770b(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: a */
    public String m97776a(String str) {
        return this.f7710b.getPropertyString(str);
    }

    /* renamed from: a */
    public /* synthetic */ void m97777a(InterfaceC5899y7.InterfaceC5901b interfaceC5901b, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        interfaceC5901b.mo92792a(this, bArr, i, i2, bArr2);
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: a */
    public void mo92805a(byte[] bArr) {
        this.f7710b.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: a */
    public synchronized void mo92807a() {
        int i = this.f7711c - 1;
        this.f7711c = i;
        if (i == 0) {
            this.f7710b.release();
        }
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: a */
    public void mo92802a(byte[] bArr, byte[] bArr2) {
        this.f7710b.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: a */
    public void mo92806a(final InterfaceC5899y7.InterfaceC5901b interfaceC5901b) {
        this.f7710b.setOnEventListener(interfaceC5901b == null ? null : new MediaDrm.OnEventListener() { // from class: com.applovin.impl.az
            {
                C4762l9.this = this;
            }

            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C4762l9.this.m97777a(interfaceC5901b, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.applovin.impl.InterfaceC5899y7
    /* renamed from: a */
    public boolean mo92804a(byte[] bArr, String str) {
        if (AbstractC5863xp.f12151a >= 31) {
            return C4763a.m97764a(this.f7710b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f7709a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: a */
    private static C5829x6.C5831b m97773a(UUID uuid, List list) {
        if (!AbstractC5538t2.f10801d.equals(uuid)) {
            return (C5829x6.C5831b) list.get(0);
        }
        if (AbstractC5863xp.f12151a >= 28 && list.size() > 1) {
            C5829x6.C5831b c5831b = (C5829x6.C5831b) list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C5829x6.C5831b c5831b2 = (C5829x6.C5831b) list.get(i2);
                byte[] bArr = (byte[]) AbstractC4100b1.m100583a(c5831b2.f11941f);
                if (AbstractC5863xp.m93016a((Object) c5831b2.f11940d, (Object) c5831b.f11940d) && AbstractC5863xp.m93016a((Object) c5831b2.f11939c, (Object) c5831b.f11939c) && AbstractC4655ji.m98169a(bArr)) {
                    i += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                byte[] bArr3 = (byte[]) AbstractC4100b1.m100583a(((C5829x6.C5831b) list.get(i4)).f11941f);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            return c5831b.m93219a(bArr2);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C5829x6.C5831b c5831b3 = (C5829x6.C5831b) list.get(i5);
            int m98165d = AbstractC4655ji.m98165d((byte[]) AbstractC4100b1.m100583a(c5831b3.f11941f));
            int i6 = AbstractC5863xp.f12151a;
            if (i6 < 23 && m98165d == 0) {
                return c5831b3;
            }
            if (i6 >= 23 && m98165d == 1) {
                return c5831b3;
            }
        }
        return (C5829x6.C5831b) list.get(0);
    }

    /* renamed from: a */
    private static UUID m97775a(UUID uuid) {
        return (AbstractC5863xp.f12151a >= 27 || !AbstractC5538t2.f10800c.equals(uuid)) ? uuid : AbstractC5538t2.f10799b;
    }

    /* renamed from: a */
    private static String m97774a(UUID uuid, String str) {
        return (AbstractC5863xp.f12151a < 26 && AbstractC5538t2.f10800c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    /* renamed from: a */
    private static byte[] m97772a(UUID uuid, byte[] bArr) {
        return AbstractC5538t2.f10800c.equals(uuid) ? AbstractC4563i3.m98553a(bArr) : bArr;
    }
}
