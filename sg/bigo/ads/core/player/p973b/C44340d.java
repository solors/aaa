package sg.bigo.ads.core.player.p973b;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;

/* renamed from: sg.bigo.ads.core.player.b.d */
/* loaded from: classes10.dex */
public final class C44340d extends TextureView {

    /* renamed from: a */
    int f116436a;

    /* renamed from: b */
    int f116437b;

    /* renamed from: c */
    private int f116438c;

    public C44340d(Context context, int i, int i2, int i3) {
        super(context);
        FrameLayout.LayoutParams layoutParams;
        this.f116436a = i;
        this.f116437b = i2;
        this.f116438c = i3;
        if (i3 != 1 && i3 != 4) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        }
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r12 != 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        if ((r11 * r5) < (r12 * r3)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        if ((r11 * r5) >= (r12 * r3)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        r5 = (r12 * r3) / r11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.player.p973b.C44340d.onMeasure(int, int):void");
    }
}
