package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp;

import com.zeus.gmc.sdk.mobileads.msa.adjump.FailError;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.AdInfoBean;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.jujujpjjp */
/* loaded from: classes8.dex */
public class C32786jujujpjjp implements InterfaceC32785jjuuju {
    private static final int jjuuju = 1;
    private static final int jujujpjjp = 15000;
    private static final int puujujuupp = 15;
    private static final int uppjpjj = 20000;
    private AdInfoBean jupppjuju;
    private int uppj;
    private int jpjjjjp = 15000;
    private int ujjuupp = 20000;
    private int jjppjjupu = 1;
    private int upupjjppj = 15;

    public C32786jujujpjjp(AdInfoBean adInfoBean) {
        this.jupppjuju = adInfoBean;
    }

    @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.InterfaceC32785jjuuju
    public int jjuuju() {
        return this.ujjuupp;
    }

    public AdInfoBean jpjjjjp() {
        return this.jupppjuju;
    }

    @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.InterfaceC32785jjuuju
    public int jujujpjjp() {
        return this.uppj;
    }

    @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.InterfaceC32785jjuuju
    public int jupppjuju() {
        return this.jjppjjupu;
    }

    @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.InterfaceC32785jjuuju
    public int puujujuupp() {
        return this.upupjjppj;
    }

    @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.InterfaceC32785jjuuju
    public int uppjpjj() {
        return this.jpjjjjp;
    }

    public void jjuuju(int i) {
        this.jjppjjupu = i;
    }

    @Override // com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp.InterfaceC32785jjuuju
    public void jujujpjjp(FailError failError) throws FailError {
        int i = this.uppj + 1;
        this.uppj = i;
        if (i >= this.jjppjjupu) {
            throw failError;
        }
    }

    public void puujujuupp(int i) {
        this.ujjuupp = i;
    }

    public void uppjpjj(int i) {
        this.upupjjppj = i;
    }

    public void jujujpjjp(int i) {
        this.jpjjjjp = i;
    }
}
