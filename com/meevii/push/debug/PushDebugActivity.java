package com.meevii.push.debug;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import p755k6.C37396g;
import p755k6.C37397h;

/* loaded from: classes5.dex */
public class PushDebugActivity extends AppCompatActivity {

    /* renamed from: k */
    private static String f61563k = "";

    /* renamed from: f */
    public /* synthetic */ void m47963f(View view) {
        finish();
    }

    /* renamed from: g */
    public /* synthetic */ void m47962g(View view) {
        if (TextUtils.isEmpty(f61563k)) {
            Toast.makeText(this, "当前token为空", 0).show();
            return;
        }
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("meevii_push_token", f61563k));
        Toast.makeText(this, "复制成功", 0).show();
    }

    public static void setToken(String str) {
        f61563k = str;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(C37397h.activity_push_debug);
        findViewById(C37396g.back_tv).setOnClickListener(new View.OnClickListener() { // from class: com.meevii.push.debug.a
            {
                PushDebugActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PushDebugActivity.this.m47963f(view);
            }
        });
        TextView textView = (TextView) findViewById(C37396g.token_tv);
        Button button = (Button) findViewById(C37396g.token_btn);
        if (TextUtils.isEmpty(f61563k)) {
            str = "当前无token";
        } else {
            str = f61563k;
        }
        textView.setText(str);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.meevii.push.debug.b
            {
                PushDebugActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PushDebugActivity.this.m47962g(view);
            }
        });
    }
}
