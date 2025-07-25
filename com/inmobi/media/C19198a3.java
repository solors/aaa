package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.a3 */
/* loaded from: classes6.dex */
public final class C19198a3 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C19198a3 f48064a = new C19198a3();

    public C19198a3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        Object obj;
        int i;
        Context m61068d = C18954Ha.m61068d();
        AudioManager audioManager = null;
        if (m61068d != null) {
            obj = m61068d.getSystemService("audio");
        } else {
            obj = null;
        }
        if (obj instanceof AudioManager) {
            audioManager = (AudioManager) obj;
        }
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = 15;
        }
        return Integer.valueOf(i);
    }
}
