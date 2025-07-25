package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.util.AbstractC15415F;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.click.h */
/* loaded from: classes4.dex */
public final class C14297h implements InterfaceC14290a {

    /* renamed from: a */
    public boolean f27017a = false;

    @Override // com.fyber.inneractive.sdk.click.InterfaceC14290a
    /* renamed from: a */
    public final boolean mo78004a(Uri uri, C14307r c14307r) {
        return SDKConstants.PARAM_INTENT.equalsIgnoreCase(uri.getScheme()) && !this.f27017a;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC14290a
    public final void cancel() {
        this.f27017a = true;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC14290a
    /* renamed from: a */
    public final C14291b mo78006a(Context context, Uri uri, List list) {
        if (mo78004a(uri, null)) {
            try {
                Intent parseUri = Intent.parseUri(uri.toString(), 1);
                if (!this.f27017a && AbstractC15415F.m76538a(context, parseUri)) {
                    int i = IAlog.f30554a;
                    IAlog.m76526d("%s %s", "DEEPLINK", uri.toString());
                    if (list != null) {
                        list.add(new C14299j(uri.toString(), true, EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return new C14291b(uri.toString(), EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION, "IntentScheme", null);
                }
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (!this.f27017a && !TextUtils.isEmpty(stringExtra)) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                        if (!(context instanceof Activity)) {
                            intent.setFlags(268435456);
                        }
                        context.startActivity(intent);
                        IAlog.m76526d("%s %s", "Intent opened successfully, url:", stringExtra);
                        if (list != null) {
                            list.add(new C14299j(uri.toString(), false, EnumC14306q.DEEP_LINK, null));
                            list.add(new C14299j(stringExtra, true, EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION, null));
                        }
                        return new C14291b(uri.toString(), EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION, "IntentScheme", null);
                    } catch (ActivityNotFoundException unused) {
                        IAlog.m76526d("%s %s", "Intent failed, url:", stringExtra);
                    }
                } else {
                    if (list != null) {
                        list.add(new C14299j(uri.toString(), false, EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION, "tryToOpenExternalApp has failed (intent scheme)"));
                    }
                    return C14307r.m77998a(uri.toString(), "IntentScheme", "tryToOpenExternalApp has failed (intent scheme)");
                }
            } catch (URISyntaxException e) {
                IAlog.m76529a("failed parsing uri with error: %s", e.getLocalizedMessage());
                if (list != null) {
                    list.add(new C14299j(uri.toString(), false, EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION, null));
                }
                return new C14291b(uri.toString(), EnumC14306q.FAILED, "IntentScheme", e);
            }
        }
        return null;
    }
}
