package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.mraid.a */
/* loaded from: classes10.dex */
final class C44233a extends ContentObserver {

    /* renamed from: a */
    private float f116122a;

    /* renamed from: b */
    private final Context f116123b;

    /* renamed from: c */
    private final InterfaceC44234a f116124c;

    /* renamed from: sg.bigo.ads.core.mraid.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC44234a {
        /* renamed from: a */
        void mo3480a(float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44233a(Handler handler, Context context, InterfaceC44234a interfaceC44234a) {
        super(handler);
        this.f116122a = -1.0f;
        this.f116123b = context.getApplicationContext();
        this.f116124c = interfaceC44234a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        AudioManager audioManager = (AudioManager) this.f116123b.getSystemService("audio");
        float f = 100.0f;
        if (audioManager != null) {
            f = 100.0f * (audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3));
        }
        if (f != this.f116122a) {
            this.f116122a = f;
            C43782a.m5010a(0, 3, "AudioVolumeContentObserver", String.format("Volume change, current value: %s", Float.valueOf(f)));
            InterfaceC44234a interfaceC44234a = this.f116124c;
            if (interfaceC44234a != null) {
                interfaceC44234a.mo3480a(this.f116122a);
            }
        }
    }
}
