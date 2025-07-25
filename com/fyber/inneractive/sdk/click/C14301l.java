package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.click.l */
/* loaded from: classes4.dex */
public final class C14301l implements InterfaceC14290a {

    /* renamed from: b */
    public static final C14300k f27025b = new C14300k();

    /* renamed from: a */
    public boolean f27026a = false;

    @Override // com.fyber.inneractive.sdk.click.InterfaceC14290a
    /* renamed from: a */
    public final boolean mo78004a(Uri uri, C14307r c14307r) {
        return !this.f27026a;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC14290a
    public final void cancel() {
        this.f27026a = true;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC14290a
    /* renamed from: a */
    public final C14291b mo78006a(Context context, Uri uri, List list) {
        Intent intent;
        ResolveInfo resolveInfo;
        if (this.f27026a) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (this.f27026a) {
                    return null;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                if (!(context instanceof Activity)) {
                    intent2.setFlags(268435456);
                }
                return m78007a(context, intent2, uri, list);
            }
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 32);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.fyber.com")), 32);
        TreeSet treeSet = new TreeSet(f27025b);
        treeSet.addAll(queryIntentActivities2);
        queryIntentActivities.removeAll(treeSet);
        if (queryIntentActivities.size() <= 0 || (resolveInfo = queryIntentActivities.get(0)) == null) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", uri);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
        }
        if (intent == null || this.f27026a) {
            return null;
        }
        return m78007a(context, intent, uri, list);
    }

    /* renamed from: a */
    public final C14291b m78007a(Context context, Intent intent, Uri uri, List list) {
        if (this.f27026a) {
            return C14307r.m77998a(uri.toString(), "Resolver", "The process was cancelled");
        }
        try {
            context.startActivity(intent);
            if (list != null) {
                list.add(new C14299j(uri.toString(), true, m78005a(intent), null));
            }
            return new C14291b(uri.toString(), m78005a(intent), "Resolver", null);
        } catch (Exception e) {
            IAlog.m76529a("failed starting activity with error: %s", e.getLocalizedMessage());
            if (list != null) {
                list.add(new C14299j(uri.toString(), false, EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION, null));
            }
            return C14307r.m77998a(uri.toString(), "Resolver", "failed starting resolved activity - " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static EnumC14306q m78005a(Intent intent) {
        if (intent.getData() != null) {
            String uri = intent.getData().toString();
            if (!TextUtils.isEmpty(uri)) {
                Uri parse = Uri.parse(uri);
                String host = parse.getHost();
                String scheme = parse.getScheme();
                if (((uri.startsWith("http:") || uri.startsWith("https:")) && ("play.google.com".equalsIgnoreCase(host) || "market.android.com".equalsIgnoreCase(host))) || ApsAdWebViewSupportClient.MARKET_SCHEME.equalsIgnoreCase(scheme)) {
                    return EnumC14306q.OPEN_GOOGLE_STORE;
                }
            }
        }
        return EnumC14306q.OPEN_IN_EXTERNAL_APPLICATION;
    }
}
