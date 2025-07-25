package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.Z2 */
/* loaded from: classes6.dex */
public final class C19184Z2 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C19184Z2 f48031a = new C19184Z2();

    public C19184Z2() {
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
            i = audioManager.getStreamVolume(3);
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
