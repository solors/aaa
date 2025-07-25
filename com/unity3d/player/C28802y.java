package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.y */
/* loaded from: classes7.dex */
public class C28802y extends EditText {

    /* renamed from: a */
    final /* synthetic */ DialogC28698B f74904a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28802y(DialogC28698B dialogC28698B, Context context) {
        super(context);
        this.f74904a = dialogC28698B;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        String m37760b;
        String m37760b2;
        if (i == 4) {
            DialogC28698B dialogC28698B = this.f74904a;
            m37760b2 = dialogC28698B.m37760b();
            dialogC28698B.m37762a(m37760b2, true);
            return true;
        } else if (i == 84) {
            return true;
        } else {
            if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
                DialogC28698B dialogC28698B2 = this.f74904a;
                m37760b = dialogC28698B2.m37760b();
                dialogC28698B2.m37762a(m37760b, false);
                return true;
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        UnityPlayer unityPlayer;
        unityPlayer = this.f74904a.f74513b;
        unityPlayer.reportSoftInputSelection(i, i2 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        Context context;
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            context = this.f74904a.f74512a;
            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(this, 0);
        }
    }
}
