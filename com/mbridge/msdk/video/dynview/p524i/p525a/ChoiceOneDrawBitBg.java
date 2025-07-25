package com.mbridge.msdk.video.dynview.p524i.p525a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.tools.FastBlurUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.ViewOption;
import com.mbridge.msdk.video.dynview.p522g.BackgroundDrawable;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.i.a.a */
/* loaded from: classes6.dex */
public class ChoiceOneDrawBitBg {

    /* renamed from: a */
    private static volatile ChoiceOneDrawBitBg f60301a;

    /* renamed from: b */
    private View f60302b;

    /* renamed from: c */
    private Bitmap f60303c;

    /* renamed from: d */
    private Bitmap f60304d;

    private ChoiceOneDrawBitBg() {
    }

    /* renamed from: b */
    public final void m48933b() {
        if (this.f60302b != null) {
            this.f60302b = null;
        }
        Bitmap bitmap = this.f60303c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f60303c.recycle();
            this.f60303c = null;
        }
        Bitmap bitmap2 = this.f60304d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f60304d.recycle();
            this.f60304d = null;
        }
    }

    /* renamed from: a */
    public static ChoiceOneDrawBitBg m48937a() {
        ChoiceOneDrawBitBg choiceOneDrawBitBg;
        if (f60301a == null) {
            synchronized (ChoiceOneDrawBitBg.class) {
                if (f60301a == null) {
                    f60301a = new ChoiceOneDrawBitBg();
                }
                choiceOneDrawBitBg = f60301a;
            }
            return choiceOneDrawBitBg;
        }
        return f60301a;
    }

    /* renamed from: a */
    public final void m48934a(Map<String, Bitmap> map, ViewOption viewOption, View view) {
        if (view == null || viewOption == null || map == null || map.size() == 0 || map.size() < 2 || viewOption.m49026g() == null || viewOption.m49026g().size() < 2) {
            return;
        }
        this.f60302b = view;
        int m49028e = viewOption.m49028e();
        float m49029d = viewOption.m49029d();
        float m49030c = viewOption.m49030c();
        try {
            List<CampaignEx> m49026g = viewOption.m49026g();
            String md5 = m49026g.get(0) != null ? SameMD5.getMD5(m49026g.get(0).getImageUrl()) : "";
            String md52 = m49026g.get(1) != null ? SameMD5.getMD5(m49026g.get(1).getImageUrl()) : "";
            Bitmap bitmap = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            Bitmap bitmap2 = (TextUtils.isEmpty(md52) || !map.containsKey(md52)) ? null : map.get(md52);
            if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            m48936a(m49028e, m49029d, m49030c, bitmap, bitmap2);
        } catch (Exception e) {
            SameLogTool.m51824b("ChoiceOneDrawBitBg", e.getMessage());
        }
    }

    /* renamed from: a */
    private synchronized void m48936a(final int i, final float f, final float f2, final Bitmap bitmap, Bitmap bitmap2) {
        try {
            ThreadPoolUtils.m52228a().execute(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Bitmap m51639a = FastBlurUtil.m51639a(bitmap, 10);
                        Bitmap m51639a2 = FastBlurUtil.m51639a(bitmap, 10);
                        final BackgroundDrawable.C23007a m48975a = BackgroundDrawable.m48975a();
                        m48975a.m48970a(i).mo48960a(m51639a).mo48957b(m51639a2);
                        if (i == 2) {
                            float f3 = f;
                            float f4 = f2;
                            if (f3 > f4) {
                                m48975a.m48971a(f3).mo48958b(f2);
                            } else {
                                m48975a.m48971a(f4).mo48958b(f);
                            }
                        } else {
                            m48975a.m48971a(f).mo48958b(f2);
                        }
                        if (ChoiceOneDrawBitBg.this.f60302b != null) {
                            ChoiceOneDrawBitBg.this.f60302b.post(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (ChoiceOneDrawBitBg.this.f60302b != null && m48975a.m48972a() != null) {
                                        ChoiceOneDrawBitBg.this.f60302b.setBackground(m48975a.m48972a());
                                    }
                                }
                            });
                        }
                    } catch (Exception e) {
                        SameLogTool.m51824b("ChoiceOneDrawBitBg", e.getMessage());
                    }
                }
            });
        } catch (Exception e) {
            SameLogTool.m51827a("ChoiceOneDrawBitBg", e.getMessage());
        }
    }
}
