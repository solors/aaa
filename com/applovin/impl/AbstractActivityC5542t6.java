package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.t6 */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5542t6 extends Activity {

    /* renamed from: a */
    private C5679v6 f10820a;

    /* renamed from: b */
    private C5416j f10821b;

    /* renamed from: c */
    private TextView f10822c;

    /* renamed from: d */
    private Button f10823d;

    /* renamed from: a */
    public static /* synthetic */ void m94532a(AbstractActivityC5542t6 abstractActivityC5542t6, View view) {
        abstractActivityC5542t6.m94533a(view);
    }

    /* renamed from: b */
    private void m94530b() {
        C5118pc c5118pc = new C5118pc();
        c5118pc.m96565a(this.f10821b.m95045v().m93311a(this.f10820a));
        String m93303b = this.f10821b.m95045v().m93303b(this.f10820a.m93966a());
        if (m93303b != null) {
            c5118pc.m96565a("\nBid Response Preview:\n");
            c5118pc.m96565a(m93303b);
        }
        TextView textView = (TextView) findViewById(C6200R.C6205id.email_report_tv);
        this.f10822c = textView;
        textView.setText(c5118pc.toString());
        this.f10822c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m94534a()) {
            finish();
            return;
        }
        setTitle(this.f10820a.m93964c() + " - " + this.f10820a.m93963d());
        setContentView(C6200R.C6206layout.creative_debugger_displayed_ad_detail_activity);
        m94530b();
        Button button = (Button) findViewById(C6200R.C6205id.report_ad_button);
        this.f10823d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.f50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC5542t6.m94532a(AbstractActivityC5542t6.this, view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C6200R.C6207menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!m94534a()) {
            finish();
            return false;
        } else if (C6200R.C6205id.action_share == menuItem.getItemId()) {
            this.f10821b.m95045v().m93310a(this.f10820a, (Context) this, false);
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* renamed from: a */
    public void m94531a(C5679v6 c5679v6, C5416j c5416j) {
        this.f10820a = c5679v6;
        this.f10821b = c5416j;
    }

    /* renamed from: a */
    private boolean m94534a() {
        return (this.f10820a == null || this.f10821b == null) ? false : true;
    }

    /* renamed from: a */
    public /* synthetic */ void m94533a(View view) {
        this.f10821b.m95045v().m93310a(this.f10820a, (Context) this, true);
    }
}
