package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.sn */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5521sn extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f10756a;

    /* renamed from: b */
    private String f10757b;

    /* renamed from: c */
    private String f10758c;

    /* renamed from: a */
    private void m94590a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", this.f10758c);
        intent.putExtra("android.intent.extra.TITLE", this.f10757b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f10757b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f10756a;
    }

    public void initialize(String str, String str2, C5416j c5416j) {
        this.f10756a = c5416j;
        this.f10757b = str;
        this.f10758c = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_text_view_activity);
        setTitle(this.f10757b);
        ((TextView) findViewById(C6200R.C6205id.textView)).setText(this.f10758c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C6200R.C6207menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C6200R.C6205id.action_share == menuItem.getItemId()) {
            m94590a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
