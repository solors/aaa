package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.z */
/* loaded from: classes7.dex */
public class C28803z implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ DialogC28698B f74905a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28803z(DialogC28698B dialogC28698B) {
        this.f74905a = dialogC28698B;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String m37760b;
        if (i == 6) {
            DialogC28698B dialogC28698B = this.f74905a;
            m37760b = dialogC28698B.m37760b();
            dialogC28698B.m37762a(m37760b, false);
        }
        return false;
    }
}
