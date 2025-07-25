package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.measurement.C14588g;
import com.fyber.inneractive.sdk.player.controller.InterfaceC14781p;
import com.fyber.inneractive.sdk.player.enums.EnumC14795b;
import com.fyber.inneractive.sdk.player.mediaplayer.C15174o;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.p */
/* loaded from: classes4.dex */
public final class C15178p implements InterfaceC14781p {

    /* renamed from: a */
    public final C14588g f30002a;

    /* renamed from: b */
    public boolean f30003b = false;

    /* renamed from: c */
    public boolean f30004c = false;

    /* renamed from: d */
    public boolean f30005d = false;

    public C15178p(C14588g c14588g) {
        this.f30002a = c14588g;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC14781p
    /* renamed from: a */
    public final void mo77097a(C15174o c15174o) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC14781p
    /* renamed from: a */
    public final void mo77098a(EnumC14795b enumC14795b) {
        IAlog.m76529a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", enumC14795b, String.valueOf(this.f30003b), String.valueOf(this.f30005d));
        if (this.f30002a != null) {
            int i = AbstractC15177o.f30001a[enumC14795b.ordinal()];
            if (i == 1) {
                this.f30005d = true;
            } else if (i == 2) {
                if (this.f30005d) {
                    C14588g c14588g = this.f30002a;
                    if (c14588g.f27630c != null) {
                        IAlog.m76529a("%s bufferStart", "OMVideo");
                        try {
                            c14588g.f27630c.bufferStart();
                        } catch (Throwable th) {
                            c14588g.m77784a(th);
                        }
                    }
                    this.f30003b = true;
                }
            } else if (i != 3) {
                if (i == 4) {
                    C14588g c14588g2 = this.f30002a;
                    if (c14588g2.f27630c != null) {
                        IAlog.m76529a("%s pause", "OMVideo");
                        try {
                            c14588g2.f27630c.pause();
                        } catch (Throwable th2) {
                            c14588g2.m77784a(th2);
                        }
                    }
                    this.f30004c = true;
                } else if (i != 5) {
                } else {
                    C14588g c14588g3 = this.f30002a;
                    if (c14588g3.f27630c != null) {
                        IAlog.m76529a("%s complete", "OMVideo");
                        try {
                            c14588g3.f27630c.complete();
                        } catch (Throwable th3) {
                            c14588g3.m77784a(th3);
                        }
                    }
                }
            } else if (this.f30003b) {
                this.f30003b = false;
                C14588g c14588g4 = this.f30002a;
                if (c14588g4.f27630c != null) {
                    IAlog.m76529a("%s bufferEnd", "OMVideo");
                    try {
                        c14588g4.f27630c.bufferFinish();
                    } catch (Throwable th4) {
                        c14588g4.m77784a(th4);
                    }
                }
            } else if (this.f30004c) {
                C14588g c14588g5 = this.f30002a;
                if (c14588g5.f27630c != null) {
                    IAlog.m76529a("%s resume", "OMVideo");
                    try {
                        c14588g5.f27630c.resume();
                    } catch (Throwable th5) {
                        c14588g5.m77784a(th5);
                    }
                }
                this.f30004c = false;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC14781p
    /* renamed from: d */
    public final void mo77095d() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC14781p
    /* renamed from: c */
    public final void mo77096c(boolean z) {
    }
}
