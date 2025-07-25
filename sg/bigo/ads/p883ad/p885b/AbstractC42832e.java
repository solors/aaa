package sg.bigo.ads.p883ad.p885b;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.InterfaceC43501Ad;
import sg.bigo.ads.api.core.C43562g;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p940w.C43887b;
import sg.bigo.ads.p883ad.AbstractC42898d;

/* renamed from: sg.bigo.ads.ad.b.e */
/* loaded from: classes10.dex */
public abstract class AbstractC42832e<T extends InterfaceC43501Ad, U extends InterfaceC43550c> extends AbstractC42898d<T, U> {

    /* renamed from: H */
    boolean f112151H;

    /* renamed from: I */
    public Integer f112152I;

    /* renamed from: t */
    private boolean f112153t;

    /* renamed from: u */
    private Integer f112154u;

    public AbstractC42832e(@NonNull C43562g c43562g) {
        super(c43562g);
        this.f112153t = false;
        this.f112151H = false;
    }

    @Nullable
    /* renamed from: C */
    public final Integer m6528C() {
        if (m6527D()) {
            return null;
        }
        return this.f112154u;
    }

    /* renamed from: D */
    public final boolean m6527D() {
        if (!this.f112153t) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m6526a(final Bitmap bitmap, final int i) {
        if (m6527D() || this.f112151H || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f112151H = true;
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.e.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (i == 1) {
                        AbstractC42832e.this.f112152I = C43887b.m4679a(bitmap);
                        return;
                    }
                    AbstractC42832e.this.f112154u = C43887b.m4679a(bitmap);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: b */
    public void mo6523b(boolean z) {
        this.f112153t = z;
    }
}
