package com.bytedance.sdk.openadsdk.core.p321Ta.eqN;

import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.C6472eqN;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6495bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.Ta.eqN.bX */
/* loaded from: classes3.dex */
public class C8733bX extends C6472eqN {
    private final C8736bg eqN;

    /* renamed from: bg */
    private final List<InterfaceC8735IL> f19316bg = Collections.synchronizedList(new ArrayList());

    /* renamed from: IL */
    private int f19314IL = 1;

    /* renamed from: bX */
    private int f19315bX = 1;

    /* renamed from: com.bytedance.sdk.openadsdk.core.Ta.eqN.bX$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC8735IL extends InterfaceC6496bg.InterfaceC6497bg {
        /* renamed from: bg */
        void mo84985bg(int i, int i2);
    }

    public C8733bX() {
        C8736bg c8736bg = new C8736bg();
        this.eqN = c8736bg;
        super.mo85066bg(c8736bg);
        m91801bg(500);
    }

    /* renamed from: bg */
    static /* synthetic */ int m85065bg(C8733bX c8733bX) {
        int i = c8733bX.f19315bX;
        c8733bX.f19315bX = i + 1;
        return i;
    }

    /* renamed from: Fy */
    public int m85070Fy() {
        return this.f19315bX;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.C6472eqN
    /* renamed from: vb */
    public long mo85064vb() {
        return super.mo85064vb() * this.f19314IL;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.C6472eqN
    public long xxp() {
        return super.xxp() + ((this.f19315bX - 1) * super.mo85064vb());
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.Ta.eqN.bX$bg */
    /* loaded from: classes3.dex */
    private class C8736bg implements InterfaceC6496bg.InterfaceC6497bg {
        private C8736bg() {
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: IL */
        public void mo84988IL(InterfaceC6496bg interfaceC6496bg) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84988IL(interfaceC6496bg);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bX */
        public void mo84986bX(InterfaceC6496bg interfaceC6496bg) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84986bX(interfaceC6496bg);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84984bg(InterfaceC6496bg interfaceC6496bg) {
            C8733bX.m85065bg(C8733bX.this);
            if (C8733bX.this.f19315bX <= C8733bX.this.f19314IL) {
                for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                    interfaceC8735IL.mo84985bg(C8733bX.this.f19315bX, C8733bX.this.f19314IL);
                }
                C8733bX.this.m91807WR();
                return;
            }
            for (InterfaceC8735IL interfaceC8735IL2 : C8733bX.this.f19316bg) {
                interfaceC8735IL2.mo84984bg(interfaceC6496bg);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        public void eqN(InterfaceC6496bg interfaceC6496bg) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.eqN(interfaceC6496bg);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: zx */
        public void mo84976zx(InterfaceC6496bg interfaceC6496bg) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84976zx(interfaceC6496bg);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: IL */
        public void mo84987IL(InterfaceC6496bg interfaceC6496bg, int i) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84987IL(interfaceC6496bg, i);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84980bg(InterfaceC6496bg interfaceC6496bg, long j) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84980bg(interfaceC6496bg, j);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84978bg(InterfaceC6496bg interfaceC6496bg, C6495bg c6495bg) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84978bg(interfaceC6496bg, c6495bg);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84977bg(InterfaceC6496bg interfaceC6496bg, boolean z) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84977bg(interfaceC6496bg, z);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84982bg(InterfaceC6496bg interfaceC6496bg, int i, int i2) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84982bg(interfaceC6496bg, i, i2);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84981bg(InterfaceC6496bg interfaceC6496bg, int i, int i2, int i3) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84981bg(interfaceC6496bg, i, i2, i3);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84983bg(InterfaceC6496bg interfaceC6496bg, int i) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84983bg(interfaceC6496bg, i);
            }
        }

        @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.InterfaceC6496bg.InterfaceC6497bg
        /* renamed from: bg */
        public void mo84979bg(InterfaceC6496bg interfaceC6496bg, long j, long j2) {
            for (InterfaceC8735IL interfaceC8735IL : C8733bX.this.f19316bg) {
                interfaceC8735IL.mo84979bg(interfaceC6496bg, j, j2);
            }
        }
    }

    /* renamed from: bX */
    public void m85068bX(int i) {
        this.f19314IL = Math.max(1, i);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.eqN.C6472eqN
    /* renamed from: bg */
    public void mo85066bg(InterfaceC6496bg.InterfaceC6497bg interfaceC6497bg) {
        if (interfaceC6497bg instanceof InterfaceC8735IL) {
            if (this.f19316bg.contains(interfaceC6497bg)) {
                return;
            }
            this.f19316bg.add((InterfaceC8735IL) interfaceC6497bg);
            return;
        }
        super.mo85066bg(interfaceC6497bg);
    }
}
