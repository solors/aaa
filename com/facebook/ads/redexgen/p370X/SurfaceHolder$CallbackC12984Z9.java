package com.facebook.ads.redexgen.p370X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Z9 */
/* loaded from: assets/audience_network.dex */
public final class SurfaceHolder$CallbackC12984Z9 implements InterfaceC11975Ii, InterfaceC11514Ao, InterfaceC11809Fw, InterfaceC11686De, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"s1XoKYuOWujOozdgD26BdexE0JndoY0p", "ug", "yyipXdVJL0NW5jruXnuLHtd7HNthnOQs", "Np", "T3S7xgCH4xR7Lhcdh7IaJmLB92LvoGO6", "Lv6Qm0KobCIJpmcapSGTsoPqXtQ8zU", "F4ppLo9DkT8dpVqKTMmIcH3FimXW4jNn", "MKgJM"};
    public final /* synthetic */ C11728Eb A00;

    public SurfaceHolder$CallbackC12984Z9(C11728Eb c11728Eb) {
        this.A00 = c11728Eb;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11514Ao
    public final void ABE(String str, long j, long j2) {
        Iterator it = C11728Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11514Ao) it.next()).ABE(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11514Ao
    public final void ABF(C11543BH c11543bh) {
        Iterator it = C11728Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11514Ao) it.next()).ABF(c11543bh);
        }
        C11728Eb.A04(this.A00, null);
        C11728Eb.A06(this.A00, null);
        C11728Eb.A00(this.A00, 0);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11514Ao
    public final void ABG(C11543BH c11543bh) {
        C11728Eb.A06(this.A00, c11543bh);
        Iterator it = C11728Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11514Ao) it.next()).ABG(c11543bh);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11514Ao
    public final void ABH(Format format) {
        C11728Eb.A04(this.A00, format);
        Iterator it = C11728Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11514Ao) it.next()).ABH(format);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11514Ao
    public final void ABI(int i) {
        C11728Eb.A00(this.A00, i);
        Iterator it = C11728Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11514Ao) it.next()).ABI(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11514Ao
    public final void ABJ(int i, long j, long j2) {
        Iterator it = C11728Eb.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[2].charAt(5) != 'd') {
                throw new RuntimeException();
            }
            A01[5] = "pWHwh8J2y";
            if (hasNext) {
                ((InterfaceC11514Ao) it.next()).ABJ(i, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11809Fw
    public final void ABg(List<C11805Fs> list) {
        C11728Eb.A08(this.A00, list);
        Iterator it = C11728Eb.A09(this.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new RuntimeException();
            }
            A01[2] = "lmorwd809xRnhQYXqopS36rQVvvPOgfq";
            ((InterfaceC11809Fw) next).ABg(list);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11975Ii
    public final void ABo(int i, long j) {
        Iterator it = C11728Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11975Ii) it.next()).ABo(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11686De
    public final void ACl(Metadata metadata) {
        Iterator it = C11728Eb.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11686De) it.next()).ACl(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11975Ii
    public final void ADM(Surface surface) {
        if (C11728Eb.A01(this.A00) == surface) {
            Iterator it = C11728Eb.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = C11728Eb.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((InterfaceC11975Ii) it2.next()).ADM(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11975Ii
    public final void ADx(String str, long j, long j2) {
        Iterator it = C11728Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            InterfaceC11975Ii interfaceC11975Ii = (InterfaceC11975Ii) it.next();
            String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "98uEWQJnNgSuENriuK2INOdUeiEIyWaZ";
            strArr2[4] = "eHkHjIDMEmUBDLT9VWPNpXXI3kSowk0p";
            interfaceC11975Ii.ADx(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11975Ii
    public final void ADy(C11543BH c11543bh) {
        Iterator it = C11728Eb.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[2].charAt(5) != 'd') {
                break;
            }
            A01[2] = "JrZfHdmFrRR6AyhIh3YYEfnATxgqdiz0";
            if (hasNext) {
                InterfaceC11975Ii interfaceC11975Ii = (InterfaceC11975Ii) it.next();
                if (A01[2].charAt(5) != 'd') {
                    break;
                }
                String[] strArr = A01;
                strArr[3] = "VQ";
                strArr[1] = "Nl";
                interfaceC11975Ii.ADy(c11543bh);
            } else {
                C11728Eb c11728Eb = this.A00;
                String[] strArr2 = A01;
                if (strArr2[6].charAt(15) != strArr2[4].charAt(15)) {
                    A01[0] = "lOLMdoznQQ3DqAD1wG39jRlc0poGBnju";
                    C11728Eb.A03(c11728Eb, null);
                    C11728Eb.A05(this.A00, null);
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11975Ii
    public final void ADz(C11543BH c11543bh) {
        C11728Eb.A05(this.A00, c11543bh);
        Iterator it = C11728Eb.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[7] = "IZFKv";
            if (!hasNext) {
                return;
            }
            Object next = it.next();
            if (A01[0].charAt(24) != '0') {
                A01[2] = "cfU7KdfDtZpXBm3qFW7t619pDkxhYS61";
                ((InterfaceC11975Ii) next).ADz(c11543bh);
            } else {
                A01[5] = "KzmuGXxm";
                ((InterfaceC11975Ii) next).ADz(c11543bh);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11975Ii
    public final void AE3(Format format) {
        C11728Eb.A03(this.A00, format);
        Iterator it = C11728Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC11975Ii) it.next()).AE3(format);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11975Ii
    public final void AE8(int i, int i2, int i3, float f) {
        Iterator it = C11728Eb.A0C(this.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (A01[0].charAt(24) != '0') {
                throw new RuntimeException();
            }
            A01[5] = "XVq90yYfVTt0";
            ((InterfaceC11966IZ) next).AE8(i, i2, i3, f);
        }
        Iterator it2 = C11728Eb.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (A01[2].charAt(5) != 'd') {
                ((InterfaceC11975Ii) next2).AE8(i, i2, i3, f);
            } else {
                A01[0] = "EzBATBLX59597vwh6aXI5FCM0yhDVwG8";
                ((InterfaceC11975Ii) next2).AE8(i, i2, i3, f);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C11728Eb.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C11728Eb.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C11728Eb.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C11728Eb.A0H(this.A00, null, false);
    }
}
