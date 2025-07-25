package com.fyber.inneractive.sdk.player.controller;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.config.global.features.C14356c;
import com.fyber.inneractive.sdk.util.AbstractC15450h0;

/* renamed from: com.fyber.inneractive.sdk.player.controller.E */
/* loaded from: classes4.dex */
public final class C14764E {

    /* renamed from: a */
    public final C14787v f27985a;

    /* renamed from: b */
    public final Dialog f27986b;

    public C14764E(Context context, C14356c c14356c, C14787v c14787v) {
        this.f27985a = c14787v;
        Dialog dialog = new Dialog(context);
        this.f27986b = dialog;
        dialog.requestWindowFeature(1);
        dialog.setContentView(C14169R.C14173layout.ia_layout_skip_rewarded_dialog);
        Button button = (Button) dialog.findViewById(C14169R.C14172id.ia_keep_watching_button);
        Button button2 = (Button) dialog.findViewById(C14169R.C14172id.ia_close_button);
        TextView textView = (TextView) dialog.findViewById(C14169R.C14172id.ia_skip_dialog_title_textview);
        TextView textView2 = (TextView) dialog.findViewById(C14169R.C14172id.ia_skip_dialog_sub_title_textview);
        String string = context.getString(C14169R.C14174string.ia_skip_rewarded_dialog_keep_watching);
        String string2 = context.getString(C14169R.C14174string.ia_skip_rewarded_dialog_close_button);
        String string3 = context.getString(C14169R.C14174string.ia_skip_rewarded_dialog_title);
        String string4 = context.getString(C14169R.C14174string.ia_skip_rewarded_dialog_sub_title);
        if (c14356c != null) {
            String mo77933a = c14356c.mo77933a("skip_reward_dialog_keep_watching_button", "KEEP WATCHING");
            String trim = mo77933a.trim().length() > 0 ? mo77933a.trim() : "KEEP WATCHING";
            string = TextUtils.isEmpty(trim) ? string : trim;
            String mo77933a2 = c14356c.mo77933a("skip_reward_dialog_close_button", "CLOSE");
            String trim2 = mo77933a2.trim().length() > 0 ? mo77933a2.trim() : "CLOSE";
            string2 = TextUtils.isEmpty(trim2) ? string2 : trim2;
            String mo77933a3 = c14356c.mo77933a("skip_reward_dialog_title", "Close Video?");
            String trim3 = mo77933a3.trim().length() > 0 ? mo77933a3.trim() : "Close Video?";
            string3 = TextUtils.isEmpty(trim3) ? string3 : trim3;
            String mo77933a4 = c14356c.mo77933a("skip_reward_dialog_sub_title", "Reward will not be received before video completion.");
            String trim4 = mo77933a4.trim().length() > 0 ? mo77933a4.trim() : "Reward will not be received before video completion.";
            if (!TextUtils.isEmpty(trim4)) {
                string4 = trim4;
            }
        }
        button.setText(AbstractC15450h0.m76502a(string, 13));
        button2.setText(AbstractC15450h0.m76502a(string2, 13));
        textView.setText(AbstractC15450h0.m76502a(string3, 20));
        textView2.setText(AbstractC15450h0.m76502a(string4, 100));
        button2.setOnClickListener(new View$OnClickListenerC14762C(this));
        button.setOnClickListener(new View$OnClickListenerC14763D(this));
    }
}
