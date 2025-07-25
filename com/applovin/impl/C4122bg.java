package com.applovin.impl;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.C4176cc;
import com.applovin.impl.C4648je;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.bg */
/* loaded from: classes2.dex */
public class C4122bg extends C4176cc {

    /* renamed from: n */
    private final C4648je f5000n;

    /* renamed from: o */
    private final Context f5001o;

    public C4122bg(C4648je c4648je, Context context) {
        super(C4176cc.EnumC4179c.DETAIL);
        this.f5000n = c4648je;
        this.f5001o = context;
        this.f5234c = m100441t();
        this.f5235d = m100442s();
    }

    /* renamed from: q */
    private SpannedString m100444q() {
        if (this.f5000n.m98230A()) {
            if (!TextUtils.isEmpty(this.f5000n.m98214c())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f5000n.m98214c(), ViewCompat.MEASURED_STATE_MASK));
                if (this.f5000n.m98229B()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f5000n.m98206k(), ViewCompat.MEASURED_STATE_MASK));
                }
                return new SpannedString(spannableStringBuilder);
            }
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
    }

    /* renamed from: s */
    private SpannedString m100442s() {
        if (!mo92899o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) m100440u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) m100444q());
        if (this.f5000n.m98200q() == C4648je.EnumC4649a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* renamed from: t */
    private SpannedString m100441t() {
        int i;
        if (mo92899o()) {
            i = ViewCompat.MEASURED_STATE_MASK;
        } else {
            i = -7829368;
        }
        return StringUtils.createSpannedString(this.f5000n.m98210g(), i, 18, 1);
    }

    /* renamed from: u */
    private SpannedString m100440u() {
        String str;
        if (this.f5000n.m98226E()) {
            if (StringUtils.isValidString(this.f5000n.m98201p())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f5000n.m98201p(), ViewCompat.MEASURED_STATE_MASK));
                return new SpannedString(spannableStringBuilder);
            }
            if (this.f5000n.m98230A()) {
                str = "Retrieving SDK Version...";
            } else {
                str = "SDK Found";
            }
            return StringUtils.createListItemDetailSpannedString(str, ViewCompat.MEASURED_STATE_MASK);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
    }

    @Override // com.applovin.impl.C4176cc
    /* renamed from: d */
    public int mo93835d() {
        if (mo92899o()) {
            return C6200R.C6203drawable.applovin_ic_disclosure_arrow;
        }
        return super.mo100217h();
    }

    @Override // com.applovin.impl.C4176cc
    /* renamed from: e */
    public int mo93834e() {
        return AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_disclosureButtonColor, this.f5001o);
    }

    @Override // com.applovin.impl.C4176cc
    /* renamed from: h */
    public int mo100217h() {
        int m98209h = this.f5000n.m98209h();
        if (m98209h <= 0) {
            return C6200R.C6203drawable.applovin_ic_mediation_placeholder;
        }
        return m98209h;
    }

    @Override // com.applovin.impl.C4176cc
    /* renamed from: o */
    public boolean mo92899o() {
        if (this.f5000n.m98200q() != C4648je.EnumC4649a.MISSING) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public C4648je m100443r() {
        return this.f5000n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f5234c) + ", detailText=" + ((Object) this.f5235d) + ", network=" + this.f5000n + "}";
    }
}
