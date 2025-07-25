package com.fyber.inneractive.sdk.video;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.cache.C14759m;
import com.fyber.inneractive.sdk.util.AbstractC15469r;
import com.fyber.inneractive.sdk.util.EnumC15477v;
import com.fyber.inneractive.sdk.util.InterfaceC15475u;

/* renamed from: com.fyber.inneractive.sdk.video.a */
/* loaded from: classes4.dex */
public final class C15484a implements InterfaceC15475u {
    @Override // com.fyber.inneractive.sdk.util.InterfaceC15475u
    /* renamed from: a */
    public final boolean mo76443a() {
        if (!TextUtils.equals("vid_cache", "vid_cache") || !C14759m.f27975f.f27978c || !AbstractC15469r.m76470a()) {
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15475u
    public final EnumC15477v getType() {
        return EnumC15477v.Video;
    }
}
