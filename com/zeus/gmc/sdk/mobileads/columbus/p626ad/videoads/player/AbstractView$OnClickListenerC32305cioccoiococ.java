package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.analytic.AnalyticsInfo;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.common.EndCardStyleInfo;
import com.zeus.gmc.sdk.mobileads.columbus.common.SdkConfig;
import com.zeus.gmc.sdk.mobileads.columbus.common.VideoStyleInfo;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32468coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32470coiio2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32473coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.HandlerC32451cc2o22co2c;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32506c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.C32514cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.DialogC32515coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.InterfaceC32513c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.C32544coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.C32647coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coocii.C32733coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.AdChoicesView;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.VideoAd;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import com.zeus.gmc.sdk.mobileads.columbus.util.TrackUtils;
import java.lang.ref.SoftReference;
import java.util.List;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ */
/* loaded from: classes8.dex */
public abstract class AbstractView$OnClickListenerC32305cioccoiococ extends AbstractC32320coo2iico implements View.OnClickListener, InterfaceC32513c2oc2i {
    protected static final int c22i2 = 1;
    private static final int c2coiii = 0;
    private static final int c2oocoiocc2 = 5;
    private static final int cc2o2oicocc = 0;
    protected static final int ccc2ici2c = 3;
    protected static final int cco2222oci = 3;
    protected static final int cco2o = 2;
    protected static final int ci222iicici = 2;
    protected static final int ci22co = 1;
    private static final int ciccio2icii = 1;
    private static final int cioo2ooi = 3;
    private static final Handler co2i2ooo22 = new HandlerC32451cc2o22co2c(new C32312coo2iico());
    protected TextView c222o2o2c2o;
    protected int c22ic;
    protected LinearLayout c22o22co22i;
    private RelativeLayout c2ccci2iii;
    protected View c2cciooo;
    protected TextView c2ccocci;
    private TextView c2cic2;
    protected LinearLayout c2ic2icoi;
    private boolean c2iiio;
    protected ImageView c2oicci2;
    private boolean c2ooc2c2;
    private ImageView cc2iiooocc2;
    private View cc2o22co2c;
    private SoftReference<Activity> ccc22i;
    private boolean cccc2coi;
    private boolean cccccioi;
    private ImageView ccci2;
    protected SeekBar cccoo22o2;
    private TextView cciccio;
    protected TextView ccii2o2;
    private int cciicii2o22;
    private final String cco22;
    protected ViewGroup ccoc2oic;
    private boolean ccoi2oo;
    protected FrameLayout ccoio;
    private TextView ci22c2;
    private int ci2cci2;
    protected FrameLayout cicc2iiccc;
    private boolean cicccco22cc;
    protected RelativeLayout cici2o2oo;
    protected RelativeLayout cicic;
    private ImageView cicoic;
    protected Context cii2c2;
    private VideoStyleInfo cii2co;
    private Runnable cii2coco;
    protected View ciii2coi2;
    protected VideoAd ciiiioccoc;
    protected AdChoicesView ciiio2o;
    protected Button ciiioc2ioc;
    private String ciio2;
    protected ImageView ciio2c;
    protected TextView cioc2;
    private String ciocicoc2;
    private FrameLayout cioii2c22c2;
    private TextView cioiic;
    private boolean co22i2c22;
    private boolean co2c2o2;
    private C32514cioccoiococ coc22;
    private EndCardStyleInfo coc2coo;
    private TextView coccoi2;
    private int cocoic;
    protected TextView coi2ccc2;
    private String coic2cccc2;
    protected RelativeLayout coiic;
    protected TextView coiio2;
    private ImageView coocii;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ$c2oc2i */
    /* loaded from: classes8.dex */
    public class RunnableC32306c2oc2i implements Runnable {
        RunnableC32306c2oc2i() {
            AbstractView$OnClickListenerC32305cioccoiococ.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C32473coo2iico.coo2iico(AbstractView$OnClickListenerC32305cioccoiococ.this.cc2iiooocc2);
            AbstractView$OnClickListenerC32305cioccoiococ.this.co22i2c22 = true;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ$c2oc2o */
    /* loaded from: classes8.dex */
    public class C32307c2oc2o implements DialogC32515coi222o222.InterfaceC32517cioccoiococ {
        final /* synthetic */ DialogC32515coi222o222 coo2iico;

        C32307c2oc2o(DialogC32515coi222o222 dialogC32515coi222o222) {
            AbstractView$OnClickListenerC32305cioccoiococ.this = r1;
            this.coo2iico = dialogC32515coi222o222;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.DialogC32515coi222o222.InterfaceC32517cioccoiococ
        public void coo2iico() {
            AbstractView$OnClickListenerC32305cioccoiococ.this.cccoo22o2();
            this.coo2iico.dismiss();
            AbstractView$OnClickListenerC32305cioccoiococ.this.cicccco22cc = false;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ$cco22 */
    /* loaded from: classes8.dex */
    public class C32308cco22 implements DialogC32515coi222o222.InterfaceC32516c2oc2i {
        C32308cco22() {
            AbstractView$OnClickListenerC32305cioccoiococ.this = r1;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.DialogC32515coi222o222.InterfaceC32516c2oc2i
        public void coo2iico() {
            if (!AbstractView$OnClickListenerC32305cioccoiococ.this.co2c2o2) {
                AbstractView$OnClickListenerC32305cioccoiococ.this.coo2iico.cioccoiococ();
            }
            AbstractView$OnClickListenerC32305cioccoiococ.this.cicccco22cc = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ$cii2c2 */
    /* loaded from: classes8.dex */
    public class RunnableC32309cii2c2 implements Runnable {
        RunnableC32309cii2c2() {
            AbstractView$OnClickListenerC32305cioccoiococ.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AbstractView$OnClickListenerC32305cioccoiococ.this.co2c2o2 && !AbstractView$OnClickListenerC32305cioccoiococ.this.c2iiio) {
                int ctaAppearStyle = AbstractView$OnClickListenerC32305cioccoiococ.this.getCtaAppearStyle();
                if (ctaAppearStyle == 1) {
                    AbstractView$OnClickListenerC32305cioccoiococ abstractView$OnClickListenerC32305cioccoiococ = AbstractView$OnClickListenerC32305cioccoiococ.this;
                    abstractView$OnClickListenerC32305cioccoiococ.cioccoiococ(abstractView$OnClickListenerC32305cioccoiococ.cici2o2oo);
                } else if (ctaAppearStyle == 2) {
                    AbstractView$OnClickListenerC32305cioccoiococ abstractView$OnClickListenerC32305cioccoiococ2 = AbstractView$OnClickListenerC32305cioccoiococ.this;
                    abstractView$OnClickListenerC32305cioccoiococ2.c2oc2i(abstractView$OnClickListenerC32305cioccoiococ2.cici2o2oo);
                } else {
                    AbstractView$OnClickListenerC32305cioccoiococ abstractView$OnClickListenerC32305cioccoiococ3 = AbstractView$OnClickListenerC32305cioccoiococ.this;
                    abstractView$OnClickListenerC32305cioccoiococ3.coi222o222(abstractView$OnClickListenerC32305cioccoiococ3.cici2o2oo);
                }
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ$cioccoiococ */
    /* loaded from: classes8.dex */
    class RunnableC32310cioccoiococ implements Runnable {
        final /* synthetic */ ViewGroup c2oc2i;
        final /* synthetic */ int coi222o222;
        final /* synthetic */ int coo2iico;

        RunnableC32310cioccoiococ(int i, int i2, ViewGroup viewGroup) {
            AbstractView$OnClickListenerC32305cioccoiococ.this = r1;
            this.coo2iico = i;
            this.coi222o222 = i2;
            this.c2oc2i = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int width = AbstractView$OnClickListenerC32305cioccoiococ.this.cicc2iiccc.getWidth();
            float f = this.coo2iico;
            float height = AbstractView$OnClickListenerC32305cioccoiococ.this.cicc2iiccc.getHeight() / f;
            float f2 = this.coi222o222;
            float f3 = width / f2;
            int i2 = -1;
            if (height > f3) {
                i = (int) (f3 * f);
            } else {
                i2 = (int) (height * f2);
                i = -1;
            }
            AbstractView$OnClickListenerC32305cioccoiococ.this.coo2iico(this.c2oc2i, i2, i);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ$coi222o222 */
    /* loaded from: classes8.dex */
    public class C32311coi222o222 implements C32544coi222o222.InterfaceC32547cioccoiococ {
        C32311coi222o222() {
            AbstractView$OnClickListenerC32305cioccoiococ.this = r1;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.C32544coi222o222.InterfaceC32547cioccoiococ
        public void coo2iico(@Nullable C32544coi222o222 c32544coi222o222) {
            if (c32544coi222o222 != null) {
                try {
                    C32544coi222o222.C32546c2oc2o c2oc2o = c32544coi222o222.c2oc2o();
                    if (c2oc2o != null) {
                        int c2oc2o2 = c2oc2o.c2oc2o();
                        if (!AbstractView$OnClickListenerC32305cioccoiococ.this.c2oc2o(c2oc2o2)) {
                            AbstractView$OnClickListenerC32305cioccoiococ.this.cciicii2o22 = c2oc2o2;
                            AbstractView$OnClickListenerC32305cioccoiococ.this.setButtonColor(c2oc2o2);
                        }
                    }
                } catch (Exception e) {
                    MLog.m25888e("ColumbusRewardStyleController", "onGenerated(Palette palette)", e);
                }
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cioccoiococ$coo2iico */
    /* loaded from: classes8.dex */
    class C32312coo2iico implements Handler.Callback {
        C32312coo2iico() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }

    public AbstractView$OnClickListenerC32305cioccoiococ(Context context) {
        super(context);
        this.cco22 = "ColumbusRewardStyleController";
        this.cccccioi = false;
        this.cccc2coi = false;
        this.ccoi2oo = false;
        this.co2c2o2 = false;
        this.c2iiio = false;
        this.cicccco22cc = false;
        this.c2ooc2c2 = false;
        this.c22ic = 1;
        this.co22i2c22 = false;
        this.cii2coco = new RunnableC32309cii2c2();
        Context coo2iico = C32284cicc2iiccc.coo2iico(context);
        this.cii2c2 = coo2iico;
        this.ciii2coi2 = LayoutInflater.from(coo2iico).inflate(ccoio(), (ViewGroup) this, true);
    }

    private void c222o2o2c2o() {
        this.cioccoiococ = false;
        coi222o222(false);
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 != null) {
            C32284cicc2iiccc.coo2iico(interfaceC32509coi222o222.getTrackMap().get("unmute"));
            this.coo2iico.getVideoTrackListener().cii2c2(String.valueOf(this.coo2iico.getCurrentPosition() / 1000));
            this.coo2iico.c22o22co22i();
        }
    }

    private void c22o22co22i() {
        this.cioccoiococ = true;
        coi222o222(true);
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 != null) {
            C32284cicc2iiccc.coo2iico(interfaceC32509coi222o222.getTrackMap().get("mute"));
            this.coo2iico.getVideoTrackListener().c22o22co22i(String.valueOf(this.coo2iico.getCurrentPosition() / 1000));
            this.coo2iico.cc2iiooocc2();
        }
    }

    private void c2ccci2iii() {
        Typeface create;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                create = Typeface.create(Typeface.DEFAULT, 500, false);
            } else {
                create = Typeface.create("sans-serif-medium", 0);
            }
            if (create != null) {
                Button button = this.ciiioc2ioc;
                if (button != null) {
                    button.setTypeface(create);
                }
                TextView textView = this.ci22c2;
                if (textView != null) {
                    textView.setTypeface(create);
                }
            }
        } catch (Exception e) {
            MLog.m25888e("ColumbusRewardStyleController", "setFontWeight error", e);
        }
    }

    private void c2cciooo() {
        try {
            View c2oc2i = C32470coiio2.c2oc2i(this.cii2c2, this.coic2cccc2, this.ciio2);
            if (c2oc2i != null && this.cioii2c22c2 != null) {
                if (c2oc2i.getParent() != null) {
                    ((ViewGroup) c2oc2i.getParent()).removeView(c2oc2i);
                }
                this.cioii2c22c2.addView(c2oc2i);
            }
        } catch (Exception e) {
            MLog.m25888e("ColumbusRewardStyleController", "showPrivacyView error", e);
        }
    }

    private boolean c2ccocci() {
        return !TextUtils.isEmpty(this.ciiiioccoc.getVideoAdInfo().c2ccocci());
    }

    private void c2cic2() {
        this.cccccioi = false;
        this.cccc2coi = false;
        this.ccoi2oo = false;
    }

    private void cc2iiooocc2() {
        this.cicc2iiccc = (FrameLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_video_container);
        this.coiio2 = (TextView) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_end_time);
        this.coiic = (RelativeLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_bg);
        RelativeLayout relativeLayout = (RelativeLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_player_container);
        this.cicic = relativeLayout;
        coi222o222(relativeLayout, 1);
        ImageView imageView = (ImageView) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_mute);
        this.c2oicci2 = imageView;
        coi222o222(imageView, 3);
        LinearLayout linearLayout = (LinearLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_access);
        this.c22o22co22i = linearLayout;
        coi222o222(linearLayout, 3);
        this.c222o2o2c2o = (TextView) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_skip);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_card);
        this.cici2o2oo = relativeLayout2;
        coi222o222(relativeLayout2, 2);
        ImageView imageView2 = (ImageView) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_icon);
        this.ciio2c = imageView2;
        coi222o222(imageView2, 2);
        TextView textView = (TextView) ((RelativeLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_title_include)).findViewById(C32065R.C32068id.columbus_reward_style_title);
        this.cioc2 = textView;
        coi222o222(textView, 2);
        Button button = (Button) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_cta);
        this.ciiioc2ioc = button;
        coi222o222(button, 3);
        TextView textView2 = (TextView) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_summary);
        this.c2ccocci = textView2;
        coi222o222(textView2, 2);
        this.ciiio2o = (AdChoicesView) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_adchoice);
        ImageView imageView3 = (ImageView) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_end_card_close);
        this.cc2iiooocc2 = imageView3;
        imageView3.setOnClickListener(this);
        this.cioii2c22c2 = (FrameLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_privacy_container);
        ciiio2o();
        FrameLayout frameLayout = (FrameLayout) this.ciii2coi2.findViewById(C32065R.C32068id.columbus_reward_style_endcard_container);
        this.ccoio = frameLayout;
        coo2iico((View) frameLayout, 1);
        View cioc2 = cioc2();
        this.cc2o22co2c = cioc2;
        if (cioc2 == null) {
            return;
        }
        ImageView imageView4 = (ImageView) cioc2.findViewById(C32065R.C32068id.columbus_end_card_icon);
        this.coocii = imageView4;
        coo2iico(imageView4, 2);
        ImageView imageView5 = (ImageView) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_img);
        this.ccci2 = imageView5;
        coo2iico(imageView5, 2);
        TextView textView3 = (TextView) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_title);
        this.cioiic = textView3;
        coo2iico((View) textView3, 2);
        TextView textView4 = (TextView) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_summary);
        this.c2cic2 = textView4;
        coo2iico((View) textView4, 2);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_cta);
        this.c2ccci2iii = relativeLayout3;
        coo2iico((View) relativeLayout3, 3);
        this.ci22c2 = (TextView) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_cta_desc);
        ImageView imageView6 = (ImageView) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_icon_other);
        this.cicoic = imageView6;
        coo2iico(imageView6, 2);
        TextView textView5 = (TextView) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_title_other);
        this.coccoi2 = textView5;
        coo2iico((View) textView5, 2);
        TextView textView6 = (TextView) this.cc2o22co2c.findViewById(C32065R.C32068id.columbus_end_card_summary_other);
        this.cciccio = textView6;
        coo2iico((View) textView6, 2);
        View inflate = View.inflate(this.cii2c2, C32065R.C32069layout.columbus_reward_style_seekbar, null);
        this.c2cciooo = inflate;
        SeekBar seekBar = (SeekBar) inflate.findViewById(C32065R.C32068id.columbus_reward_style_seek_bar);
        this.cccoo22o2 = seekBar;
        seekBar.setEnabled(false);
        this.coi2ccc2 = (TextView) this.c2cciooo.findViewById(C32065R.C32068id.columbus_reward_seek_current);
        this.ccii2o2 = (TextView) this.c2cciooo.findViewById(C32065R.C32068id.columbus_reward_seek_total);
        this.c2ic2icoi = (LinearLayout) this.c2cciooo.findViewById(C32065R.C32068id.columbus_reward_seek_text);
        c2ccci2iii();
        setButtonColor(ContextCompat.getColor(this.cii2c2, C32065R.C32066color.columbus_reward_cta_color));
        cciccio();
    }

    private boolean cc2o22co2c() {
        if (this.ci2cci2 == 13) {
            return true;
        }
        return false;
    }

    private boolean ccci2() {
        if (this.ci2cci2 == 14) {
            return true;
        }
        return false;
    }

    public void cccoo22o2() {
        if (!ccci2()) {
            this.ciiiioccoc.setTrackTime();
        }
        coi222o222();
        this.coo2iico.coo2iico();
        super.coo2iico();
        this.co2c2o2 = true;
        cicoic();
        if (this.coo2iico.getVideoTrackListener() instanceof InterfaceC32506c2oc2i) {
            ((InterfaceC32506c2oc2i) this.coo2iico.getVideoTrackListener()).coo2iico();
        }
    }

    private void cciccio() {
        RelativeLayout relativeLayout = this.cici2o2oo;
        if (relativeLayout != null && relativeLayout.getVisibility() == 8) {
            postDelayed(this.cii2coco, getCtaEnterTime());
        }
    }

    private void ccii2o2() {
        EndCardStyleInfo endCardStyleInfo;
        VideoAd videoAd = this.ciiiioccoc;
        if (videoAd != null && videoAd.getVideoAdInfo() != null) {
            this.ciiio2o.startAdChoice(this.cii2c2, this.ciiiioccoc.getmAdChoice());
            if (this.cocoic == 1 && (endCardStyleInfo = this.coc2coo) != null && endCardStyleInfo.c2oicci2() != null) {
                C32514cioccoiococ c32514cioccoiococ = new C32514cioccoiococ(this.cii2c2);
                this.coc22 = c32514cioccoiococ;
                c32514cioccoiococ.cioccoiococ();
                this.coc22.setEndCardListener(this);
                this.coc22.coo2iico(this.coc2coo.c2oicci2());
                this.ccoio.removeAllViews();
                this.ccoio.addView(this.coc22);
            }
            coo2iico(this.cioc2, this.ciiiioccoc.getAdTitle());
            coo2iico(this.c2ccocci, this.ciiiioccoc.getVideoAdInfo().cicic());
            String ciii2coi2 = this.ciiiioccoc.getVideoAdInfo().ciii2coi2();
            if (this.ciiioc2ioc != null && !TextUtils.isEmpty(ciii2coi2)) {
                this.ciiioc2ioc.setText(ciii2coi2);
            }
            if (getSkipTime() <= 0) {
                coccoi2();
            }
            coo2iico(this.cioiic, this.ciiiioccoc.getAdTitle());
            coo2iico(this.c2cic2, this.ciiiioccoc.getVideoAdInfo().cicic());
            coo2iico(this.coccoi2, this.ciiiioccoc.getAdTitle());
            coo2iico(this.cciccio, this.ciiiioccoc.getVideoAdInfo().cicic());
            coo2iico(this.ci22c2, this.ciiiioccoc.getVideoAdInfo().ciii2coi2());
            Bitmap coo2iico = C32468coi222o222.coo2iico(C32468coi222o222.coo2iico(this.ciiiioccoc.getVideoAdInfo().c222o2o2c2o()), AndroidUtils.dp2px(this.cii2c2, 66.0f), AndroidUtils.dp2px(this.cii2c2, 66.0f), AndroidUtils.dp2px(this.cii2c2, 12.0f), 0);
            coo2iico(this.ciio2c, coo2iico);
            coo2iico(this.coocii, coo2iico);
            coo2iico(this.cicoic, coo2iico);
            coo2iico(coo2iico);
            setBitMap(coo2iico);
            return;
        }
        MLog.m25889e("ColumbusRewardStyleController", "video is null");
    }

    private void ci22c2() {
        Activity appActivity = this.ciiiioccoc.getAppActivity();
        if (appActivity != null) {
            int requestedOrientation = appActivity.getRequestedOrientation();
            if (requestedOrientation == 0) {
                this.c22ic = 0;
                return;
            } else if (requestedOrientation == 1) {
                this.c22ic = 1;
                return;
            } else {
                getContextOrientation();
                return;
            }
        }
        getContextOrientation();
    }

    private void cici2o2oo() {
        try {
            if (!this.c2ooc2c2) {
                return;
            }
            if (cc2o22co2c() && !this.co22i2c22) {
                cccoo22o2();
            } else if (ccci2() && !this.co2c2o2) {
                this.coo2iico.cii2c2();
                SoftReference<Activity> softReference = this.ccc22i;
                if (softReference != null && softReference.get() != null) {
                    DialogC32515coi222o222 dialogC32515coi222o222 = new DialogC32515coi222o222(this.ccc22i.get(), this.cciicii2o22);
                    dialogC32515coi222o222.coo2iico(new C32307c2oc2o(dialogC32515coi222o222));
                    dialogC32515coi222o222.coo2iico(new C32308cco22());
                    dialogC32515coi222o222.setCancelable(false);
                    dialogC32515coi222o222.show();
                    this.cicccco22cc = true;
                }
            } else {
                ciio2c();
            }
        } catch (Exception e) {
            MLog.m25888e("ColumbusRewardStyleController", "clickClose error", e);
        }
    }

    private void cicoic() {
        this.ccoio.setVisibility(0);
        this.cicic.setVisibility(8);
        co2i2ooo22.postDelayed(new RunnableC32306c2oc2i(), getCloseEnterTime());
        AnalyticsInfo analyticsInfo = new AnalyticsInfo();
        analyticsInfo.adEvent = new C32647coo2iico(18).coo2iico();
        analyticsInfo.endCardShowWay = this.cocoic;
        coo2iico(analyticsInfo);
    }

    private void ciiioc2ioc() {
        removeCallbacks(this.cii2coco);
        co2i2ooo22.removeCallbacksAndMessages(null);
        C32514cioccoiococ c32514cioccoiococ = this.coc22;
        if (c32514cioccoiococ != null) {
            c32514cioccoiococ.setEndCardListener(null);
        }
        SoftReference<Activity> softReference = this.ccc22i;
        if (softReference != null && softReference.get() != null) {
            this.c2iiio = true;
            this.ccc22i.get().finish();
        }
    }

    private void ciio2c() {
        if (!this.co22i2c22) {
            return;
        }
        coi2ccc2();
        ciiioc2ioc();
    }

    private View cioc2() {
        EndCardStyleInfo endCardStyleInfo = this.coc2coo;
        int i = 0;
        if (endCardStyleInfo != null) {
            String coo2iico = C32282ccoc2oic.coo2iico(endCardStyleInfo.coiio2());
            Integer num = C32282ccoc2oic.c22o22co22i.get(coo2iico);
            if (num != null) {
                i = num.intValue();
            }
            this.ciocicoc2 = coo2iico;
        }
        if (i == 0) {
            i = C32065R.C32069layout.columbus_reward_style_end_2_2;
            this.ciocicoc2 = "2.2";
        }
        if (!c2ccocci()) {
            i = C32065R.C32069layout.columbus_reward_style_end_2_1;
            this.ciocicoc2 = "2.1";
        }
        return LayoutInflater.from(this.cii2c2).inflate(i, (ViewGroup) this.ccoio, true);
    }

    private void coccoi2() {
        coo2iico(this.c222o2o2c2o, this.cii2c2.getResources().getString(C32065R.C32070string.columbus_skip_ad));
        coo2iico(this.c222o2o2c2o, ContextCompat.getColor(this.cii2c2, C32065R.C32066color.columbus_reward_style_text_color));
        this.c222o2o2c2o.setOnClickListener(this);
        this.c2ooc2c2 = true;
    }

    private void coi2ccc2() {
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 != null) {
            List<String> list = interfaceC32509coi222o222.getTrackMap().get("close");
            if (list == null) {
                list = this.coo2iico.getTrackMap().get("closeLinear");
            }
            C32284cicc2iiccc.coo2iico(list);
            this.coo2iico.getVideoTrackListener().coo2iico(String.valueOf(this.coo2iico.getCurrentPosition() / 1000));
        }
    }

    private boolean coocii() {
        if (this.c22ic != 0) {
            return true;
        }
        return false;
    }

    private Bitmap getAdBitmap() {
        if (!c2ccocci()) {
            return null;
        }
        return C32733coo2iico.coo2iico(this.cii2c2, this.ciiiioccoc.getVideoAdInfo().c2ccocci(), coocii(), null);
    }

    private long getCloseEnterTime() {
        EndCardStyleInfo endCardStyleInfo = this.coc2coo;
        if (endCardStyleInfo != null) {
            return endCardStyleInfo.ccoc2oic() * 1000;
        }
        return 0L;
    }

    private void getContextOrientation() {
        Context context = this.cii2c2;
        if (context != null) {
            if (context.getResources().getConfiguration().orientation == 2) {
                this.c22ic = 0;
            } else {
                this.c22ic = 1;
            }
        }
    }

    private long getCtaEnterTime() {
        VideoStyleInfo videoStyleInfo = this.cii2co;
        if (videoStyleInfo != null) {
            return videoStyleInfo.coiio2() * 1000;
        }
        return 3000L;
    }

    private int getSkipTime() {
        int i;
        int duration;
        VideoStyleInfo videoStyleInfo = this.cii2co;
        if (videoStyleInfo != null) {
            i = videoStyleInfo.c2oicci2();
        } else {
            i = 5;
        }
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 != null && (interfaceC32509coi222o222.getDuration() / 1000) - 1 > 0) {
            return Math.min(i, duration) * 1000;
        }
        return i * 1000;
    }

    private void setBitMap(Bitmap bitmap) {
        ImageView imageView;
        Bitmap thumbBitmap = this.ciiiioccoc.getThumbBitmap();
        if (thumbBitmap != null) {
            coo2iico(this.coiic, C32468coi222o222.coo2iico(this.cii2c2, thumbBitmap, 25, 0.05f));
            if (this.c22ic == 0) {
                coo2iico(this.cicc2iiccc, C32468coi222o222.coo2iico(this.cii2c2, thumbBitmap, 25, 0.25f));
            }
        }
        Bitmap adBitmap = getAdBitmap();
        if (adBitmap != null && !adBitmap.isRecycled() && (imageView = this.ccci2) != null && imageView.getVisibility() == 0) {
            coo2iico(this.ccoio, C32468coi222o222.coo2iico(this.cii2c2, adBitmap, 25, 0.05f));
            coo2iico((View) this.ccci2, C32468coi222o222.coo2iico(this.cii2c2, adBitmap, 25, 0.25f));
            this.ccci2.setImageBitmap(adBitmap);
        }
        if (bitmap != null) {
            C32544coi222o222.coo2iico(bitmap).coo2iico(1).coo2iico(new C32311coi222o222());
        }
    }

    public void c2ic2icoi() {
        LinearLayout linearLayout = this.c2ic2icoi;
        if (linearLayout != null) {
            ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).gravity = GravityCompat.START;
        }
        RelativeLayout relativeLayout = this.cici2o2oo;
        if (relativeLayout != null) {
            relativeLayout.setBackground(ContextCompat.getDrawable(this.cii2c2, C32065R.C32067drawable.columbus_reward_style_card_mask));
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    protected void c2oc2o() {
        MLog.m25887i("ColumbusRewardStyleController", "invoke initVolume");
    }

    protected boolean cco22(@ColorInt int i) {
        if (ColorUtils.calculateLuminance(i) >= 0.5d) {
            return true;
        }
        return false;
    }

    @LayoutRes
    protected abstract int ccoio();

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    protected void cicc2iiccc() {
        MLog.m25887i("ColumbusRewardStyleController", "invoke showAfterClickMask");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void cicic() {
        MLog.m25892d("ColumbusRewardStyleController", "reset Controller");
        coi222o222();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void cii2c2() {
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 != null && !interfaceC32509coi222o222.ccoio() && !this.cicccco22cc) {
            this.coo2iico.cioccoiococ();
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void ciii2coi2() {
        cici2o2oo();
    }

    protected abstract void ciiio2o();

    protected void cioii2c22c2() {
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 != null && interfaceC32509coi222o222.getVideoAd() != null) {
            this.ciiiioccoc = this.coo2iico.getVideoAd();
            this.ci2cci2 = this.coo2iico.getCurrentMode();
            VideoAd videoAd = this.ciiiioccoc;
            if (videoAd != null) {
                this.coic2cccc2 = videoAd.getPrivacyToken();
                this.ciio2 = this.ciiiioccoc.getPrivacyUrl();
                this.cii2co = this.ciiiioccoc.getVideoStyleInfo();
                this.coc2coo = this.ciiiioccoc.getEndCardStyleInfo();
                this.cocoic = this.ciiiioccoc.getEndCardShowWay();
                ci22c2();
                cc2iiooocc2();
                ccii2o2();
                c2cciooo();
            }
        }
    }

    public void cioiic() {
        if (!this.co2c2o2) {
            return;
        }
        cicoic();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    protected void coiio2() {
        MLog.m25887i("ColumbusRewardStyleController", "update progress");
        int currentPosition = this.coo2iico.getCurrentPosition();
        int duration = this.coo2iico.getDuration();
        int i = currentPosition / 1000;
        if (i == duration / 4000 && i != 0 && !this.cccccioi) {
            C32284cicc2iiccc.coo2iico(this.coo2iico.getTrackMap().get("firstQuartile"));
            this.coo2iico.getVideoTrackListener().cicc2iiccc(String.valueOf(i));
            this.cccccioi = true;
        } else if (i == duration / 2000 && i != 0 && !this.cccc2coi) {
            C32284cicc2iiccc.coo2iico(this.coo2iico.getTrackMap().get("midpoint"));
            this.coo2iico.getVideoTrackListener().c2oc2i(String.valueOf(i));
            this.cccc2coi = true;
        } else if (i == (duration * 3) / 4000 && i != 0 && !this.ccoi2oo) {
            C32284cicc2iiccc.coo2iico(this.coo2iico.getTrackMap().get("thirdQuartile"));
            this.coo2iico.getVideoTrackListener().cco22(String.valueOf(i));
            this.ccoi2oo = true;
        }
        SeekBar seekBar = this.cccoo22o2;
        if (seekBar != null) {
            if (seekBar.getMax() != duration) {
                this.cccoo22o2.setMax(duration);
            }
            this.cccoo22o2.setProgress(currentPosition);
        }
        if (this.c2ic2icoi != null) {
            String cioccoiococ = cioccoiococ(currentPosition);
            String cioccoiococ2 = cioccoiococ(duration);
            if (!TextUtils.isEmpty(cioccoiococ) && !TextUtils.isEmpty(cioccoiococ2)) {
                this.coi2ccc2.setText(cioccoiococ);
                TextView textView = this.ccii2o2;
                textView.setText(" / " + cioccoiococ2);
            }
        }
        int i2 = (duration - currentPosition) / 1000;
        if (i2 > 0 && i2 < 1000 && i2 <= duration / 1000) {
            this.coiio2.setText(String.valueOf(i2));
        }
        int skipTime = getSkipTime();
        int i3 = (skipTime - currentPosition) / 1000;
        if (i3 > 0 && i3 <= skipTime && !this.c2ooc2c2) {
            coo2iico(this.c222o2o2c2o, String.format(this.cii2c2.getResources().getString(C32065R.C32070string.columbus_skip_ad_time), Integer.valueOf(i3)));
        } else if (i3 <= 0 && !this.c2ooc2c2) {
            coccoi2();
        }
    }

    protected abstract void coo2iico(Bitmap bitmap);

    protected abstract void coo2iico(View view);

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public int getAppOrientation() {
        return this.c22ic;
    }

    protected int getCtaAppearStyle() {
        VideoStyleInfo videoStyleInfo = this.cii2co;
        if (videoStyleInfo != null) {
            return videoStyleInfo.ccoc2oic();
        }
        return 3;
    }

    protected int getSummaryBlackColor() {
        return ContextCompat.getColor(this.cii2c2, C32065R.C32066color.columbus_reward_style_summary_black);
    }

    protected int getSummaryWhiteColor() {
        return ContextCompat.getColor(this.cii2c2, C32065R.C32066color.columbus_reward_style_summary_white);
    }

    protected int getTitleBlackColor() {
        return ContextCompat.getColor(this.cii2c2, C32065R.C32066color.columbus_reward_style_title_black);
    }

    public int getTitleWhiteColor() {
        return ContextCompat.getColor(this.cii2c2, C32065R.C32066color.columbus_reward_style_title_white);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (view == this.c2oicci2) {
            c2oc2i();
        }
        if (view == this.c222o2o2c2o) {
            cici2o2oo();
        }
        if (view == this.cc2iiooocc2) {
            ciio2c();
        }
        if (view == this.ccoc2oic) {
            coo2iico(Constants.VIDEO);
        }
        if (view == this.cicic || view == this.c22o22co22i || view == this.cici2o2oo || view == this.ciio2c || view == this.cioc2 || view == this.ciiioc2ioc || view == this.c2ccocci || view == this.ccoio || view == this.coocii || view == this.cioiic || view == this.c2cic2 || view == this.ccci2 || view == this.c2ccci2iii || view == this.cicoic || view == this.coccoi2 || view == this.cciccio) {
            coo2iico(Constants.CLICK_AREA.get(Integer.valueOf(view.getId())));
        }
        coo2iico(view);
    }

    public void setButtonColor(int i) {
        Button button = this.ciiioc2ioc;
        if (button != null) {
            try {
                ((GradientDrawable) button.getBackground()).setColor(i);
                if (cco22(i)) {
                    this.ciiioc2ioc.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                } else {
                    this.ciiioc2ioc.setTextColor(-1);
                }
            } catch (Exception e) {
                MLog.m25891d("ColumbusRewardStyleController", "modifyButton error", e);
            }
        }
        RelativeLayout relativeLayout = this.c2ccci2iii;
        if (relativeLayout != null && this.ci22c2 != null) {
            try {
                ((GradientDrawable) relativeLayout.getBackground()).setColor(i);
                if (cco22(i)) {
                    this.ci22c2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    this.ci22c2.setCompoundDrawableTintList(ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK));
                } else {
                    this.ci22c2.setTextColor(-1);
                    this.ci22c2.setCompoundDrawableTintList(ColorStateList.valueOf(-1));
                }
            } catch (Exception e2) {
                MLog.m25891d("ColumbusRewardStyleController", "modifyEndCardCTA error", e2);
            }
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void setColumbusVideoPlayer(InterfaceC32509coi222o222 interfaceC32509coi222o222) {
        super.setColumbusVideoPlayer(interfaceC32509coi222o222);
        cioii2c22c2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void setContext(Context context) {
        if (context instanceof Activity) {
            this.ccc22i = new SoftReference<>((Activity) context);
        }
        this.cii2c2 = C32284cicc2iiccc.coo2iico(context);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void setLearnMoreText(String str) {
        MLog.m25887i("ColumbusRewardStyleController", "invoke setLearnMoreText, text = " + str);
    }

    public boolean c2oc2o(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return fArr[0] <= 10.0f && fArr[1] <= 0.05f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void cioccoiococ() {
        coi222o222(false);
    }

    public void cioccoiococ(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1500.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        view.startAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void c2oc2i(int i) {
        if (i == -1) {
            MLog.m25887i("ColumbusRewardStyleController", "onPlayStateChanged->STATE_ERROR");
            coi222o222();
            super.coo2iico();
        } else if (i == 0) {
            MLog.m25887i("ColumbusRewardStyleController", "onPlayStateChanged->IDLE");
        } else if (i == 1) {
            MLog.m25887i("ColumbusRewardStyleController", "onPlayStateChanged->STATE_PREPARING");
            c2cic2();
        } else if (i == 2) {
            MLog.m25887i("ColumbusRewardStyleController", "onPlayStateChanged->STATE_PREPARED");
            coiio2();
        } else if (i == 3) {
            MLog.m25887i("ColumbusRewardStyleController", "onPlayStateChanged->STATE_PLAYING");
            ccoc2oic();
        } else if (i == 4) {
            MLog.m25887i("ColumbusRewardStyleController", "onPlayStateChanged->STATE_PAUSED");
            coi222o222();
            super.coo2iico();
        } else if (i != 7) {
        } else {
            MLog.m25887i("ColumbusRewardStyleController", "onPlayStateChanged->STATE_COMPLETED");
            this.ciiiioccoc.completeCount++;
            coi222o222();
            super.coo2iico();
            this.co2c2o2 = true;
            cicoic();
        }
    }

    public void coi222o222(View view, int i) {
        VideoStyleInfo videoStyleInfo = this.cii2co;
        int cicc2iiccc = videoStyleInfo != null ? videoStyleInfo.cicc2iiccc() : 2;
        if (view == null || i < cicc2iiccc) {
            return;
        }
        view.setOnClickListener(this);
    }

    private void coo2iico(View view, int i) {
        EndCardStyleInfo endCardStyleInfo = this.coc2coo;
        int cicc2iiccc = endCardStyleInfo != null ? endCardStyleInfo.cicc2iiccc() : 2;
        if (view == null || i < cicc2iiccc) {
            return;
        }
        view.setOnClickListener(this);
    }

    private String cioccoiococ(int i) {
        if (i < 0) {
            return "";
        }
        int i2 = i / 1000;
        if (i2 < 60) {
            if (i2 < 10) {
                return "00:0" + i2;
            }
            return "00:" + i2;
        }
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i3 >= 10) {
            if (i4 < 10) {
                return i3 + ":0" + i4;
            }
            return i3 + ":" + i4;
        } else if (i4 < 10) {
            return "0" + i3 + ":0" + i4;
        } else {
            return "0" + i3 + ":" + i4;
        }
    }

    private void coi222o222(int i, int i2) {
        try {
            if (this.c2cciooo != null) {
                if (1 == this.c22ic && i < i2) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(12, -1);
                    layoutParams.bottomMargin = 3;
                    if (this.c2cciooo.getParent() != null) {
                        ((ViewGroup) this.c2cciooo.getParent()).removeView(this.c2cciooo);
                    }
                    c2ic2icoi();
                    this.cicic.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    this.cicic.addView(this.c2cciooo, layoutParams);
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 80;
                if (this.c2cciooo.getParent() != null) {
                    ((ViewGroup) this.c2cciooo.getParent()).removeView(this.c2cciooo);
                }
                this.cicc2iiccc.addView(this.c2cciooo, layoutParams2);
            }
        } catch (Exception e) {
            MLog.m25888e("ColumbusRewardStyleController", "error: ", e);
        }
    }

    protected void coo2iico(View view, Bitmap bitmap) {
        if (view == null || bitmap == null) {
            return;
        }
        view.setBackground(new BitmapDrawable(getResources(), bitmap));
    }

    public void coo2iico(ImageView imageView, Bitmap bitmap) {
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(8);
        }
    }

    public void coo2iico(TextView textView, String str) {
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void coo2iico(TextView textView, @ColorInt int i) {
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void coo2iico(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        VideoAd videoAd = this.ciiiioccoc;
        if (videoAd != null && videoAd.getVideoAdInfo() != null) {
            int cicoic = this.ciiiioccoc.getVideoAdInfo().cicoic();
            int c2cciooo = this.ciiiioccoc.getVideoAdInfo().c2cciooo();
            float ccoc2oic = C32284cicc2iiccc.ccoc2oic(this.cii2c2);
            float ciii2coi2 = C32284cicc2iiccc.ciii2coi2(this.cii2c2);
            if (cicoic <= 0 || c2cciooo <= 0) {
                coo2iico(viewGroup, -1, -1);
                return;
            } else if (ciii2coi2 < ccoc2oic) {
                this.cicc2iiccc.post(new RunnableC32310cioccoiococ(cicoic, c2cciooo, viewGroup));
                return;
            } else {
                float f = cicoic;
                float f2 = ciii2coi2 / f;
                float f3 = c2cciooo;
                float f4 = ccoc2oic / f3;
                if (f2 > f4) {
                    i3 = (int) ccoc2oic;
                    i2 = (int) (f4 * f);
                } else {
                    i2 = (int) ciii2coi2;
                    i3 = (int) (f2 * f3);
                }
                coo2iico(i3, i2, ciii2coi2);
                coo2iico(viewGroup, i3, i2);
                return;
            }
        }
        MLog.m25892d("ColumbusRewardStyleController", "mVideoAd or VideoAdInfo is null, return");
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void c2oc2i() {
        MLog.m25887i("ColumbusRewardStyleController", "change mute");
        float coi222o222 = C32284cicc2iiccc.coi222o222(this.cii2c2);
        if (this.cioccoiococ) {
            c222o2o2c2o();
        } else {
            c22o22co22i();
            coi222o222 = 0.0f;
        }
        coo2iico(coi222o222, coi222o222);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void coi222o222(int i) {
        MLog.m25887i("ColumbusRewardStyleController", "invoke onPlayModeChanged, playMode = " + i);
    }

    private void coi222o222(boolean z) {
        if (z) {
            this.c2oicci2.setImageResource(C32065R.C32067drawable.columbus_reward_style_mute);
        } else {
            this.c2oicci2.setImageResource(C32065R.C32067drawable.columbus_reward_style_unmute);
        }
    }

    public void coo2iico(ViewGroup viewGroup, int i, int i2) {
        MLog.m25887i("ColumbusRewardStyleController", "video container height = " + i2 + ", width = " + i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        if (viewGroup != null) {
            if (viewGroup.getParent() != null) {
                ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
            }
            this.cicc2iiccc.addView(viewGroup, layoutParams);
            coi222o222(i, i2);
            this.ccoc2oic = viewGroup;
            coi222o222(viewGroup, 2);
        }
    }

    public void coi222o222(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 1500.0f, 0.0f);
        translateAnimation.setDuration(500L);
        view.startAnimation(translateAnimation);
    }

    public void c2oc2i(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(-1500.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        view.startAnimation(translateAnimation);
    }

    private void coo2iico(int i, int i2, float f) {
        FrameLayout frameLayout;
        if (i <= i2 || (frameLayout = this.cicc2iiccc) == null) {
            return;
        }
        try {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof FrameLayout) {
                ((FrameLayout) parent).setPadding(0, 0, 0, (int) ((f - i2) / 4.0f));
            }
        } catch (Exception e) {
            MLog.m25888e("ColumbusRewardStyleController", "setVideo error", e);
        }
    }

    public void coo2iico(String str) {
        this.coo2iico.getVideoTrackListener().coo2iico(String.valueOf(this.coo2iico.getCurrentPosition() / 1000), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.AbstractC32320coo2iico
    public void coo2iico(boolean z) {
        float coi222o222 = C32284cicc2iiccc.coi222o222(this.cii2c2);
        if (z) {
            if (this.cioccoiococ) {
                c222o2o2c2o();
            }
        } else if (coi222o222 == 0.0f && !this.cioccoiococ) {
            c22o22co22i();
        } else if (this.cioccoiococ) {
            coi222o222 = 0.0f;
        }
        super.coo2iico(coi222o222, coi222o222);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.InterfaceC32513c2oc2i
    public void coo2iico(int i, int i2) {
        AnalyticsInfo analyticsInfo = new AnalyticsInfo();
        if (i >= 0) {
            analyticsInfo.loadTime = String.valueOf(i);
        }
        if (i2 >= 0) {
            analyticsInfo.interactiveTime = String.valueOf(i2);
        }
        analyticsInfo.adEvent = new C32647coo2iico(19).coo2iico();
        coo2iico(analyticsInfo);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.InterfaceC32513c2oc2i
    public void coo2iico(int i) {
        if (i == 0) {
            coo2iico(Constants.CTA);
        } else {
            coo2iico(Constants.END_CARD_URL);
        }
    }

    private void coo2iico(AnalyticsInfo analyticsInfo) {
        if (this.ciiiioccoc == null) {
            MLog.m25892d("ColumbusRewardStyleController", "video ad is null");
            return;
        }
        if (analyticsInfo == null) {
            analyticsInfo = new AnalyticsInfo();
        }
        analyticsInfo.mTagId = this.ciiiioccoc.getAdTagId();
        analyticsInfo.f89358ex = this.ciiiioccoc.getVideoAdInfo().c2oicci2();
        analyticsInfo.configKey = SdkConfig.USE_STAGING ? "systemadsolution_globalnativestaging" : "systemadsolution_globalnative";
        VideoStyleInfo videoStyleInfo = this.cii2co;
        analyticsInfo.videoStyleId = videoStyleInfo == null ? "1.2" : videoStyleInfo.c22o22co22i();
        EndCardStyleInfo endCardStyleInfo = this.coc2coo;
        analyticsInfo.endCardStyleId = endCardStyleInfo == null ? this.ciocicoc2 : endCardStyleInfo.coiio2();
        TrackUtils.trackAction(this.cii2c2, analyticsInfo);
    }
}
