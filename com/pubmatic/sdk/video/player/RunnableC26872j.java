package com.pubmatic.sdk.video.player;

import android.view.View;

/* renamed from: com.pubmatic.sdk.video.player.j */
/* loaded from: classes7.dex */
class RunnableC26872j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f70993a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26872j(View view) {
        this.f70993a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f70993a.setVisibility(4);
    }
}
