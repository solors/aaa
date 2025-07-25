package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ListIterator;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.browser.BrowserActivity;

/* loaded from: classes10.dex */
public class IntentHandler {
    private static final String TAG = "IntentHandler";
    private final Context context;

    public IntentHandler(Context context) {
        this.context = context;
    }

    public boolean canHandleIntent(Intent intent) {
        return !this.context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public boolean handleBrowserLink(Uri uri) {
        if (HyBid.getBrowserManager().containsPriorities()) {
            ListIterator<String> listIterator = HyBid.getBrowserManager().getPackagePriorities().listIterator();
            Intent intent = null;
            do {
                String next = listIterator.next();
                if (!TextUtils.isEmpty(next.trim())) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(uri);
                    intent2.addFlags(268435456);
                    intent2.setPackage(next);
                    if (canHandleIntent(intent2)) {
                        intent = intent2;
                    }
                }
                if (!listIterator.hasNext()) {
                    break;
                }
            } while (intent == null);
            if (intent == null) {
                return handleDeepLink(uri);
            }
            try {
                this.context.startActivity(intent);
                return true;
            } catch (RuntimeException e) {
                Logger.m14227e(TAG, e.getMessage());
                return false;
            }
        }
        return handleDeepLink(uri);
    }

    public boolean handleBrowserLinkBrowserActivity(Uri uri) {
        try {
            this.context.startActivity(BrowserActivity.createIntent(this.context, uri.toString()));
            return true;
        } catch (RuntimeException e) {
            Logger.m14227e(TAG, e.getMessage());
            return false;
        }
    }

    public boolean handleDeepLink(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        if (canHandleIntent(intent)) {
            try {
                this.context.startActivity(intent);
                return true;
            } catch (RuntimeException e) {
                Logger.m14227e(TAG, e.getMessage());
            }
        }
        return false;
    }
}
